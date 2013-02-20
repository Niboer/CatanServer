package JUnitTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Spielfeld.Generator;
import Spielfeld.LandTyp;

public class JTestGeneratorgetRndTyp {

	@Test
	public void test() {
		Generator worldgen=new Generator();
		LandTyp neuer_Typ;
		boolean berg=false;
		boolean feld=false;
		boolean wiese=false;
		boolean grube=false;
		for (int i =0; i < 100000000; i++)
		{
			neuer_Typ=worldgen.TestgetRndTyp();
			if (!(neuer_Typ == LandTyp.BERG || neuer_Typ == LandTyp.FELD ||
					neuer_Typ == LandTyp.WIESE || neuer_Typ == LandTyp.GRUBE))
			{
				System.out.println("Durchlauf: " + i + " Ausgabe: " + neuer_Typ);
				assertTrue(false);
			}
			if (neuer_Typ == LandTyp.BERG)
			{
				berg=true;
			}
			else if (neuer_Typ == LandTyp.FELD)
			{
				feld=true;
			}
			else if (neuer_Typ == LandTyp.WIESE)
			{
				wiese=true;
			}
			else if (neuer_Typ == LandTyp.GRUBE)
			{
				grube=true;
			}
		}
		
		if (berg)
		{
			System.out.println("Es wurden Berge generiert.");
		}
		else
		{
			System.out.println("Es wurden KEINE Berge generiert.");
		}
		if (feld)
		{
			System.out.println("Es wurden Felder generiert.");
		}
		else
		{
			System.out.println("Es wurden KEINE Felder generiert.");
		}
		if (wiese)
		{
			System.out.println("Es wurden Wiesen generiert.");
		}
		else
		{
			System.out.println("Es wurden KEINE Wiesen generiert.");
		}
		if (grube)
		{
			System.out.println("Es wurden Gruben generiert.");
		}
		else
		{
			System.out.println("Es wurden KEINE Gruben generiert.");
		}
		
	}

}
