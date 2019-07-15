package backEnd;

import java.util.ArrayList;

public class Team {
	private String Id;
	private String name;
	private String manager;
	private ArrayList<Roster> rosterPlayers;
	private int games;
	private int gamesWin;
	private int gamesLose;
	private ArrayList<Roster> lineUp;
	private Stadium stadium;
	
	/* Constructor */
	
	public Team(String id, String name, String manager, ArrayList<Roster> rosterPlayers, int games, int gamesWin, int gamesLose,
			ArrayList<Roster> lineUp, Stadium stadium) {
		super();
		this.Id = id;
		this.name = name;
		this.manager = manager;
		this.rosterPlayers = new ArrayList<Roster>();
		this.games = games;
		this.gamesWin = gamesWin;
		this.gamesLose = gamesLose;
		this.lineUp = new ArrayList<Roster>();
		this.stadium = stadium;
	}
	
	

	public String getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}

	public String getManager() {
		return manager;
	}

	public ArrayList<Roster> getRosterPlayers() {
		return rosterPlayers;
	}

	public int getGames() {
		return games;
	}

	public int getGamesWin() {
		return gamesWin;
	}

	public int getGamesLose() {
		return gamesLose;
	}

	public ArrayList<Roster> getLineUp() {
		return lineUp;
	}
	
	public Stadium getStadium() {
		return stadium;
	}

	public void setId(String id) {
		this.Id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public void setRosterPlayers(ArrayList<Roster> rosterPlayers) {
		this.rosterPlayers = rosterPlayers;
	}

	public void setGames(int games) {
		this.games = games;
	}

	public void setGamesWin(int gamesWin) {
		this.gamesWin = gamesWin;
	}

	public void setGamesLose(int gamesLose) {
		this.gamesLose = gamesLose;
	}

	public void setLineUp(ArrayList<Roster> lineUp) {
		this.lineUp = lineUp;
	}
	
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}
	
	
	
	
	
	

}
