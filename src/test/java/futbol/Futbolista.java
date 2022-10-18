package futbol;

public class Futbolista implements Comparable<Object> {
	
	private String nombre;
	private int edad;
	private String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setPosicion(posicion);
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
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

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + 
				getPosicion();
	}
	
	public boolean equals(Futbolista f) {
		if(this.hashCode() == f.hashCode()) {
			return true;
		}
		return false;
	}
	
	public boolean jugarConLasManos() {
		if(this instanceof Portero) {
			return true;
		}
		
		return false;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
