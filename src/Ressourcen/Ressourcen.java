package Ressourcen;

public class Ressourcen {
	int[] menge = new int[4];

	public int getRess(int RessTyp) {
		try {
			return menge[RessTyp];
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
	}

	public boolean setRess(int neuer_wert, int RessTyp) {
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
	
	public boolean veraendernRess(int unterschied, int RessTyp)
	{
		try
		{
			if (menge[RessTyp]-unterschied <= 0)
			{
				return false;
			}
			else
			{
				menge[RessTyp]-=unterschied;
				return true;
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
}
