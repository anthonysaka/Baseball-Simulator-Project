package backEnd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.sun.tracing.dtrace.ArgsAttributes;

public class Server extends Thread {

	private static ServerSocket server;
	private static Socket client;

	public static void main(String[] args) {
		

		loadFile();

		try {
			server = new ServerSocket(7000);
		} catch (IOException e) {
			System.out.println("Error en la apertura del socket:" + e);
			e.printStackTrace();
			System.exit(-1);
		}

		while (true) {

			try {
				client = server.accept();
				
				System.out.println(client.getInetAddress());
				System.out.println();
				FlowSocket fs = new FlowSocket(client);
				Thread thr = new Thread(fs);
				thr.start();

			}catch(IOException e) {
				System.out.println("Error (excepción IO): " + e);
				e.printStackTrace();			
			}		
		}	
	}

	public static void loadFile(){



		try {
			File file = new File("DataUser.dat");
			FileInputStream fileInputUser = new FileInputStream (file);
			ObjectInputStream fileObjectInputUser = new ObjectInputStream(fileInputUser);
			System.out.println("Cargando datos de usuarios");
			UserController usrController = (UserController) fileObjectInputUser.readObject();
			UserController.setUsrCtrl(usrController);
			fileInputUser.close();
			fileObjectInputUser.close();

		} catch (FileNotFoundException e) {
			try {
				File fileO = new File("DataUser.dat");
				FileOutputStream fileOutputUser= new FileOutputStream(fileO);
				ObjectOutputStream fileObjectOutputUser = new ObjectOutputStream(fileOutputUser);
				System.out.println("Se esta creando un usuario por defecto");
				User userDefault = new User("user", "user", "Administrador");
				UserController.getInstance().addUser(userDefault);
				fileObjectOutputUser.writeObject(UserController.getInstance());
				fileObjectOutputUser.close();
				fileOutputUser.close();
			} catch (FileNotFoundException e1) {} catch (IOException e2) {}
		}catch(IOException e3) {} catch(ClassNotFoundException e4) {}
	}


}
