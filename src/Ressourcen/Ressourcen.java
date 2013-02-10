package Ressourcen;
/**
 * Diese Klasse bildet die Verschiedenen Ressourcen des Spiels ab.
 * 
 * @author bejo
 *
 */

public enum Ressourcen {

	Holz(0), Lehm(0), Getreide(0), Schaf(0), Erz(0);

	int menge;

	/**
	 * Konstruktor mit Startwert 0.
	 * 
	 */
	Ressourcen(int menge) {
		this.menge = menge;
	}

	/**
	 * Getter fuer Menge.
	 * @return aktuelle Menge
	 */
	public int getMenge() {
		return menge;
	}
	
	/**
	 * Setter fuer Menge
	 * @param menge neue Menge
	 * @return True bei erfolgreicher Aenderung.
	 */
	public boolean setMenge(int menge) {
		if (menge < 0) {
			return false;
		} else {
			this.menge = menge;
			return true;
		}

	}

	/**
	 * Verändert die Menge relativ zur aktuellen Menge
	 * Positive Werte: hinzufügen der Ressource
	 * Negative Werte: abziehen der Ressource
	 * Der neue Wert darf dabei nicht unter 0 fallen.
	 * @param menge relative neue Menge
	 * @return True bei erfolgreicher Aenderung.
	 */
	public boolean verändern(int menge) {
		if(this.menge + menge < 0){
			return false;
		} else {
			this.menge += menge;
			return true;
		}
		

	}

}
