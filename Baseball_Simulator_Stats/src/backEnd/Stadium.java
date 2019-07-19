package backEnd;

public class Stadium {
	
	private String Id;
	private String name;
	private String address;

	
	/* Constructor */
	
	public Stadium(String id, String name, String address) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
	}
	
	
	public String getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setId(String id) {
		Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	

}
