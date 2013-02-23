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
	int last_groesse;
	int anzahl_berge;
	int anzahl_gruben;
	int anzahl_wiesen;
	int anzahl_felder;
	boolean wueste_verwendet;
	boolean genhex;

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
		last_groesse = groesse;
		genhex = true;
		return (Feld[]) rueckgabe.toArray(new Feld[0]);
	} // Ende genHexagonSpielfeld

	/**
	 * 
	 * @param vorlage
	 * @param groesse
	 * @return
	 */
	public Feld_Ecke[] genEckenSpielfeld(Feld[] vorlage) {
		List<Feld_Ecke> rueckgabe;
		Feld_Ecke tempEcke;
		LandTyp[] tempTyp = new LandTyp[3];
		int eckenNr = 0;
		int seitenzaehler = 1;
		int seitenposition = 1;
		int feld0_hilfe = 0;
		int eckeninRunde = 0;
		int[] feldNr = new int[3];
		int[] tempTyp_wuerfelzahl = new int[3];
		boolean letzterPunktinrunde = false;
		boolean vorletzterPunktinrunde = false;

		if (genhex) {
			rueckgabe = new ArrayList<Feld_Ecke>(ermittleeckenzahl());

			for (int rundenNr = 1; rundenNr <= last_groesse + 1; rundenNr++) {
				letzterPunktinrunde = false;
				eckeninRunde = ermittleeckenzahl_aktuelleRunde(rundenNr);

				for (int i = 0; i < eckeninRunde; i++) {
					rueckgabe.add(new Feld_Ecke());
					tempEcke = rueckgabe.get(eckenNr);

					if (i == eckeninRunde - 1) {
						vorletzterPunktinrunde = false;
						letzterPunktinrunde = true;
					} else if (i == eckeninRunde - 2) {
						vorletzterPunktinrunde = true;
					}

					if (seitenposition == 2 + 2 * (rundenNr - 1)) {
						seitenposition = 1;
						seitenzaehler++;
					}
					if (seitenposition % 2 == 1 && seitenposition != 1) {
						feld0_hilfe++;
					}

					if (letzterPunktinrunde) {
						feldNr[0] = 0;
						feldNr[1] = 0;
						feldNr[2] = 0;

						for (int j = 0; j <= rundenNr - 2; j++) {
							feldNr[0] += 6 * j;
						}
						if (rundenNr != 1) {
							feldNr[0]++;
						}
						for (int j = 0; j <= rundenNr; j++) {
							feldNr[1] += 6 * j;
						}
						for (int j = 0; j <= rundenNr - 1; j++) {
							feldNr[2] += 6 * j;
						}
						feldNr[2]++;

					} else if (vorletzterPunktinrunde && rundenNr != 1) {
						feldNr[0] = 0;
						feldNr[1] = 0;
						feldNr[2] = 0;

						for (int j = 0; j <= rundenNr - 2; j++) {
							feldNr[0] += 6 * j;
						}
						feldNr[0]++;
						for (int j = 0; j <= rundenNr - 1; j++) {
							feldNr[1] += 6 * j;
						}
						for (int j = 0; j <= rundenNr; j++) {
							feldNr[2] += 6 * j;
						}

					} else {
						feldNr[0] = feld0_hilfe;
						feldNr[1] = feldNr[0]
								+ ((((int) Math.pow(-1, seitenposition) - 1) / -2)
										* seitenzaehler + ((((int) Math.pow(-1,
										seitenposition) + 1) / 2)));
						feldNr[2] = feldNr[1]
								+ ((((int) Math.pow(-1, seitenposition) + 1) / 2)
										* seitenzaehler + ((((int) Math.pow(-1,
										seitenposition) - 1) / -2)));
					}

					/*// DEBUG-Info
					System.out.print("Runde: " + rundenNr + "; EckenNr: "
							+ eckenNr + "; Seitenzaehler: " + seitenzaehler
							+ "; temp: " + temp01 + "; Feld: " + feldNr[0]
							+ " " + feldNr[1] + " " + feldNr[2]);
				 	*/
					if (vorletzterPunktinrunde) {
						System.out.println("; v");
					} else if (letzterPunktinrunde) {
						System.out.println("; l");
					} else {
						System.out.println("");
					}

					for (int j = 0; j < 3; j++) {
						tempTyp[j] = vorlage[feldNr[j]].getTyp();
						tempTyp_wuerfelzahl[j] = vorlage[feldNr[j]]
								.getWuerfelzahl();
					}

					tempEcke.setTyp(tempTyp);
					tempEcke.setTyp_wuerfelzahl(tempTyp_wuerfelzahl);
					eckenNr++;
					seitenposition++;
				}
				seitenposition = 1;

				if (rundenNr == 1) {
					feld0_hilfe++;
				} else {
					seitenzaehler++;
				}
			}

		} else {
			rueckgabe = new ArrayList<Feld_Ecke>(1);
		}
		return (Feld_Ecke[]) rueckgabe.toArray(new Feld_Ecke[0]);
	}

	public int ermittleeckenzahl() {
		int anzahlRunden = last_groesse + 1;
		return (anzahlRunden * anzahlRunden * 6) - 1;
	}

	public int ermittleeckenzahl(int rundenAnzahl) {
		return (rundenAnzahl * rundenAnzahl * 6) - 1;
	}

	public int ermittleeckenzahl_aktuelleRunde(int aktuelleRunde) {
		return ((int) Math.pow(aktuelleRunde, 2) * 6)
				- ((int) Math.pow(aktuelleRunde - 1, 2) * 6);
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

	/**
	 * 
	 * @return
	 */
	public LandTyp TestgetRndTyp() {
		return getRndTyp();
	}

	/**
	 * 
	 * @return
	 */
	public int TestgetRndWuerfelzahl() {
		return getRndWuerfelzahl();
	}

	/**
	 * 
	 */
	public void resetGenerator() {
		last_kartenGesamt = 0;
		last_kartenGesamtoW = 0;
		wueste_verwendet = false;
		genhex = false;
		anzahl_berge = 0;
		anzahl_gruben = 0;
		anzahl_wiesen = 0;
		anzahl_felder = 0;
	}

	/**
	 * 
	 */
	public Generator() {
		resetGenerator();
	}
}
