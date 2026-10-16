package co.edu.unbosque.model;

import java.util.ArrayList;

public class Registraduria {

	ArrayList<Persona> personaNatural = new ArrayList ();
	
	public void ingresarPersona(String nombrePersona, String sexoPersona, short edadPersona) {
		personaNatural.add(new Persona(nombrePersona, sexoPersona, edadPersona));
	}
	
	public ArrayList<Persona> listarPersonasRegistradas() {
	    return new ArrayList<>(personaNatural); // devuelve una copia defensiva
	}

}
