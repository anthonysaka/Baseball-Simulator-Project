package backEnd;

import java.util.Date;

public class Batter extends Player {
	
	private String position;
	private int average;
	private int runs;
	private int H1;
	private int H2;
	private int H3;
	private int HR;
	private int RBI;
	private int baseBall;
	private int strikeOut;
	private int stolenBase;
	
	/* Construcor */
	
	public Batter(String id, String name, String lastname, String teamName, Date birthdate, String birthplace,
			float height, float weight, String position, int average, int runs, int h1, int h2, int h3, int hR, int rBI,
			int baseBall, int strikeOut, int stolenBase) {
		super(id, name, lastname, teamName, birthdate, birthplace, height, weight);
		this.position = position;
		this.average = average;
		this.runs = runs;
		H1 = h1;
		H2 = h2;
		H3 = h3;
		HR = hR;
		RBI = rBI;
		this.baseBall = baseBall;
		this.strikeOut = strikeOut;
		this.stolenBase = stolenBase;
	}

	
	
	public String getPosition() {
		return position;
	}

	public int getAverage() {
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

	public void setAverage(int average) {
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
	
	
	
	
	

}
