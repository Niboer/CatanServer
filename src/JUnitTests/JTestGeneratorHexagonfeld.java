package JUnitTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Spielfeld.Spielfeld;

public class JTestGeneratorHexagonfeld {

	@Test
	public void test() {
		Spielfeld spielfeld = new Spielfeld();
		int spielfeldGroesse = 1;

		if (!spielfeld.genSpielfeld(spielfeldGroesse)) {
			assertTrue(false);
		}

		spielfeldGroesse = 2;

		if (!spielfeld.genSpielfeld(spielfeldGroesse)) {
			assertTrue(false);
		}

		spielfeldGroesse = 3;

		if (!spielfeld.genSpielfeld(spielfeldGroesse)) {
			assertTrue(false);
		}

		spielfeldGroesse = 4;

		if (!spielfeld.genSpielfeld(spielfeldGroesse)) {
			assertTrue(false);
		}
	}

}
