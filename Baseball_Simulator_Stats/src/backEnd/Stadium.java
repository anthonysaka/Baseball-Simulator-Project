package backEnd;

public class Stadium {
	
	private String Id;
	private String name;
	private String address;
	private String owner;
	private int capacity;
	
	/* Constructor */
	
	public Stadium(String id, String name, String address, String owner, int capacity) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.capacity = capacity;
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
	public String getOwner() {
		return owner;
	}
	public int getCapacity() {
		return capacity;
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
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
