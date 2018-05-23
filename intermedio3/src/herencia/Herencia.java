package herencia;

public class Herencia {

	public static void main(String[] args) {
		int i=0;
		Vehiculo[] vehiculos = {new Barco(),new Barco(), new Avion()};
		for(Vehiculo vehiculo : vehiculos) {
			vehiculo.identificarse();
			if(vehiculo instanceof Barco) {
				((Barco)vehiculo).flotar(i);
			}
			else {
				System.out.println("Se movio desde "+i+"hasta "+vehiculo.moverse(i, 5));
			}
			System.out.println(vehiculo.toString());
			i++;
		}
	}

}
