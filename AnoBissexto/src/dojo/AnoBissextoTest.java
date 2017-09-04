package dojo;
import static org.junit.Assert.*;

import org.junit.Test;

public class AnoBissextoTest {

	@Test
	public void testAno2001() {
		boolean ano = AnoBissexto.anoValido(2001); 
		assertEquals(false, ano);
	}

}
