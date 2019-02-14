package objetos;

import java.util.HashSet;

public class Menu {
	private HashSet<String> primeros = new HashSet<String>();
	private HashSet<String> segundos = new HashSet<String>();
	private int precio;
	private String comentarios;
	
	
	public String getPrimeros() {
		String listado="";
		
		for(String primero : primeros) {
			listado = listado + primero + "\n";
		}
		return listado;
	}
	
	public void setPrimeros(String plato) {
		this.primeros.add(plato);
	}
	
	public String getSegundos() {
		String listado="";
		
		for(String segundo : segundos) {
			listado = listado + segundo + "\n";
		}
		return listado;
	}
	
	public void setSegundos(String plato) {
		this.segundos.add(plato);
	}
	
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
	
}
