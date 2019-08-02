package backEnd;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String tipo;
	

	public User(String username, String password, String tipo) {
		
		super();
		this.username = username;
		this.password = password;
		this.tipo = tipo;
	}


	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}









}
