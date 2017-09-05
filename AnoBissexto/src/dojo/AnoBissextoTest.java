package dojo;
import static org.junit.Assert.*;

import org.junit.Test;

public class AnoBissextoTest {

	@Test
	public void testAno2001() {
		boolean ano = AnoBissexto.anoValido(2001); 
		assertEquals(false, ano);
	}
	
	@Test
	public void testAno1600() {
		boolean ano = AnoBissexto.anoValido(1600); 
		assertEquals(true, ano);
	}
	
	@Test
	public void testAno1732() {
		boolean ano = AnoBissexto.anoValido(1732); 
		assertEquals(true, ano);
	}
	
	@Test
	public void testAno2008() {
		boolean ano = AnoBissexto.anoValido(2008); 
		assertEquals(true, ano);
	}
	
	@Test
	public void testAno1944() {
		boolean ano = AnoBissexto.anoValido(1944); 
		assertEquals(true, ano);
	}
	
	@Test
	public void testAno1889() {
		boolean ano = AnoBissexto.anoValido(1889); 
		assertEquals(false, ano);
	}
	
	@Test
	public void testAno1951() {
		boolean ano = AnoBissexto.anoValido(1951); 
		assertEquals(false, ano);
	}
	
	@Test
	public void testAno2011() {
		boolean ano = AnoBissexto.anoValido(2011); 
		assertEquals(false, ano);
	}
	
	@Test
	public void testAno1900() {
		boolean ano = AnoBissexto.anoValido(1900); 
		assertEquals(false, ano);
	}
	
	@Test
	public void testAno2100() {
		boolean ano = AnoBissexto.anoValido(2100); 
		assertEquals(false, ano);
	}
	
	@Test
	public void testAno1800() {
		boolean ano = AnoBissexto.anoValido(1800); 
		assertEquals(false, ano);
	}


}
