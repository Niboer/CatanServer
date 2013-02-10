package Server;

/**
 * Diese Klasse stellet die Wuerfel dar.
 */
public class Wuerfel {

	int w1; //Wuerfel 1
	int w2; //Wuerfel 2
	
	public void wuerfeln(){
		w1 =(int) ((Math.random()*120)%6)+1;
		w2 =(int) ((Math.random()*120)%6)+1;	
	}
	
	public int getWuerfel1(){
		return w1;
	}
	
	public int getWuerfel2(){
		return w2;
	}
	
	
	
}
