package interfaces;

public class Automovil extends Vehiculo implements Rodable{

	public Automovil() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void identificarse() {
		// TODO Auto-generated method stub
		System.out.println("Soy un auto");
	}

	@Override
	public String tipoVehiculo() {
		// TODO Auto-generated method stub
		return "AUTO";
	}

	@Override
	public void rodar() {
		// TODO Auto-generated method stub
		System.out.println("Soy un auto ruedo siempre");
	}

}
