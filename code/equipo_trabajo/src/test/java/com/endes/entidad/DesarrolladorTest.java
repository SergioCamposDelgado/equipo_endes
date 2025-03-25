package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class DesarrolladorTest {

	protected Desarrollador d;
	@BeforeEach
	void setUp() throws Exception {
		d = new Desarrollador("11111111H", "Sergio", 1000.00, "Java");
	}
	
	
	@DisplayName("Test de metodo getLenguajePrincipal()")
	@Test
	void testGetLenguajePrincipal() {
		String respuestaObtenida = d.getLenguajePrincipal();
		
		String respuestaEsperada = "Java";
		
		assertEquals(respuestaEsperada, respuestaObtenida);
	}

	@DisplayName("Test de metodo calcularProductividad()")
	@Test
	void testCalcularProductividad() {
		double respuestaObtenida = d.calcularProductividad();
		
		double respuestaEsperada = 1100.00;
		
		assertEquals(respuestaEsperada, respuestaObtenida);
	}
	
	@DisplayName("Test de metodo calcularProductividad()")
	@Test
	void testCalcularProductividadSin() {
		d = new Desarrollador("11111111H", "Sergio", 1000.00, "C++");
		double respuestaObtenida = d.calcularProductividad();
		
		double respuestaEsperada = 1000.00;
		
		assertEquals(respuestaEsperada, respuestaObtenida);
	}
}
