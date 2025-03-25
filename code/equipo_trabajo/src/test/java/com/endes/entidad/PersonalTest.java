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
	
    @Test
    @DisplayName("No se permite crear una persona con DNI nulo")
    void testContructorExcepcionDNINulo() {

		Exception ex = assertThrows(IllegalArgumentException.class, ()->new Desarrollador(null,"Sergio", 1000.00, "Java") );
		String mensajeEsperado = "DNI no válido.";
		
		assertEquals(mensajeEsperado, ex.getMessage());
    }
    
    @Test
    @DisplayName("No se permite crear una persona con DNI vacio")
    void testContructorExcepcionDNIVacio() {
		
		Desarrollador d = null;
		Exception ex = assertThrows(IllegalArgumentException.class, ()->new Desarrollador(" ","Sergio", 1000.00, "Java") );
		String mensajeEsperado = "DNI no válido.";
		
		assertEquals(mensajeEsperado, ex.getMessage());
    }
    
    @Test
    @DisplayName("No se permite crear una persona con Nombre nulo")
    void testContructorExcepcionNombreNulo() {

		Exception ex = assertThrows(IllegalArgumentException.class, ()->new Desarrollador("11111111H",null, 1000.00, "Java") );
		String mensajeEsperado = "Nombre no válido.";
		
		assertEquals(mensajeEsperado, ex.getMessage());
    }
    
    @Test
    @DisplayName("No se permite crear una persona con Nombre vacio")
    void testContructorExcepcionNombreVacio() {

		Exception ex = assertThrows(IllegalArgumentException.class, ()->new Desarrollador("11111111H"," ", 1000.00, "Java") );
		String mensajeEsperado = "Nombre no válido.";
		
		assertEquals(mensajeEsperado, ex.getMessage());
    }
    
    @Test
    @DisplayName("No se permite crear una persona con sueldo negativo")
    void testContructorExcepcionSueldoNegativo() {

		Exception ex = assertThrows(IllegalArgumentException.class, ()->new Desarrollador("11111111H","Sergio", -1000.00, "Java") );
		String mensajeEsperado = "El sueldo base no puede ser negativo.";
		
		assertEquals(mensajeEsperado, ex.getMessage());
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
