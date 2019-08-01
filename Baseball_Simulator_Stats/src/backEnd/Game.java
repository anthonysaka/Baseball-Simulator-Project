package backEnd;

import java.io.Serializable;


public class Game implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3155127998866144L;
	private String homeTeam;
	private String awayTeam;
	private String stadium;
	private String hora;
	private String date;
	private BoxScore datosBoxScore;
	
	private boolean finished = false;
	private int homeRun = 0;
	private int awayRun = 0;
	private int hitsHome = 0;
	private int hitsAway = 0;
	private int erroresHome = 0;
	private int erroresAway = 0;
	
	/* Constructor */
	
	public Game(String homeTeam, String awayTeam, String stadium) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.stadium = stadium;
		homeRun = 0;
		awayRun = 0;
		finished = false;
	//	this.hora = hora;
	//	this.date = date;
	}
	
	
	
	public BoxScore getDatosBoxScore() {
		return datosBoxScore;
	}



	public void setDatosBoxScore(BoxScore datosBoxScore) {
		this.datosBoxScore = datosBoxScore;
	}



	public int getHitsHome() {
		return hitsHome;
	}

	public int getHitsAway() {
		return hitsAway;
	}

	public int getErroresHome() {
		return erroresHome;
	}

	public int getErroresAway() {
		return erroresAway;
	}

	public void setHitsHome(int hitsHome) {
		this.hitsHome = hitsHome;
	}




	public void setHitsAway(int hitsAway) {
		this.hitsAway = hitsAway;
	}




	public void setErroresHome(int erroresHome) {
		this.erroresHome = erroresHome;
	}




	public void setErroresAway(int erroresAway) {
		this.erroresAway = erroresAway;
	}




	public boolean isFinished() {
		return finished;
	}


	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	


	public int getHomeRun() {
		return homeRun;
	}


	public int getAwayRun() {
		return awayRun;
	}


	public void setHomeRun(int homeRun) {
		this.homeRun = homeRun;
	}


	public void setAwayRun(int awayRun) {
		this.awayRun = awayRun;
	}


	public String getHomeTeam() {
		return homeTeam;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public String getStadium() {
		return stadium;
	}
	public String getHora() {
		return hora;
	}
	public String getDate() {
		return date;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}
