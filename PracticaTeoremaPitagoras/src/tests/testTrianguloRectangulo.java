package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	static TrianguloRectangulo t1;

	@BeforeAll
	static void setup() {
		t1 = new TrianguloRectangulo();
	}

	@Test
	void testArea() {
		double resultadoObtenido = t1.area();
		double resultadoEsperado = 0.5;

		assertEquals(resultadoEsperado,resultadoObtenido);
	}

	@Test
	void testHipotenusa() {
		double resultadoObtenido = t1.hipotenusa();
		double resultadoEsperado = 1.41;

		assertEquals(resultadoEsperado,resultadoObtenido);
	}

	@Test
	void testPerimetro() {
		double resultadoObtenido = t1.perimetro();
		double resultadoEsperado = 3.41;

		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testArea2() {
		TrianguloRectangulo t2 = new TrianguloRectangulo(3, 4);
		double resultadoObtenido = t2.area();
		double resultadoEsperado = 6;

		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testHipotenusa2() {
		TrianguloRectangulo t2 = new TrianguloRectangulo(3, 4);
		double resultadoObtenido = t2.hipotenusa();
		double resultadoEsperado = 5.0;

		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testPerimetro2() {
    	TrianguloRectangulo t2 = new TrianguloRectangulo(3, 4);
		double resultadoObtenido = t2.perimetro();
		double resultadoEsperado = 12.0;

		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testExcepcion() {
		Exception e = assertThrows(IllegalArgumentException.class,() -> new TrianguloRectangulo(-1,0) );
		String mensajeEsperado = "Los catetos no pueden ser negativos";
		String mensajeObtenido = e.getMessage();
		assertEquals(mensajeEsperado,mensajeObtenido);
	}
}
