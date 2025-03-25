package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonalTest {

	protected Personal p;
	@BeforeEach
	void setUp() throws Exception {
		p = new Desarrollador("11111111H", "Sergio", 1000.00, "Java");
	}
	
	@DisplayName("Test de metodo getDNI()")
	@Test
	void testGetDNI() {
		String respuestaObtenida = p.getDni();
		
		String respuestaEsperada = "11111111H";
		
		assertEquals(respuestaEsperada, respuestaObtenida);
	}
	
	@DisplayName("Test de metodo getNombre()")
	@Test
	void testGetNombre() {
		String respuestaObtenida = p.getNombre();
		
		String respuestaEsperada = "Sergio";
		
		assertEquals(respuestaEsperada, respuestaObtenida);
	}
	
	@DisplayName("Test de metodo getSueldoBase()")
	@Test
	void testGetSuedoBase() {
		double respuestaObtenida = p.getSueldoBase();
		
		double respuestaEsperada = 1000.00;
		
		assertEquals(respuestaEsperada, respuestaObtenida);
	}
	
	@DisplayName("Test de metodo setSueldoBase()")
	@Test
	void testSetSuedoBase() {
		p.setSueldoBase(1200.00);
		double respuestaObtenida = p.getSueldoBase();
		
		double respuestaEsperada = 1200.00;
		
		assertEquals(respuestaEsperada, respuestaObtenida);
	}

}
