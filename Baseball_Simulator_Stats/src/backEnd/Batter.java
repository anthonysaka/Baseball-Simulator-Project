package backEnd;

import java.io.Serializable;
import java.util.Date;

public class Batter extends Player implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6386883874716748621L;
	private String position;
	private float average;
	private int runs;
	private int H1;
	private int H2;
	private int H3;
	private int HR;
	private int RBI;
	private int baseBall;
	private int strikeOut;
	private int stolenBase;
	private String manoDeBateo;
//	private int numeroHitparapromedio = 0;
	private int turnos = 0;
	
	/* Constructor */
	
	public Batter(String id, String name, String number, String lastname, String teamName, Date birthdate, String birthplace,
			float height, float weight, String manoLanzar, String position, String manoDeBateo) {
		super(id, name, number, lastname, teamName, birthdate, birthplace, height, weight, manoLanzar);
		this.position = position;
		this.manoDeBateo = manoDeBateo;
	//	this.average = average;
	//	this.runs = runs;
	//	H1 = h1;
	///	H2 = h2;
	//	H3 = h3;
	//	HR = hR;
	//	RBI = rBI;
	//	this.baseBall = baseBall;
	//	this.strikeOut = strikeOut;
	//	this.stolenBase = stolenBase;
	}

	
	

	public int getTurnos() {
		return turnos;
	}

	public void setTurnos(int turnos) {
		this.turnos = turnos;
	}

//	public int getNumeroHitparapromedio() {
//		return numeroHitparapromedio;
//	}
//
//	public void setNumeroHitparapromedio(int numeroHitparapromedio) {
//		this.numeroHitparapromedio = numeroHitparapromedio;
//	}

	public String getManoDeBateo() {
		return manoDeBateo;
	}

	public void setManoDeBateo(String manoDeBateo) {
		this.manoDeBateo = manoDeBateo;
	}

	public String getPosition() {
		return position;
	}

	public float getAverage() {
		return average;
	}

	public int getRuns() {
		return runs;
	}

	public int getH1() {
		return H1;
	}

	public int getH2() {
		return H2;
	}

	public int getH3() {
		return H3;
	}

	public int getHR() {
		return HR;
	}

	public int getRBI() {
		return RBI;
	}

	public int getBaseBall() {
		return baseBall;
	}

	public int getStrikeOut() {
		return strikeOut;
	}

	public int getStolenBase() {
		return stolenBase;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public void setH1(int h1) {
		H1 = h1;
	}

	public void setH2(int h2) {
		H2 = h2;
	}

	public void setH3(int h3) {
		H3 = h3;
	}

	public void setHR(int hR) {
		HR = hR;
	}

	public void setRBI(int rBI) {
		RBI = rBI;
	}

	public void setBaseBall(int baseBall) {
		this.baseBall = baseBall;
	}

	public void setStrikeOut(int strikeOut) {
		this.strikeOut = strikeOut;
	}

	public void setStolenBase(int stolenBase) {
		this.stolenBase = stolenBase;
	}
	
	
	public float Average_Bateador(int numerHitsPromedio	, int turnosPromedio) {
		
	    float Resultado = 0.0f;
	    float nH = numerHitsPromedio;
	    float tP = turnosPromedio;
	   
	    if (nH == 0 && tP ==0) {
			Resultado = 0.0f;
		}
	    else {
	    	 Resultado = (float) (nH / tP);
	 	    
	    }
	    
	    this.setAverage(Resultado);
	    
		return Resultado;
		
	}
	
	

}
