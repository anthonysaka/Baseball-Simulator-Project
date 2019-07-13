package backEnd;

import java.util.ArrayList;

/*  Final project - Baseball Simulator -
* 
*  Developers: Anthony Sakamoto
*              Arnold Lantigua
*              Victor Rosario
*
*              Controller Class - LIDOM (Liga de Béisbol Profesional de República Dominicana)
*/

public class Lidom {
	
	private ArrayList<Team> listTeams;
	private ArrayList<Stadium>listStadium;
	private ArrayList<Game> listGame;
	
	private static Lidom LIDOM;
	
	/* Constructor */
	private Lidom() {
		super();
		this.listTeams = new ArrayList<Team>();
		this.listStadium = new ArrayList<Stadium>();
		this.listGame = new ArrayList<Game>();
	}
	
	
	/* SINGLETON */
	public static Lidom getInstance() {
		if(LIDOM == null) {
			LIDOM = new Lidom();
		}
		return LIDOM;
	}


	public ArrayList<Team> getListTeams() {
		return listTeams;
	}
	public ArrayList<Stadium> getListStadium() {
		return listStadium;
	}
	public ArrayList<Game> getListGame() {
		return listGame;
	}

	public void setListTeams(ArrayList<Team> listTeams) {
		this.listTeams = listTeams;
	}
	public void setListStadium(ArrayList<Stadium> listStadium) {
		this.listStadium = listStadium;
	}
	public void setListGame(ArrayList<Game> listGame) {
		this.listGame = listGame;
	}

	
	
	
	

}
