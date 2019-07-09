package backEnd;

import java.util.ArrayList;

public class Team {
	
	private String Id;
	private ArrayList<PlayerOfTeam> listPlayers;
	
	
	/* Constructor */
	public Team(String id, ArrayList<PlayerOfTeam> listPlayers) {
		super();
		Id = id;
		this.listPlayers = listPlayers;
	}
	
	
	public String getId() {
		return Id;
	}
	public ArrayList<PlayerOfTeam> getListPlayers() {
		return listPlayers;
	}
	public void setId(String id) {
		Id = id;
	}
	public void setListPlayers(ArrayList<PlayerOfTeam> listPlayers) {
		this.listPlayers = listPlayers;
	}
	
	
	
	

}
