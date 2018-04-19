package programa;

public class Ejercicio2 {
	/*
	 *
	2. Programa java que realice lo siguiente: 
	declarar dos variables X e Y de tipo int, 
	dos variables N y M de tipo double 
	y asigna a cada una un valor. 
	A continuación reliza y muestra muestra por pantalla una serie 
	de operaciones entre ellas.  */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*

Si por ejemplo le hemos dado a X el valor 1, a Y el valor 2, a M el valor 3.2 y a N el valor 4.7 se debe mostrar por pantalla:
		 * Las ecuaciones de segundo grado son de la forma Mx2+ Nx + y = 0*/
		
		claseEjer2  c = new claseEjer2();
		System.out.println("Valores de x,y,M,N es: "+c.getX()+", "+c.getY()+", "+c.getM()+", "+c.getN());
		System.out.println("La ecuación de segundo grado para hallar el valor de x es:");
//		System.out.println("Valor positivo de la raíz: "+((-1)*c.getN()+(float)Math.sqrt((c.getN()*c.getN())-4*c.getM()*c.getY()))/2*c.getM());
//		System.out.println("Valor negativo de la raíz: "+((-1)*c.getN()-(float)Math.sqrt((c.getN()*c.getN())-4*c.getM()*c.getY()))/2*c.getM());
		c.setM(3.2);
		c.setN(4.7);
		c.setX(1);
		c.setY(2);
		System.out.println("La suma de cada variables: "+(c.getM()+c.getN()+c.getX()+c.getY()));
		System.out.println("x+y: "+(c.getX()+c.getY()));
		System.out.println("x-y: "+(c.getX()-c.getY()));
		System.out.println("x*y: "+(c.getX()*c.getY()));
		System.out.println("x/y: "+(c.getX()/c.getY()));
		System.out.println("x%y: "+(c.getX()%c.getY()));
		System.out.println("...........................");
		System.out.println("N+M: "+(c.getN()+c.getM()));
		System.out.println("N-M: "+(c.getN()-c.getM()));
		System.out.println("N*M: "+(c.getN()*c.getM()));
		System.out.println("N/M: "+(c.getN()/c.getM()));
		System.out.println("N%M: "+(c.getN()%c.getM()));
		System.out.println("...........................");
		System.out.println("x+N: "+(c.getX()+c.getN()));
		System.out.println("y/M: "+(c.getY()-c.getM()));
		System.out.println("y%M: "+(c.getY()%c.getM()));
		System.out.println("El doble de cada variable: "+2*c.getX()+", "+2*c.getY()+", "+2*c.getM()+", "+2*c.getN());
		System.out.println("x%y: "+(c.getX()%c.getY()));
		System.out.println("El producto de todas las variables: "+(c.getM()*c.getN()*c.getX()*c.getY()));
		
	}

}
