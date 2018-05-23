package lamda;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public Lambda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = {"SUSANA", "SEBASTIAN", "DIEGO"};
		List<String> lista = Arrays.asList(nombres);
		lista.replaceAll(nombre -> nombre.toLowerCase());
		System.out.println("En minuscula "+lista);
		lista.replaceAll(nombre ->darVuelta(nombre));
		System.out.println(lista);
	}
	
	private static String darVuelta(String v) {
		String vuelta="";
		for(int i=v.length()-1;i>0;i--) {
			vuelta+=v.charAt(i);
		}
		return vuelta;
	}

}
