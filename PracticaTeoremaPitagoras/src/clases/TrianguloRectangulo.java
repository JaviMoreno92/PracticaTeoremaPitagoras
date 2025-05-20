package clases;

public class TrianguloRectangulo {
	double a;
	double b;
	double c;
	/**
	 * Constructor que recibe los valores de los parametros
	 * @param Recibe el valor del cateto a 
	 * @param Recibe el valor del cateto b
	 * @throws IllegalArgumentException Esto controla que los catetos no sean 0 o menos
	 */
	public TrianguloRectangulo(double a,double b) throws IllegalArgumentException {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Los catetos no pueden ser negativos");
		}
		this.a = a;
		this.b = b;
		this.c = hipotenusa();
	}
	/**
	 * Crea un TrianguloRectangulo con los valores dados
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	/**
	 * Funcion que calcula el area del Triangulo
	 * @return El area calculada
	 */
	public double area() {
		double area = (a * b) / 2.0;
		return area;
	}
	/**
	 * Funcion que calcula la hipotenusa del Triangulo
	 * @return La hipotenusa del Triangulo
	 */
	public double hipotenusa () {
		double hipotenusa = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		return hipotenusa;
	}
	/**
	 * Funcion que calcula el perimetro del Triangulo
	 * @return El perimetro del Triangulo
	 */
	public double perimetro () {
		double perimetro = a + b + hipotenusa();
		return perimetro;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	public String toString() {
		return "El cateto a es " + this.a + " ,el b es "+this.b+" y la hipotenusa es "+this.c;
	}

}
