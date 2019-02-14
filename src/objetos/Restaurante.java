package objetos;

public class Restaurante {
	
	static private int contadorRestaurantes = 0;
	
	private Direccion direccion;
	private String nombre;
	private  final int idRestaurante = ++contadorRestaurantes;
	private Menu menu;
	
	public Restaurante() {
		
	}
	
	public Restaurante(Direccion direccion, String nombre) {
		this.direccion = direccion;
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdRestaurante() {
		return idRestaurante;
	}
	
	public void setMenu() {
		menu = new Menu();	
	}
	
	public String getMenu() {
		String textoMenu = "Primeros: \n" +
							menu.getPrimeros() +
							"\nSegundos:\n" +
							menu.getSegundos() +
							"\n " +
							menu.getComentarios()+ 
							"\nPrecio: " + menu.getPrecio(); 
		return textoMenu;
	}
	
	public static int getTotalRestaurantes() {
		return contadorRestaurantes;
	}
	
	
}
