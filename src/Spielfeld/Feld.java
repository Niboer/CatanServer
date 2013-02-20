package Spielfeld;

/**
 * Diese Klasse beschreibt ein Feld im Spielfeld. Da die Felder sechs Ecken haben, werden sie als "Hexagon" bezeichnet.
 * @author frankero
 *
 */
public class Feld {
	LandTyp typ;
	int wuerfelzahl;
	
	/**
	 * 
	 * @param typ
	 * @param wuerfelzahl
	 */
	public Feld(LandTyp typ, int wuerfelzahl)
	{
		this.typ=typ;
		this.wuerfelzahl=wuerfelzahl;	
	}
	
	public LandTyp getTyp()
	{
		return typ;
	}
	
	public int getWuerfelzahl()
	{
		return wuerfelzahl;
	}
	
	public void setTyp(LandTyp neuerTyp)
	{
		typ=neuerTyp;
	}
	
	public boolean setWuerfelzahl(int neueZahl)
	{
		if (neueZahl >= 2 && neueZahl <= 12)
		{
			wuerfelzahl=neueZahl;
			return true;
		}
		else
		{
			return false;
		}
	}	
}
