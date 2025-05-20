package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo t1 = new TrianguloRectangulo (6,1);
		TrianguloRectangulo t2 = new TrianguloRectangulo ();
		
		double primeraArea = t1.area();
		double primerPerimetro = t1.perimetro();
		double segundaArea = t2.area();
		double segundoPerimetro = t2.perimetro();


	}

}
