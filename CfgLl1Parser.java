/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write your info here
 * 
 * @name Jane Smith
 * @id 46-0234
 * @labNumber 07
 */

public class CfgLl1Parser {

	/**
	 * Constructs a Context Free Grammar
	 * 
	 * @param cfg A formatted string representation of the CFG, the First sets of
	 *            each right-hand side, and the Follow sets of each variable. The
	 *            string representation follows the one in the task description
	 */

	ArrayList<String> leftsideVariables=new ArrayList<String>();
	ArrayList<String> rightsidevariables=new ArrayList<String>();
        ArrayList<String> orders=new ArrayList<String>();
	ArrayList<String> firsts=new ArrayList<String>();
	ArrayList<String> follows=new ArrayList<String>();
        ArrayList< ArrayList<String>> table=new ArrayList< ArrayList<String>>();
        

	public CfgLl1Parser(String input) {
		// TODO Auto-generated constructor stub
		//let's collect
                input=input.replace(" ", "");
		var r=input.split("#");
		var d=r[0].split(";");
                leftsideVariables.addAll(Arrays.asList(d));
                d=r[1].split(";");
                rightsidevariables.addAll(Arrays.asList(d));
                
                int i;
                for(int z=0;z<3;z++)
                {
                    i=0;
                    d=r[2+z].split(";");
                    for(var a :d)
                    {
                        var c=leftsideVariables.get(i);
                        var a1=a.replace(c+"/","");
                        switch (z) {
                            case 0 -> orders.add(a1);
                            case 1 -> firsts.add(a1);
                            case 2 -> follows.add(a1);
                        }
                        i++;
                    }
                }
                 i=0;
                for(var v:leftsideVariables)
                {
                    ArrayList<String> nonterminals=new ArrayList<String>();
                    var f=firsts.get(i).split(",");
                    ArrayList<String> firstofc=new ArrayList<String>();
                    firstofc.addAll(Arrays.asList(f));
                    boolean keep=true;
                    int y=0;
                    while(keep &&y<2){
                        int z=0;
                    for(var c:rightsidevariables){
                        var s="";
                        var indx=-1;//firstofc.indexOf(c);
                        int ia=0;
                        for(var cc : firstofc){
                            if(cc.contains(c)){//substring(0,1).equals(c)
                                indx=ia;
                                break;
                            }
                            ia++;
                        }
                        if(indx!=-1)
                        {
                            s=orders.get(i).split(",")[indx];//.replace("e", "");
                        }
                        //s=s.replace(",", "");
                        if(y==0)
                        {nonterminals.add(s);}
                        else{
                            s="e";
                            nonterminals.set(z, nonterminals.get(z)+s);
                        }
                        z++;
                    }
                        keep=false;
                        if(firstofc.contains("e"))
                        {   
                            String qq="";
                         for(int zz=0;zz<follows.size();zz++){
                             qq+=follows.get(i);//.substring(zz,zz+1)+",";
                         }
                         f=qq.split(",");
                         keep=true;
                        }
                        y++;
                    }
                    table.add(nonterminals);
                    i++;
                }
	}

	/**
	 * @param input The string to be parsed by the LL(1) CFG.
	 * 
	 * @return A string encoding a left-most derivation.
	 */
        ArrayList<String> Stacklist=new ArrayList<String>();
        String steps;
        void Add(String v)
        {
            var ind=point+1;
            for(int y=0;y<v.length();y++){
                var ft=v.substring(y,y+1);
                if(!ft.equals("e")){
                Stacklist.add(ind,ft);
                point++;
             //   Stacklist.add(0, ft);
                }
            }
            if(pub.length()!=0){
               // steps+=v.replace("e", "")+";";
                for(int i=Stacklist.size()-1;i>-1;i--){
                    var a=Stacklist.get(i);
                    steps+=a;
                }
                steps+=";";
            }
        }
        int point=-1;
        String last()
        {
            var indx=point;//Stacklist.size()-1;
            return Stacklist.get(indx);
        }
        String pub="";
        void replace(int indx,String current)
        {
            var indxcurrent=rightsidevariables.indexOf(current);
            Stacklist.remove(point);
            point--;
            var v=table.get(indx).get(indxcurrent);
            pub=v;
            Add(v);
        }
        void remove(){
        // var indx=point;// Stacklist.size()-1;
         point--;
          //   Stacklist.remove(indx);
        }
        void check(String input){
            String vv="";
            for(int i=Stacklist.size()-1;i>-1;i--){
                    var a=Stacklist.get(i);
                    vv+=a;
                }
            if(!vv.equals(input)){
                steps+="ERROR;";
            }
        }
	public String parse(String input) {
		// TODO Auto-generated method stub
                var firstvariable=leftsideVariables.get(0);
                 steps=firstvariable+";";
                Add(firstvariable);
                for(int i=0;i<input.length();i++)
                {
                    try{
                    var current=input.substring(i,i+1);
                    var lst=last();
                    while(true){
                    var indx=leftsideVariables.indexOf(lst);
                    if(indx!=-1){
                        replace(indx,current);
                    }
                    else{
                        break;
                    }
                    if(pub.length()==0){
                        throw new Exception("");
                    }
                     lst=last();
                    }
                   
                    if(lst.equals(current)){
                            remove();
                        
                    }
                    else{
                       throw new Exception("");
                    }}
                    catch( Exception ex){
                       // steps+="ERROR;";
                        break;
                    }
                    
                }
                check(input);
                steps=steps.substring(0,steps.length()-1);
		return steps;
	}

}
