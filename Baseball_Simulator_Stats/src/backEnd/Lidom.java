package backEnd;

import java.util.ArrayList;

/*  Final project - Baseball Simulator -
 * 
 *  Developers: Anthony Sakamoto
 *              Arnold
 *              Victor Rodriguez
 *
 *              Controller Class - LIDOM (Liga de Béisbol Profesional de República Dominicana)
 */

public class Lidom {
	
	public ArrayList<Team> listTeams;
	public ArrayList<Player> listPlayers;
	private static Lidom LIDOM;
	
	
	
	/* Constructor */
	private Lidom() {
		super();
		this.listTeams = new ArrayList<Team>();
		this.listPlayers = new ArrayList<Player>();
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
	public ArrayList<Player> getListPlayers() {
		return listPlayers;
	}
	public void setListTeams(ArrayList<Team> listTeams) {
		this.listTeams = listTeams;
	}
	public void setListPlayers(ArrayList<Player> listPlayers) {
		this.listPlayers = listPlayers;
	}
	
	
	

}
