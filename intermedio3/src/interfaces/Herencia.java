package interfaces;

import java.util.Arrays;
import java.util.List;


public class Herencia {

	public static void main(String[] args) {
		int i=0;
		Vehiculo[] vehiculos = {new Barco(),new Barco(), new Avion(), new Automovil()};
		List<Vehiculo> lista = Arrays.asList(vehiculos);
		for(Vehiculo vehiculo : vehiculos) {
			vehiculo.identificarse();
			if(vehiculo instanceof Barco) {
				((Barco)vehiculo).flotar(i);
			}
			else {
				System.out.println("Se movio desde "+i+"hasta "+vehiculo.moverse(i, 5));
			}
			if(vehiculo instanceof Rodable) {
				((Rodable)vehiculo).rodar();
			}
			System.out.println(vehiculo.toString());
			System.out.println("_______________");
			i++;
		}
	}

}
