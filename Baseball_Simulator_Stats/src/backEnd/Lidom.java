package backEnd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


/*  Final project - Baseball Simulator -
 * 
 *  Developers: Anthony Sakamoto
 *              Arnold Lantigua
 *              Victor Rosario
 *
 *              Controller Class - LIDOM (Liga de B�isbol Profesional de Rep�blica Dominicana)
 */


public class Lidom implements Serializable {

	private static final long serialVersionUID = 5337891823986950253L;

	private ArrayList<Team> listTeams;
	private ArrayList<Stadium>listStadium;
	private ArrayList<Game> listGame;
	private ArrayList<Player> listPlayer;

	private static Lidom LIDOM;

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


	public static Lidom getLIDOM() {
		return LIDOM;
	}


	public static void setLIDOM(Lidom lIDOM) {
		LIDOM = lIDOM;
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
	}

	//Add Team.
	public void addTeam(Team team) {
		listTeams.add(team);
		generateIdTeam++;
	}

	//Add Stadium.
	public void addStadium(Stadium stadium) {
		listStadium.add(stadium);
		generateIdStadium++;
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
	
	public void updateGame(Game myGame) {
		int index = searchIndexGame(myGame.getHomeTeam(), myGame.getAwayTeam(), myGame.getStadium(), myGame.getDate(), myGame.getHora());
		listGame.remove(index);
		listGame.add(index, myGame);

	}
	
	public void updatePlayer(Player myPlayercode) {
		
		int index = searchIndexPlayerByID(myPlayercode.getId());
		listPlayer.remove(index);
		listPlayer.add(index, myPlayercode);

	}
	


	/**************************************************************/

	/************** METODOS PARA LLEVAR A CABO EL FUNCIONAMIENTO DEL BACKEND ************/

	/*** 
	 * LOS METODOS BUSCAR SE HUBIERON PODIDO HACER UTILIZANDO FOREACH, 
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
	
	public Player searchPlayerByNameByTeam(String namePlayer, String lastname, String nameTeam) {
		Player auxPlayer = null;
		boolean found = false;
		int i = 0;

		while (!found && i < listPlayer.size()) {
			if(listPlayer.get(i).getName().equalsIgnoreCase(namePlayer) && listPlayer.get(i).getLastname().equalsIgnoreCase(lastname)
					&& listPlayer.get(i).getTeamName().equalsIgnoreCase(nameTeam)) {
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

	public int searchIndexGame(String local, String visitante, String estadio, String fecha, String hora) {
		int auxGame = -1;
		boolean found = false;
		int i = 0;

		while (!found &&  i < listGame.size()) {
			if (listGame.get(i).getHomeTeam().equalsIgnoreCase(local) && listGame.get(i).getAwayTeam().equalsIgnoreCase(visitante) && listGame.get(i).getDate().equalsIgnoreCase(fecha) && listGame.get(i).getHora().equalsIgnoreCase(hora)) {
				found = true;
				auxGame = i;
			}
			i++;
		}
		return auxGame; //retornar el index del juego encontrado
	}
	
	//Search Player by ID.
	public int searchIndexPlayerByID(String idPlayer) {
		int  auxPlayer = -1;
		boolean found = false;
		int i = 0;

		while (!found && i < listPlayer.size()) {
			if(listPlayer.get(i).getId().equalsIgnoreCase(idPlayer)) {
				found = true;
				auxPlayer = i;;
			}
			i++;
		}
		return auxPlayer; //Retorna el Index del JUGADOR del ID encontrado.
	}
	
	public Game searchGame(String local, String visitante, String estadio, String fecha, String hora) {
		Game auxGame = null;
		boolean found = false;
		int i = 0;

		while (!found &&  i < listGame.size()) {
			if (listGame.get(i).getHomeTeam().equalsIgnoreCase(local) && listGame.get(i).getAwayTeam().equalsIgnoreCase(visitante) && listGame.get(i).getDate().equalsIgnoreCase(fecha) && listGame.get(i).getHora().equalsIgnoreCase(hora)) {
				found = true;
				auxGame = listGame.get(i);
			}
			i++;
		}
		return auxGame;
	}

	//metodo para filtrar el mejor bateador en HR, hit, 2b, 3b o averages.
	public Player mayor (String caso) {
		Player mejor= listPlayer.get(0);
		switch (caso) {
		case "HR": 
			for (int i = 0; i < listPlayer.size(); i++) {
				Player p = listPlayer.get(i); 
				if(p instanceof Batter) {
					if( ((Batter)p).getHR()>((Batter)mejor).getHR() ) {
						mejor = p; 
					}
				}
			}
			break;

		case "Hits":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player p = listPlayer.get(i); 
				if(p instanceof Batter) {
					if( ((Batter)p).getH1()>((Batter)mejor).getH1() ) {
						mejor = p; 
					}
				}
			}
			break;

		case "Dobles":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player p = listPlayer.get(i); 
				if(p instanceof Batter) {
					if( ((Batter)p).getH2()>((Batter)mejor).getH2() ) {
						mejor = p; 
					}
				}
			}
			break;

		case " Triples":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player p = listPlayer.get(i); 
				if(p instanceof Batter) {
					if( ((Batter)p).getH2()>((Batter)mejor).getH2() ) {
						mejor = p; 
					}
				}
			}
			break;

		case "Average":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player p = listPlayer.get(i); 
				if(p instanceof Batter) {
					if( ((Batter)p).getAverage()>((Batter)mejor).getAverage() ) {
						mejor = p; 
					}
				}
			}
			break;

		default:
			break;
		}
		return mejor;//retorna el jugador con mas HR o estadisticas que el usuario diga.
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//METODO PARA BUSCAR AL PITCHER DE MAYOR ESTADISTICA DESEADA POR EL USUARIO.

	public Player Pitcher(String Estadistica) {

		Player Statistic = listPlayer.get(0);

		switch (Estadistica) {

		case "W":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getGameWin() > ((Pitcher)Statistic).getGameWin()){
						Statistic = Pit;
					}
				}
			}
			break;

		case "L":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getGameLose() > ((Pitcher)Statistic).getGameLose()) {
						Statistic = Pit;
					}
				}
			}
			break;

		case "ERA":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getERA() > ((Pitcher)Statistic).getERA()) {
						Statistic = Pit;
					}
				}
			}
			break;

		case "G":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getPlayedGame() > ((Pitcher)Statistic).getPlayedGame()) {
						Statistic = Pit;
					}
				}
			}
			break;

		case "GS":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getStartedGame() > ((Pitcher)Statistic).getStartedGame()) {
						Statistic = Pit;
					}
				}
			}
			break;

		case "SV":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getSavedGame() > ((Pitcher)Statistic).getSavedGame()) {
						Statistic = Pit;
					}
				}
			}
			break;

		case "HR":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getNumberHR() > ((Pitcher)Statistic).getNumberHR()) {
						Statistic = Pit;
					}
				}
			}
			break;

		case "H":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getNumberHit() > ((Pitcher)Statistic).getNumberHit()) {
						Statistic = Pit;
					}
				}
			}
			break;

		case "R":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getNumberRun() > ((Pitcher)Statistic).getNumberRun()) {
						Statistic = Pit;
					}
				}
			}
			break;

		case "IP":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getIP() > ((Pitcher)Statistic).getIP()) {
						Statistic = Pit;
					}
				}
			}
			break;

		case "AVG":
			for (int i = 0; i < listPlayer.size(); i++) {
				Player Pit = listPlayer.get(i);
				if(Pit instanceof Pitcher) {
					if(((Pitcher)Pit).getAverage() > ((Pitcher)Statistic).getAverage()) {
						Statistic = Pit;
					}
				}
			}
			break;

		default:
			break;
		}
		return Statistic;
	}
	
	
	//esta funcion es para calcular el porcentage de victorias de los equipos
	public float TeamAvr(int win, int game) {
		float w = win;
        float g = game;
		return (float) (w/g);
		
	}


	public void addPlayerToTeam(String nameTeam, Player player) {
		Team auxTeam = searchTeamByName(nameTeam); //Buscar el equipo correspondiente.
		auxTeam.addPlayerRoster(player);
	}
	
	public void deletePlayerToTeam(String nameTeam, Player player) {
		Team auxTeam = searchTeamByName(nameTeam); //Buscar el equipo correspondiente.
		auxTeam.deletePlayerRoster(player);
	}

	public Boolean checkIdPlayer(String myPlayerId) {

		Boolean correct = true;

		for (Player p : listPlayer) {
			if (myPlayerId.equalsIgnoreCase(p.getId())) {
				correct = false;
				break;		
			}
		}

		return correct; // return true si el ID no se encuentra en otro jugador, o sea el id se puede registrar.


	}

	public Boolean checkNumberPlayer(String myPlayerNumber, String playerTeam) {
		Team auxTeam = searchTeamByName(playerTeam);
		Boolean correct = true;

		for (Player p : auxTeam.getRosterPlayers()) {
			if (myPlayerNumber.equalsIgnoreCase(p.getNumber())) {
				correct = false;
				break;		
			}

		}

		return correct; // return true si el Numero no se encuentra en otro jugador del equipo, o sea que el numero se puede usar.
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//METODO PARA BUSCAR AL MEJOR EQUIPO DE LA SERIE
	public String Mejor_Equipo() { //REVISAR

		int Mejor = 0 ;
		String Mejor_Team = null;


		for (Team equipo : listTeams) {
			if(Mejor < equipo.getGamesWin()) {
				Mejor = equipo.getGamesWin();

				Mejor_Team = equipo.getName();
			}
		}

		return Mejor_Team;
	}
	




	/************************ METODOS PARA CARGAR FILE Y GUARDAR FILE *******************************/

	// Para cargar los datos de la clase controladora.
	public void loadInitData(Lidom myLidom) {

		File file = new File("DatosGeneralesLidom.dat");
		FileInputStream fileInput;
		ObjectInputStream fileObjectInput;

		try {
			fileInput = new FileInputStream (file);
			fileObjectInput = new ObjectInputStream(fileInput);

			Lidom lidom = (Lidom) fileObjectInput.readObject();
			Lidom.setLIDOM(lidom);
			fileInput.close();
			fileObjectInput.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// para guardar los datos de la clase controladora
	public void saveInitData(Lidom myLidom) {
		File file = new File("DatosGeneralesLidom.dat");
		FileOutputStream fileOutput;
		ObjectOutputStream fileObjectOutput = null;

		try {
			fileOutput = new FileOutputStream(file);
			fileObjectOutput = new ObjectOutputStream(fileOutput);
			fileObjectOutput.writeObject(myLidom);

			fileOutput.close();
			fileObjectOutput.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileObjectOutput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	public void writeCodes(int code, String name) {

		File file = new File(name + ".dat");
		FileOutputStream fileOutput;
		ObjectOutputStream fileObjectOutput = null;

		try {
			fileOutput = new FileOutputStream(file);
			fileObjectOutput = new ObjectOutputStream(fileOutput);
			fileObjectOutput.writeObject(code);

			fileOutput.close();
			fileObjectOutput.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileObjectOutput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}




	public void readStadiumCodes(int code, String name) {


		File file = new File(name + ".dat");
		FileInputStream fileInput;
		ObjectInputStream fileObjectInput;

		try {
			fileInput = new FileInputStream (file);
			fileObjectInput = new ObjectInputStream(fileInput);

			generateIdStadium = (Integer) fileObjectInput.readObject();
			fileInput.close();
			fileObjectInput.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

	public void readTeamCodes(int code, String name) {


		File file = new File(name + ".dat");
		FileInputStream fileInput;
		ObjectInputStream fileObjectInput;

		try {
			fileInput = new FileInputStream (file);
			fileObjectInput = new ObjectInputStream(fileInput);

			generateIdTeam = (Integer) fileObjectInput.readObject();
			fileInput.close();
			fileObjectInput.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

	public ArrayList<Player> Filtrar_Equipo(String team) {

		ArrayList<Player> TeamFiltered = new ArrayList<Player>();

		if (team.equals("Todos")) {
			//			System.out.println(listPlayer);
			return listPlayer;
		}

		for (Player player : listPlayer) {
			if (team.equals(player.getTeamName())) {
				TeamFiltered.add(player);
			}
		}
		//		System.out.println(TeamFiltered);
		return TeamFiltered;

	}
}
