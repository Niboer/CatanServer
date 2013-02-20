package Spielfeld;

/**
 * 
 * @author frankero
 *
 */
public class Spielfeld {
	Generator worldgen = new Generator();
	Feld[] karten;
	Feld_Ecke[] ecken;
	Kante[] kanten;
	int spielfeldGroesse;
	int[][] wuerfelzahlen_zu_ecke = new int[13][2];

	/**
	 * @param spielfeldGroesse
	 *            the spielfeldGroesse to set
	 */
	private boolean setSpielfeldGroesse(int spielfeldGroesse) {
		if (spielfeldGroesse > 0 && spielfeldGroesse < 10) {
			this.spielfeldGroesse = spielfeldGroesse;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Generiert das Spielfeld mit den Hexagons(Sechsecken)
	 * 
	 * @param spielfeldGroesse
	 *            radius des Spielfeldes OHNE Mittelpunkt und Wasserrand
	 * @return Erfolg oder nicht Erfolg
	 */
	public boolean genSpielfeld(int spielfeldGroesse) {
		if (setSpielfeldGroesse(spielfeldGroesse)) {
			karten = worldgen.genHexagonSpielfeld(this.spielfeldGroesse);
			return true;
		} else {
			worldgen.resetGenerator();
			return false;
		}
	}
}
