package intermedio;

public class Usuario {

	private String nombre;
	private int edad;
	private char genero;

	


	public Usuario(String nombre, int edad, char genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
	}
	
	
	public boolean equals(Object arg0) {
		if(arg0 instanceof Usuario) {
			Usuario param= (Usuario)arg0;
			return this.nombre.equalsIgnoreCase(param.getNombre())
					&& this.edad == param.getEdad();
		
		}
		else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		
		return "Nombre: "+this.nombre + " edad:" + this.edad;
	}

	

	@Override
	public int hashCode() {
		return this.getEdad()+this.getNombre().toLowerCase().hashCode();
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}
}
