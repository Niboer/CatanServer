package Ressourcen;

/**
 * Diese Klasse definiert die Ressourcen für
 * 
 * @author Robin
 * 
 */
public class Ressourcen {
	int[] menge = new int[4];

	public int getRess(int RessTyp) {
		try {
			return menge[RessTyp];
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
	}

	boolean setRess(int neuer_wert, int RessTyp) {
		if (neuer_wert >= 0) {
			try {
				menge[RessTyp] = neuer_wert;
			} catch (ArrayIndexOutOfBoundsException e) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean veraendernRess(int unterschied, int RessTyp) {
		try {
			if (menge[RessTyp] + unterschied < 0) {
				return false;
			} else {
				menge[RessTyp] += unterschied;
				return true;
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			return false;
		}
	}

	public boolean veraendernRess(Ressourcen differenz) {

		return false;
	}

	public Ressourcen() {
		for (int i = 0; i < menge.length; i++) {
			menge[i] = 0;
		}
	}

	public Ressourcen(int weizen, int holz, int eisen, int schaf) {
		if (!this.setRess(weizen, RessTyp.WEIZEN.getStelle())) {
			this.setRess(0, RessTyp.WEIZEN.getStelle());
		}
		if (!this.setRess(eisen, RessTyp.EISEN.getStelle())) {
			this.setRess(0, RessTyp.EISEN.getStelle());
		}
		if (!this.setRess(holz, RessTyp.HOLZ.getStelle())) {
			this.setRess(0, RessTyp.HOLZ.getStelle());
		}
		if (!this.setRess(schaf, RessTyp.SCHAF.getStelle())) {
			this.setRess(0, RessTyp.SCHAF.getStelle());
		}
	}
}
