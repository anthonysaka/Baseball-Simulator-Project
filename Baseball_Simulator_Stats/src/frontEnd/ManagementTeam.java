package frontEnd;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

import javax.swing.SwingConstants;

import backEnd.Batter;
import backEnd.Game;
import backEnd.Lidom;
import backEnd.Pitcher;
import backEnd.Player;
import backEnd.Team;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComboBox;

public class ManagementTeam extends JDialog {


	private final JPanel contentPanel = new JPanel();
	private JLabel lblRegistroEquipo;
	private JPanel panelHeader;
	private JPanel panelFondo;
	private JLabel lblFundadoTeam;
	private JLabel lblEstadioTeam;
	private JLabel lblManagerTeam;
	private JLabel lblNameTeam;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblLogoTeam;
	private JPanel panelGeneralInfo;
	private JScrollPane scrollPaneLineUp;
	private JLabel label_8;
	private JLabel label_9;
	private JButton btnLineUp;
	private JButton btnAgregarLesin;
	private JButton btnCalendario;
	private JButton btnQuitarLesin;
	private JLabel label_10;
	private JScrollPane scrollPaneRoster;
	private JLabel label_11;
	private JScrollPane scrollPaneLesionados;
	private JPanel panelLineUp;
	private JButton btnCf;
	private JLabel lblBgPlayLineUp;
	private JButton btnL;
	private JButton btnSs;
	private JButton btn3b;
	private JButton btnP;
	private JButton btnC;
	private JButton button_10;
	private JButton btn1b;
	private JButton btn2b;
	private JButton bntRf;

	/***********table*************/

	private static  DefaultTableModel modelRoster;
	public static DefaultTableModel modelLineUp;
	private static DefaultTableModel modelLesionados;
	private static DefaultTableModel modelCalendario;

	private static  Object[] columnRoster;
	public static Object[] columnLineUp;
	private static Object[] columnLesionados;
	private static Object[] columnCalendario;

	private static JTable tableRoster;
	private static JTable tableLesionados;
	private static JTable tableLineUp;
	private static JTable tableCalendario;

	/***********************/
	static Team myTeam;
	private JButton button_14;

	private static String nombreJugador;
	private static String nameArray[] ;
	private static String nameArrayAvailable[];
	private static JPanel panelEstadisticaEquipo;
	private static JLabel lblEstadsticaDelEquipo;
	private JPanel panelCalendarioEquipo;
	private JLabel lblCalendarioDePartidos;
	private JPanel panelPerfilJugador;
	private JLabel lblPerfilJugador;
	private static String codeJugadorRoster;
	private static JLabel lblFotoJugador;
	private static  JLabel lblName;
	private static JLabel lblNacimiento;
	private static JLabel lblEdad;
	private static JLabel lblNumero;
	private static JLabel lblPosion;
	private static JSeparator separator;
	private static JLabel lblFechaNacimiento;
	private static JLabel lblLugarNacimiento;
	private static JLabel lblBt;
	private  static JLabel lblBT;
	private static JLabel lblAp;
	private static JLabel lblPesoAlt;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JButton btnModifyPlayer;
	private JScrollPane scrollPane;
	private static JPanel panelEstadisticaBateador;
	private JSeparator separator_3;
	private JLabel lblEstadsticas;
	private JLabel label_1;
	private static JTextField txtAVGb;
	private static JTextField txtRb;
	private JLabel label_2;
	private JLabel label_3;
	private static JTextField txtH1b;
	private  static JTextField txtH2b;
	private JLabel label_7;
	private JLabel label_12;
	private static  JTextField txtH3b;
	private static JTextField txtHRb;
	private JLabel label_13;
	private JLabel label_14;
	private static JTextField txtRBIb;
	private static JTextField txtBBb;
	private JLabel label_15;
	private JLabel label_16;
	private static  JTextField txtSOb;
	private static  JTextField txtSBb;
	private JLabel label_17;
	private JPanel panel;
	private static JPanel panelEstadisticaPitcher;
	private JSeparator separator_4;
	private JLabel label;
	private JLabel label_18;
	private static JTextField txtWp;
	private  static JTextField txtLp;
	private JLabel label_19;
	private JLabel label_20;
	private static JTextField txtERA;
	private static  JTextField txtGp;
	private JLabel label_21;
	private JLabel label_22;
	private static JTextField txtGSp;
	private static JTextField txtSVp;
	private JLabel label_23;
	private JLabel label_24;
	private static JTextField txtHRp;
	private static  JTextField txtHp;
	private JLabel label_25;
	private JLabel label_26;
	private static JTextField txtRp;
	private static JTextField txtSOp;
	private JLabel label_27;
	private JLabel label_28;
	private static JTextField txtIPp;
	private static JTextField txtAVGp;
	private JLabel label_29;
	private JButton btnNa_1;
	private JButton btnAddPlayerTeam;
	private JButton btnNa_2;
	private String seleccionarjugador;
	private JLabel lblCf;
	private JLabel lblLf;
	private JLabel lblRf;
	private JLabel lblSs;
	private JLabel lbl3b;
	private JLabel lbl2b;
	private JLabel lbl1b;
	private JLabel lblP;
	private JLabel lblC;
	private JButton btnBD;
	private JLabel lblBD;
	private JButton btnEliminarJugador;
	private String codePlayer;
	private String namePlayer;
	private static JTextField txtTurnos;
	private JLabel lblTurnos;


	/**
	 * Create the dialog.
	 */

	public ManagementTeam(Team team) {
		myTeam = Lidom.getInstance().searchTeamByName(team.getName());






		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 1585, 845);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 1585, 845);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);

			panelHeader = new JPanel();
			panelHeader.setLayout(null);
			panelHeader.setBackground(new Color(0, 30, 72));
			panelHeader.setBounds(0, 0, 1585, 45);
			panelBg.add(panelHeader);

			lblRegistroEquipo = new JLabel("GESTION DE EQUIPO");
			lblRegistroEquipo.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRegistroEquipo.setBounds(244, 0, 192, 45);
			panelHeader.add(lblRegistroEquipo);
			lblRegistroEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistroEquipo.setForeground(new Color(255, 255, 255));
			lblRegistroEquipo.setFont(new Font("Consolas", Font.BOLD, 20));

			button_14 = new JButton("");
			button_14.setIcon(new ImageIcon(ManagementTeam.class.getResource("/iconos_imagenes/icons8_close_window_24px_1.png")));
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			button_14.setPreferredSize(new Dimension(100, 30));
			button_14.setOpaque(false);
			button_14.setHideActionText(true);
			button_14.setForeground(Color.WHITE);
			button_14.setFont(new Font("Consolas", Font.BOLD, 20));
			button_14.setBorder(null);
			button_14.setBackground(new Color(4, 10, 20));
			button_14.setActionCommand("Cancel");
			button_14.setBounds(1547, 0, 26, 30);
			panelHeader.add(button_14);

			panelFondo = new JPanel();
			panelFondo.setBackground(new Color(255, 255, 255));
			panelFondo.setBounds(0, 45, 1585, 800);
			panelBg.add(panelFondo);
			panelFondo.setLayout(null);

			lblFundadoTeam = new JLabel("");

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			lblFundadoTeam.setText(formatter.format(myTeam.getFoundationDate()));

			lblFundadoTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblFundadoTeam.setVerticalAlignment(SwingConstants.BOTTOM);
			lblFundadoTeam.setHorizontalTextPosition(SwingConstants.LEFT);
			lblFundadoTeam.setHorizontalAlignment(SwingConstants.LEFT);
			lblFundadoTeam.setForeground(Color.BLACK);
			lblFundadoTeam.setFont(new Font("Consolas", Font.PLAIN, 22));
			lblFundadoTeam.setBackground(new Color(0, 30, 72));
			lblFundadoTeam.setBounds(455, 101, 260, 31);
			panelFondo.add(lblFundadoTeam);

			lblEstadioTeam = new JLabel("");

			lblEstadioTeam.setText(myTeam.getStadium());

			lblEstadioTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEstadioTeam.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEstadioTeam.setHorizontalTextPosition(SwingConstants.LEFT);
			lblEstadioTeam.setHorizontalAlignment(SwingConstants.LEFT);
			lblEstadioTeam.setForeground(Color.BLACK);
			lblEstadioTeam.setFont(new Font("Consolas", Font.PLAIN, 22));
			lblEstadioTeam.setBackground(new Color(0, 30, 72));
			lblEstadioTeam.setBounds(455, 57, 260, 31);
			panelFondo.add(lblEstadioTeam);

			lblManagerTeam = new JLabel("");

			lblManagerTeam.setText(myTeam.getManager());

			lblManagerTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblManagerTeam.setVerticalAlignment(SwingConstants.BOTTOM);
			lblManagerTeam.setHorizontalTextPosition(SwingConstants.LEFT);
			lblManagerTeam.setHorizontalAlignment(SwingConstants.LEFT);
			lblManagerTeam.setForeground(Color.BLACK);
			lblManagerTeam.setFont(new Font("Consolas", Font.PLAIN, 22));
			lblManagerTeam.setBackground(new Color(0, 30, 72));
			lblManagerTeam.setBounds(455, 143, 260, 31);
			panelFondo.add(lblManagerTeam);

			lblNameTeam = new JLabel();

			lblNameTeam.setText(myTeam.getName());

			lblNameTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblNameTeam.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNameTeam.setForeground(Color.BLACK);
			lblNameTeam.setFont(new Font("Consolas", Font.PLAIN, 36));
			lblNameTeam.setBackground(Color.WHITE);
			lblNameTeam.setBounds(229, 187, 558, 58);
			panelFondo.add(lblNameTeam);

			label_4 = new JLabel("- Manager:");
			label_4.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_4.setVerticalAlignment(SwingConstants.BOTTOM);
			label_4.setHorizontalTextPosition(SwingConstants.LEFT);
			label_4.setHorizontalAlignment(SwingConstants.LEFT);
			label_4.setForeground(Color.BLACK);
			label_4.setFont(new Font("Consolas", Font.PLAIN, 22));
			label_4.setBackground(new Color(0, 30, 72));
			label_4.setBounds(278, 143, 120, 31);
			panelFondo.add(label_4);

			label_5 = new JLabel("- Fundado:");
			label_5.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_5.setVerticalAlignment(SwingConstants.BOTTOM);
			label_5.setHorizontalTextPosition(SwingConstants.LEFT);
			label_5.setHorizontalAlignment(SwingConstants.LEFT);
			label_5.setForeground(Color.BLACK);
			label_5.setFont(new Font("Consolas", Font.PLAIN, 22));
			label_5.setBackground(new Color(0, 30, 72));
			label_5.setBounds(278, 101, 120, 31);
			panelFondo.add(label_5);

			label_6 = new JLabel("- Estadio:");
			label_6.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_6.setVerticalAlignment(SwingConstants.BOTTOM);
			label_6.setHorizontalTextPosition(SwingConstants.LEFT);
			label_6.setHorizontalAlignment(SwingConstants.LEFT);
			label_6.setForeground(Color.BLACK);
			label_6.setFont(new Font("Consolas", Font.PLAIN, 22));
			label_6.setBackground(new Color(0, 30, 72));
			label_6.setBounds(278, 57, 120, 31);
			panelFondo.add(label_6);

			lblLogoTeam = new JLabel("");
			lblLogoTeam.setToolTipText("LIDOM");
			lblLogoTeam.setOpaque(true);
			lblLogoTeam.setBackground(Color.BLACK);
			lblLogoTeam.setBounds(12, 38, 205, 205);
			panelFondo.add(lblLogoTeam);

			String routetosave = "Fotos_Equipos/"+ myTeam.getName() + ".png";
			/** to adjust image at size of JLabel **/
			ImageIcon fotoJugador = new ImageIcon(routetosave);
			Icon fotoJ = new ImageIcon(fotoJugador.getImage().getScaledInstance(lblLogoTeam.getWidth(), lblLogoTeam.getHeight(), Image.SCALE_SMOOTH));
			lblLogoTeam.setIcon(fotoJ);

			panelGeneralInfo = new JPanel();
			panelGeneralInfo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panelGeneralInfo.setBackground(Color.WHITE);
			panelGeneralInfo.setBounds(12, 258, 775, 529);
			panelFondo.add(panelGeneralInfo);
			panelGeneralInfo.setLayout(new CardLayout(0, 0));

			panelEstadisticaEquipo = new JPanel();
			panelGeneralInfo.add(panelEstadisticaEquipo, "name_119129357718800");
			panelEstadisticaEquipo.setLayout(null);

			lblEstadsticaDelEquipo = new JLabel("Estad\u00EDstica Equipo");
			lblEstadsticaDelEquipo.setBounds(0, 0, 775, 31);
			panelEstadisticaEquipo.add(lblEstadsticaDelEquipo);
			lblEstadsticaDelEquipo.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEstadsticaDelEquipo.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEstadsticaDelEquipo.setOpaque(true);
			lblEstadsticaDelEquipo.setHorizontalTextPosition(SwingConstants.CENTER);
			lblEstadsticaDelEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblEstadsticaDelEquipo.setForeground(Color.WHITE);
			lblEstadsticaDelEquipo.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEstadsticaDelEquipo.setBackground(new Color(0, 30, 72));

			panelLineUp = new JPanel();
			panelGeneralInfo.add(panelLineUp, "name_35499254060700");
			panelLineUp.setLayout(null);

			btnCf = new JButton("CF");
			btnCf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;
					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Batter) {		
							if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Center fielder") && auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName() + " " + auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox				
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null) {

							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {

								try {
									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Batter) {

											if (((Batter) playel).getPosition().equalsIgnoreCase("Center fielder")) {
												auxTeam.getLineUp().remove(i);
												auxTeam.getLineUp().add(i, auxPlayer);
												jugadorRepetido = true;

											}

										}


										i++;
									}
								}catch(java.util.ConcurrentModificationException e2) {

								}
							}if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}
							lblCf.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());
						} //FALTA MANDAR MENSAJE DE QUE NO ESTA SELECCIONADO MMG


						loadLineUpPlayerByTeam();

					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnCf.setIconTextGap(5);
			btnCf.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnCf.setForeground(new Color(255, 255, 240));
			btnCf.setFont(new Font("Consolas", Font.BOLD, 22));
			btnCf.setBorder(null);
			btnCf.setBackground(new Color(4, 10, 20));
			btnCf.setBounds(365, 47, 60, 37);
			panelLineUp.add(btnCf);

			btnL = new JButton("LF");
			btnL.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;
					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Batter) {		
							if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Left fielder") && auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName() + " "+ auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox				
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null) {
							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {

								try {
									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Batter) {

											if (((Batter) playel).getPosition().equalsIgnoreCase("Left fielder")) {
												auxTeam.getLineUp().remove(i);
												auxTeam.getLineUp().add(i, auxPlayer);
												jugadorRepetido = true;

											}

										}


										i++;
									}
								}catch(java.util.ConcurrentModificationException e2) {

								}
							}if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}
							lblLf.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());
						} //FALTA MANDAR MENSAJE DE QUE NO ESTA SELECCIONADO MMG


						loadLineUpPlayerByTeam();
						loadLineUpLabel();

					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnL.setIconTextGap(5);
			btnL.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnL.setForeground(new Color(255, 255, 240));
			btnL.setFont(new Font("Consolas", Font.BOLD, 22));
			btnL.setBorder(null);
			btnL.setBackground(new Color(4, 10, 20));
			btnL.setBounds(163, 91, 60, 37);
			panelLineUp.add(btnL);

			btnSs = new JButton("SS");
			btnSs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;

					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Batter) {		
							if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Short stop") && auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName()+ " "+ auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox				
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null ) {	
							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {
								try {
									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Batter) {

											if (((Batter) playel).getPosition().equalsIgnoreCase("Short stop")) {
												auxTeam.getLineUp().remove(i);
												auxTeam.getLineUp().add(i, auxPlayer);
												jugadorRepetido = true;

											}
										}
										i++;
									}
								}catch(java.util.ConcurrentModificationException e2) {

								}

							}

							if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}
							lblSs.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());
						} //FALTA MANDAR MENSAJE DE QUE NO ESTA SELECCIONADO MMG

						loadLineUpPlayerByTeam();
						loadLineUpLabel();

					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnSs.setIconTextGap(5);
			btnSs.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnSs.setForeground(new Color(255, 255, 240));
			btnSs.setFont(new Font("Consolas", Font.BOLD, 22));
			btnSs.setBorder(null);
			btnSs.setBackground(new Color(4, 10, 20));
			btnSs.setBounds(271, 196, 60, 37);
			panelLineUp.add(btnSs);

			btn3b = new JButton("3B");
			btn3b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;
					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Batter) {		
							if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Tercera base") && auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName() + " " + auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox				
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null ) {
							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {

								try {
									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Batter) {

											if (((Batter) playel).getPosition().equalsIgnoreCase("Tercera base")) {
												auxTeam.getLineUp().remove(i);
												auxTeam.getLineUp().add(i, auxPlayer);  /// para sustituir la posicion en el lineup
												jugadorRepetido = true;
											}
										}
										i++;
									}
								}catch(java.util.ConcurrentModificationException e2) {

								}
							}if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}
							lbl3b.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());

						} //FALTA MANDAR MENSAJE DE QUE NO ESTA SELECCIONADO MMG

						loadLineUpPlayerByTeam();
						loadLineUpLabel();

					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btn3b.setIconTextGap(5);
			btn3b.setHorizontalTextPosition(SwingConstants.RIGHT);
			btn3b.setForeground(new Color(255, 255, 240));
			btn3b.setFont(new Font("Consolas", Font.BOLD, 22));
			btn3b.setBorder(null);
			btn3b.setBackground(new Color(4, 10, 20));
			btn3b.setBounds(238, 279, 60, 37);
			panelLineUp.add(btn3b);

			btnP = new JButton("P");
			btnP.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;
					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Pitcher) {		
							if (auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName() + " " + auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox.			
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null ) {
							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {
								try {
									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Pitcher) {

											auxTeam.getLineUp().remove(i);
											auxTeam.getLineUp().add(i, auxPlayer);
											jugadorRepetido = true;
										}
										i++;
									}
								}catch(java.util.ConcurrentModificationException e2) {

								}
							}if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}

							lblP.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());

						}
						loadLineUpPlayerByTeam();
						loadLineUpLabel();
					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnP.setIconTextGap(5);
			btnP.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnP.setForeground(new Color(255, 255, 240));
			btnP.setFont(new Font("Consolas", Font.BOLD, 22));
			btnP.setBorder(null);
			btnP.setBackground(new Color(4, 10, 20));
			btnP.setBounds(360, 279, 60, 37);
			panelLineUp.add(btnP);

			btnC = new JButton("C");
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;
					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Batter) {		
							if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Catcher") && auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName() + " "+ auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox				
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null ) {
							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {

								try {
									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Batter) {

											if (((Batter) playel).getPosition().equalsIgnoreCase("Catcher")) {
												auxTeam.getLineUp().remove(i);
												auxTeam.getLineUp().add(i, auxPlayer);
												jugadorRepetido = true;

											}

										}


										i++;
									}
								}catch(java.util.ConcurrentModificationException e2) {

								}
							}if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}
							lblC.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());
						} //FALTA MANDAR MENSAJE DE QUE NO ESTA SELECCIONADO MMG


						loadLineUpPlayerByTeam();
						loadLineUpLabel();

					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnC.setIconTextGap(5);
			btnC.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnC.setForeground(new Color(255, 255, 240));
			btnC.setFont(new Font("Consolas", Font.BOLD, 22));
			btnC.setBorder(null);
			btnC.setBackground(new Color(4, 10, 20));
			btnC.setBounds(360, 459, 60, 37);
			panelLineUp.add(btnC);

			button_10 = new JButton("Finalizar Line Up");
			button_10.setIconTextGap(5);
			button_10.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_10.setForeground(new Color(255, 255, 240));
			button_10.setFont(new Font("Consolas", Font.BOLD, 22));
			button_10.setEnabled(false);
			button_10.setBorder(null);
			button_10.setBackground(new Color(4, 10, 20));
			button_10.setBounds(243, 615, 284, 37);
			panelLineUp.add(button_10);

			btn1b = new JButton("1B");
			btn1b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;
					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Batter) {		
							if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Primera base") && auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName() + " "+auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox				
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null) {
							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {
								try {

									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Batter) {

											if (((Batter) playel).getPosition().equalsIgnoreCase("Primera base")) {

												auxTeam.getLineUp().remove(i);
												auxTeam.getLineUp().add(i, auxPlayer);
												jugadorRepetido = true;
											}
										}	
										i++;
									}
								}
								catch (java.util.ConcurrentModificationException e2) {

								}
							}if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}
							lbl1b.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());
						} //FALTA MANDAR MENSAJE DE QUE NO ESTA SELECCIONADO MMG


						loadLineUpPlayerByTeam();
						loadLineUpLabel();

					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btn1b.setIconTextGap(5);
			btn1b.setHorizontalTextPosition(SwingConstants.RIGHT);
			btn1b.setForeground(new Color(255, 255, 240));
			btn1b.setFont(new Font("Consolas", Font.BOLD, 22));
			btn1b.setBorder(null);
			btn1b.setBackground(new Color(4, 10, 20));
			btn1b.setBounds(474, 279, 60, 37);
			panelLineUp.add(btn1b);

			btn2b = new JButton("2B");
			btn2b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;
					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Batter) {		
							if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Segunda base") && auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName() + " " + auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox				
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null) {

							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {

								try {
									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Batter) {

											if (((Batter) playel).getPosition().equalsIgnoreCase("Segunda base")) {
												auxTeam.getLineUp().remove(i);
												auxTeam.getLineUp().add(i, auxPlayer);
												jugadorRepetido = true;

											}

										}


										i++;
									}
								}catch(java.util.ConcurrentModificationException e2) {

								}
							}if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}
							lbl2b.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());

						} //FALTA MANDAR MENSAJE DE QUE NO ESTA SELECCIONADO MMG


						loadLineUpPlayerByTeam();
						loadLineUpLabel();

					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btn2b.setIconTextGap(5);
			btn2b.setHorizontalTextPosition(SwingConstants.RIGHT);
			btn2b.setForeground(new Color(255, 255, 240));
			btn2b.setFont(new Font("Consolas", Font.BOLD, 22));
			btn2b.setBorder(null);
			btn2b.setBackground(new Color(4, 10, 20));
			btn2b.setBounds(447, 196, 60, 37);
			panelLineUp.add(btn2b);

			bntRf = new JButton("RF");
			bntRf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;
					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Batter) {		
							if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Right fielder") && auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName() + " " + auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox				
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null) {

							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {

								try {
									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Batter) {

											if (((Batter) playel).getPosition().equalsIgnoreCase("Right fielder")) {
												auxTeam.getLineUp().remove(i);
												auxTeam.getLineUp().add(i, auxPlayer);
												jugadorRepetido = true;

											}

										}


										i++;
									}
								}catch(java.util.ConcurrentModificationException e2) {

								}
							}if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}
							lblRf.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());
						} //FALTA MANDAR MENSAJE DE QUE NO ESTA SELECCIONADO MMG


						loadLineUpPlayerByTeam();
						loadLineUpLabel();

					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			bntRf.setIconTextGap(5);
			bntRf.setHorizontalTextPosition(SwingConstants.RIGHT);
			bntRf.setForeground(new Color(255, 255, 240));
			bntRf.setFont(new Font("Consolas", Font.BOLD, 22));
			bntRf.setBorder(null);
			bntRf.setBackground(new Color(4, 10, 20));
			bntRf.setBounds(566, 91, 60, 37);
			panelLineUp.add(bntRf);

			btnBD = new JButton("BD");
			btnBD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
					ArrayList<String> playerAvailable = new ArrayList<String>();
					boolean jugadorRepetido = false;
					for (Player auxPlayer : auxTeam.getRosterPlayers()) {
						if (auxPlayer instanceof Batter) {		
							if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Designado") && auxPlayer.getLesionado() == false) {
								playerAvailable.add(auxPlayer.getName() + " " +auxPlayer.getLastname()); // agregar a un arraylist temporal para mostrar en cbxbox				
							}
						}		
					}
					try {
						String[] copyPlayerAvailable = new String[playerAvailable.size()];
						copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

						seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);

						if (seleccionarjugador != null ) {

							nameArrayAvailable = seleccionarjugador.split(" ", 0);
							Player auxPlayer = Lidom.getInstance().searchPlayerByNameByTeam(nameArrayAvailable[0], nameArrayAvailable[1], auxTeam.getName());
							int i = 0;

							if (auxTeam.getLineUp().size() > 0) {
								try {

									for (Player playel : auxTeam.getLineUp()) {

										if (playel  instanceof Batter) {

											if (((Batter) playel).getPosition().equalsIgnoreCase("Designado")) {
												auxTeam.getLineUp().remove(i);
												auxTeam.getLineUp().add(i, auxPlayer);
												jugadorRepetido = true;

											}

										}


										i++;
									}
								}catch(java.util.ConcurrentModificationException e2) {

								}
							}if(jugadorRepetido == false){
								auxTeam.addPlayerLineUp(auxPlayer);
							}
							lblBD.setText(seleccionarjugador+ " " +  auxPlayer.getLastname());
						} //FALTA MANDAR MENSAJE DE QUE NO ESTA SELECCIONADO MMG


						loadLineUpPlayerByTeam();
						loadLineUpLabel();

					}
					catch(ArrayIndexOutOfBoundsException e2){
						JOptionPane.showMessageDialog(null, "No hay jugadores para esta posici�n!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnBD.setIconTextGap(5);
			btnBD.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnBD.setForeground(new Color(255, 255, 240));
			btnBD.setFont(new Font("Consolas", Font.BOLD, 22));
			btnBD.setBorder(null);
			btnBD.setBackground(new Color(4, 10, 20));
			btnBD.setBounds(360, 329, 60, 37);
			panelLineUp.add(btnBD);

			lblCf = new JLabel("");
			lblCf.setFont(new Font("Consolas", Font.ITALIC, 11));
			lblCf.setBounds(346, 22, 128, 16);
			panelLineUp.add(lblCf);

			lblLf = new JLabel("");
			lblLf.setFont(new Font("Consolas", Font.ITALIC, 11));
			lblLf.setBounds(116, 68, 128, 16);
			panelLineUp.add(lblLf);

			lblRf = new JLabel("");
			lblRf.setFont(new Font("Consolas", Font.ITALIC, 11));
			lblRf.setBounds(546, 68, 128, 16);
			panelLineUp.add(lblRf);

			lblSs = new JLabel("");
			lblSs.setFont(new Font("Consolas", Font.ITALIC, 11));
			lblSs.setBounds(238, 178, 114, 16);
			panelLineUp.add(lblSs);

			lbl3b = new JLabel("");
			lbl3b.setFont(new Font("Consolas", Font.ITALIC, 11));
			lbl3b.setBounds(189, 259, 128, 16);
			panelLineUp.add(lbl3b);

			lbl2b = new JLabel("");
			lbl2b.setFont(new Font("Consolas", Font.ITALIC, 11));
			lbl2b.setBounds(427, 178, 142, 16);
			panelLineUp.add(lbl2b);

			lbl1b = new JLabel("");
			lbl1b.setFont(new Font("Consolas", Font.ITALIC, 11));
			lbl1b.setBounds(452, 259, 128, 16);
			panelLineUp.add(lbl1b);

			lblP = new JLabel("");
			lblP.setFont(new Font("Consolas", Font.ITALIC, 11));
			lblP.setBounds(329, 259, 125, 16);
			panelLineUp.add(lblP);

			lblC = new JLabel("");
			lblC.setFont(new Font("Consolas", Font.ITALIC, 11));
			lblC.setBounds(312, 430, 142, 16);
			panelLineUp.add(lblC);

			lblBD = new JLabel("");
			lblBD.setFont(new Font("Consolas", Font.ITALIC, 11));
			lblBD.setBounds(329, 368, 125, 16);
			panelLineUp.add(lblBD);

			lblBgPlayLineUp = new JLabel("");
			lblBgPlayLineUp.setBounds(30, 13, 711, 499);
			panelLineUp.add(lblBgPlayLineUp);
			/** to adjust image at size of JLabel **/
			ImageIcon bgLinePlay = new ImageIcon(getClass().getResource("/iconos_imagenes/Baseball_diamond_clean.png"));
			Icon playLine = new ImageIcon(bgLinePlay.getImage().getScaledInstance(lblBgPlayLineUp.getWidth(), lblBgPlayLineUp.getHeight(), Image.SCALE_SMOOTH));
			lblBgPlayLineUp.setIcon(playLine);

			panelCalendarioEquipo = new JPanel();
			panelCalendarioEquipo.setBackground(new Color(255, 255, 255));
			panelGeneralInfo.add(panelCalendarioEquipo, "name_120195129084500");
			panelCalendarioEquipo.setLayout(null);

			lblCalendarioDePartidos = new JLabel("Calendario Partidos");
			lblCalendarioDePartidos.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblCalendarioDePartidos.setVerticalAlignment(SwingConstants.BOTTOM);
			lblCalendarioDePartidos.setOpaque(true);
			lblCalendarioDePartidos.setHorizontalTextPosition(SwingConstants.CENTER);
			lblCalendarioDePartidos.setHorizontalAlignment(SwingConstants.CENTER);
			lblCalendarioDePartidos.setForeground(Color.WHITE);
			lblCalendarioDePartidos.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblCalendarioDePartidos.setBackground(new Color(0, 30, 72));
			lblCalendarioDePartidos.setBounds(0, 0, 775, 31);
			panelCalendarioEquipo.add(lblCalendarioDePartidos);

			scrollPane = new JScrollPane();
			scrollPane.setBackground(Color.WHITE);
			scrollPane.setBounds(10, 44, 749, 468);
			panelCalendarioEquipo.add(scrollPane);

			tableCalendario = new JTable();
			tableCalendario.setRowMargin(0);
			tableCalendario .setFocusable(false);
			tableCalendario.setRowHeight(20);
			tableCalendario.setIntercellSpacing(new Dimension(0, 0));
			tableCalendario.setGridColor(new Color(255, 255, 255));
			tableCalendario.setShowVerticalLines(false);
			tableCalendario.getTableHeader().setReorderingAllowed(false);
			tableCalendario.setSelectionBackground(new Color(239, 108, 0));
			tableCalendario.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableCalendario.getTableHeader().setOpaque(false);
			tableCalendario.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			tableCalendario.getTableHeader().setBackground(new Color(255,255,255));
			tableCalendario.setFont(new Font("Consolas", Font.PLAIN, 15));

			tableCalendario.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"Equipo local", "Equipo visitante", "Estadio", "Fecha", "Hora"
					}
					) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1665962479029189562L;


				Class[] columnTypes = new Class[] {
						String.class, String.class, String.class, String.class, String.class
				};
				@SuppressWarnings({ "unchecked" })
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
						false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			tableCalendario.getColumnModel().getColumn(0).setPreferredWidth(120);
			tableCalendario.getColumnModel().getColumn(1).setPreferredWidth(120);
			tableCalendario.getColumnModel().getColumn(2).setPreferredWidth(125);
			scrollPane.setViewportView(tableCalendario);

			panelPerfilJugador = new JPanel();
			panelPerfilJugador.setBackground(new Color(255, 255, 255));
			panelGeneralInfo.add(panelPerfilJugador, "name_120305318624100");
			panelPerfilJugador.setLayout(null);

			lblPerfilJugador = new JLabel("Perfil Jugador");
			lblPerfilJugador.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPerfilJugador.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPerfilJugador.setOpaque(true);
			lblPerfilJugador.setHorizontalTextPosition(SwingConstants.CENTER);
			lblPerfilJugador.setHorizontalAlignment(SwingConstants.CENTER);
			lblPerfilJugador.setForeground(Color.WHITE);
			lblPerfilJugador.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblPerfilJugador.setBackground(new Color(0, 30, 72));
			lblPerfilJugador.setBounds(0, 0, 775, 31);
			panelPerfilJugador.add(lblPerfilJugador);

			lblFotoJugador = new JLabel("");
			lblFotoJugador.setToolTipText("LIDOM");
			lblFotoJugador.setOpaque(true);
			lblFotoJugador.setBackground(Color.BLACK);
			lblFotoJugador.setBounds(10, 44, 205, 160);
			panelPerfilJugador.add(lblFotoJugador);

			lblName = new JLabel();
			lblName.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblName.setVerticalAlignment(SwingConstants.BOTTOM);
			lblName.setText("NOMBRE");
			lblName.setForeground(Color.BLACK);
			lblName.setFont(new Font("Consolas", Font.PLAIN, 36));
			lblName.setBackground(Color.WHITE);
			lblName.setBounds(227, 44, 400, 38);
			panelPerfilJugador.add(lblName);

			lblNacimiento = new JLabel("Lugar de nacimiento:");
			lblNacimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblNacimiento.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNacimiento.setHorizontalTextPosition(SwingConstants.LEFT);
			lblNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
			lblNacimiento.setForeground(Color.BLACK);
			lblNacimiento.setFont(new Font("Consolas", Font.PLAIN, 18));
			lblNacimiento.setBackground(new Color(0, 30, 72));
			lblNacimiento.setBounds(227, 177, 240, 27);
			panelPerfilJugador.add(lblNacimiento);

			lblEdad = new JLabel("Fecha de nacimiento:");
			lblEdad.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEdad.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEdad.setHorizontalTextPosition(SwingConstants.LEFT);
			lblEdad.setHorizontalAlignment(SwingConstants.LEFT);
			lblEdad.setForeground(Color.BLACK);
			lblEdad.setFont(new Font("Consolas", Font.PLAIN, 18));
			lblEdad.setBackground(new Color(0, 30, 72));
			lblEdad.setBounds(227, 135, 240, 27);
			panelPerfilJugador.add(lblEdad);

			lblNumero = new JLabel();
			lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
			lblNumero.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblNumero.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNumero.setText("#");
			lblNumero.setForeground(Color.BLACK);
			lblNumero.setFont(new Font("Consolas", Font.PLAIN, 36));
			lblNumero.setBackground(Color.WHITE);
			lblNumero.setBounds(639, 44, 70, 38);
			panelPerfilJugador.add(lblNumero);

			lblPosion = new JLabel("");
			lblPosion.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPosion.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPosion.setHorizontalTextPosition(SwingConstants.LEFT);
			lblPosion.setHorizontalAlignment(SwingConstants.CENTER);
			lblPosion.setForeground(Color.BLACK);
			lblPosion.setFont(new Font("Consolas", Font.PLAIN, 18));
			lblPosion.setBackground(new Color(0, 30, 72));
			lblPosion.setBounds(227, 95, 48, 27);
			panelPerfilJugador.add(lblPosion);

			separator = new JSeparator();
			separator.setBounds(227, 80, 486, 2);
			panelPerfilJugador.add(separator);

			lblFechaNacimiento = new JLabel("");
			lblFechaNacimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblFechaNacimiento.setVerticalAlignment(SwingConstants.BOTTOM);
			lblFechaNacimiento.setHorizontalTextPosition(SwingConstants.LEFT);
			lblFechaNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
			lblFechaNacimiento.setForeground(Color.BLACK);
			lblFechaNacimiento.setFont(new Font("Consolas", Font.PLAIN, 18));
			lblFechaNacimiento.setBackground(new Color(0, 30, 72));
			lblFechaNacimiento.setBounds(479, 135, 230, 27);
			panelPerfilJugador.add(lblFechaNacimiento);

			lblLugarNacimiento = new JLabel("");
			lblLugarNacimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblLugarNacimiento.setVerticalAlignment(SwingConstants.BOTTOM);
			lblLugarNacimiento.setHorizontalTextPosition(SwingConstants.LEFT);
			lblLugarNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
			lblLugarNacimiento.setForeground(Color.BLACK);
			lblLugarNacimiento.setFont(new Font("Consolas", Font.PLAIN, 18));
			lblLugarNacimiento.setBackground(new Color(0, 30, 72));
			lblLugarNacimiento.setBounds(479, 177, 230, 27);
			panelPerfilJugador.add(lblLugarNacimiento);

			lblBt = new JLabel("B/T:");
			lblBt.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblBt.setVerticalAlignment(SwingConstants.BOTTOM);
			lblBt.setHorizontalTextPosition(SwingConstants.LEFT);
			lblBt.setHorizontalAlignment(SwingConstants.LEFT);
			lblBt.setForeground(Color.BLACK);
			lblBt.setFont(new Font("Consolas", Font.PLAIN, 18));
			lblBt.setBackground(new Color(0, 30, 72));
			lblBt.setBounds(301, 95, 48, 27);
			panelPerfilJugador.add(lblBt);

			lblBT = new JLabel("");
			lblBT.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblBT.setVerticalAlignment(SwingConstants.BOTTOM);
			lblBT.setHorizontalTextPosition(SwingConstants.LEFT);
			lblBT.setHorizontalAlignment(SwingConstants.CENTER);
			lblBT.setForeground(Color.BLACK);
			lblBT.setFont(new Font("Consolas", Font.PLAIN, 18));
			lblBT.setBackground(new Color(0, 30, 72));
			lblBT.setBounds(361, 95, 106, 27);
			panelPerfilJugador.add(lblBT);

			lblAp = new JLabel("Alt./P:");
			lblAp.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblAp.setVerticalAlignment(SwingConstants.BOTTOM);
			lblAp.setHorizontalTextPosition(SwingConstants.LEFT);
			lblAp.setHorizontalAlignment(SwingConstants.LEFT);
			lblAp.setForeground(Color.BLACK);
			lblAp.setFont(new Font("Consolas", Font.PLAIN, 18));
			lblAp.setBackground(new Color(0, 30, 72));
			lblAp.setBounds(490, 95, 70, 27);
			panelPerfilJugador.add(lblAp);

			lblPesoAlt = new JLabel("");
			lblPesoAlt.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPesoAlt.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPesoAlt.setHorizontalTextPosition(SwingConstants.LEFT);
			lblPesoAlt.setHorizontalAlignment(SwingConstants.LEFT);
			lblPesoAlt.setForeground(Color.BLACK);
			lblPesoAlt.setFont(new Font("Consolas", Font.PLAIN, 18));
			lblPesoAlt.setBackground(new Color(0, 30, 72));
			lblPesoAlt.setBounds(572, 95, 137, 27);
			panelPerfilJugador.add(lblPesoAlt);

			separator_1 = new JSeparator();
			separator_1.setOpaque(true);
			separator_1.setBorder(null);
			separator_1.setBackground(new Color(4, 10, 20, 70));
			separator_1.setBounds(287, 95, 2, 27);
			panelPerfilJugador.add(separator_1);

			separator_2 = new JSeparator();
			separator_2.setOpaque(true);
			separator_2.setBorder(null);
			separator_2.setBackground(new Color(4, 10, 20, 70));
			separator_2.setBounds(476, 95, 2, 27);
			panelPerfilJugador.add(separator_2);

			btnModifyPlayer = new JButton("");
			btnModifyPlayer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Player auxPlayer = Lidom.getInstance().searchPlayerByID(codeJugadorRoster);
					AddPlayer modplayer = new AddPlayer(auxPlayer, myTeam.getName());
					modplayer.setModal(true);
					modplayer.setVisible(true);

				}
			});
			btnModifyPlayer.setIcon(new ImageIcon(ManagementTeam.class.getResource("/iconos_imagenes/icons8_edit_property_36px_1.png")));
			btnModifyPlayer.setToolTipText("Modificar jugador.");
			btnModifyPlayer.setIconTextGap(5);
			btnModifyPlayer.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnModifyPlayer.setForeground(new Color(255, 255, 240));
			btnModifyPlayer.setFont(new Font("Consolas", Font.BOLD, 20));
			btnModifyPlayer.setBorder(null);
			btnModifyPlayer.setBackground(new Color(4, 10, 20));
			btnModifyPlayer.setBounds(721, 44, 38, 37);
			panelPerfilJugador.add(btnModifyPlayer);

			panel = new JPanel();
			panel.setBounds(10, 271, 749, 241);
			panelPerfilJugador.add(panel);
			panel.setLayout(new CardLayout(0, 0));

			panelEstadisticaBateador = new JPanel();
			panel.add(panelEstadisticaBateador, "name_132482742902900");
			panelEstadisticaBateador.setLayout(null);
			panelEstadisticaBateador.setBorder(new LineBorder(new Color(0, 30, 72), 1, true));
			panelEstadisticaBateador.setBackground(Color.WHITE);

			separator_3 = new JSeparator();
			separator_3.setOpaque(true);
			separator_3.setBorder(null);
			separator_3.setBackground(new Color(4, 10, 20));
			separator_3.setBounds(12, 40, 725, 2);
			panelEstadisticaBateador.add(separator_3);

			lblEstadsticas = new JLabel("Estad\u00EDsticas");
			lblEstadsticas.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEstadsticas.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEstadsticas.setHorizontalAlignment(SwingConstants.LEFT);
			lblEstadsticas.setForeground(Color.BLACK);
			lblEstadsticas.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEstadsticas.setBounds(12, 13, 231, 24);
			panelEstadisticaBateador.add(lblEstadsticas);

			label_1 = new JLabel("AVG");
			label_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_1.setVerticalAlignment(SwingConstants.BOTTOM);
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setForeground(Color.BLACK);
			label_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_1.setBounds(132, 55, 85, 31);
			panelEstadisticaBateador.add(label_1);

			txtAVGb = new JTextField() {
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
			txtAVGb.setEditable(false);
			txtAVGb.setHorizontalAlignment(SwingConstants.CENTER);
			txtAVGb.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtAVGb.setDisabledTextColor(Color.BLACK);
			txtAVGb.setColumns(10);
			txtAVGb.setBounds(132, 89, 85, 30);
			panelEstadisticaBateador.add(txtAVGb);

			txtRb = new JTextField() {
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
			txtRb.setEditable(false);
			txtRb.setHorizontalAlignment(SwingConstants.CENTER);
			txtRb.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtRb.setDisabledTextColor(Color.BLACK);
			txtRb.setColumns(10);
			txtRb.setBounds(132, 166, 85, 30);
			panelEstadisticaBateador.add(txtRb);

			label_2 = new JLabel("R");
			label_2.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_2.setVerticalAlignment(SwingConstants.BOTTOM);
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setForeground(Color.BLACK);
			label_2.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_2.setBounds(132, 132, 85, 31);
			panelEstadisticaBateador.add(label_2);

			label_3 = new JLabel("H1");
			label_3.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_3.setVerticalAlignment(SwingConstants.BOTTOM);
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setForeground(Color.BLACK);
			label_3.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_3.setBounds(229, 55, 85, 31);
			panelEstadisticaBateador.add(label_3);

			txtH1b = new JTextField() {
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
			txtH1b.setEditable(false);
			txtH1b.setHorizontalAlignment(SwingConstants.CENTER);
			txtH1b.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtH1b.setDisabledTextColor(Color.BLACK);
			txtH1b.setColumns(10);
			txtH1b.setBounds(229, 89, 85, 30);
			panelEstadisticaBateador.add(txtH1b);

			txtH2b = new JTextField() {
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
			txtH2b.setEditable(false);
			txtH2b.setHorizontalAlignment(SwingConstants.CENTER);
			txtH2b.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtH2b.setDisabledTextColor(Color.BLACK);
			txtH2b.setColumns(10);
			txtH2b.setBounds(326, 89, 85, 30);
			panelEstadisticaBateador.add(txtH2b);

			label_7 = new JLabel("H2");
			label_7.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_7.setVerticalAlignment(SwingConstants.BOTTOM);
			label_7.setHorizontalAlignment(SwingConstants.CENTER);
			label_7.setForeground(Color.BLACK);
			label_7.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_7.setBounds(326, 55, 85, 31);
			panelEstadisticaBateador.add(label_7);

			label_12 = new JLabel("H3");
			label_12.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_12.setVerticalAlignment(SwingConstants.BOTTOM);
			label_12.setHorizontalAlignment(SwingConstants.CENTER);
			label_12.setForeground(Color.BLACK);
			label_12.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_12.setBounds(423, 55, 85, 31);
			panelEstadisticaBateador.add(label_12);

			txtH3b = new JTextField() {
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
			txtH3b.setEditable(false);
			txtH3b.setHorizontalAlignment(SwingConstants.CENTER);
			txtH3b.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtH3b.setDisabledTextColor(Color.BLACK);
			txtH3b.setColumns(10);
			txtH3b.setBounds(423, 89, 85, 30);
			panelEstadisticaBateador.add(txtH3b);

			txtHRb = new JTextField() {
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
			txtHRb.setEditable(false);
			txtHRb.setHorizontalAlignment(SwingConstants.CENTER);
			txtHRb.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtHRb.setDisabledTextColor(Color.BLACK);
			txtHRb.setColumns(10);
			txtHRb.setBounds(520, 89, 85, 30);
			panelEstadisticaBateador.add(txtHRb);

			label_13 = new JLabel("HR");
			label_13.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_13.setVerticalAlignment(SwingConstants.BOTTOM);
			label_13.setHorizontalAlignment(SwingConstants.CENTER);
			label_13.setForeground(Color.BLACK);
			label_13.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_13.setBounds(520, 55, 85, 31);
			panelEstadisticaBateador.add(label_13);

			label_14 = new JLabel("RBI");
			label_14.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_14.setVerticalAlignment(SwingConstants.BOTTOM);
			label_14.setHorizontalAlignment(SwingConstants.CENTER);
			label_14.setForeground(Color.BLACK);
			label_14.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_14.setBounds(326, 132, 85, 31);
			panelEstadisticaBateador.add(label_14);

			txtRBIb = new JTextField() {
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
			txtRBIb.setEditable(false);
			txtRBIb.setHorizontalAlignment(SwingConstants.CENTER);
			txtRBIb.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtRBIb.setDisabledTextColor(Color.BLACK);
			txtRBIb.setColumns(10);
			txtRBIb.setBounds(326, 166, 85, 30);
			panelEstadisticaBateador.add(txtRBIb);

			txtBBb = new JTextField() {
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
			txtBBb.setEditable(false);
			txtBBb.setHorizontalAlignment(SwingConstants.CENTER);
			txtBBb.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtBBb.setDisabledTextColor(Color.BLACK);
			txtBBb.setColumns(10);
			txtBBb.setBounds(423, 166, 85, 30);
			panelEstadisticaBateador.add(txtBBb);

			label_15 = new JLabel("BB");
			label_15.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_15.setVerticalAlignment(SwingConstants.BOTTOM);
			label_15.setHorizontalAlignment(SwingConstants.CENTER);
			label_15.setForeground(Color.BLACK);
			label_15.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_15.setBounds(423, 132, 85, 31);
			panelEstadisticaBateador.add(label_15);

			label_16 = new JLabel("SO");
			label_16.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_16.setVerticalAlignment(SwingConstants.BOTTOM);
			label_16.setHorizontalAlignment(SwingConstants.CENTER);
			label_16.setForeground(Color.BLACK);
			label_16.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_16.setBounds(520, 132, 85, 31);
			panelEstadisticaBateador.add(label_16);

			txtSOb = new JTextField() {
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
			txtSOb.setEditable(false);
			txtSOb.setHorizontalAlignment(SwingConstants.CENTER);
			txtSOb.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtSOb.setDisabledTextColor(Color.BLACK);
			txtSOb.setColumns(10);
			txtSOb.setBounds(520, 166, 85, 30);
			panelEstadisticaBateador.add(txtSOb);

			txtSBb = new JTextField() {
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
			txtSBb.setEditable(false);
			txtSBb.setHorizontalAlignment(SwingConstants.CENTER);
			txtSBb.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtSBb.setDisabledTextColor(Color.BLACK);
			txtSBb.setColumns(10);
			txtSBb.setBounds(229, 166, 85, 30);
			panelEstadisticaBateador.add(txtSBb);

			label_17 = new JLabel("SB");
			label_17.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_17.setVerticalAlignment(SwingConstants.BOTTOM);
			label_17.setHorizontalAlignment(SwingConstants.CENTER);
			label_17.setForeground(Color.BLACK);
			label_17.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_17.setBounds(229, 132, 85, 31);
			panelEstadisticaBateador.add(label_17);
			
			txtTurnos = new JTextField() {
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
			txtTurnos.setHorizontalAlignment(SwingConstants.CENTER);
			txtTurnos.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtTurnos.setEditable(false);
			txtTurnos.setDisabledTextColor(Color.BLACK);
			txtTurnos.setColumns(10);
			txtTurnos.setBounds(638, 132, 80, 50);
			panelEstadisticaBateador.add(txtTurnos);
			
			lblTurnos = new JLabel("Turnos");
			lblTurnos.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblTurnos.setVerticalAlignment(SwingConstants.BOTTOM);
			lblTurnos.setHorizontalAlignment(SwingConstants.CENTER);
			lblTurnos.setForeground(Color.BLACK);
			lblTurnos.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblTurnos.setBounds(638, 89, 85, 31);
			panelEstadisticaBateador.add(lblTurnos);

			panelEstadisticaPitcher = new JPanel();
			panelEstadisticaPitcher.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			panel.add(panelEstadisticaPitcher, "name_132513796040699");
			panelEstadisticaPitcher.setLayout(null);

			separator_4 = new JSeparator();
			separator_4.setOpaque(true);
			separator_4.setBorder(null);
			separator_4.setBackground(new Color(4, 10, 20));
			separator_4.setBounds(12, 35, 725, 2);
			panelEstadisticaPitcher.add(separator_4);

			label = new JLabel("Estad\u00EDsticas Lanzador");
			label.setVerticalTextPosition(SwingConstants.BOTTOM);
			label.setVerticalAlignment(SwingConstants.BOTTOM);
			label.setHorizontalAlignment(SwingConstants.LEFT);
			label.setForeground(Color.BLACK);
			label.setFont(new Font("Consolas", Font.PLAIN, 20));
			label.setBounds(12, 13, 231, 24);
			panelEstadisticaPitcher.add(label);

			label_18 = new JLabel("W");
			label_18.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_18.setVerticalAlignment(SwingConstants.BOTTOM);
			label_18.setHorizontalAlignment(SwingConstants.CENTER);
			label_18.setForeground(Color.BLACK);
			label_18.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_18.setBounds(90, 70, 85, 31);
			panelEstadisticaPitcher.add(label_18);

			txtWp = new JTextField() {
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
			txtWp.setEditable(false);
			txtWp.setHorizontalAlignment(SwingConstants.CENTER);
			txtWp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtWp.setDisabledTextColor(Color.BLACK);
			txtWp.setColumns(10);
			txtWp.setBounds(90, 104, 85, 30);
			panelEstadisticaPitcher.add(txtWp);

			txtLp = new JTextField() {
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
			txtLp.setEditable(false);
			txtLp.setHorizontalAlignment(SwingConstants.CENTER);
			txtLp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtLp.setDisabledTextColor(Color.BLACK);
			txtLp.setColumns(10);
			txtLp.setBounds(187, 104, 85, 30);
			panelEstadisticaPitcher.add(txtLp);

			label_19 = new JLabel("L");
			label_19.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_19.setVerticalAlignment(SwingConstants.BOTTOM);
			label_19.setHorizontalAlignment(SwingConstants.CENTER);
			label_19.setForeground(Color.BLACK);
			label_19.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_19.setBounds(187, 70, 85, 31);
			panelEstadisticaPitcher.add(label_19);

			label_20 = new JLabel("ERA");
			label_20.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_20.setVerticalAlignment(SwingConstants.BOTTOM);
			label_20.setHorizontalAlignment(SwingConstants.CENTER);
			label_20.setForeground(Color.BLACK);
			label_20.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_20.setBounds(284, 72, 85, 31);
			panelEstadisticaPitcher.add(label_20);

			txtERA = new JTextField() {
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
			txtERA.setEditable(false);
			txtERA.setHorizontalAlignment(SwingConstants.CENTER);
			txtERA.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtERA.setDisabledTextColor(Color.BLACK);
			txtERA.setColumns(10);
			txtERA.setBounds(284, 106, 85, 30);
			panelEstadisticaPitcher.add(txtERA);

			txtGp = new JTextField() {
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
			txtGp.setEditable(false);
			txtGp.setHorizontalAlignment(SwingConstants.CENTER);
			txtGp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtGp.setDisabledTextColor(Color.BLACK);
			txtGp.setColumns(10);
			txtGp.setBounds(381, 104, 85, 30);
			panelEstadisticaPitcher.add(txtGp);

			label_21 = new JLabel("G");
			label_21.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_21.setVerticalAlignment(SwingConstants.BOTTOM);
			label_21.setHorizontalAlignment(SwingConstants.CENTER);
			label_21.setForeground(Color.BLACK);
			label_21.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_21.setBounds(381, 70, 85, 31);
			panelEstadisticaPitcher.add(label_21);

			label_22 = new JLabel("GS");
			label_22.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_22.setVerticalAlignment(SwingConstants.BOTTOM);
			label_22.setHorizontalAlignment(SwingConstants.CENTER);
			label_22.setForeground(Color.BLACK);
			label_22.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_22.setBounds(478, 72, 85, 31);
			panelEstadisticaPitcher.add(label_22);

			txtGSp = new JTextField() {
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
			txtGSp.setEditable(false);
			txtGSp.setHorizontalAlignment(SwingConstants.CENTER);
			txtGSp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtGSp.setDisabledTextColor(Color.BLACK);
			txtGSp.setColumns(10);
			txtGSp.setBounds(478, 106, 85, 30);
			panelEstadisticaPitcher.add(txtGSp);

			txtSVp = new JTextField() {
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
			txtSVp.setEditable(false);
			txtSVp.setHorizontalAlignment(SwingConstants.CENTER);
			txtSVp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtSVp.setDisabledTextColor(Color.BLACK);
			txtSVp.setColumns(10);
			txtSVp.setBounds(90, 181, 85, 30);
			panelEstadisticaPitcher.add(txtSVp);

			label_23 = new JLabel("SV");
			label_23.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_23.setVerticalAlignment(SwingConstants.BOTTOM);
			label_23.setHorizontalAlignment(SwingConstants.CENTER);
			label_23.setForeground(Color.BLACK);
			label_23.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_23.setBounds(90, 147, 85, 31);
			panelEstadisticaPitcher.add(label_23);

			label_24 = new JLabel("HR");
			label_24.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_24.setVerticalAlignment(SwingConstants.BOTTOM);
			label_24.setHorizontalAlignment(SwingConstants.CENTER);
			label_24.setForeground(Color.BLACK);
			label_24.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_24.setBounds(575, 70, 85, 31);
			panelEstadisticaPitcher.add(label_24);

			txtHRp = new JTextField() {
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
			txtHRp.setEditable(false);
			txtHRp.setHorizontalAlignment(SwingConstants.CENTER);
			txtHRp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtHRp.setDisabledTextColor(Color.BLACK);
			txtHRp.setColumns(10);
			txtHRp.setBounds(575, 104, 85, 30);
			panelEstadisticaPitcher.add(txtHRp);

			txtHp = new JTextField() {
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
			txtHp.setEditable(false);
			txtHp.setHorizontalAlignment(SwingConstants.CENTER);
			txtHp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtHp.setDisabledTextColor(Color.BLACK);
			txtHp.setColumns(10);
			txtHp.setBounds(575, 181, 85, 30);
			panelEstadisticaPitcher.add(txtHp);

			label_25 = new JLabel("H");
			label_25.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_25.setVerticalAlignment(SwingConstants.BOTTOM);
			label_25.setHorizontalAlignment(SwingConstants.CENTER);
			label_25.setForeground(Color.BLACK);
			label_25.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_25.setBounds(575, 147, 85, 31);
			panelEstadisticaPitcher.add(label_25);

			label_26 = new JLabel("R");
			label_26.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_26.setVerticalAlignment(SwingConstants.BOTTOM);
			label_26.setHorizontalAlignment(SwingConstants.CENTER);
			label_26.setForeground(Color.BLACK);
			label_26.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_26.setBounds(187, 147, 85, 31);
			panelEstadisticaPitcher.add(label_26);

			txtRp = new JTextField() {
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
			txtRp.setEditable(false);
			txtRp.setHorizontalAlignment(SwingConstants.CENTER);
			txtRp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtRp.setDisabledTextColor(Color.BLACK);
			txtRp.setColumns(10);
			txtRp.setBounds(187, 181, 85, 30);
			panelEstadisticaPitcher.add(txtRp);

			txtSOp = new JTextField() {
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
			txtSOp.setEditable(false);
			txtSOp.setHorizontalAlignment(SwingConstants.CENTER);
			txtSOp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtSOp.setDisabledTextColor(Color.BLACK);
			txtSOp.setColumns(10);
			txtSOp.setBounds(284, 183, 85, 30);
			panelEstadisticaPitcher.add(txtSOp);

			label_27 = new JLabel("SO");
			label_27.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_27.setVerticalAlignment(SwingConstants.BOTTOM);
			label_27.setHorizontalAlignment(SwingConstants.CENTER);
			label_27.setForeground(Color.BLACK);
			label_27.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_27.setBounds(284, 149, 85, 31);
			panelEstadisticaPitcher.add(label_27);

			label_28 = new JLabel("IP");
			label_28.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_28.setVerticalAlignment(SwingConstants.BOTTOM);
			label_28.setHorizontalAlignment(SwingConstants.CENTER);
			label_28.setForeground(Color.BLACK);
			label_28.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_28.setBounds(381, 147, 85, 31);
			panelEstadisticaPitcher.add(label_28);

			txtIPp = new JTextField() {
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
			txtIPp.setEditable(false);
			txtIPp.setHorizontalAlignment(SwingConstants.CENTER);
			txtIPp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtIPp.setDisabledTextColor(Color.BLACK);
			txtIPp.setColumns(10);
			txtIPp.setBounds(381, 181, 85, 30);
			panelEstadisticaPitcher.add(txtIPp);

			txtAVGp = new JTextField() {
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
			txtAVGp.setEditable(false);
			txtAVGp.setHorizontalAlignment(SwingConstants.CENTER);
			txtAVGp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtAVGp.setDisabledTextColor(Color.BLACK);
			txtAVGp.setColumns(10);
			txtAVGp.setBounds(478, 181, 85, 30);
			panelEstadisticaPitcher.add(txtAVGp);

			label_29 = new JLabel("AVG");
			label_29.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_29.setVerticalAlignment(SwingConstants.BOTTOM);
			label_29.setHorizontalAlignment(SwingConstants.CENTER);
			label_29.setForeground(Color.BLACK);
			label_29.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_29.setBounds(478, 147, 85, 31);
			panelEstadisticaPitcher.add(label_29);

			btnEliminarJugador = new JButton("");
			btnEliminarJugador.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	
					int xOption	= JOptionPane.showOptionDialog(null, "�Seguro que desea eliminar el jugador? " + codeJugadorRoster, "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					if (xOption == 0) {
						Player auxPlayer = Lidom.getInstance().searchPlayerByID(codeJugadorRoster);
						Lidom.getInstance().deletePlayer(auxPlayer);
						Lidom.getInstance().deletePlayerToTeam(auxPlayer.getTeamName(), auxPlayer);

						ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_checked_48px_1.png"));
						String[] options1 = {"Ok"};	
						JOptionPane.showOptionDialog(null, "Eliminado con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1);
						loadRosterPlayerByTeam();

					}
				}
			});
			btnEliminarJugador.setIcon(new ImageIcon(ManagementTeam.class.getResource("/iconos_imagenes/icons8_delete_sign_36px_1.png")));
			btnEliminarJugador.setToolTipText("Eliminar jugador.");
			btnEliminarJugador.setIconTextGap(5);
			btnEliminarJugador.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnEliminarJugador.setForeground(new Color(255, 255, 240));
			btnEliminarJugador.setFont(new Font("Consolas", Font.BOLD, 20));
			btnEliminarJugador.setBorder(null);
			btnEliminarJugador.setBackground(new Color(4, 10, 20));
			btnEliminarJugador.setBounds(721, 85, 38, 37);
			panelPerfilJugador.add(btnEliminarJugador);

			scrollPaneLineUp = new JScrollPane();
			scrollPaneLineUp.setBackground(new Color(255, 255, 255));
			scrollPaneLineUp.setBounds(799, 469, 375, 318);
			panelFondo.add(scrollPaneLineUp);

			tableLineUp = new JTable();
			tableLineUp.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int index = tableLineUp.getSelectedRow();
					codePlayer = (String) tableLineUp.getModel().getValueAt(index, 0);
					namePlayer = (String) tableLineUp.getModel().getValueAt(index, 1);

					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	
					int xOption	= JOptionPane.showOptionDialog(null, "�Seguro que desea eliminar el jugador del lineUp? " + codePlayer + namePlayer, "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					if (xOption == 0) {

						Player auxPlayer = Lidom.getInstance().searchPlayerByID(codePlayer);
						myTeam.getLineUp().remove(auxPlayer);
						loadLineUpPlayerByTeam();

						ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_checked_48px_1.png"));
						String[] options1 = {"Ok"};	
						JOptionPane.showOptionDialog(null, "Eliminado con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1);


						loadLineUpLabel();

					}

				}
			});
			tableLineUp.setRowMargin(0);
			tableLineUp .setFocusable(false);
			tableLineUp.setRowHeight(20);
			tableLineUp.setIntercellSpacing(new Dimension(0, 0));
			tableLineUp.setGridColor(new Color(255, 255, 255));
			tableLineUp.setShowVerticalLines(false);
			tableLineUp.getTableHeader().setReorderingAllowed(false);
			tableLineUp.setSelectionBackground(new Color(239, 108, 0));
			tableLineUp.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableLineUp.getTableHeader().setOpaque(false);

			tableLineUp.getTableHeader().setBackground(new Color(255,255,255));
			tableLineUp.setFont(new Font("Consolas", Font.PLAIN, 15));
			tableLineUp.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"N\u00FAmero ID", "Nombre", "Posici\u00F3n"
					}
					) {
				Class[] columnTypes = new Class[] {
						String.class, String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
						false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			scrollPaneLineUp.setViewportView(tableLineUp);

			label_8 = new JLabel("Line Up / Jugadores Regulares");
			label_8.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_8.setVerticalAlignment(SwingConstants.BOTTOM);
			label_8.setOpaque(true);
			label_8.setHorizontalTextPosition(SwingConstants.CENTER);
			label_8.setHorizontalAlignment(SwingConstants.CENTER);
			label_8.setForeground(Color.WHITE);
			label_8.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_8.setBackground(new Color(0, 30, 72));
			label_8.setBounds(799, 425, 375, 31);
			panelFondo.add(label_8);

			label_9 = new JLabel("Funciones");
			label_9.setOpaque(true);
			label_9.setHorizontalTextPosition(SwingConstants.CENTER);
			label_9.setHorizontalAlignment(SwingConstants.CENTER);
			label_9.setForeground(Color.WHITE);
			label_9.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_9.setBackground(new Color(0, 30, 72));
			label_9.setBounds(810, 13, 352, 31);
			panelFondo.add(label_9);

			btnLineUp = new JButton("Line Up");
			btnLineUp.setEnabled(false);
			if(myTeam.getRosterPlayers().size() > 0) {
				btnLineUp.setEnabled(true);
			}
			btnLineUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					loadLineUpLabel();
					loadLineUpPlayerByTeam();               /*** LO ULTIMO QUE HICE FUE LINEUP ***/
					panelEstadisticaEquipo.setVisible(false);
					panelCalendarioEquipo.setVisible(false);
					panelPerfilJugador.setVisible(false);
					panelLineUp.setVisible(true);
				}
			});

			label_10 = new JLabel("Roster / Jugadores Activos");
			label_10.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_10.setVerticalAlignment(SwingConstants.BOTTOM);
			label_10.setOpaque(true);
			label_10.setHorizontalTextPosition(SwingConstants.CENTER);
			label_10.setHorizontalAlignment(SwingConstants.CENTER);
			label_10.setForeground(Color.WHITE);
			label_10.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_10.setBackground(new Color(0, 30, 72));
			label_10.setBounds(1198, 13, 375, 31);
			panelFondo.add(label_10);

			label_11 = new JLabel("Jugadores Lesionados");
			label_11.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_11.setVerticalAlignment(SwingConstants.BOTTOM);
			label_11.setOpaque(true);
			label_11.setHorizontalTextPosition(SwingConstants.CENTER);
			label_11.setHorizontalAlignment(SwingConstants.CENTER);
			label_11.setForeground(Color.WHITE);
			label_11.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_11.setBackground(new Color(0, 30, 72));
			label_11.setBounds(1198, 425, 375, 31);
			panelFondo.add(label_11);
			btnLineUp.setIcon(new ImageIcon(ManagementTeam.class.getResource("/iconos_imagenes/icons8_add_property_1_36px.png")));
			btnLineUp.setIconTextGap(5);
			btnLineUp.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnLineUp.setForeground(new Color(255, 255, 240));
			btnLineUp.setFont(new Font("Consolas", Font.BOLD, 20));
			btnLineUp.setBorder(null);
			btnLineUp.setBackground(new Color(4, 10, 20));
			btnLineUp.setBounds(992, 57, 170, 37);
			panelFondo.add(btnLineUp);

			btnAgregarLesin = new JButton("Lesi\u00F3n");
			btnAgregarLesin.setEnabled(false);
			if (myTeam.getRosterPlayers().size() > 0) {
				btnAgregarLesin.setEnabled(true);
			}
			btnAgregarLesin.setToolTipText("Agregar Lesi\u00F3n");
			btnAgregarLesin.setIcon(new ImageIcon(ManagementTeam.class.getResource("/iconos_imagenes/icons8_crutch_36px.png")));
			btnAgregarLesin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AddInjury injury = new AddInjury(myTeam, false);
					injury.setModal(true);
					injury.setVisible(true);
				}
			});
			btnAgregarLesin.setIconTextGap(5);
			btnAgregarLesin.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnAgregarLesin.setForeground(new Color(255, 255, 240));
			btnAgregarLesin.setFont(new Font("Consolas", Font.BOLD, 22));
			btnAgregarLesin.setBorder(null);
			btnAgregarLesin.setBackground(new Color(4, 10, 20));
			btnAgregarLesin.setBounds(810, 57, 170, 37);
			panelFondo.add(btnAgregarLesin);

			btnCalendario = new JButton("Calendario");
			btnCalendario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelEstadisticaEquipo.setVisible(false);
					panelPerfilJugador.setVisible(false);
					panelLineUp.setVisible(false);
					panelCalendarioEquipo.setVisible(true);
				}
			});
			btnCalendario.setEnabled(false);

			if(myTeam.getRosterPlayers().size() > 0) {
				btnCalendario.setEnabled(true);
			}

			btnCalendario.setIcon(new ImageIcon(ManagementTeam.class.getResource("/iconos_imagenes/icons8_calendar_36px.png")));
			btnCalendario.setIconTextGap(5);
			btnCalendario.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnCalendario.setForeground(new Color(255, 255, 240));
			btnCalendario.setFont(new Font("Consolas", Font.BOLD, 20));
			btnCalendario.setBorder(null);
			btnCalendario.setBackground(new Color(4, 10, 20));
			btnCalendario.setBounds(810, 157, 170, 37);
			panelFondo.add(btnCalendario);

			btnQuitarLesin = new JButton("Lesi\u00F3n");
			btnQuitarLesin.setEnabled(false);
			if (myTeam.getRosterPlayers().size() > 0 ) {
				btnQuitarLesin.setEnabled(true);
			}
			btnQuitarLesin.setToolTipText("Quitar Lesi\u00F3n");
			btnQuitarLesin.setIcon(new ImageIcon(ManagementTeam.class.getResource("/iconos_imagenes/icons8_doctors_bag_36px.png")));
			btnQuitarLesin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					AddInjury injury = new AddInjury(myTeam, true);
					injury.setModal(true);
					injury.setVisible(true);

				}
			});
			btnQuitarLesin.setIconTextGap(5);
			btnQuitarLesin.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnQuitarLesin.setForeground(new Color(255, 255, 240));
			btnQuitarLesin.setFont(new Font("Consolas", Font.BOLD, 20));
			btnQuitarLesin.setBorder(null);
			btnQuitarLesin.setBackground(new Color(4, 10, 20));
			btnQuitarLesin.setBounds(810, 107, 170, 37);
			panelFondo.add(btnQuitarLesin);

			scrollPaneRoster = new JScrollPane();
			scrollPaneRoster.setBounds(1198, 57, 375, 355);
			panelFondo.add(scrollPaneRoster);

			tableRoster = new JTable();
			tableRoster.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int index = tableRoster.getSelectedRow();
					codeJugadorRoster = (String) tableRoster.getModel().getValueAt(index, 0);

					//cargarJugadoresLesionadoPorEquipo();
					loadPerfilPlayer(codeJugadorRoster);
					loadStats(codeJugadorRoster);

					panelEstadisticaEquipo.setVisible(false);
					panelCalendarioEquipo.setVisible(false);
					panelLineUp.setVisible(false);
					panelPerfilJugador.setVisible(true);


				}
			});
			tableRoster.setRowMargin(0);
			tableRoster .setFocusable(false);
			tableRoster.setRowHeight(20);
			tableRoster.setIntercellSpacing(new Dimension(0, 0));
			tableRoster.setGridColor(new Color(255, 255, 255));
			tableRoster.setShowVerticalLines(false);
			tableRoster.getTableHeader().setReorderingAllowed(false);
			tableRoster.setSelectionBackground(new Color(239, 108, 0));
			tableRoster.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableRoster.getTableHeader().setOpaque(false);

			tableRoster.getTableHeader().setBackground(new Color(255,255,255));
			tableRoster.setFont(new Font("Consolas", Font.PLAIN, 15));
			tableRoster.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"N\u00FAmero ID", "Nombre", "Apellido"
					}
					) {
				Class[] columnTypes = new Class[] {
						String.class, String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
						false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			scrollPaneRoster.setViewportView(tableRoster);

			scrollPaneLesionados = new JScrollPane();
			scrollPaneLesionados.setBounds(1198, 469, 375, 318);
			panelFondo.add(scrollPaneLesionados);

			tableLesionados = new JTable();
			tableLesionados.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					if (tableLesionados.getSelectedRow() > 0) {
						int index = tableLesionados.getSelectedRow();
						nombreJugador = (String) tableLesionados.getModel().getValueAt(index, 1);
						nameArray = nombreJugador.split(" ",0);

						//cargarJugadoresLesionadoPorEquipo();
						//cargarJugador(jugador);
					}



				}
			});
			tableLesionados.setRowMargin(0);
			tableLesionados .setFocusable(false);
			tableLesionados.setRowHeight(20);
			tableLesionados.setIntercellSpacing(new Dimension(0, 0));
			tableLesionados.setGridColor(new Color(255, 255, 255));
			tableLesionados.setShowVerticalLines(false);
			tableLesionados.getTableHeader().setReorderingAllowed(false);
			tableLesionados.setSelectionBackground(new Color(239, 108, 0));
			tableLesionados.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableLesionados.getTableHeader().setOpaque(false);

			tableLesionados.getTableHeader().setBackground(new Color(255,255,255));
			tableLesionados.setFont(new Font("Consolas", Font.PLAIN, 15));
			tableLesionados.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"N\u00FAmero ID", "Nombre"
					}
					) {
				Class[] columnTypes = new Class[] {
						String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
						false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			scrollPaneLesionados.setViewportView(tableLesionados);

			btnNa_1 = new JButton("Jugador");
			btnNa_1.setIcon(new ImageIcon(ManagementTeam.class.getResource("/iconos_imagenes/icons8_add_36px_1.png")));
			btnNa_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AddPlayer player = new AddPlayer(null, myTeam.getName());
					player.setModal(true);
					player.setVisible(true);
				}
			});
			btnNa_1.setToolTipText("Agregar jugador al equipo.");
			btnNa_1.setIconTextGap(5);
			btnNa_1.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnNa_1.setForeground(new Color(255, 255, 240));
			btnNa_1.setFont(new Font("Consolas", Font.BOLD, 20));
			btnNa_1.setBorder(null);
			btnNa_1.setBackground(new Color(4, 10, 20));
			btnNa_1.setBounds(992, 107, 170, 37);
			panelFondo.add(btnNa_1);

			btnAddPlayerTeam = new JButton("Temporal");
			btnAddPlayerTeam.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					myTeam.getLineUp().removeAll(myTeam.getLineUp());
					//	myTeam.getRosterPlayers().remove(2);
				}
			});
			btnAddPlayerTeam.setToolTipText("");
			btnAddPlayerTeam.setIconTextGap(5);
			btnAddPlayerTeam.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnAddPlayerTeam.setForeground(new Color(255, 255, 240));
			btnAddPlayerTeam.setFont(new Font("Consolas", Font.BOLD, 20));
			btnAddPlayerTeam.setBorder(null);
			btnAddPlayerTeam.setBackground(new Color(4, 10, 20));
			btnAddPlayerTeam.setBounds(955, 236, 170, 37);
			panelFondo.add(btnAddPlayerTeam);

			btnNa_2 = new JButton("Equipo");
			btnNa_2.setIcon(new ImageIcon(ManagementTeam.class.getResource("/iconos_imagenes/icons8_statistics_36px.png")));
			btnNa_2.setToolTipText("Estadist\u00EDcas del equipo.");
			btnNa_2.setIconTextGap(5);
			btnNa_2.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnNa_2.setForeground(new Color(255, 255, 240));
			btnNa_2.setFont(new Font("Consolas", Font.BOLD, 20));
			btnNa_2.setBorder(null);
			btnNa_2.setBackground(new Color(4, 10, 20));
			btnNa_2.setBounds(992, 157, 170, 37);
			panelFondo.add(btnNa_2);
			/**********************************************************/		


		}
		loadInjuryPlayerByTeam();
		loadRosterPlayerByTeam();
		loadLineUpPlayerByTeam();
		loadGamesByTeam();
		loadLineUpLabel();


	}


	/********* METODOS ************/

	// Metodo para cargar la lista de jugadores de un equipo, roster.
	public static void loadLineUpPlayerByTeam() {

		modelLineUp= (DefaultTableModel) tableLineUp.getModel();
		modelLineUp.setRowCount(0);
		columnLineUp = new Object[modelLineUp.getColumnCount()];

		for (Player playerR : myTeam.getLineUp()) {
			columnLineUp[0] = playerR.getId();
			columnLineUp[1] = playerR.getName() + " " + playerR.getLastname();

			if (playerR instanceof Pitcher) {
				columnLineUp[2] = "P - " + ((Pitcher) playerR).getTipo();
			}
			if (playerR instanceof Batter) {
				columnLineUp[2] = "B - " + ((Batter) playerR).getPosition();		
			}
			modelLineUp.addRow(columnLineUp);
		}
	}

	public static void loadRosterPlayerByTeam() {

		modelRoster= (DefaultTableModel) tableRoster.getModel();
		modelRoster.setRowCount(0);
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		tableRoster.getColumnModel().getColumn(0).setCellRenderer(tcr);
		tableRoster.getColumnModel().getColumn(1).setCellRenderer(tcr);
		tableRoster.getColumnModel().getColumn(2).setCellRenderer(tcr);
		columnRoster = new Object[modelRoster.getColumnCount()];

		for (Player playerR : myTeam.getRosterPlayers()) {
			if (!playerR.getLesionado()) {

				columnRoster[0] = playerR.getId();
				columnRoster[1] = playerR.getName();
				columnRoster[2] =  playerR.getLastname();
				modelRoster.addRow(columnRoster);
			}


		}
	}

	// Metodo para cargar la lista de jugadores lesionados de un equipo.
	public static void loadInjuryPlayerByTeam() {

		modelLesionados= (DefaultTableModel) tableLesionados.getModel();
		modelLesionados.setRowCount(0);
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		tableLesionados.getColumnModel().getColumn(0).setCellRenderer(tcr);
		tableLesionados.getColumnModel().getColumn(1).setCellRenderer(tcr);
		columnLesionados = new Object[modelLesionados.getColumnCount()];

		for (Player playerR : myTeam.getRosterPlayers()) {
			if (playerR.getLesionado()== true) {
				columnLesionados[0] = playerR.getId();
				columnLesionados[1] = playerR.getName();
				modelLesionados.addRow(columnLesionados);
			}

		}
	}

	public static void loadPerfilPlayer(String codePlayer) {
		Player auxP = Lidom.getInstance().searchPlayerByID(codePlayer);

		lblName.setText(auxP.getName() + " " + auxP.getLastname());

		String routetosave = "Fotos_Jugadores/"+ auxP.getName() + " " + auxP.getLastname() + ".png";
		/** to adjust image at size of JLabel **/
		ImageIcon fotoJugador = new ImageIcon(routetosave);
		Icon fotoJ = new ImageIcon(fotoJugador.getImage().getScaledInstance(lblFotoJugador.getWidth(), lblFotoJugador.getHeight(), Image.SCALE_SMOOTH));
		lblFotoJugador.setIcon(fotoJ);

		lblNumero.setText("#" + auxP.getNumber());
		String pos = "";

		String mano=null;
		String bat = null;
		if (auxP.getManoLanzar().equalsIgnoreCase("Derecha")) {
			mano = "Der.";
		}
		else if (auxP.getManoLanzar().equalsIgnoreCase("Izquierda")) {
			mano = "Izq.";
		}
		else if (auxP.getManoLanzar().equalsIgnoreCase("Ambas")) {
			mano = "Amb.";
		}



		if (auxP instanceof Batter) {
			panelEstadisticaBateador.setVisible(true);
			panelEstadisticaPitcher.setVisible(false);
			if (((Batter) auxP).getPosition().equalsIgnoreCase("Primera base")) {
				pos = "1B";
			} else if (((Batter) auxP).getPosition().equalsIgnoreCase("Segunda base")) {
				pos = "2B";
			} else if (((Batter) auxP).getPosition().equalsIgnoreCase("Tercera base")) {
				pos = "3B";
			} else if (((Batter) auxP).getPosition().equalsIgnoreCase("Catcher")) {
				pos = "C";
			} else if (((Batter) auxP).getPosition().equalsIgnoreCase("Short stop")) {
				pos = "SS";
			} else if (((Batter) auxP).getPosition().equalsIgnoreCase("Left fielder")) {
				pos = "LF";
			} else if (((Batter) auxP).getPosition().equalsIgnoreCase("Center fielder")) {
				pos = "CF";
			} else if (((Batter) auxP).getPosition().equalsIgnoreCase("Right fielder")) {
				pos = "RF";
			} else if (((Batter) auxP).getPosition().equalsIgnoreCase("Designado")) {
				pos = "BD";
			}
			if (((Batter)auxP).getManoDeBateo().equalsIgnoreCase("Derecha")) {
				bat = "Der.";
			}
			else if (((Batter)auxP).getManoDeBateo().equalsIgnoreCase("Izquierda")) {
				bat = "Izq.";
			}
			else if (((Batter)auxP).getManoDeBateo().equalsIgnoreCase("Ambas")) {
				bat = "Amb.";
			}

			lblBT.setText(bat + "/" + mano);
		}
		else if (auxP instanceof Pitcher) {
			panelEstadisticaBateador.setVisible(false);
			panelEstadisticaPitcher.setVisible(true);
			pos = "P";
			bat = "-";
			lblBT.setText( bat +"/" + mano);
		}

		lblPosion.setText(pos);
		lblPesoAlt.setText(auxP.getHeight()+"/"+auxP.getWeight());
		lblLugarNacimiento.setText(auxP.getBirthplace());
		Locale spanishLocale = new Locale("es", "ES");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy", spanishLocale);
		lblFechaNacimiento.setText(formatter.format(auxP.getBirthdate()));

	}

	public static void loadStats(String codePlayer) {
		Player auxP = Lidom.getInstance().searchPlayerByID(codePlayer);

		if (auxP instanceof Batter) {

			txtAVGb.setText(String.valueOf(((Batter) auxP).getAverage()));
			txtRb.setText(String.valueOf(((Batter) auxP).getRuns()));
			txtH1b.setText(String.valueOf(((Batter) auxP).getH1()));
			txtH2b.setText(String.valueOf(((Batter) auxP).getH2()));
			txtH3b.setText(String.valueOf(((Batter) auxP).getH3()));
			txtHRb.setText(String.valueOf(((Batter) auxP).getHR()));
			txtRBIb.setText(String.valueOf(((Batter) auxP).getRBI()));
			txtBBb.setText(String.valueOf(((Batter) auxP).getBaseBall()));
			txtSOb.setText(String.valueOf(((Batter) auxP).getStrikeOut()));
			txtSBb.setText(String.valueOf(((Batter) auxP).getStolenBase()));
			txtTurnos.setText(String.valueOf(((Batter) auxP).getTurnos()));
		}
		else if (auxP instanceof Pitcher) {
			txtWp.setText(String.valueOf(((Pitcher) auxP).getGameWin()));
			txtLp.setText(String.valueOf(((Pitcher) auxP).getGameLose()));
			txtERA.setText(String.valueOf(((Pitcher) auxP).getERA()));
			txtGp.setText(String.valueOf(((Pitcher) auxP).getPlayedGame()));
			txtGSp.setText(String.valueOf(((Pitcher) auxP).getStartedGame()));
			txtSVp.setText(String.valueOf(((Pitcher) auxP).getSavedGame()));
			txtHRp.setText(String.valueOf(((Pitcher) auxP).getNumberHR()));
			txtHp.setText(String.valueOf(((Pitcher) auxP).getNumberHit()));
			txtRp.setText(String.valueOf(((Pitcher) auxP).getNumberRun()));
			txtSOp.setText(String.valueOf(((Pitcher) auxP).getNumberStrikeOut()));
			txtIPp.setText(String.valueOf(((Pitcher) auxP).getIP()));
			txtAVGp.setText(String.valueOf(((Pitcher) auxP).getAverage()));
		}


	}

	public void loadGamesByTeam() {

		modelCalendario= (DefaultTableModel) tableCalendario.getModel();
		modelCalendario.setRowCount(0);
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		tableCalendario.getColumnModel().getColumn(0).setCellRenderer(tcr);
		tableCalendario.getColumnModel().getColumn(1).setCellRenderer(tcr);
		tableCalendario.getColumnModel().getColumn(2).setCellRenderer(tcr);
		tableCalendario.getColumnModel().getColumn(3).setCellRenderer(tcr);
		tableCalendario.getColumnModel().getColumn(4).setCellRenderer(tcr);

		columnCalendario = new Object[modelCalendario.getColumnCount()];

		for (Game auxGame : Lidom.getInstance().getListGame()) {
			if (myTeam.getName().equalsIgnoreCase(auxGame.getAwayTeam()) 
					|| myTeam.getName().equalsIgnoreCase(auxGame.getHomeTeam())) {

				columnCalendario[0] =  auxGame.getHomeTeam();
				columnCalendario[1] =  auxGame.getAwayTeam();
				columnCalendario[2] =  auxGame.getStadium();
				columnCalendario[3] =  auxGame.getDate();
				columnCalendario[4] =  auxGame.getHora();			

				modelCalendario.addRow(columnCalendario);
			}
		}
	}

	public void loadLineUpLabel(){

		for (Player auxP : myTeam.getLineUp()) {
			if (auxP instanceof Batter) {
				if(((Batter) auxP).getPosition().equalsIgnoreCase("Segunda base")){
					lbl2b.setText(auxP.getName()+ " " + auxP.getLastname());
				}
				if(((Batter) auxP).getPosition().equalsIgnoreCase("Tercera base")){
					lbl3b.setText(auxP.getName()+ " " + auxP.getLastname());
				}
				if(((Batter) auxP).getPosition().equalsIgnoreCase("Catcher")){
					lblC.setText(auxP.getName()+ " " + auxP.getLastname());
				}
				if(((Batter) auxP).getPosition().equalsIgnoreCase("Left fielder")){
					lblLf.setText(auxP.getName()+ " " + auxP.getLastname());
				}
				if(((Batter) auxP).getPosition().equalsIgnoreCase("Primera base")){
					lbl1b.setText(auxP.getName()+ " " + auxP.getLastname());
				}
				if(((Batter) auxP).getPosition().equalsIgnoreCase("Right fielder")){
					lblRf.setText(auxP.getName()+ " " + auxP.getLastname());
				}
				if(((Batter) auxP).getPosition().equalsIgnoreCase("Center fielder")){
					lblCf.setText(auxP.getName()+ " " + auxP.getLastname());
				}
				if(((Batter) auxP).getPosition().equalsIgnoreCase("Short stop")){
					lblSs.setText(auxP.getName()+ " " + auxP.getLastname());
				}
				if(((Batter) auxP).getPosition().equalsIgnoreCase("Designado")){
					lblBD.setText(auxP.getName()+ " " + auxP.getLastname());
				}

			}
			else if (auxP instanceof Pitcher) {
				lblP.setText(auxP.getName()+ " " + auxP.getLastname());
			}

		}
	}
}

