package programa;

public class Ejercicio4 {

	/*
	 * Programa java que declare cuatro variables enteras A, B, C y D y 
	 * asígnale un valor a cada una. A continuación realiza las instrucciones 
	 * necesarias para que:
B tome el valor de C
C tome el valor de A
A tome el valor de D
D tome el valor de B
Si por ejemplo A = 1, B = 2, C = 3 y D = 4 el programa debe mostrar:*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		claseEjer4 c4 = new claseEjer4();
		c4.setA(1);
		c4.setB(2);
		c4.setC(3);
		c4.setD(4);
		
		System.out.println("a, b, c, d: "+c4.getA()+", "+c4.getB()+", "+c4.getC()+", "+c4.getD());
		
		c4.setB(c4.getC());
		System.out.println("Luego b=c "+c4.getB());
		c4.setC(c4.getA());
		System.out.println("Luego c=a "+c4.getC());
		c4.setA(c4.getD());
		System.out.println("Luego a=d "+c4.getA());
		c4.setD(c4.getB());
		System.out.println("Luego d=b "+c4.getD());
		
		
	}

}
