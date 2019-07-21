package backEnd;

import java.io.Serializable;
import java.util.Date;

public class Game implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3155127998866144L;
	private Team homeTeam;
	private Team awayTeam;
	private Stadium stadium;
	private Date date;
	
	/* Constructor */
	
	public Game(Team homeTeam, Team awayTeam, Stadium stadium, Date date) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.stadium = stadium;
		this.date = date;
	}
	
	
	public Team getHomeTeam() {
		return homeTeam;
	}
	public Team getAwayTeam() {
		return awayTeam;
	}
	public Stadium getStadium() {
		return stadium;
	}
	public Date getDate() {
		return date;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
