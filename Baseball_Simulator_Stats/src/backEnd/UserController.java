package backEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class UserController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3977840986218084261L;
	private ArrayList<User> listUsers;
	private static UserController usrCtrl;
	
	private static User userLogged;
	
	

	private UserController() {
		super();
		this.listUsers =  new ArrayList<User>();
	}
	
	/* SINGLETON */
	public static UserController getInstance() {
		if(usrCtrl == null) {
			usrCtrl = new UserController();
		}
		return usrCtrl;
	}
	
	
	
	public static UserController getUsrCtrl() {
		return usrCtrl;
	}

	public static void setUsrCtrl(UserController usrCtrl) {
		UserController.usrCtrl = usrCtrl;
	}

	public static User getUserLogged() {
		return userLogged;
	}

	public static void setUserLogged(User userLogged) {
		UserController.userLogged = userLogged;
	}

	public ArrayList<User> getListUsers() {
		return listUsers;
	}

	public void setListUsers(ArrayList<User> listUsers) {
		this.listUsers = listUsers;
	}
	
	//Add User.
	public void addUser(User user) {
		listUsers.add(user);
	}
	

	public boolean checkUserLogin(String username, String password) {
		
		boolean check = false;
		
		for (User usuario : listUsers) {
			
			if ( (usuario.getUserName().equalsIgnoreCase(username) && (usuario.getPassword().equalsIgnoreCase(password)) )) {
				
				setUserLogged(usuario);
				check = true;
			}
		}
		return check;
	}
	
	
	// para guardar los datos de la clase controladora
			public static void saveUserData(UserController myUser) {
				File file = new File("DataUser.dat");
				FileOutputStream fileOutput;
				ObjectOutputStream fileObjectOutput = null;

				try {
					fileOutput = new FileOutputStream(file);
					fileObjectOutput = new ObjectOutputStream(fileOutput);
					fileObjectOutput.writeObject(myUser);

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


		
	
	
}
