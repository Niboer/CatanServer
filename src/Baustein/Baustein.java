package Baustein;

import Spieler.Spieler;

/**
 * Diese abstracte Klasse beschreibt alle Bausteine die auf dem Spielfeld platziert werden können.
 * @author Robin
 *
 */
public abstract class Baustein {
	private Spieler besitzer;
	
	/**
	 * Getter für Besitzer
	 * @return gibt den bestzer des Bausteines zurück
	 */
	public Spieler getBesitzer ()
	{
		return besitzer;
	}
	
	/**
	 * Konstruktor für ein Objekt der Klasse Baustein.
	 * @param besitzer Es wird ein Verweis auf den Spieler benoetigt, der diesen Baustein
	 * besitzen soll
	 */
	public Baustein(Spieler besitzer)
	{
		this.besitzer = besitzer;
	}
}
