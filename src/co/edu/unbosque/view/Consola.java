package co.edu.unbosque.view;

import java.util.ArrayList;
import java.util.Scanner;

public class Consola {

	private Scanner consola = new Scanner(System.in);

	public int menu() {
		System.out.println("""
				1. Registrar Persona
				2. Ver Personas
				3. Salir del programa
				""");
		return consola.nextInt();
	}
	
	public void mensajeConsola(String mensaje) {
		System.out.println(mensaje);
	}
	
	public void mensajeArrayList(ArrayList persona) {
		System.out.println(persona);
	}
	
	public String pedirNombre() {
		System.out.println("Ingrese su nombre: ");
		String nombrePersona = consola.nextLine();
		consola.nextLine();
		return nombrePersona;
	}

	public String pedirSexo() {
		System.out.println("Ingrese su sexo: ");
		String sexoPersona = consola.nextLine();
		consola.nextLine();
		return sexoPersona;
	}

	public short pedirEdad() {
		System.out.println("Ingrese su edad: ");
		short edadPersona = consola.nextShort();
		return edadPersona;
	}

}
