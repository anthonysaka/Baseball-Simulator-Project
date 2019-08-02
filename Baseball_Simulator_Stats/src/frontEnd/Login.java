package frontEnd;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backEnd.Lidom;
import backEnd.Server;
import backEnd.User;
import backEnd.UserController;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class Login extends JDialog {

	private static final long serialVersionUID = 8961996554876997224L;

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTituloSesion;
	private JPanel panelHeader;

	private JButton btnLogin;
	private JLabel lblBuscar;
	private JTextField txtUsuario;
	private JLabel lblContrasea;

	private Socket socket1;
	private JButton button;
	private JButton button_1;
	private JPasswordField txtPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}           
	/**
	 * Create the dialog.
	 */
private boolean createU;

	public Login(boolean create) {
		
		this.createU = create;

		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 625, 470);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 625, 470);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);

			panelHeader = new JPanel();
			panelHeader.setLayout(null);
			panelHeader.setBackground(new Color(0, 30, 72));
			panelHeader.setBounds(0, 0, 625, 45);
			panelBg.add(panelHeader);

			lblTituloSesion = new JLabel("INICIO DE SESION");
			lblTituloSesion.setHorizontalTextPosition(SwingConstants.CENTER);
			lblTituloSesion.setBounds(215, 0, 192, 45);
			panelHeader.add(lblTituloSesion);
			lblTituloSesion.setHorizontalAlignment(SwingConstants.CENTER);
			lblTituloSesion.setForeground(new Color(255, 255, 255));
			lblTituloSesion.setFont(new Font("Consolas", Font.BOLD, 20));
			
			button = new JButton("");
			button.setIcon(new ImageIcon(Login.class.getResource("/iconos_imagenes/icons8_close_window_24px_1.png")));
			button.setPreferredSize(new Dimension(100, 30));
			button.setOpaque(false);
			button.setHideActionText(true);
			button.setForeground(Color.WHITE);
			button.setFont(new Font("Consolas", Font.BOLD, 20));
			button.setBorder(null);
			button.setBackground(new Color(4, 10, 20));
			button.setActionCommand("Cancel");
			button.setBounds(824, 0, 26, 30);
			panelHeader.add(button);
			
			button_1 = new JButton("");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			button_1.setIcon(new ImageIcon(Login.class.getResource("/iconos_imagenes/icons8_close_window_24px_1.png")));
			button_1.setPreferredSize(new Dimension(100, 30));
			button_1.setOpaque(false);
			button_1.setHideActionText(true);
			button_1.setForeground(Color.WHITE);
			button_1.setFont(new Font("Consolas", Font.BOLD, 20));
			button_1.setBorder(null);
			button_1.setBackground(new Color(4, 10, 20));
			button_1.setActionCommand("Cancel");
			button_1.setBounds(599, 0, 26, 30);
			panelHeader.add(button_1);

			btnLogin = new JButton("Entrar");
			if (createU == true) {
				
				btnLogin.setText("Registrar");
			}
			
			btnLogin.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {
				System.out.println(UserController.getInstance().getListUsers().get(0).getUserName());
				//	System.out.println(UserController.getInstance().getListUsers().get(1).getUserName());
					
					if (createU == false) {
						
						boolean respond_echo = false;

						try {
							socket1 = new Socket("127.0.0.1", 7000); // creando socket

							DataInputStream	 input = new DataInputStream(socket1.getInputStream());
							DataOutputStream output = new DataOutputStream(socket1.getOutputStream());
							
							output.writeUTF(txtUsuario.getText()); // escribe el usuario 
							output.writeUTF(txtPassword.getText()); // escribe la contrasena
							respond_echo = input.readBoolean();  // respuesta del servidor.
							output.close();
							input.close();
							socket1.close();

						} catch (IOException e1) {
							e1.printStackTrace();
						}
						
						
						if (respond_echo) {
							txtUsuario.setText("");
							txtPassword.setText("");
							Home hm = new Home();
							hm.setVisible(true);
							dispose();
							
							
						}else {
							ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
							String[] options = {"Ok"};	
							 JOptionPane.showOptionDialog(null, "Usuario o Contraseña Incorrestas!",
									"Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
						}
						
					}else if (createU == true) {
				
						//// para crear usuario.
						String usuario = txtUsuario.getText();
						String contrasena = txtPassword.getText();
						
						User nUser = new User(usuario, contrasena, "Empleado");
						UserController.getInstance().addUser(nUser);
						UserController.saveUserData(UserController.getInstance());
						ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
						String[] options = {"Ok"};	
						 JOptionPane.showOptionDialog(null, "Usuario registrado con exito!",
								"Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
						
						 txtUsuario.setText("");
						 txtPassword.setText("");
						 
						 dispose();
						
					}
					else {
						ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
						String[] options = {"Ok"};	
						 JOptionPane.showOptionDialog(null, "Error 404, Server Not Found!",
								"Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
						
					}
				}		

			});


			btnLogin.setIconTextGap(5);
			btnLogin.setHorizontalTextPosition(SwingConstants.LEFT);
			btnLogin.setForeground(new Color(255, 255, 240));
			btnLogin.setFont(new Font("Consolas", Font.BOLD, 17));
			btnLogin.setBorder(null);
			btnLogin.setBackground(new Color(0, 30, 72));
			btnLogin.setBounds(237, 410, 146, 30);
			panelBg.add(btnLogin);

			lblBuscar = new JLabel("Usuario:");
			lblBuscar.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblBuscar.setVerticalAlignment(SwingConstants.BOTTOM);
			lblBuscar.setHorizontalAlignment(SwingConstants.LEFT);
			lblBuscar.setForeground(Color.BLACK);
			lblBuscar.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblBuscar.setBounds(158, 118, 304, 31);
			panelBg.add(lblBuscar);

			txtUsuario = new JTextField() {
				private static final long serialVersionUID = 1L;
				/************* PARA REDONDEAR JTEXTFIELD *************/
				@Override 
				protected void paintComponent(Graphics g) {
					if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
						Graphics2D g2 = (Graphics2D) g.create();
						g2.setPaint(getBackground());
						g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
								0, 0, getWidth() - 1, getHeight() - 1));
						g2.dispose();
					}
					super.paintComponent(g);
				}
				@Override 
				public void updateUI() {
					super.updateUI();
					setOpaque(false);
					setBorder(new RoundedCornerBorder());
				}
			};

			txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
			txtUsuario.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtUsuario.setDisabledTextColor(Color.BLACK);
			txtUsuario.setColumns(10);
			txtUsuario.setBounds(158, 162, 304, 30);
			panelBg.add(txtUsuario);

			lblContrasea = new JLabel("Contrase\u00F1a:");
			lblContrasea.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblContrasea.setVerticalAlignment(SwingConstants.BOTTOM);
			lblContrasea.setHorizontalAlignment(SwingConstants.LEFT);
			lblContrasea.setForeground(Color.BLACK);
			lblContrasea.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblContrasea.setBounds(158, 249, 304, 31);
			panelBg.add(lblContrasea);
			
			txtPassword = new JPasswordField() {/************* PARA REDONDEAR JTEXTFIELD *************/
				@Override 
				protected void paintComponent(Graphics g) {
					if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
						Graphics2D g2 = (Graphics2D) g.create();
						g2.setPaint(getBackground());
						g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
								0, 0, getWidth() - 1, getHeight() - 1));
						g2.dispose();
					}
					super.paintComponent(g);
				}
				@Override 
				public void updateUI() {
					super.updateUI();
					setOpaque(false);
					setBorder(new RoundedCornerBorder());
				}
			};
			txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
			txtPassword.setFont(new Font("Consolas", Font.PLAIN, 18));
			
			txtPassword.setBounds(158, 293, 304, 30);
			panelBg.add(txtPassword);

		}


	}
}