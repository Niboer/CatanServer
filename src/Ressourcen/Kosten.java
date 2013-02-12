package Ressourcen;

/**
 * Diese Klasse beschreibt die Kosten einer Aktion auf dem Spielfeld
 * @author Robin
 *
 */
public class Kosten {
	Ressourcen kosten;
	
	/**
	 * Getter für die kosten
	 * @return kosten
	 */
	public Ressourcen getKosten()
	{
		return kosten;
	}
	
	/**
	 * Konstruktor für die Klasse Kosten.
	 * @param kosten Es muss ein Objekt vom Typ Ressourcen als kostenbeshreibung hinterlegt werden.
	 */
	public Kosten(Ressourcen kosten)
	{
		this.kosten = kosten;
	}
}
