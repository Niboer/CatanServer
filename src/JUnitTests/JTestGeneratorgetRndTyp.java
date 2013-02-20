package JUnitTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Spielfeld.Generator;
import Spielfeld.LandTyp;

public class JTestGeneratorgetRndTyp {

	@Test
	public void test() {
		Generator worldgen = new Generator();
		LandTyp neuer_Typ;
		boolean berg = false;
		int berg_zaehler=0;
		boolean feld = false;
		int feld_zaehler=0;
		boolean wiese = false;
		int wiese_zaehler=0;
		boolean grube = false;
		int grube_zaehler=0;
		boolean wueste = false;
		int wueste_zaehler=0;
		for (int i = 0; i < 100000000; i++) {
			neuer_Typ = worldgen.TestgetRndTyp();
			if (!(neuer_Typ == LandTyp.BERG || neuer_Typ == LandTyp.FELD
					|| neuer_Typ == LandTyp.WIESE || neuer_Typ == LandTyp.GRUBE || neuer_Typ == LandTyp.WUESTE)) {
				System.out
						.println("Durchlauf: " + i + " Ausgabe: " + neuer_Typ);
				assertTrue(false);
			}
			if (neuer_Typ == LandTyp.BERG) {
				berg = true;
				berg_zaehler++;
			} else if (neuer_Typ == LandTyp.FELD) {
				feld = true;
				feld_zaehler++;
			} else if (neuer_Typ == LandTyp.WIESE) {
				wiese = true;
				wiese_zaehler++;
			} else if (neuer_Typ == LandTyp.GRUBE) {
				grube = true;
				grube_zaehler++;
			} else if (neuer_Typ == LandTyp.WUESTE) {
				wueste = true;
				wueste_zaehler++;
			}
		}

		if (berg) {
			System.out.println("Es wurden " + berg_zaehler + " Berge generiert.");
		} else {
			System.out.println("Es wurden KEINE Berge generiert.");
			assertTrue(false);
		}
		if (feld) {
			System.out.println("Es wurden " + feld_zaehler + " Felder generiert.");
		} else {
			System.out.println("Es wurden KEINE Felder generiert.");
			assertTrue(false);
		}
		if (wiese) {
			System.out.println("Es wurden " + wiese_zaehler + " Wiesen generiert.");
		} else {
			System.out.println("Es wurden KEINE Wiesen generiert.");
			assertTrue(false);
		}
		if (grube) {
			System.out.println("Es wurden " + grube_zaehler + " Gruben generiert.");
		} else {
			System.out.println("Es wurden KEINE Gruben generiert.");
			assertTrue(false);
		}
		if (wueste) {
			System.out.println("Es wurde " + wueste_zaehler + " Wueste generiert.");
		} else {
			System.out.println("Es wurden KEINE Wueste generiert.");
			assertTrue(false);
		}
	}

}
