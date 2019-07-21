package backEnd;

import java.io.Serializable;
import java.util.Date;

public abstract class Player implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6515373590338509750L;
	protected String Id;
	protected String name;
	protected String number;
	protected String lastname;
	protected String teamName;
	protected Date birthdate;
	protected String birthplace;
	protected float height;
	protected float weight;
	protected String manoLanzar;
	
	/* Constructor */
	
	public Player(String id, String name, String number, String lastname, String teamName, Date birthdate, String birthplace,
			float height, float weight, String manoLanzar) {
		super();
		this.Id = id;
		this.name = name;
		this.number = number;
		this.lastname = lastname;
		this.teamName = teamName;
		this.birthdate = birthdate;
		this.birthplace = birthplace;
		this.height = height;
		this.weight = weight;
		this.manoLanzar = manoLanzar;
	}
	


	public String getManoLanzar() {
		return manoLanzar;
	}

	public void setManoLanzar(String manoLanzar) {
		this.manoLanzar = manoLanzar;
	}

	public String getId() {
		return Id;
	}

	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}

	public String getLastname() {
		return lastname;
	}

	public String getTeamName() {
		return teamName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public void setId(String id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber (String number) {
		this.number = number;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	
	

}
