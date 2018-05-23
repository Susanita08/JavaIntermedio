package interfaces;

public class Avion extends Vehiculo{

	public Avion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void identificarse() {
		// TODO Auto-generated method stub
		System.out.println("Soy un avión");
	}

	public String getModelo() {
		return "737"; 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+getModelo();
	}

	@Override
	public String tipoVehiculo() {
		// TODO Auto-generated method stub
		return "AVION";
	}
	
	

}
