package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import Spielfeld.Generator;

public class JTestGeneratorermittleeckenzahl_aktuelleRunde {

	@Test
	public void test() {
		Generator worldgen=new Generator();
		for (int i=1;i<=10;i++)
			System.out.println("Runde "+ i + ": " + worldgen.ermittleeckenzahl_aktuelleRunde(i));
	}

}
