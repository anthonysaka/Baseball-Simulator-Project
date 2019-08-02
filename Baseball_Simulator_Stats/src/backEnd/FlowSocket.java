package backEnd;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

public class FlowSocket extends  Thread {
	
	Socket client;
	DataInputStream flowInput;
	DataOutputStream flowOutput;
	
	public FlowSocket(Socket clientSck) {
		client = clientSck;
		
		try {
			
			flowInput = new DataInputStream(clientSck.getInputStream());
			flowOutput = new DataOutputStream(clientSck.getOutputStream());
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}	
	}
	
	
	public void run() {
		
		while(true) {
			
			String username;
			String password;
			try {
				username = flowInput.readUTF();
				password = flowInput.readUTF();
				
				if (UserController.getInstance().checkUserLogin(username, password)) {
					flowOutput.writeBoolean(true);	
					System.out.println("Data correcta!");
				}else {
					flowOutput.writeBoolean(false);
					System.out.println("Data incorrecta!");
				}
				flowOutput.flush();
			}catch(EOFException e) {
				break;
			} catch (IOException e1) {
		
	
			}	
		}
		try {
			flowInput.close();
			flowOutput.close();
			client.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	
		
		
	}
	
	
	
	
	
	

}
