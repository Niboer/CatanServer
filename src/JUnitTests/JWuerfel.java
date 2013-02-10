package JUnitTests;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Test;

import Server.Wuerfel;

public class JWuerfel {

	@Test
	public void wuerfel_werfen() {
		Wuerfel w = new Wuerfel();
		
		for (int i = 0; i < 1000; i++) {
			w.wuerfeln();
			int w1 = w.getWuerfel1();
			int w2 = w.getWuerfel2();
			int ergebnis = w1 + w2;
			System.out.println(ergebnis);
			if(ergebnis > 12 || ergebnis < 2){
				Assert.fail("Ergebnis: " + ergebnis);
			}
		}
		Assert.assertTrue(true);

	}
	

}
