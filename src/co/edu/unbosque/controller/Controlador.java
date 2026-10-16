package co.edu.unbosque.controller;

import co.edu.unbosque.model.Registraduria;
import co.edu.unbosque.view.Consola;

public class Controlador {

	private Registraduria registraduria;
	private Consola consola;

	public void ejecutar() {
		registraduria = new Registraduria();
		consola = new Consola();

		int opcionMenu;
		do {
			opcionMenu = consola.menu();

			switch (opcionMenu) {
			case 1 -> {

				String nombre = consola.pedirNombre();
				String sexo = consola.pedirSexo();
				short edad = consola.pedirEdad();
				registraduria.ingresarPersona(nombre, sexo, edad);
				consola.mensajeConsola("Persona Registrada Exitosamente");
			}

			case 2 -> {
				consola.mensajeArrayList(registraduria.listarPersonasRegistradas());
			}

			case 3 -> {
				consola.mensajeConsola("Terminando programa, hasta pronto...");
			}
			default -> {
				consola.mensajeConsola("Ingrese de nuevo una opcion");
			}
			}
		} while (opcionMenu != 3);
	}
}
