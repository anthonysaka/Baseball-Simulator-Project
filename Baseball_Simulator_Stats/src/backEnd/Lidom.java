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
	private ArrayList<Player> listPlayer;

	private static Lidom LIDOM;

	public static int generateIdPlayer = 1;
	public static int generateIdTeam = 1;
	public static int generateIdStadium = 1;
	public static int generateIdGame = 1;

	/* Constructor */
	private Lidom() {
		super();
		this.listTeams = new ArrayList<Team>();
		this.listStadium = new ArrayList<Stadium>();
		this.listGame = new ArrayList<Game>();
		this.listPlayer = new ArrayList<Player>();
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
	public ArrayList<Player> getListPlayer(){
		return listPlayer;
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
	public void setListPlayer(ArrayList<Player> listPlayer) {
		this.listPlayer = listPlayer;
	}


	/*** METODOS ***/

	/************** METODOS DE AGREGAR Y REMOVER - LISTAS (ARRAYLIST) ************/

	//Add Player.
	public void addPlayer(Player player) {
		listPlayer.add(player);
		generateIdPlayer++;
	}

	//Add Team.
	public void addTeam(Team team) {
		listTeams.add(team);
		generateIdTeam++;
	}

	//Add Stadium.
	public void addStadium(Stadium stadium) {
		listStadium.add(stadium);
	//	generateIdStadium++;
	}

	//Add Game.
	public void addGame(Game game) {
		listGame.add(game);
		generateIdGame++;
	}

	//Delete Player.
	public void deletePlayer(Player player) {
		listPlayer.remove(player);
	//	generateIdPlayer--;
	}

	//Delete Team.
	public void deleteTeam(Team team) {
		listTeams.remove(team);
	//	generateIdTeam--;
	}

	//Delete Stadium.
	public void deleteStadium(Stadium stadium) {
		listStadium.remove(stadium);
		System.out.println("Entre");
	//	generateIdStadium--;
	}

	//Delete Game.
	public void deleteGame(Game game) {
		listGame.remove(game);
	//	generateIdGame--;
	}

	/**************************************************************/

	/************** METODOS PARA LLEVAR A CABO EL FUNCIONAMIENTO DEL BACKEND ************/

	/*** 
	 * LOS METODOS BUSCAR SI HUBIERON PODIDO HACER UTILIZANDO FOREACH, 
	 * PERO YO PREFIERO PROGRAMAR CON WHILE LOOP XD! 
	 ***/

	//Search Player by ID.
	public Player searchPlayerByID(String idPlayer) {
		Player auxPlayer = null;
		boolean found = false;
		int i = 0;

		while (!found && i < listPlayer.size()) {
			if(listPlayer.get(i).getId().equalsIgnoreCase(idPlayer)) {
				found = true;
				auxPlayer = listPlayer.get(i);
			}
			i++;
		}
		return auxPlayer; //Retorna el JUGADOR del ID encontrado.
	}

	//Search Player by Name.
	public Player searchPlayerByName(String namePlayer) {
		Player auxPlayer = null;
		boolean found = false;
		int i = 0;

		while (!found && i < listPlayer.size()) {
			if(listPlayer.get(i).getName().equalsIgnoreCase(namePlayer)) {
				found = true;
				auxPlayer = listPlayer.get(i);
			}
			i++;
		}
		return auxPlayer; //Retorna el JUGADOR del NOMBRE encontrado.
	}


	//Search Team by ID.
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
		return auxTeam; //Retorna el EQUIPO del ID encontrado.
	}

	//Search Team by Name.
	public Team searchTeamByName(String nameTeam){
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
		return auxTeam; //Retorna el EQUIPO del NOMBRE encontrado.
	}

	//Search Stadium by ID.
	public Stadium searchStadiumByID(String idStadium) {
		Stadium auxStadium = null;
		boolean found = false;
		int i = 0;

		while (!found && i < listStadium.size()) {
			if(listStadium.get(i).getId().equalsIgnoreCase(idStadium)) {
				found = true;
				auxStadium = listStadium.get(i);
			}
			i++;
		}
		return auxStadium; //Retorna el ESTADIO del ID encontrado.
	}

	//Search Stadium by NAME.
	public Stadium searchStadiumByNAME(String nameStadium) {
		Stadium auxStadium = null;
		boolean found = false;
		int i = 0;

		while (!found && i < listStadium.size()) {
			if(listStadium.get(i).getName().equalsIgnoreCase(nameStadium)) {
				found = true;
				auxStadium = listStadium.get(i);
			}
			i++;
		}
		return auxStadium; //Retorna el ESTADIO del NOMBRE encontrado.
	}







}
