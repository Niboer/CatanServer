package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test; 
import Spielfeld.Generator;

public class JTestGeneratorermittleecken {

	@Test
	public void test() {
		Generator worldgen=new Generator();
		int erg;
		
		for (int i=0; i<4;i++)
		{
			worldgen.resetGenerator();
			worldgen.genHexagonSpielfeld(i);
			erg=worldgen.ermittleeckenzahl();
			
			//if (erg!=5)
			{
				System.out.println("Ergebis "+ (i+1) +" ist "+erg);
				//assertTrue(false);
			}
		}
	}

}
