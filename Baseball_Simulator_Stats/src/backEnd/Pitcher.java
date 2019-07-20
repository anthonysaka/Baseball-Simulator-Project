package backEnd;

import java.util.Date;

public class Pitcher extends Player {
	
	private String tipo;
	private int gameWin;
	private int gameLose;
	private float ERA;
	private int playedGame;
	private int startedGame;
	private int savedGame;
	private int numberHR;
	private int numberHit;
	private int numberRun;
	private int numberStrikeOut;
	private float IP;
	private float average;
	
	/* Constructor */
	
	public Pitcher(String id, String name, String number, String lastname, String teamName, Date birthdate, String birthplace,
			float height, float weight, String tipo) {
		super(id, name, number, lastname, teamName, birthdate, birthplace, height, weight);
		this.tipo = tipo;
		//this.gameWin = gameWin;
	//	this.gameLose = gameLose;
	//	this.ERA = eRA;
	//	this.playedGame = playedGame;
	//	this.startedGame = startedGame;
	//	this.savedGame = savedGame;
	//	this.numberHR = numberHR;
	//	this.numberHit = numberHit;
	//	this.numberRun = numberRun;
	//	this.numberStrikeOut = numberStrikeOut;
	//	this.IP = iP;
	//	this.average = average;
	}

	
	public String getTipo() {
		return tipo;
	}

	public int getGameWin() {
		return gameWin;
	}

	public int getGameLose() {
		return gameLose;
	}

	public float getERA() {
		return ERA;
	}

	public int getPlayedGame() {
		return playedGame;
	}

	public int getStartedGame() {
		return startedGame;
	}

	public int getSavedGame() {
		return savedGame;
	}

	public int getNumberHR() {
		return numberHR;
	}

	public int getNumberHit() {
		return numberHit;
	}

	public int getNumberRun() {
		return numberRun;
	}

	public int getNumberStrikeOut() {
		return numberStrikeOut;
	}

	public float getIP() {
		return IP;
	}

	public float getAverage() {
		return average;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setGameWin(int gameWin) {
		this.gameWin = gameWin;
	}

	public void setGameLose(int gameLose) {
		this.gameLose = gameLose;
	}

	public void setERA(float eRA) {
		ERA = eRA;
	}

	public void setPlayedGame(int playedGame) {
		this.playedGame = playedGame;
	}

	public void setStartedGame(int startedGame) {
		this.startedGame = startedGame;
	}

	public void setSavedGame(int savedGame) {
		this.savedGame = savedGame;
	}

	public void setNumberHR(int numberHR) {
		this.numberHR = numberHR;
	}

	public void setNumberHit(int numberHit) {
		this.numberHit = numberHit;
	}

	public void setNumberRun(int numberRun) {
		this.numberRun = numberRun;
	}

	public void setNumberStrikeOut(int numberStrikeOut) {
		this.numberStrikeOut = numberStrikeOut;
	}

	public void setIP(float iP) {
		IP = iP;
	}

	public void setAverage(float average) {
		this.average = average;
	}
	
	
	public float Efectividad_Pitcher (int Carreras_Permitidas, float Cantidad_Innings) {
		
		float Promedio = 0;
		
		Promedio = ((Carreras_Permitidas * 9) / Cantidad_Innings);
		
		return Promedio;
		
	}
	
	
	
	

}
