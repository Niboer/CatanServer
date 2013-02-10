package Server;

/**
 * Diese Klasse stellet die Wuerfel dar.
 */
public class Wuerfel {

	int w1; //Wuerfel 1
	int w2; //Wuerfel 2

	/**
	 * In dieser Methode werden zwei zufaellige Zahlenwerte generiert,
	 * die zwischen 1 und 6 liegen und damit einem W6 Wuerfel entsprechen.
	 * Diese Werte werden in den Attributen w1 und w2 gespeichert.
	 */
	public void wuerfeln(){
		w1 =(int) ((Math.random()*120)%6)+1;
		w2 =(int) ((Math.random()*120)%6)+1;	
	}
	
	/**
	 * Getter fuer w1
	 * @return Wert fuer w1
	 */
	public int getWuerfel1(){
		return w1;
	}
	
	/**
	 * Getter fuer w2
	 * @return
	 */
	public int getWuerfel2(){
		return w2;
	}	
}
