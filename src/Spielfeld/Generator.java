package Spielfeld;

import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse enthaelt die Methoden zur Erstellung eines Spielfeldes.
 * 
 * @author frankero
 * 
 */
public class Generator {
	int last_kartenGesamt;
	int last_kartenGesamtoW;
	boolean wueste_verwendet;
	int anzahl_berge;
	int anzahl_gruben;
	int anzahl_wiesen;
	int anzahl_felder;

	/**
	 * Diese Methode generiert das Spielfeld fuer die GUI und die Erzeugung der
	 * Ecken und Kanten
	 * 
	 * @param groesse
	 *            Bestimmt die Groesse der Generierten Karte, dabei wird der
	 *            Radius angegeben ohne Mittelpunkt und Wasserrand.
	 * @return Es wird ein Array aus Hexahon zurueck gegeben
	 */
	public Feld[] genHexagonSpielfeld(int groesse) {
		int kartenGesamt = 1;
		int kartenGesamtoW = 1;
		int anzahlRinge = groesse + 1;

		List<Feld> rueckgabe;

		for (int ringNr = 1; ringNr <= anzahlRinge; ringNr++) {
			kartenGesamt += ringNr * 6;
			if (ringNr != anzahlRinge) {
				kartenGesamtoW += ringNr * 6;
			}
		}

		rueckgabe = new ArrayList<Feld>(kartenGesamt);

		for (int karteNr = 0; karteNr < kartenGesamtoW; karteNr++) {
			rueckgabe.add(new Feld(getRndTyp(), getRndWuerfelzahl()));
		}
		for (int karteNr = kartenGesamtoW; karteNr < kartenGesamt; karteNr++) {
			rueckgabe.add(new Feld(LandTyp.WASSER, 0));
		}

		last_kartenGesamt = kartenGesamt;
		last_kartenGesamtoW = kartenGesamtoW;
		return (Feld[]) rueckgabe.toArray(new Feld[0]);
	} // Ende genHexagonSpielfeld

	public Feld_Ecke[] genEckenSpielfeld(Feld[] vorlage, int groesse) {
		List<Feld_Ecke> rueckgabe = new ArrayList<Feld_Ecke>(23);
		for (int rundenNr = 1; rundenNr <= groesse + 1; rundenNr++) {
			rueckgabe.add(new Feld_Ecke());
		}

		// rueckgabe.trimToSize();
		return (Feld_Ecke[]) rueckgabe.toArray(new Feld_Ecke[0]);
	}

	/**
	 * Es wird eine Zufaellige Zahl zwischen 2 und 12 generiert
	 * 
	 * @return Zahl zwischen 2 und 12 wird zurueck gegeben
	 */
	private int getRndWuerfelzahl() {
		return (int) (Math.random() * 11 + 2);
	}

	/**
	 * Es wird ein zufaelliger Landschaftstyp zurueckgegeben
	 * 
	 * @return LandTyp der entweder berg, wiese, feld oder grube ist.
	 */
	private LandTyp getRndTyp() {
		int max_Zahl = 4;
		if (!wueste_verwendet) {
			max_Zahl++;
		}
		int new_Typ = (int) (Math.random() * max_Zahl + 1);

		switch (new_Typ) {
		case 1:
			return LandTyp.BERG;
		case 2:
			return LandTyp.WIESE;
		case 3:
			return LandTyp.FELD;
		case 4:
			return LandTyp.GRUBE;
		case 5:
			wueste_verwendet = true;
			return LandTyp.WUESTE;
		default:
			return LandTyp.LEER;
		}
	}

	public LandTyp TestgetRndTyp() {
		return getRndTyp();
	}

	public int TestgetRndWuerfelzahl() {
		return getRndWuerfelzahl();
	}

	public void resetGenerator() {
		last_kartenGesamt = 0;
		last_kartenGesamtoW = 0;
		wueste_verwendet = false;
		anzahl_berge = 0;
		anzahl_gruben = 0;
		anzahl_wiesen = 0;
		anzahl_felder = 0;
	}

	public Generator() {
		resetGenerator();
	}
}
