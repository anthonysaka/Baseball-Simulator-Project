package backEnd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;



public class Team implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6485039811763326860L;
	private String Id;
	private String name;
	private String manager;
	private Date foundationDate;
	private ArrayList<Player> rosterPlayers;
	private int games;
	private int gamesWin;
	private int gamesLose;
	private ArrayList<Player> lineUp ;
	private String stadium;
	
	/* Constructor */
	
	public Team(String id, String name, String manager, Date foundationDate, String stadium) {
		super();
		this.Id = id;
		this.name = name;
		this.manager = manager;
		this.foundationDate = foundationDate;
	//	this.rosterPlayers = new ArrayList<Player>();
	//	this.games = games;
	//	this.gamesWin = gamesWin;
	//	this.gamesLose = gamesLose;
	//	this.lineUp = new ArrayList<Player>();
		this.stadium = stadium;
		lineUp = new ArrayList<Player>();
		rosterPlayers = new ArrayList<Player>();
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
	
	public Date getFoundationDate() {
		return foundationDate;
	}

	public ArrayList<Player> getRosterPlayers() {
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

	public ArrayList<Player> getLineUp() {
		return lineUp;
	}
	
	public String getStadium() {
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
	
	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public void setRosterPlayers(ArrayList<Player> rosterPlayers) {
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

	public void setLineUp(ArrayList<Player> lineUp) {
		this.lineUp = lineUp;
	}
	
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	
	
	public void addPlayerRoster(Player player) {
		rosterPlayers.add(player);
		//generateIdPlayer++;
	}
	public void deletePlayerRoster(Player player) {
		rosterPlayers.remove(player);
		//generateIdPlayer++;
	}
	
	public void addPlayerLineUp(Player player) {
		

		lineUp.add(player);
	}
	
	
	/***** METODOS *****/
	
	public void addLesion(String nom, String apell, Injury lesion){
		int i=0; 
		boolean found = false;
		
		while( i < rosterPlayers.size() && found == false){
			
			if(rosterPlayers.get(i).getName().equalsIgnoreCase(nom) && rosterPlayers.get(i).getLastname().equalsIgnoreCase(apell) ){
				rosterPlayers.get(i).setLesionado(true);		
				rosterPlayers.get(i).setInjury(lesion);
				found = true;
			}
			i++;
		}
	}
	
	public void deleteLesion(String nom, String apell, Injury lesion){
		int i=0; 
		boolean found = false;
		
		while( i < rosterPlayers.size() && found == false){
			
			if(rosterPlayers.get(i).getName().equalsIgnoreCase(nom) && rosterPlayers.get(i).getLastname().equalsIgnoreCase(apell)){
				rosterPlayers.get(i).setLesionado(false);		
				rosterPlayers.get(i).setInjury(lesion);
				found = true;
			}
			i++;
		}
	}
	
	/** faltan metodos **/ 
	/* estadisticas de equipo*/
	
	
	
	
	

}
