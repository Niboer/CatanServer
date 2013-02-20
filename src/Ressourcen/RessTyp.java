package Ressourcen;

/**
 * Enum mit Werten fuer jeden RessourcenTyp
 * 
 * @author Robin
 * 
 */
public enum RessTyp {
	WEIZEN(0), HOLZ(1), EISEN(2), SCHAF(3);

	int wert;

	RessTyp(int stelle) {
		wert = stelle;
	}

	public int getStelle() {
		return wert;
	}
}
