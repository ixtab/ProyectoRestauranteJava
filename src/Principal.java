import java.util.Scanner;

import procesos.*;

public class Principal {

	public static void main(String[] args) {
		
		String opcion = "";
		
		Scanner scn = new Scanner(System.in);
		do {
			System.out.println("1. Añadir Restaurante");
			System.out.println("2. Listado de restaurantes");
			System.out.println("5. Salir");
			System.out.println("----------");
			System.out.println("opcion: ");
			
			opcion = scn.nextLine();
			
			switch (opcion) {
			case "1":
				System.out.println(ProcesosRestaurante.AddRestaurante());
				break;
			case "2":
				ProcesosRestaurante.listadoRestaurantes();
				break;
			case "5":
				System.out.println("Programa finalizado");
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
			
		} while (!opcion.equals("5"));
		
		scn.close();
	}

}
