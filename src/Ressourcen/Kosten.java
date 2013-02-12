package Ressourcen;

/**
 * Diese Klasse beschreibt die Kosten einer Aktion auf dem Spielfeld
 * @author Robin
 *
 */
public class Kosten {
	Ressourcen kosten;
	
	/**
	 * Getter f�r die kosten
	 * @return kosten
	 */
	public Ressourcen getKosten()
	{
		return kosten;
	}
	
	/**
	 * Konstruktor f�r die Klasse Kosten.
	 * @param kosten Es muss ein Objekt vom Typ Ressourcen als kostenbeshreibung hinterlegt werden.
	 */
	public Kosten(Ressourcen kosten)
	{
		this.kosten = kosten;
	}
}
