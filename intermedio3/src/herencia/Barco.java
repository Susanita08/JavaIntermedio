package herencia;

public class Barco extends Vehiculo{

	public Barco() {
		
	}

	public void flotar(int i) {
		System.out.println("El barco "+i+" flota");
	}

	@Override
	public void identificarse() {
		// TODO Auto-generated method stub
		System.out.println("Soy un barco...");
	}

	@Override
	public String tipoVehiculo() {
		// TODO Auto-generated method stub
		return "Barco";
	}
}
