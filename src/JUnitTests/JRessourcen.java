package JUnitTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Ressourcen.RessTyp;
import Ressourcen.Ressourcen;

public class JRessourcen {

	@Test
	public void test() {
		Ressourcen ob1=new Ressourcen();
		Ressourcen ob2=new Ressourcen(1,2,3,4);
		
		if (ob1.getRess(RessTyp.WEIZEN.getStelle())!=0)
		{
			assertTrue(false);
		}
		if (ob1.getRess(RessTyp.EISEN.getStelle())!=0)
		{
			assertTrue(false);
		}
		if (ob1.getRess(RessTyp.HOLZ.getStelle())!=0)
		{
			assertTrue(false);
		}
		if (ob1.getRess(RessTyp.SCHAF.getStelle())!=0)
		{
			assertTrue(false);
		}
		if (ob2.getRess(RessTyp.WEIZEN.getStelle())!=1)
		{
			assertTrue(false);
		}
		if (ob2.getRess(RessTyp.HOLZ.getStelle())!=2)
		{
			assertTrue(false);
		}
		if (ob2.getRess(RessTyp.EISEN.getStelle())!=3)
		{
			assertTrue(false);
		}
		if (ob2.getRess(RessTyp.SCHAF.getStelle())!=4)
		{
			assertTrue(false);
		}
		
		if (ob1.veraendernRess(-1, RessTyp.WEIZEN.getStelle()))
		{
			assertTrue(false);
		}
		if (!ob1.veraendernRess(1, RessTyp.WEIZEN.getStelle()))
		{
			assertTrue(false);
		}
		if (ob1.veraendernRess(-2, RessTyp.WEIZEN.getStelle()))
		{
			assertTrue(false);
		}
		if (!ob1.veraendernRess(-1, RessTyp.WEIZEN.getStelle()))
		{
			assertTrue(false);
		}
		if (ob1.veraendernRess(-1, RessTyp.WEIZEN.getStelle()))
		{
			assertTrue(false);
		}
	}

}
