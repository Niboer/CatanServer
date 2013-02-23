package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import Spielfeld.Generator;

public class JTestGeneratorEckengen {

	@Test
	public void test() {
		Generator worldgen=new Generator();
		worldgen.genEckenSpielfeld(worldgen.genHexagonSpielfeld(4));
	}

}
