package programa;

public class Ejercicio3 {

	/*
	 * Escribe un programa Java que declare una variable entera N y asígnale un valor. 
	 * A continuación escribe las instrucciones que realicen los siguientes:
Incrementar N en 77.
Decrementarla en 3.
Duplicar su valor.
Si por ejemplo N = 1 la salida del programa será:

*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		claseEjer2  c = new claseEjer2();
		c.setN(1);
		System.out.println("incremento en 77: "+(c.getN()+77)+"decremento en 3: "+(c.getN()-3)+"Duplicar: "+(2*c.getN()));
	}

}
