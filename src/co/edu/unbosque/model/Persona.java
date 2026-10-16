package co.edu.unbosque.model;

public class Persona {

	private String nombrePersona;
	private String generoPersona;
	private short edadPersona;

	public Persona(String nombrePersona, String generoPersona, short edadPersona) {
		super();
		this.nombrePersona = nombrePersona;
		this.generoPersona = generoPersona;
		this.edadPersona = edadPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getGeneroPersona() {
		return generoPersona;
	}

	public void setGeneroPersona(String generoPersona) {
		this.generoPersona = generoPersona;
	}

	public short getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(short edadPersona) {
		this.edadPersona = edadPersona;
	}

}
