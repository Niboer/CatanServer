package JUnitTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Spielfeld.Generator;

public class JTestGeneratorgetRndWuerfelzahl {

	@Test
	public void test() {
		Generator worldgen = new Generator();
		int neue_Zahl;
		for (int i = 0; i < 100000000; i++) {
			neue_Zahl = worldgen.TestgetRndWuerfelzahl();

			if (neue_Zahl <= 1 || neue_Zahl >= 13) {
				System.out
						.println("Durchlauf: " + i + " Ausgabe: " + neue_Zahl);
				assertTrue(false);
			}
		}
	}
}
