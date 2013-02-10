package Baustein;

import Spieler.Spieler;

/**
 * Diese abstracte Klasse beschreibt alle Bausteine die auf dem Spielfeld platziert werden k�nnen.
 * @author Robin
 *
 */
public abstract class Baustein {
	private Spieler besitzer;
	
	/**
	 * Getter f�r Besitzer
	 * @return gibt den bestzer des Bausteines zur�ck
	 */
	public Spieler getBesitzer ()
	{
		return besitzer;
	}
	
	/**
	 * Konstruktor f�r ein Objekt der Klasse Baustein.
	 * @param besitzer Es wird ein Verweis auf den Spieler benoetigt, der diesen Baustein
	 * besitzen soll
	 */
	public Baustein(Spieler besitzer)
	{
		this.besitzer = besitzer;
	}
}
