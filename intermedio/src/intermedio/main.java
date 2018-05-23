package intermedio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario u = new Usuario("Pepito",16, 'I');
		Usuario u2 = new Usuario("Vero",25, 'F');
		Usuario u3 = new Usuario("Jose",34, 'M');
		Usuario u4 = new Usuario("Pepe",16, 'm');
		Usuario u5 = new Usuario("Veronica",25, 'f');
		Usuario u6 = new Usuario("Luisa",34, 'i');
		
		Set <Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(u);
		usuarios.add(u2);
		usuarios.add(u3);
		usuarios.add(u4);
		usuarios.add(u5);
		usuarios.add(u6);

		usuarios.stream().forEach(System.out::println);
		Usuario usu=null;
		
		for(Object object: usuarios){
			System.out.println(" ");
			System.out.println(object);
			//Imprimir frnaja de edad y genero(usar switch o if / else cuando corresponda)
			usu = (Usuario) object;
			switch(usu.getGenero()) {
				case 'f': case 'F':
					System.out.println(" Es mujer, ");
					break;
				case 'm': case 'M':
					System.out.println(" Es hombre, ");
					break;	
				default:
					System.out.println(" Es de genero indeterminado.");
					break;	
			}
			if(usu.getEdad()<20) {
				System.out.println("Es joven.");
			}
			else if(usu.getEdad()<30){
				System.out.println("Es adulto");
			}
			else {
				System.out.println("Es más adulto.");
			}
			
			  LocalDate date = LocalDate.now();
			  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			  String text = date.format(formatter);
			  LocalDate parsedDate = LocalDate.parse(text, formatter);
			  System.out.println(parsedDate);
		}
	}

}
