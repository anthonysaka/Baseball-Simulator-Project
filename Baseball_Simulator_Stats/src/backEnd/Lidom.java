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

	
	/*** METODOS ***/
	
	//1. Search Team by ID.
	public Team searchTeamByID(String idTeam) {
		Team auxTeam = null;
		boolean found = false;
		int i = 0;

		while (!found && i < listTeams.size()) {
			if(listTeams.get(i).getId().equalsIgnoreCase(idTeam)) {
				found = true;
				auxTeam = listTeams.get(i);
			}
			i++;
		}
		return auxTeam; //Retorna el equipo del ID encontrado.
	}
	
	//2. Search Team by Name.
	public Team searchTeamrByName(String nameTeam){
		Team auxTeam = null;
		boolean found = false;
		int i = 0;

		while (!found && i < listTeams.size()) {
			if(listTeams.get(i).getName().equalsIgnoreCase(nameTeam)) {
				found = true;
				auxTeam = listTeams.get(i);
			}
			i++;
		}
		return auxTeam; //Retorna el equipo del NOMBRE encontrado.
	}
	
	
	
	

}
