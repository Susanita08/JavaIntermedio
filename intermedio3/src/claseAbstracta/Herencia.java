package claseAbstracta;

public class Herencia {

	public static void main(String[] args) {
		int i=0;
		Vehiculo[] vehiculos = {new Vehiculo(),new Barco(), new Vehiculo()};
		for(Vehiculo vehiculo : vehiculos) {
			if(vehiculo instanceof Barco) {
				((Barco)vehiculo).flotar(i);
			}
			else {
				System.out.println("Se movio desde "+i+"hasta "+vehiculo.moverse(i, 5));
			}
			i++;
		}
	}

}
