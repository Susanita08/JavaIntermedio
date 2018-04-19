package programa;

public class Ejercicio1 {

	/*
	 *Programa java que realice lo siguiente: 
	 *declarar una variable N de tipo int, 
	 *una variable A de tipo double y una variable C de tipo char y
	 * asigna a cada una un valor. A continuación muestra por pantalla: 
	 * El valor de cada variable, la suma de N + A, la diferencia de A - N, 
	 * el valor numérico correspondiente al carácter que contiene la variable C. */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El valor de cada variable: ");
		System.out.println("Variable N: "+getN());
		System.out.println("Variable A: "+getA());
		System.out.println("Variable C: "+getC());
		System.out.println("N+A: "+(getN()+getA()));
		System.out.println("A-N: "+(getA()-getN()));
		System.out.println("Valor númerico de C: "+getC()+" es: "+(int)getC());
	}
	
	private static int N=5;
	public static int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	public static double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public static char getC() {
		return C;
	}

	public void setC(char c) {
		C = c;
	}

	private static double A=3;
	private static char C='a';

}
