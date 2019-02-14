package objetos;

public class Direccion {
	private String direccion;
	private String zona; // podría ser barrio etc...
	private String cp;
	private String ciudad;
	
	public Direccion(String direccion, String zona, String cp, String ciudad) {
		this.direccion = direccion;
		this.zona = zona;
		this.cp = cp;
		this.ciudad = ciudad;
	}
	
	public Direccion() {}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}
