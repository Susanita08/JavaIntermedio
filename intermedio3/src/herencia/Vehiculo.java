package herencia;

public abstract class Vehiculo {

	public Vehiculo() {
		
	}
	
	public int moverse(int puntoI, int distancia) {
		return (puntoI+distancia);
	}

	public abstract void identificarse();
	public abstract String tipoVehiculo();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "toString de "+ tipoVehiculo();
	}
	
}
