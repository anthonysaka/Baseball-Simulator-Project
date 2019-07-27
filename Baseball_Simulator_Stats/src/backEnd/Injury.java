package backEnd;

import java.io.Serializable;

public class Injury implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7313436801787544469L;
	private String equipo;
	private String nombrejugador;
	private String fechalesion;
	private String tipoLesion;

	
	public Injury (String equipo, String nombrejugador, String fechalesion, String tipoLesion) {
		super();
		this.equipo = equipo;
		this.nombrejugador = nombrejugador;
		this.fechalesion = fechalesion;
		this.tipoLesion = tipoLesion;
		
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getNombrejugador() {
		return nombrejugador;
	}

	public void setNombrejugador(String nombrejugador) {
		this.nombrejugador = nombrejugador;
	}

	public String getFechalesion() {
		return fechalesion;
	}

	public void setFechalesion(String fechalesion) {
		this.fechalesion = fechalesion;
	}

	public String getTipoLesion() {
		return tipoLesion;
	}

	public void setTipoLesion(String tipoLesion) {
		this.tipoLesion = tipoLesion;
	}


}
