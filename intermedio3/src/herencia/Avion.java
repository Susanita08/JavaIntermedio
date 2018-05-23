package herencia;

import interfaces.Rodable;

public class Avion extends Vehiculo implements Rodable{

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

	@Override
	public void rodar() {
		// TODO Auto-generated method stub
		System.out.println("Soy un avion ruedo en el arranque");
	}
	
	

}
