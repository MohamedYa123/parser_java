package csen1002.main.task7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task7.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task7TestsBatch0 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;R;O;Y#b;k;l;m;q;s;t#S/sS,lR;Z/bR,OlOY,sRlY;R/m,tOl,e;O/mYs,kRl,e;Y/sS,lZqY#S/s,l;Z/b,klm,s;R/m,t,e;O/m,k,e;Y/s,l#S/$qs;Z/q;R/$lqs;O/l;Y/qs");
		assertEquals("S;lR;ltOl;ltmYsl;ltmlZqYsl;ltmlOlOYqYsl;ltmllOYqYsl;ltmllmYsYqYsl;ERROR", cfgLl1Parser.parse("ltmllmm"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;R;O;Y#b;k;l;m;q;s;t#S/sS,lR;Z/bR,OlOY,sRlY;R/m,tOl,e;O/mYs,kRl,e;Y/sS,lZqY#S/s,l;Z/b,klm,s;R/m,t,e;O/m,k,e;Y/s,l#S/$qs;Z/q;R/$lqs;O/l;Y/qs");
		assertEquals("S;lR;ltOl;ltmYsl;ltmsSsl;ltmssSsl;ltmsslRsl;ltmsslsl;ERROR", cfgLl1Parser.parse("ltmssllb"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;R;O;Y#b;k;l;m;q;s;t#S/sS,lR;Z/bR,OlOY,sRlY;R/m,tOl,e;O/mYs,kRl,e;Y/sS,lZqY#S/s,l;Z/b,klm,s;R/m,t,e;O/m,k,e;Y/s,l#S/$qs;Z/q;R/$lqs;O/l;Y/qs");
		assertEquals("S;lR;ltOl;ltmYsl;ltmlZqYsl;ltmlsRlYqYsl;ltmlstOllYqYsl;ltmlstllYqYsl;ERROR", cfgLl1Parser.parse("ltmlstll"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;R;O;Y#b;k;l;m;q;s;t#S/sS,lR;Z/bR,OlOY,sRlY;R/m,tOl,e;O/mYs,kRl,e;Y/sS,lZqY#S/s,l;Z/b,klm,s;R/m,t,e;O/m,k,e;Y/s,l#S/$qs;Z/q;R/$lqs;O/l;Y/qs");
		assertEquals("S;sS;slR;sltOl;sltmYsl;sltmlZqYsl;sltmlbRqYsl;sltmlbqYsl;ERROR", cfgLl1Parser.parse("sltmlbqm"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;R;O;Y#b;k;l;m;q;s;t#S/sS,lR;Z/bR,OlOY,sRlY;R/m,tOl,e;O/mYs,kRl,e;Y/sS,lZqY#S/s,l;Z/b,klm,s;R/m,t,e;O/m,k,e;Y/s,l#S/$qs;Z/q;R/$lqs;O/l;Y/qs");
		assertEquals("S;lR;ltOl;ltmYsl;ltmlZqYsl;ltmlbRqYsl;ltmlbqYsl;ltmlbqsSsl;ltmlbqslRsl;ltmlbqslsl", cfgLl1Parser.parse("ltmlbqslsl"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;D;W;N;P#c;h;o;q;r;z#S/rP,q,cWzS;X/hW,cDh,e;D/q,r,cW,e;W/o,rXq,e;N/r,hXq,oX,cD;P/hN,zS#S/r,q,c;X/h,c,e;D/q,r,c,e;W/o,r,e;N/r,h,o,c;P/h,z#S/$;X/$q;D/$h;W/$hqz;N/$;P/$");
		assertEquals("S;cWzS;crXqzS;crhWqzS;crhrXqqzS;crhrhWqqzS;crhrhqqzS;ERROR", cfgLl1Parser.parse("crhrhhhz"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;D;W;N;P#c;h;o;q;r;z#S/rP,q,cWzS;X/hW,cDh,e;D/q,r,cW,e;W/o,rXq,e;N/r,hXq,oX,cD;P/hN,zS#S/r,q,c;X/h,c,e;D/q,r,c,e;W/o,r,e;N/r,h,o,c;P/h,z#S/$;X/$q;D/$h;W/$hqz;N/$;P/$");
		assertEquals("S;rP;rzS;rzcWzS;rzcrXqzS;rzcrhWqzS;rzcrhqzS;ERROR", cfgLl1Parser.parse("rzcrhhhh"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;D;W;N;P#c;h;o;q;r;z#S/rP,q,cWzS;X/hW,cDh,e;D/q,r,cW,e;W/o,rXq,e;N/r,hXq,oX,cD;P/hN,zS#S/r,q,c;X/h,c,e;D/q,r,c,e;W/o,r,e;N/r,h,o,c;P/h,z#S/$;X/$q;D/$h;W/$hqz;N/$;P/$");
		assertEquals("S;rP;rzS;rzcWzS;rzczS;rzczcWzS;rzczczS;ERROR", cfgLl1Parser.parse("rzczchco"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;D;W;N;P#c;h;o;q;r;z#S/rP,q,cWzS;X/hW,cDh,e;D/q,r,cW,e;W/o,rXq,e;N/r,hXq,oX,cD;P/hN,zS#S/r,q,c;X/h,c,e;D/q,r,c,e;W/o,r,e;N/r,h,o,c;P/h,z#S/$;X/$q;D/$h;W/$hqz;N/$;P/$");
		assertEquals("S;cWzS;czS;czrP;czrhN;czrhhXq;czrhhhWq;czrhhhoq", cfgLl1Parser.parse("czrhhhoq"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;X;D;W;N;P#c;h;o;q;r;z#S/rP,q,cWzS;X/hW,cDh,e;D/q,r,cW,e;W/o,rXq,e;N/r,hXq,oX,cD;P/hN,zS#S/r,q,c;X/h,c,e;D/q,r,c,e;W/o,r,e;N/r,h,o,c;P/h,z#S/$;X/$q;D/$h;W/$hqz;N/$;P/$");
		assertEquals("S;cWzS;crXqzS;crcDhqzS;crchqzS;crchqzrP;crchqzrhN;crchqzrhcD;crchqzrhccW;crchqzrhcco", cfgLl1Parser.parse("crchqzrhcco"));
	}

}