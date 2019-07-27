package frontEnd;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.SystemColor;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import Animacion.Animacion;
import backEnd.Batter;
import backEnd.Game;
import backEnd.Lidom;
import backEnd.Pitcher;
import backEnd.Player;
import backEnd.Team;

import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import javax.swing.JTextField;

public class Home extends JFrame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7565495060282114993L;
	private JPanel contentPane;
	private Dimension dimention;
	private JPanel panelBackGround;
	private JPanel panelMenuBar;
	private JButton btnEquipos;
	private JButton btnJugadores;
	private JPanel panelBgHome;
	private JButton btnMini;
	private JButton btnClose;
	private JPanel panelMenuEquipo;
	private JPanel panelMenuJugadores;
	private JButton btnRegistrarTeam;
	private JButton btnListarTeams;
	private JButton btnRegistrarPlayer;
	private JButton btnListarPlayers;
	private JButton btnEstadios;
	private JPanel panelMenuEstadio;
	private JButton btnregistrarEstadio;
	private JButton btnListarEstadio;
	private JPanel panelMenuLateral;
	private JSeparator separator;
	private JLabel lblLogoLidomMenuLateral;
	private JLabel lblSimuladorEstadsticasBeisbol;
	private JLabel lblTitle;
	private JButton btnButtons;
	private JSeparator separator_1;
	private JLabel lblTitle_1;
	private JButton btnButtons_1;
	private JButton btnButtons_2;
	private JLabel lblTitle_2;
	private JLabel lblSebVersinBeta;
	private JLabel lblmenuDeslizante;
	private JButton btnMenu;
	private JLabel lblMenAdministrativos;
	private JSeparator separator_2;
	private static JPanel panelManageTeams;
	private static JLabel lblLogoTeam;
	private JSeparator separator_3;
	private static JLabel lblNameTeam;
	private JScrollPane scrollPaneRoster;

	private JLabel lblRoster;
	private JScrollPane scrollPaneLineUp;
	private JScrollPane scrollPaneLesionados;
	private JLabel lblLineUp;
	private JLabel lblLesionados;

	private JPanel panel;
	private static JPanel panelBgDashboard;
	private JLabel lblPlay_Blur;
	private JPanel panelMenuInfo;
	private JButton btnPanelLineUp;
	private JButton btnFuncionesNa_1;
	private JButton btnFuncionesNa_2;
	private JButton btnFuncionesNa_3;
	private JButton btnFuncionesNa_4;
	private JButton btnFuncionesNa_5;
	private JLabel lblLineUp_1;

	/*** tables ***/
	private static JTable tableRoster;
	public static JTable tableLineUp;
	private static JTable tableLesionados;
	private static JTable tablePartidosHoy;
	private static JTable tableGameVisit;
	private static JTable tableGameLocal;

	private static DefaultTableModel modelRoster;
	public static DefaultTableModel modelLineUp;
	private static DefaultTableModel modelLesionados;
	private static DefaultTableModel modelGameToday;
	private static DefaultTableModel modelGameLocal;
	private static DefaultTableModel modelGameVisit;

	private static Object[] columnRoster;
	public static Object[] columnLineUp;
	private static Object[] columnLesionados;
	private static Object[] columnGameToday;
	private static Object[] columnGameLocal;
	private static Object[] columnGameVisit;

	private static JPanel panelLineUp;
	private JLabel lblBgPlayLineUp;
	private JLabel lblCrearLineUp;
	private JButton btnCf;
	private JButton btnLf;
	private JButton btnRf;
	private JButton btnss;
	private JButton btn3b;
	private JButton btn2b;
	private JButton btnP;
	private JButton btnC;
	private JButton btn1b;
	private JButton btnHome;

	private String seleccionarjugador;
	private JLabel lblP;
	private JButton btnLineUp;
	private JLabel lblC;
	private JLabel lbl3b;
	private JLabel lblss;
	private JLabel lbl2b;
	private JLabel lbl1b;
	private JLabel lblLf;
	private JLabel lblCf;
	private JLabel lblRf;
	private JPanel panel_1;
	private JButton btnPartidos;
	private JPanel panelPartidosDashboard;
	private JPanel panelMenuPartidos;
	private JButton btnBoxScores;
	private JButton btnButtonsNa;
	private JButton btnButtonNa;
	private JPanel panelPartidoHoy;
	private JPanel panel_3;
	private JLabel lblFundado;
	private JLabel lblManager;
	private static JLabel lblEstadioTeam;
	private static JLabel lblFundadoTeam;
	private static JLabel lblManagerTeam;
	private JLabel lblEstadio;
	private static JPanel panelGameSimulation;
	private JLabel lblNewLabel;
	private static JPanel panelScoreBoard;
	private JScrollPane scrollPanePartidosHoy;

	private JLabel lblListaPartidosDe;
	public  JLabel lblDate;
	public  JLabel lblTime;
	int hour, minute, second, day, mont, year;
	Calendar calendario;
	Thread h1;
	private JTextField txtEquipVisi;
	private JLabel lblEquipos;
	private JLabel label_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_2;
	private JTextField textField_3;
	private JLabel label_3;
	private JLabel label_4;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel label_5;
	private JLabel label_6;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel label_7;
	private JLabel label_8;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel label_9;
	private JLabel lblR;
	private JTextField textField_10;
	private JTextField txtEquipLocal;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel lblH;
	private JLabel lblE;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JPanel panel_2;
	private JPanel panelGameLocal;
	private JLabel lblEquipoLocal;
	private JLabel lblEquipoVisitante;
	private JButton btnH;
	private JButton btnH_1;
	private JButton btnH_2;
	private JButton btnHr;
	private JButton btnOut;
	private JPanel panelControlBateo;
	private JLabel lblControlBateo;
	private JButton btnPlayBall;

	private String equipoLocal;
	private String equipoVisitante;
	private String fecha;
	private String hora;
	private String estadio;
	private Game auxGame = null;
	private JScrollPane scrollPaneLocal;
	private JPanel panelGameVisitant;
	private JScrollPane scrollPaneVisit;
	private JPanel panel_4;
	private JButton btnCarrera;
	private JButton btnOut_1;
	private JLabel lblControlInnin;
	private JLabel lblDefensa;
	private JLabel lblOfensiva;
	private JLabel lblBateador;
	private JPanel panel_5;
	private JButton btnNa;
	private JButton btnNa_1;
	private JLabel lblFinalizarPartido;
	private JLabel lblEquipDef;
	private JLabel lblEquipOfen;
	private JLabel lblBatAct;
	static int randomNum = 0;

	/****************/
	public static int numberOut = 0;
	public static int turno=0;
	private JButton btnListar;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}           /*    ESTA VENTANA SE LEVANTARA AUTOMATICAMENTE DESDE LA CLASE SplashScreen*/

	/**
	 * Create the frame.
	 */

	public Home() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1455, 740);
		dimention = super.getToolkit().getScreenSize();
		super.getToolkit().getScreenResolution();
		//super.getToolkit().getS
		super.setSize(dimention.width, (dimention.height-50));
		setLocationRelativeTo(null);
		Lidom.getInstance().readStadiumCodes(Lidom.generateIdStadium, "codeStadium");
		Lidom.getInstance().readTeamCodes(Lidom.generateIdTeam, "codeTeam");
		Lidom.getInstance().loadInitData(Lidom.getInstance());


		contentPane = new JPanel();
		//contentPane.setBackground(SystemColor.desktop);
		contentPane.setMaximumSize(new Dimension(1920, 1080));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);


		panelBackGround = new JPanel();
		panelBackGround.setBackground(new Color(0, 0, 0));
		panelBackGround.setLayout(null);
		contentPane.add(panelBackGround);

		panelMenuBar = new JPanel();
		panelMenuBar.setBounds(0, 0, 1910, 50);
		panelBackGround.add(panelMenuBar);
		panelMenuBar.setLayout(null);
		panelMenuBar.setBackground(new Color(0,30,72));

		btnEquipos = new JButton("EQUIPOS");
		btnEquipos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//panelMenuEquipo.setSize(170,218);
				if (btnEquipos.isEnabled()) {
					setColorBlue(btnEquipos);
					panelMenuEquipo.setVisible(true);
					if (panelMenuLateral.getX() >= 0) {
						Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);

					}
				}


			}

			@Override
			public void mouseExited(MouseEvent e) {
				//	panelMenuEquipo.setSize(0,0);
				resetColor(btnEquipos);
				panelMenuEquipo.setVisible(false);
			}
		});
		btnEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnEquipos.setIconTextGap(10);
		btnEquipos.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnEquipos.setForeground(new Color(255, 255, 240));
		btnEquipos.setFont(new Font("Consolas", Font.BOLD, 22));
		btnEquipos.setBorder(null);
		btnEquipos.setBackground(new Color(0,30,72));
		btnEquipos.setBounds(329, 0, 170, 50);
		panelMenuBar.add(btnEquipos);

		btnJugadores = new JButton("JUGADORES");
		btnJugadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//	panelMenuJugadores.setSize(170,218);

				if (btnJugadores.isEnabled()) {
					setColorBlue(btnJugadores);
					panelMenuJugadores.setVisible(true);
					if (panelMenuLateral.getX() >= 0) {
						Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);

					}

				}

			}
			@Override
			public void mouseExited(MouseEvent e) {
				//panelMenuJugadores.setSize(0,0);
				resetColor(btnJugadores);
				panelMenuJugadores.setVisible(false);
			}
		});
		btnJugadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


			}
		});
		btnJugadores.setIconTextGap(10);
		btnJugadores.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnJugadores.setForeground(new Color(255, 255, 240));
		btnJugadores.setFont(new Font("Consolas", Font.BOLD, 22));
		btnJugadores.setBorder(null);
		btnJugadores.setBackground(new Color(0,30,72));
		btnJugadores.setBounds(511, 0, 170, 50);
		panelMenuBar.add(btnJugadores);


		btnMini = new JButton("");
		btnMini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(ICONIFIED);
			}
		});
		btnMini.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/icons8_minimize_window_24px.png")));
		btnMini.setPreferredSize(new Dimension(100, 30));
		btnMini.setOpaque(false);
		btnMini.setHideActionText(true);
		btnMini.setForeground(Color.WHITE);
		btnMini.setFont(new Font("Consolas", Font.BOLD, 20));
		btnMini.setBorder(null);
		btnMini.setBackground(new Color(4, 10, 20));
		btnMini.setActionCommand("Cancel");
		btnMini.setBounds(1856, 0, 26, 30);
		panelMenuBar.add(btnMini);

		btnClose = new JButton("");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Lidom.getInstance().saveInitData(Lidom.getInstance());
				Lidom.getInstance().writeCodes(Lidom.generateIdStadium, "codeStadium");
				Lidom.getInstance().writeCodes(Lidom.generateIdTeam, "codeTeam");
				// agregar cualquier otro

				ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
				String[] options = {"Si", "No"};	
				int xOption	= JOptionPane.showOptionDialog(null, "¿Seguro que desea cerrar la aplicación?", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

				if (xOption == 0) {
					dispose();
				}
			}

		});
		btnClose.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/icons8_close_window_24px_1.png")));
		btnClose.setPreferredSize(new Dimension(100, 30));
		btnClose.setOpaque(false);
		btnClose.setHideActionText(true);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Consolas", Font.BOLD, 20));
		btnClose.setBorder(null);
		btnClose.setBackground(new Color(4, 10, 20));
		btnClose.setActionCommand("Cancel");
		btnClose.setBounds(1884, 0, 26, 30);
		panelMenuBar.add(btnClose);

		btnEstadios = new JButton("ESTADIOS");
		btnEstadios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//	panelMenuJugadores.setSize(170,218);
				if (btnEstadios.isEnabled()) {
					setColorBlue(btnEstadios);
					panelMenuEstadio.setVisible(true);
					if (panelMenuLateral.getX() >= 0) {
						Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);

					}
				}


			}
			@Override
			public void mouseExited(MouseEvent e) {
				//panelMenuJugadores.setSize(0,0);
				resetColor(btnEstadios);
				panelMenuEstadio.setVisible(false);
			}
		});
		btnEstadios.setIconTextGap(10);
		btnEstadios.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnEstadios.setForeground(new Color(255, 255, 240));
		btnEstadios.setFont(new Font("Consolas", Font.BOLD, 22));
		btnEstadios.setBorder(null);
		btnEstadios.setBackground(new Color(0, 30, 72));
		btnEstadios.setBounds(693, 0, 170, 50);
		panelMenuBar.add(btnEstadios);

		btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/icons8_squared_menu_60px.png")));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Para dezlizar el menu lateral
				int position = panelMenuLateral.getX();
				if (position >= 0) {
					Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);
				}
				else {
					Animacion.mover_derecha(-400, 0, 2, 2, panelMenuLateral);
				}
			}
		});
		btnMenu.setPreferredSize(new Dimension(100, 30));
		btnMenu.setHideActionText(true);
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFont(new Font("Consolas", Font.BOLD, 20));
		btnMenu.setBorder(null);
		btnMenu.setBackground(new Color(0, 30, 72));
		btnMenu.setActionCommand("Cancel");
		btnMenu.setBounds(12, 0, 65, 50);
		panelMenuBar.add(btnMenu);

		btnHome = new JButton("Home");
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (btnHome.isEnabled()) {
					setColorBlue(btnHome);
				}

			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnHome);
			}
		});

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lidom.getInstance().getListGame().removeAll(Lidom.getInstance().getListGame());
				panelBgDashboard.setVisible(true);
				panelManageTeams.setVisible(false);
				//	btnHome.setEnabled(false);
			}
		});
		btnHome.setIconTextGap(10);
		btnHome.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnHome.setForeground(new Color(255, 255, 240));
		btnHome.setFont(new Font("Consolas", Font.BOLD, 22));
		btnHome.setBorder(null);
		btnHome.setBackground(new Color(0, 30, 72));
		btnHome.setBounds(1633, 0, 170, 50);
		panelMenuBar.add(btnHome);

		btnPartidos = new JButton("PARTIDOS");
		btnPartidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnPartidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//	panelMenuJugadores.setSize(170,218);
				if (btnPartidos.isEnabled()) {
					setColorBlue(btnPartidos);
					panelMenuPartidos.setVisible(true);
					if (panelMenuLateral.getX() >= 0) {
						Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);	
					}
				}

			}
			@Override
			public void mouseExited(MouseEvent e) {
				//panelMenuJugadores.setSize(0,0);
				resetColor(btnPartidos);
				panelMenuPartidos.setVisible(false);
			}
		});
		btnPartidos.setIconTextGap(10);
		btnPartidos.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnPartidos.setForeground(new Color(255, 255, 240));
		btnPartidos.setFont(new Font("Consolas", Font.BOLD, 22));
		btnPartidos.setBorder(null);
		btnPartidos.setBackground(new Color(0, 30, 72));
		btnPartidos.setBounds(875, 0, 170, 50);
		panelMenuBar.add(btnPartidos);

		lblTime = new JLabel("");
		lblTime.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Consolas", Font.BOLD, 20));
		lblTime.setBounds(125, 18, 156, 32);
		panelMenuBar.add(lblTime);

		panelMenuEquipo = new JPanel();
		panelMenuEquipo.setVisible(false);
		panelMenuEquipo.setBackground(new Color(0,30,72));
		panelMenuEquipo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//panelMenuEquipo.setSize(170,218);
				setColorBlue(btnEquipos);
				panelMenuEquipo.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				//panelMenuEquipo.setSize(0,0);
				resetColor(btnEquipos);
				panelMenuEquipo.setVisible(false);
			}
		});

		panelMenuEstadio = new JPanel();
		panelMenuEstadio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//panelMenuJugadores.setSize(170,218);
				setColorBlue(btnEstadios);
				panelMenuEstadio.setVisible(true);

			}
			@Override
			public void mouseExited(MouseEvent e) {
				//panelMenuJugadores.setSize(0,0);
				resetColor(btnEstadios);
				panelMenuEstadio.setVisible(false);
			}
		});
		panelMenuEstadio.setVisible(false);

		panelMenuLateral = new JPanel();
		panelMenuLateral.setBounds(-400, 63, 400, 957);
		panelBackGround.add(panelMenuLateral);
		panelMenuLateral.setLayout(null);
		panelMenuLateral.setBackground(new Color(0, 30, 72));

		separator = new JSeparator();
		separator.setOpaque(true);
		separator.setBorder(null);
		separator.setBackground(Color.WHITE);
		separator.setBounds(12, 880, 376, 7);
		panelMenuLateral.add(separator);

		lblLogoLidomMenuLateral = new JLabel("");
		lblLogoLidomMenuLateral.setBackground(new Color(255, 255, 255));
		lblLogoLidomMenuLateral.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/preview-lidom (2).png")));
		lblLogoLidomMenuLateral.setToolTipText("LIDOM");
		lblLogoLidomMenuLateral.setBounds(155, 25, 90, 88);
		panelMenuLateral.add(lblLogoLidomMenuLateral);

		/** to adjust image at size of JLabel **/
		ImageIcon logoIconLidom= new ImageIcon(getClass().getResource("/iconos_imagenes/preview-lidom (2).png"));
		Icon LidomIco = new ImageIcon(logoIconLidom.getImage().getScaledInstance(lblLogoLidomMenuLateral.getWidth(), lblLogoLidomMenuLateral.getHeight(), Image.SCALE_SMOOTH));
		lblLogoLidomMenuLateral.setIcon(LidomIco);


		lblSimuladorEstadsticasBeisbol = new JLabel("Simulador Estad\u00EDsticas B\u00E9isbol");
		lblSimuladorEstadsticasBeisbol.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblSimuladorEstadsticasBeisbol.setToolTipText("Desarrollador: Anthony Sakamoto");
		lblSimuladorEstadsticasBeisbol.setIconTextGap(20);
		lblSimuladorEstadsticasBeisbol.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimuladorEstadsticasBeisbol.setForeground(Color.WHITE);
		lblSimuladorEstadsticasBeisbol.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblSimuladorEstadsticasBeisbol.setBackground(Color.BLACK);
		lblSimuladorEstadsticasBeisbol.setBounds(0, 141, 400, 24);
		panelMenuLateral.add(lblSimuladorEstadsticasBeisbol);

		lblTitle = new JLabel("Equipos");
		lblTitle.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblTitle.setOpaque(true);
		lblTitle.setIconTextGap(10);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Consolas", Font.BOLD, 20));
		lblTitle.setBackground(new Color(8, 18, 30));
		lblTitle.setBounds(12, 248, 376, 37);
		panelMenuLateral.add(lblTitle);

		btnButtons = new JButton("Gestionar equipos");
		btnButtons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);
				SelectionTeamToManage aux = new SelectionTeamToManage();
				aux.setModal(true);
				aux.setVisible(true);
				panelBgDashboard.setVisible(false);
				//panelManageTeams.setVisible(true);

			}
		});
		btnButtons.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/icons8_coach_36px_1.png")));
		btnButtons.setIconTextGap(5);
		btnButtons.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnButtons.setForeground(new Color(255, 255, 240));
		btnButtons.setFont(new Font("Consolas", Font.BOLD, 22));
		btnButtons.setBorder(null);
		btnButtons.setBackground(new Color(4, 10, 20));
		btnButtons.setBounds(12, 298, 307, 37);
		panelMenuLateral.add(btnButtons);

		separator_1 = new JSeparator();
		separator_1.setOpaque(true);
		separator_1.setBorder(null);
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(12, 161, 376, 4);
		panelMenuLateral.add(separator_1);

		lblTitle_1 = new JLabel("Partidos");
		lblTitle_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblTitle_1.setOpaque(true);
		lblTitle_1.setIconTextGap(10);
		lblTitle_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle_1.setForeground(Color.WHITE);
		lblTitle_1.setFont(new Font("Consolas", Font.BOLD, 20));
		lblTitle_1.setBackground(new Color(8, 18, 30));
		lblTitle_1.setBounds(12, 460, 376, 37);
		panelMenuLateral.add(lblTitle_1);

		btnButtons_1 = new JButton("Gestionar partidos");
		btnButtons_1.setIconTextGap(30);
		btnButtons_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnButtons_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnButtons_1.setForeground(new Color(255, 255, 240));
		btnButtons_1.setFont(new Font("Consolas", Font.BOLD, 22));
		btnButtons_1.setBorder(null);
		btnButtons_1.setBackground(new Color(4, 10, 20));
		btnButtons_1.setBounds(12, 510, 307, 37);
		panelMenuLateral.add(btnButtons_1);

		btnButtons_2 = new JButton("buttons n/a");
		btnButtons_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);
				panelGameSimulation.setVisible(true);
				panelBgDashboard.setVisible(false);
			}
		});
		btnButtons_2.setIconTextGap(30);
		btnButtons_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnButtons_2.setHorizontalAlignment(SwingConstants.LEADING);
		btnButtons_2.setForeground(new Color(255, 255, 240));
		btnButtons_2.setFont(new Font("Consolas", Font.BOLD, 22));
		btnButtons_2.setBorder(null);
		btnButtons_2.setBackground(new Color(4, 10, 20));
		btnButtons_2.setBounds(12, 718, 307, 37);
		panelMenuLateral.add(btnButtons_2);

		lblTitle_2 = new JLabel("Estad\u00EDticas");
		lblTitle_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblTitle_2.setOpaque(true);
		lblTitle_2.setIconTextGap(10);
		lblTitle_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle_2.setForeground(Color.WHITE);
		lblTitle_2.setFont(new Font("Consolas", Font.BOLD, 20));
		lblTitle_2.setBackground(new Color(8, 18, 30));
		lblTitle_2.setBounds(12, 668, 376, 37);
		panelMenuLateral.add(lblTitle_2);

		lblSebVersinBeta = new JLabel("S.E.B Versi\u00F3n beta: 1.0");
		lblSebVersinBeta.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblSebVersinBeta.setToolTipText("Desarrollador: Anthony Sakamoto");
		lblSebVersinBeta.setIconTextGap(20);
		lblSebVersinBeta.setHorizontalAlignment(SwingConstants.CENTER);
		lblSebVersinBeta.setForeground(Color.WHITE);
		lblSebVersinBeta.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblSebVersinBeta.setBackground(Color.BLACK);
		lblSebVersinBeta.setBounds(12, 900, 376, 22);
		panelMenuLateral.add(lblSebVersinBeta);

		lblmenuDeslizante = new JLabel("(Menu deslizante)");
		lblmenuDeslizante.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblmenuDeslizante.setToolTipText("Desarrollador: Anthony Sakamoto");
		lblmenuDeslizante.setIconTextGap(20);
		lblmenuDeslizante.setHorizontalAlignment(SwingConstants.CENTER);
		lblmenuDeslizante.setForeground(Color.WHITE);
		lblmenuDeslizante.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblmenuDeslizante.setBackground(Color.BLACK);
		lblmenuDeslizante.setBounds(12, 922, 376, 22);
		panelMenuLateral.add(lblmenuDeslizante);

		lblMenAdministrativos = new JLabel("Men\u00FA administrativo");
		lblMenAdministrativos.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblMenAdministrativos.setToolTipText("Desarrollador: Anthony Sakamoto");
		lblMenAdministrativos.setIconTextGap(20);
		lblMenAdministrativos.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenAdministrativos.setForeground(Color.WHITE);
		lblMenAdministrativos.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblMenAdministrativos.setBackground(Color.BLACK);
		lblMenAdministrativos.setBounds(0, 189, 400, 24);
		panelMenuLateral.add(lblMenAdministrativos);

		separator_2 = new JSeparator();
		separator_2.setOpaque(true);
		separator_2.setBorder(null);
		separator_2.setBackground(Color.WHITE);
		separator_2.setBounds(81, 209, 238, 4);
		panelMenuLateral.add(separator_2);

		btnBoxScores = new JButton("Box scores");
		btnBoxScores.setIconTextGap(30);
		btnBoxScores.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnBoxScores.setHorizontalAlignment(SwingConstants.LEADING);
		btnBoxScores.setForeground(new Color(255, 255, 240));
		btnBoxScores.setFont(new Font("Consolas", Font.BOLD, 22));
		btnBoxScores.setBorder(null);
		btnBoxScores.setBackground(new Color(4, 10, 20));
		btnBoxScores.setBounds(12, 560, 307, 37);
		panelMenuLateral.add(btnBoxScores);

		btnButtonsNa = new JButton("buttons n/a");
		btnButtonsNa.setIconTextGap(30);
		btnButtonsNa.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnButtonsNa.setHorizontalAlignment(SwingConstants.LEADING);
		btnButtonsNa.setForeground(new Color(255, 255, 240));
		btnButtonsNa.setFont(new Font("Consolas", Font.BOLD, 22));
		btnButtonsNa.setBorder(null);
		btnButtonsNa.setBackground(new Color(4, 10, 20));
		btnButtonsNa.setBounds(12, 768, 307, 37);
		panelMenuLateral.add(btnButtonsNa);

		btnButtonNa = new JButton("Button n/a");
		btnButtonNa.setIconTextGap(5);
		btnButtonNa.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnButtonNa.setForeground(new Color(255, 255, 240));
		btnButtonNa.setFont(new Font("Consolas", Font.BOLD, 22));
		btnButtonNa.setBorder(null);
		btnButtonNa.setBackground(new Color(4, 10, 20));
		btnButtonNa.setBounds(12, 348, 307, 37);
		panelMenuLateral.add(btnButtonNa);
		panelMenuEstadio.setBounds(693, 50, 170, 59);
		panelMenuEstadio.setBackground(new Color(0, 30, 72));
		panelBackGround.add(panelMenuEstadio);
		panelMenuEstadio.setLayout(null);

		btnregistrarEstadio = new JButton("Registrar");
		btnregistrarEstadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStadium newStadio= new AddStadium();
				newStadio.setModal(true);
				newStadio.setVisible(true);
			}
		});
		btnregistrarEstadio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnregistrarEstadio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColorBlue(btnEstadios);
				setColorOrange(btnregistrarEstadio);
				panelMenuEstadio.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnregistrarEstadio);
				resetColor(btnEstadios);
				panelMenuEstadio.setVisible(false);
			}
		});
		btnregistrarEstadio.setIconTextGap(10);
		btnregistrarEstadio.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnregistrarEstadio.setForeground(new Color(255, 255, 240));
		btnregistrarEstadio.setFont(new Font("Consolas", Font.BOLD, 22));
		btnregistrarEstadio.setBorder(null);
		btnregistrarEstadio.setBackground(new Color(0, 30, 72));
		btnregistrarEstadio.setBounds(0, 13, 170, 50);
		panelMenuEstadio.add(btnregistrarEstadio);

		btnListarEstadio = new JButton("Listar");
		btnListarEstadio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListarEstadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStadium listStadio = new ViewStadium();
				listStadio.setModal(true);
				listStadio.setVisible(true);
			}
		});
		btnListarEstadio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColorBlue(btnEstadios);
				setColorOrange(btnListarEstadio);
				panelMenuEstadio.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnListarEstadio);
				resetColor(btnEstadios);
				panelMenuEstadio.setVisible(false);
			}
		});
		btnListarEstadio.setIconTextGap(10);
		btnListarEstadio.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnListarEstadio.setForeground(new Color(255, 255, 240));
		btnListarEstadio.setFont(new Font("Consolas", Font.BOLD, 22));
		btnListarEstadio.setBorder(null);
		btnListarEstadio.setBackground(new Color(0, 30, 72));
		btnListarEstadio.setBounds(0, 76, 170, 50);
		panelMenuEstadio.add(btnListarEstadio);
		panelMenuEquipo.setBounds(329, 50, 170, 59);
		panelBackGround.add(panelMenuEquipo);
		panelMenuEquipo.setLayout(null);

		btnRegistrarTeam = new JButton("Registrar");
		btnRegistrarTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[] options = {"Ok"};
				ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));


				if (backEnd.Lidom.getInstance().getListStadium().size() > 0) {
					AddTeam newTeam = new AddTeam();
					newTeam.setModal(true);
					newTeam.setVisible(true);

				}else {
					JOptionPane.showOptionDialog(null, "No hay estadio. Debe existir 1 estadio mínimo.", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
				}

			}
		});
		btnRegistrarTeam.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrarTeam.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColorOrange(btnRegistrarTeam);
				setColorBlue(btnEquipos);
				panelMenuEquipo.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnRegistrarTeam);
				resetColor(btnEquipos);
				panelMenuEquipo.setVisible(false);
			}
		});
		btnRegistrarTeam.setIconTextGap(10);
		btnRegistrarTeam.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnRegistrarTeam.setForeground(new Color(255, 255, 240));
		btnRegistrarTeam.setFont(new Font("Consolas", Font.BOLD, 22));
		btnRegistrarTeam.setBorder(null);
		btnRegistrarTeam.setBackground(new Color(0, 30, 72));
		btnRegistrarTeam.setBounds(0, 13, 170, 50);
		panelMenuEquipo.add(btnRegistrarTeam);

		btnListarTeams = new JButton("Listar");
		btnListarTeams.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListarTeams.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewTeam listTeam = new ViewTeam();
				listTeam.setModal(true);
				listTeam.setVisible(true);
			}
		});
		btnListarTeams.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColorBlue(btnEquipos);
				setColorOrange(btnListarTeams);
				panelMenuEquipo.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnListarTeams);
				resetColor(btnEquipos);
				panelMenuEquipo.setVisible(false);
			}
		});
		btnListarTeams.setIconTextGap(10);
		btnListarTeams.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnListarTeams.setForeground(new Color(255, 255, 240));
		btnListarTeams.setFont(new Font("Consolas", Font.BOLD, 22));
		btnListarTeams.setBorder(null);
		btnListarTeams.setBackground(new Color(0, 30, 72));
		btnListarTeams.setBounds(0, 76, 170, 50);
		panelMenuEquipo.add(btnListarTeams);

		panelMenuJugadores = new JPanel();
		panelMenuJugadores.setVisible(false);
		panelMenuJugadores.setBackground(new Color(0,30,72));
		panelMenuJugadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//panelMenuJugadores.setSize(170,218);
				setColorBlue(btnJugadores);
				panelMenuJugadores.setVisible(true);

			}
			@Override
			public void mouseExited(MouseEvent e) {
				//panelMenuJugadores.setSize(0,0);
				resetColor(btnJugadores);
				panelMenuJugadores.setVisible(false);
			}
		});
		panelMenuJugadores.setBounds(511, 50, 170, 59);
		panelBackGround.add(panelMenuJugadores);
		panelMenuJugadores.setLayout(null);

		btnRegistrarPlayer = new JButton("Registrar");
		btnRegistrarPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {



				String[] options = {"Ok"};
				ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));

				if (backEnd.Lidom.getInstance().getListTeams().size() > 0) {
					AddPlayer newPlayer = new AddPlayer(null);
					newPlayer.setModal(true);
					newPlayer.setVisible(true);

				}else {
					JOptionPane.showOptionDialog(null, "No hay equipo. Debe existir 1 equipo mínimo.", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
				}		
			}
		});
		btnRegistrarPlayer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrarPlayer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColorBlue(btnJugadores);
				setColorOrange(btnRegistrarPlayer);
				panelMenuJugadores.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnRegistrarPlayer);
				resetColor(btnJugadores);
				panelMenuJugadores.setVisible(false);
			}
		});
		btnRegistrarPlayer.setIconTextGap(10);
		btnRegistrarPlayer.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnRegistrarPlayer.setForeground(new Color(255, 255, 240));
		btnRegistrarPlayer.setFont(new Font("Consolas", Font.BOLD, 22));
		btnRegistrarPlayer.setBorder(null);
		btnRegistrarPlayer.setBackground(new Color(0, 30, 72));
		btnRegistrarPlayer.setBounds(0, 13, 170, 50);
		panelMenuJugadores.add(btnRegistrarPlayer);

		btnListarPlayers = new JButton("Listar");
		btnListarPlayers.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListarPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewPlayer listPlayer = new ViewPlayer();
				listPlayer.setModal(true);
				listPlayer.setVisible(true);
			}
		});
		btnListarPlayers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColorBlue(btnJugadores);
				setColorOrange(btnListarPlayers);
				panelMenuJugadores.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnListarPlayers);
				resetColor(btnJugadores);
				panelMenuJugadores.setVisible(false);
			}
		});
		btnListarPlayers.setIconTextGap(10);
		btnListarPlayers.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnListarPlayers.setForeground(new Color(255, 255, 240));
		btnListarPlayers.setFont(new Font("Consolas", Font.BOLD, 22));
		btnListarPlayers.setBorder(null);
		btnListarPlayers.setBackground(new Color(0, 30, 72));
		btnListarPlayers.setBounds(0, 76, 170, 50);
		panelMenuJugadores.add(btnListarPlayers);

		panelMenuPartidos = new JPanel();
		panelMenuPartidos.setVisible(false);
		panelMenuPartidos.setBackground(new Color(0,30,72));
		panelMenuPartidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//panelMenuJugadores.setSize(170,218);
				setColorBlue(btnPartidos);
				panelMenuPartidos.setVisible(true);

			}
			@Override
			public void mouseExited(MouseEvent e) {
				//panelMenuJugadores.setSize(0,0);
				resetColor(btnPartidos);
				panelMenuPartidos.setVisible(false);
			}
		});
		panelMenuEstadio.setVisible(false);
		panelMenuPartidos.setBounds(875, 50, 170, 79);
		panelBackGround.add(panelMenuPartidos);
		panelMenuPartidos.setLayout(null);


		btnListar = new JButton("Listar");
		btnListar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				setColorBlue(btnPartidos);
				setColorOrange(btnListar);
				panelMenuPartidos.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnListar);
				resetColor(btnPartidos);
				panelMenuPartidos.setVisible(false);
			}
		});
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ViewGame listGame = new ViewGame();
				listGame.setModal(true);
				listGame.setVisible(true);
			}
		});
		btnListar.setIconTextGap(10);
		btnListar.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnListar.setForeground(new Color(255, 255, 240));
		btnListar.setFont(new Font("Consolas", Font.BOLD, 22));
		btnListar.setBorder(null);
		btnListar.setBackground(new Color(0, 30, 72));
		btnListar.setBounds(0, 13, 170, 50);
		panelMenuPartidos.add(btnListar);

		panelBgHome = new JPanel();
		panelBgHome.setBackground(new Color(255, 255, 255));
		panelBgHome.setBounds(0, 63, 1910, 957);
		panelBackGround.add(panelBgHome);
		panelBgHome.setLayout(new CardLayout(0, 0));

		panelBgDashboard = new JPanel();
		panelBgDashboard.setOpaque(false);
		panelBgDashboard.setBackground(new Color(255, 255, 255));
		panelBgHome.add(panelBgDashboard, "name_550420640900300");
		panelBgDashboard.setLayout(null);

		panelPartidoHoy = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);

			}
		};
		panelPartidoHoy.setBackground(new Color(0, 0, 0, 60));
		panelPartidoHoy.setBounds(59, 13, 1100, 394);
		panelBgDashboard.add(panelPartidoHoy);
		panelPartidoHoy.setLayout(null);

		scrollPanePartidosHoy = new JScrollPane();
		scrollPanePartidosHoy.setBorder(null);
		scrollPanePartidosHoy.setViewportBorder(null);
		scrollPanePartidosHoy.setBackground(new Color(0, 0, 0,50));
		scrollPanePartidosHoy.setBounds(12, 57, 1076, 324);
		scrollPanePartidosHoy.getViewport().setBackground(new Color(0,0,0,60));

		scrollPanePartidosHoy.getViewportBorder();
		panelPartidoHoy.add(scrollPanePartidosHoy);

		tablePartidosHoy = new JTable();
		tablePartidosHoy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (tablePartidosHoy.getSelectedRow() >= 0) {
					int index = tablePartidosHoy.getSelectedRow();
					btnPlayBall.setEnabled(true);
					equipoLocal = (String) tablePartidosHoy.getModel().getValueAt(index, 0);	
					equipoVisitante = (String) tablePartidosHoy.getModel().getValueAt(index, 1);
					estadio = (String) tablePartidosHoy.getModel().getValueAt(index, 2);
					fecha = (String) tablePartidosHoy.getModel().getValueAt(index, 3);
					hora = (String) tablePartidosHoy.getModel().getValueAt(index, 4);

					auxGame = Lidom.getInstance().searchGame(equipoLocal, equipoVisitante, estadio, fecha, hora);
				}

			}
		});
		tablePartidosHoy.setForeground(new Color(255, 255, 255));
		tablePartidosHoy.setFont(new Font("Consolas", Font.BOLD, 16));
		tablePartidosHoy.setRowMargin(0);
		tablePartidosHoy .setFocusable(false);
		tablePartidosHoy.setRowHeight(26);
		tablePartidosHoy.setIntercellSpacing(new Dimension(0, 0));
		tablePartidosHoy.setGridColor(new Color(255, 255, 255));
		tablePartidosHoy.setShowVerticalLines(false);
		tablePartidosHoy.getTableHeader().setReorderingAllowed(false);
		tablePartidosHoy.setSelectionBackground(new Color(239, 108, 0));
		tablePartidosHoy.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 18));
		tablePartidosHoy.getTableHeader().setOpaque(false);

		tablePartidosHoy.getTableHeader().setBackground(new Color(255,255,255,80));
		tablePartidosHoy.setOpaque(false);
		tablePartidosHoy.setBackground(new Color(0,0,0));
		tablePartidosHoy.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Equipo local", "Equipo visitante", "Estadio", "Fecha", "Hora", "Fin partido"
				}
				) {
			Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class, String.class, String.class
			};
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
		tablePartidosHoy.setBorder(null);
		scrollPanePartidosHoy.setViewportView(tablePartidosHoy);

		/******** para centrar el contenido de la tabla *******/		
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < tablePartidosHoy.getColumnCount(); i++)
			tablePartidosHoy.getColumnModel().getColumn(i).setCellRenderer(tcr);

		lblListaPartidosDe = new JLabel("LISTA PARTIDOS DE HOY");
		lblListaPartidosDe.setHorizontalTextPosition(SwingConstants.CENTER);
		lblListaPartidosDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaPartidosDe.setForeground(Color.WHITE);
		lblListaPartidosDe.setFont(new Font("Consolas", Font.BOLD, 20));
		lblListaPartidosDe.setBounds(12, 13, 265, 45);
		panelPartidoHoy.add(lblListaPartidosDe);

		lblDate = new JLabel("");

		lblDate.setOpaque(false);
		lblDate.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Consolas", Font.BOLD, 20));
		lblDate.setBounds(289, 13, 265, 45);
		panelPartidoHoy.add(lblDate);

		btnPlayBall = new JButton("Play Ball !");
		btnPlayBall.setEnabled(false);
		btnPlayBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (auxGame.getHomeRun() == 0 && auxGame.getAwayRun() == 0) {
					//	if (verificarEquiposLlenos(local, visita) == true) {
					panelBgDashboard.setVisible(false);
					panelManageTeams.setVisible(false);
					panelGameSimulation.setVisible(true);
					btnMenu.setEnabled(false);
					btnHome.setEnabled(false);
					btnJugadores.setEnabled(false);
					btnPartidos.setEnabled(false);
					btnEquipos.setEnabled(false);
					btnEstadios.setEnabled(false);
					gameSimulationOpen(equipoLocal, equipoVisitante, auxGame);

					//	} else {
					//		int answer = JOptionPane.showConfirmDialog(null,
					//				"Las posiciones de uno o ambos equipos no están cubiertas\n¿Desea Verificar?", null,
					////				JOptionPane.YES_NO_OPTION);
					//		if (answer == JOptionPane.YES_OPTION) {
					//			TablaPosiciones equip = new TablaPosiciones();
					//			equip.setVisible(true);
					//		}
					//	}

				} else {
					JOptionPane.showMessageDialog(null, "El Partido ya está Finalizado", "Error",
							JOptionPane.WARNING_MESSAGE);
				}

			}
		});
		btnPlayBall.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/icons8_baseball_24px.png")));
		btnPlayBall.setIconTextGap(5);
		btnPlayBall.setHorizontalTextPosition(SwingConstants.LEFT);
		btnPlayBall.setForeground(new Color(255, 255, 240));
		btnPlayBall.setFont(new Font("Consolas", Font.BOLD, 17));
		btnPlayBall.setBorder(null);
		btnPlayBall.setBackground(new Color(0, 30, 72));
		btnPlayBall.setBounds(888, 23, 200, 30);
		panelPartidoHoy.add(btnPlayBall);

		panel_3 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);

			}
		};
		panel_3.setOpaque(false);
		panel_3.setBackground(new Color(0, 0, 0, 60));
		panel_3.setBounds(59, 500, 1100, 396);
		panelBgDashboard.add(panel_3);

		panelPartidosDashboard = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());

				g.fillRect(0, 0, getWidth(), getHeight());

				super.paintComponent(g);
			}
		};
		panelPartidosDashboard.setBackground(new Color(0, 0, 0,60));
		panelPartidosDashboard.setOpaque(false);

		panelPartidosDashboard.setBounds(1267, 13, 590, 883);
		panelBgDashboard.add(panelPartidosDashboard);

		lblPlay_Blur = new JLabel("");
		lblPlay_Blur.setBounds(0, 0, 1910, 957);
		panelBgDashboard.add(lblPlay_Blur);
		/** to adjust image at size of JLabel **/
		ImageIcon bgPlay = new ImageIcon(getClass().getResource("/iconos_imagenes/fondoPlay.png"));
		Icon play = new ImageIcon(bgPlay.getImage().getScaledInstance(lblPlay_Blur.getWidth(), lblPlay_Blur.getHeight(), Image.SCALE_SMOOTH));
		lblPlay_Blur.setIcon(play);



		panelManageTeams = new JPanel();
		panelManageTeams.setVisible(false);
		panelManageTeams.setBackground(new Color(255, 255, 255));
		panelBgHome.add(panelManageTeams, "name_546922147272900");
		panelManageTeams.setLayout(null);



		lblLogoTeam = new JLabel("");
		lblLogoTeam.setOpaque(true);
		lblLogoTeam.setToolTipText("LIDOM");
		lblLogoTeam.setBackground(Color.BLACK);
		lblLogoTeam.setBounds(85, 38, 205, 205);
		panelManageTeams.add(lblLogoTeam);

		lblNameTeam = new JLabel();
		lblNameTeam.setBackground(new Color(255, 255, 255));
		lblNameTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNameTeam.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNameTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameTeam.setForeground(Color.BLACK);
		lblNameTeam.setFont(new Font("Consolas", Font.PLAIN, 36));
		lblNameTeam.setBounds(302, 185, 573, 58);
		panelManageTeams.add(lblNameTeam);

		separator_3 = new JSeparator();
		separator_3.setOpaque(true);
		separator_3.setBorder(null);
		separator_3.setBackground(new Color(4, 10, 20));
		separator_3.setBounds(302, 241, 573, 2);
		panelManageTeams.add(separator_3);

		lblRoster = new JLabel("Roster / Jugadores Activos");
		lblRoster.setBackground(new Color(0,30,72));
		lblRoster.setOpaque(true);
		lblRoster.setHorizontalTextPosition(SwingConstants.CENTER);
		lblRoster.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblRoster.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRoster.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoster.setForeground(Color.WHITE);
		lblRoster.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblRoster.setBounds(1523, 13, 375, 31);
		panelManageTeams.add(lblRoster);

		scrollPaneRoster = new JScrollPane();
		scrollPaneRoster.setBounds(1523, 57, 375, 462);
		panelManageTeams.add(scrollPaneRoster);

		tableRoster = new JTable();
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
		scrollPaneRoster.setViewportView(tableRoster);

		scrollPaneLineUp = new JScrollPane();
		scrollPaneLineUp.setBounds(1136, 57, 375, 462);
		panelManageTeams.add(scrollPaneLineUp);

		tableLineUp = new JTable();
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

		scrollPaneLesionados = new JScrollPane();
		scrollPaneLesionados.setBounds(1523, 604, 375, 340);
		panelManageTeams.add(scrollPaneLesionados);

		tableLesionados = new JTable();
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

		lblLineUp = new JLabel("Funciones");
		lblLineUp.setBackground(new Color(0,30,72));
		lblLineUp.setOpaque(true);
		lblLineUp.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLineUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblLineUp.setForeground(Color.WHITE);
		lblLineUp.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblLineUp.setBounds(1159, 560, 328, 31);
		panelManageTeams.add(lblLineUp);

		lblLesionados = new JLabel("Jugadores Lesionados");
		lblLesionados.setBackground(new Color(0,30,72));
		lblLesionados.setOpaque(true);
		lblLesionados.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLesionados.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLesionados.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLesionados.setHorizontalAlignment(SwingConstants.CENTER);
		lblLesionados.setForeground(Color.WHITE);
		lblLesionados.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblLesionados.setBounds(1523, 560, 375, 31);
		panelManageTeams.add(lblLesionados);

		panelMenuInfo = new JPanel();
		panelMenuInfo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMenuInfo.setBackground(new Color(255, 255, 255));
		panelMenuInfo.setBounds(12, 275, 1056, 669);
		panelManageTeams.add(panelMenuInfo);
		panelMenuInfo.setLayout(new CardLayout(0, 0));

		panelLineUp = new JPanel();
		panelLineUp.setVisible(false);

		panel_1 = new JPanel();
		panelMenuInfo.add(panel_1, "name_633036105551300");
		panelLineUp.setBackground(new Color(255, 255, 255));
		panelMenuInfo.add(panelLineUp, "name_616045152774500");
		panelLineUp.setLayout(null);


		lblCrearLineUp = new JLabel("CREAR LINE UP  DEL EQUIPO");
		lblCrearLineUp.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblCrearLineUp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCrearLineUp.setOpaque(true);
		lblCrearLineUp.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCrearLineUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearLineUp.setForeground(Color.WHITE);
		lblCrearLineUp.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblCrearLineUp.setBackground(new Color(0, 30, 72));
		lblCrearLineUp.setBounds(335, 13, 403, 31);
		panelLineUp.add(lblCrearLineUp);

		btnCf = new JButton("CF");
		btnCf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				ArrayList<String> playerAvailable = new ArrayList<String>();

				for (Player auxPlayer : auxTeam.getRosterPlayers()) {
					if (auxPlayer instanceof Batter) {		
						if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Center fielder") && auxPlayer.getLesionado() == false) {
							playerAvailable.add(auxPlayer.getName()); // agregar a un arraylist temporal para mostrar en cbxbox				
						}
					}		
				}
				try {
					String[] copyPlayerAvailable = new String[playerAvailable.size()];
					copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

					seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);
					Player auxPlayerN = Lidom.getInstance().searchPlayerByName(seleccionarjugador);

					lblCf.setText(seleccionarjugador+ " " +  auxPlayerN.getLastname());
					Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					auxTeam.addPlayerLineUp(auxPlayer);

				}
				catch(ArrayIndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(null, "No hay jugadores para esta posición!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCf.setIconTextGap(5);
		btnCf.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCf.setForeground(new Color(255, 255, 240));
		btnCf.setFont(new Font("Consolas", Font.BOLD, 22));
		btnCf.setBorder(null);
		btnCf.setBackground(new Color(4, 10, 20));
		btnCf.setBounds(493, 98, 60, 37);
		panelLineUp.add(btnCf);

		btnLf = new JButton("LF");
		btnLf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				ArrayList<String> playerAvailable = new ArrayList<String>();

				for (Player auxPlayer : auxTeam.getRosterPlayers()) {
					if (auxPlayer instanceof Batter) {		
						if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Left fielder") && auxPlayer.getLesionado() == false) {
							playerAvailable.add(auxPlayer.getName()); // agregar a un arraylist temporal para mostrar en cbxbox				
						}
					}		
				}
				try {
					String[] copyPlayerAvailable = new String[playerAvailable.size()];
					copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

					seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);
					Player auxPlayerN = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					lblLf.setText(seleccionarjugador + " " +  auxPlayerN.getLastname());
					Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					auxTeam.addPlayerLineUp(auxPlayer);

				}
				catch(ArrayIndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(null, "No hay jugadores para esta posición!", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnLf.setIconTextGap(5);
		btnLf.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnLf.setForeground(new Color(255, 255, 240));
		btnLf.setFont(new Font("Consolas", Font.BOLD, 22));
		btnLf.setBorder(null);
		btnLf.setBackground(new Color(4, 10, 20));
		btnLf.setBounds(291, 142, 60, 37);
		panelLineUp.add(btnLf);

		btnRf = new JButton("RF");
		btnRf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				ArrayList<String> playerAvailable = new ArrayList<String>();

				for (Player auxPlayer : auxTeam.getRosterPlayers()) {
					if (auxPlayer instanceof Batter) {		
						if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Right fielder") && auxPlayer.getLesionado() == false) {
							playerAvailable.add(auxPlayer.getName()); // agregar a un arraylist temporal para mostrar en cbxbox				
						}
					}		
				}
				try {
					String[] copyPlayerAvailable = new String[playerAvailable.size()];
					copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

					seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);
					Player auxPlayerN = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					if (seleccionarjugador !=null) {
						lblRf.setText(seleccionarjugador+ " " +  auxPlayerN.getLastname());
						Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
						auxTeam.addPlayerLineUp(auxPlayer);

					}


				}
				catch(ArrayIndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(null, "No hay jugadores para esta posición!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnRf.setIconTextGap(5);
		btnRf.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnRf.setForeground(new Color(255, 255, 240));
		btnRf.setFont(new Font("Consolas", Font.BOLD, 22));
		btnRf.setBorder(null);
		btnRf.setBackground(new Color(4, 10, 20));
		btnRf.setBounds(694, 142, 60, 37);
		panelLineUp.add(btnRf);

		btnss = new JButton("SS");
		btnss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				ArrayList<String> playerAvailable = new ArrayList<String>();

				for (Player auxPlayer : auxTeam.getRosterPlayers()) {
					if (auxPlayer instanceof Batter) {		
						if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Short stop") && auxPlayer.getLesionado() == false) {
							playerAvailable.add(auxPlayer.getName()); // agregar a un arraylist temporal para mostrar en cbxbox				
						}
					}		
				}
				try {
					String[] copyPlayerAvailable = new String[playerAvailable.size()];
					copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

					seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);
					Player auxPlayerN = Lidom.getInstance().searchPlayerByName(seleccionarjugador);

					lblss.setText(seleccionarjugador+ " " +  auxPlayerN.getLastname());
					Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					auxTeam.addPlayerLineUp(auxPlayer);

				}
				catch(ArrayIndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(null, "No hay jugadores para esta posición!", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnss.setIconTextGap(5);
		btnss.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnss.setForeground(new Color(255, 255, 240));
		btnss.setFont(new Font("Consolas", Font.BOLD, 22));
		btnss.setBorder(null);
		btnss.setBackground(new Color(4, 10, 20));
		btnss.setBounds(395, 268, 60, 37);
		panelLineUp.add(btnss);

		btn3b = new JButton("3B");
		btn3b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				ArrayList<String> playerAvailable = new ArrayList<String>();

				for (Player auxPlayer : auxTeam.getRosterPlayers()) {
					if (auxPlayer instanceof Batter) {		
						if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Tercera base") && auxPlayer.getLesionado() == false) {
							playerAvailable.add(auxPlayer.getName()); // agregar a un arraylist temporal para mostrar en cbxbox				
						}
					}		
				}
				try {
					String[] copyPlayerAvailable = new String[playerAvailable.size()];
					copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

					seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);
					Player auxPlayerN = Lidom.getInstance().searchPlayerByName(seleccionarjugador);

					lbl3b.setText(seleccionarjugador+ " " +  auxPlayerN.getLastname());
					Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					auxTeam.addPlayerLineUp(auxPlayer);

				}
				catch(ArrayIndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(null, "No hay jugadores para esta posición!", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btn3b.setIconTextGap(5);
		btn3b.setHorizontalTextPosition(SwingConstants.RIGHT);
		btn3b.setForeground(new Color(255, 255, 240));
		btn3b.setFont(new Font("Consolas", Font.BOLD, 22));
		btn3b.setBorder(null);
		btn3b.setBackground(new Color(4, 10, 20));
		btn3b.setBounds(366, 344, 60, 37);
		panelLineUp.add(btn3b);

		btn2b = new JButton("2B");
		btn2b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				ArrayList<String> playerAvailable = new ArrayList<String>();

				for (Player auxPlayer : auxTeam.getRosterPlayers()) {
					if (auxPlayer instanceof Batter) {		
						if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Segunda base") && auxPlayer.getLesionado() == false) {
							playerAvailable.add(auxPlayer.getName()); // agregar a un arraylist temporal para mostrar en cbxbox				
						}
					}		
				}
				try {
					String[] copyPlayerAvailable = new String[playerAvailable.size()];
					copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

					seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);
					Player auxPlayerN = Lidom.getInstance().searchPlayerByName(seleccionarjugador);


					lbl2b.setText(seleccionarjugador+ " " +  auxPlayerN.getLastname());
					Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					auxTeam.addPlayerLineUp(auxPlayer);

				}
				catch(ArrayIndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(null, "No hay jugadores para esta posición!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn2b.setIconTextGap(5);
		btn2b.setHorizontalTextPosition(SwingConstants.RIGHT);
		btn2b.setForeground(new Color(255, 255, 240));
		btn2b.setFont(new Font("Consolas", Font.BOLD, 22));
		btn2b.setBorder(null);
		btn2b.setBackground(new Color(4, 10, 20));
		btn2b.setBounds(574, 268, 60, 37);
		panelLineUp.add(btn2b);

		btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				ArrayList<String> playerAvailable = new ArrayList<String>();

				for (Player auxPlayer : auxTeam.getRosterPlayers()) {
					if (auxPlayer instanceof Pitcher) {		
						if (auxPlayer.getLesionado() == false) {
							playerAvailable.add(auxPlayer.getName()); // agregar a un arraylist temporal para mostrar en cbxbox				
						}
					}		
				}
				try {
					String[] copyPlayerAvailable = new String[playerAvailable.size()];
					copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

					seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);
					Player auxPlayerN = Lidom.getInstance().searchPlayerByName(seleccionarjugador);

					lblP.setText(seleccionarjugador+ " " +  auxPlayerN.getLastname());
					Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					auxTeam.addPlayerLineUp(auxPlayer);

				}
				catch(ArrayIndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(null, "No hay jugadores para esta posición!", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnP.setIconTextGap(5);
		btnP.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnP.setForeground(new Color(255, 255, 240));
		btnP.setFont(new Font("Consolas", Font.BOLD, 22));
		btnP.setBorder(null);
		btnP.setBackground(new Color(4, 10, 20));
		btnP.setBounds(493, 363, 60, 37);
		panelLineUp.add(btnP);

		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				ArrayList<String> playerAvailable = new ArrayList<String>();

				for (Player auxPlayer : auxTeam.getRosterPlayers()) {
					if (auxPlayer instanceof Batter) {		
						if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Catcher") && auxPlayer.getLesionado() == false) {
							playerAvailable.add(auxPlayer.getName()); // agregar a un arraylist temporal para mostrar en cbxbox				
						}
					}		
				}
				try {
					String[] copyPlayerAvailable = new String[playerAvailable.size()];
					copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

					seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);
					Player auxPlayerN = Lidom.getInstance().searchPlayerByName(seleccionarjugador);

					lblC.setText(seleccionarjugador+ " " +  auxPlayerN.getLastname());
					Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					auxTeam.addPlayerLineUp(auxPlayer);

				}
				catch(ArrayIndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(null, "No hay jugadores para esta posición!", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnC.setIconTextGap(5);
		btnC.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnC.setForeground(new Color(255, 255, 240));
		btnC.setFont(new Font("Consolas", Font.BOLD, 22));
		btnC.setBorder(null);
		btnC.setBackground(new Color(4, 10, 20));
		btnC.setBounds(493, 549, 60, 37);
		panelLineUp.add(btnC);

		btn1b = new JButton("1B");
		btn1b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Team auxTeam = backEnd.Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				ArrayList<String> playerAvailable = new ArrayList<String>();

				for (Player auxPlayer : auxTeam.getRosterPlayers()) {
					if (auxPlayer instanceof Batter) {		
						if (((Batter) auxPlayer).getPosition().equalsIgnoreCase("Primera base") && auxPlayer.getLesionado() == false) {
							playerAvailable.add(auxPlayer.getName()); // agregar a un arraylist temporal para mostrar en cbxbox				
						}
					}		
				}
				try {
					String[] copyPlayerAvailable = new String[playerAvailable.size()];
					copyPlayerAvailable = playerAvailable.toArray(copyPlayerAvailable);

					seleccionarjugador = (String) JOptionPane.showInputDialog(null, "Seleccione un jugador", "Seleccionar Jugador",  JOptionPane.QUESTION_MESSAGE,  null,  copyPlayerAvailable, copyPlayerAvailable[0]);
					Player auxPlayerN = Lidom.getInstance().searchPlayerByName(seleccionarjugador);



					lbl1b.setText(seleccionarjugador+ " " +  auxPlayerN.getLastname());
					Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					auxTeam.addPlayerLineUp(auxPlayer);

				}
				catch(ArrayIndexOutOfBoundsException e2){
					JOptionPane.showMessageDialog(null, "No hay jugadores para esta posición!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn1b.setIconTextGap(5);
		btn1b.setHorizontalTextPosition(SwingConstants.RIGHT);
		btn1b.setForeground(new Color(255, 255, 240));
		btn1b.setFont(new Font("Consolas", Font.BOLD, 22));
		btn1b.setBorder(null);
		btn1b.setBackground(new Color(4, 10, 20));
		btn1b.setBounds(607, 351, 60, 37);
		panelLineUp.add(btn1b);

		lblP = new JLabel("");
		lblP.setFont(new Font("Consolas", Font.ITALIC, 14));
		lblP.setBounds(473, 344, 100, 16);
		panelLineUp.add(lblP);

		lblC = new JLabel("");
		lblC.setFont(new Font("Consolas", Font.ITALIC, 14));
		lblC.setBounds(473, 531, 100, 16);
		panelLineUp.add(lblC);

		lbl3b = new JLabel("");
		lbl3b.setFont(new Font("Consolas", Font.ITALIC, 14));
		lbl3b.setBounds(346, 327, 100, 16);
		panelLineUp.add(lbl3b);

		lblss = new JLabel("");
		lblss.setFont(new Font("Consolas", Font.ITALIC, 14));
		lblss.setBounds(375, 251, 100, 16);
		panelLineUp.add(lblss);

		lbl2b = new JLabel("");
		lbl2b.setFont(new Font("Consolas", Font.ITALIC, 14));
		lbl2b.setBounds(554, 251, 100, 16);
		panelLineUp.add(lbl2b);

		lbl1b = new JLabel("");
		lbl1b.setFont(new Font("Consolas", Font.ITALIC, 14));
		lbl1b.setBounds(587, 332, 100, 16);
		panelLineUp.add(lbl1b);

		lblLf = new JLabel("");
		lblLf.setFont(new Font("Consolas", Font.ITALIC, 14));
		lblLf.setBounds(271, 123, 100, 16);
		panelLineUp.add(lblLf);

		lblCf = new JLabel("");
		lblCf.setFont(new Font("Consolas", Font.ITALIC, 14));
		lblCf.setBounds(473, 77, 100, 16);
		panelLineUp.add(lblCf);

		lblRf = new JLabel("");
		lblRf.setFont(new Font("Consolas", Font.ITALIC, 14));
		lblRf.setBounds(674, 119, 100, 16);
		panelLineUp.add(lblRf);

		lblBgPlayLineUp = new JLabel("");
		lblBgPlayLineUp.setBounds(163, 62, 711, 542);
		panelLineUp.add(lblBgPlayLineUp);
		/** to adjust image at size of JLabel **/
		ImageIcon bgLinePlay = new ImageIcon(getClass().getResource("/iconos_imagenes/Baseball_diamond_clean.png"));
		Icon playLine = new ImageIcon(bgLinePlay.getImage().getScaledInstance(lblBgPlayLineUp.getWidth(), lblBgPlayLineUp.getHeight(), Image.SCALE_SMOOTH));
		lblBgPlayLineUp.setIcon(playLine);

		btnLineUp = new JButton("Finalizar Line Up");
		btnLineUp.setEnabled(false);
		btnLineUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Team auxTeam = Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				loadLineUpPlayerByTeam(auxTeam, modelLineUp, columnLineUp, tableLineUp);
				btnLineUp.setEnabled(false);
				panelLineUp.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnLineUp.setIconTextGap(5);
		btnLineUp.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnLineUp.setForeground(new Color(255, 255, 240));
		btnLineUp.setFont(new Font("Consolas", Font.BOLD, 22));
		btnLineUp.setBorder(null);
		btnLineUp.setBackground(new Color(4, 10, 20));
		btnLineUp.setBounds(376, 615, 284, 37);
		panelLineUp.add(btnLineUp);

		btnPanelLineUp = new JButton("Crear Line Up");
		btnPanelLineUp.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/icons8_add_property_1_36px.png")));
		btnPanelLineUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panelLineUp.setVisible(true);
				btnLineUp.setEnabled(true);
			}
		});
		btnPanelLineUp.setIconTextGap(5);
		btnPanelLineUp.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnPanelLineUp.setForeground(new Color(255, 255, 240));
		btnPanelLineUp.setFont(new Font("Consolas", Font.BOLD, 22));
		btnPanelLineUp.setBorder(null);
		btnPanelLineUp.setBackground(new Color(4, 10, 20));
		btnPanelLineUp.setBounds(1183, 606, 280, 37);
		panelManageTeams.add(btnPanelLineUp);

		btnFuncionesNa_1 = new JButton("Funciones n/a");
		btnFuncionesNa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Team auxTeam = Lidom.getInstance().searchTeamByName(lblNameTeam.getText());
				AddInjury lesion = new AddInjury(auxTeam, false);
				lesion.setModal(true);
				lesion.setVisible(true);
				
				loadInjuryPlayerByTeam(auxTeam);
				loadRosterPlayerByTeam(auxTeam);
				loadLineUpPlayerByTeam(auxTeam, modelLineUp, columnLineUp, tableLineUp);
			}
		});
		btnFuncionesNa_1.setIconTextGap(5);
		btnFuncionesNa_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnFuncionesNa_1.setForeground(new Color(255, 255, 240));
		btnFuncionesNa_1.setFont(new Font("Consolas", Font.BOLD, 22));
		btnFuncionesNa_1.setBorder(null);
		btnFuncionesNa_1.setBackground(new Color(4, 10, 20));
		btnFuncionesNa_1.setBounds(1183, 656, 280, 37);
		panelManageTeams.add(btnFuncionesNa_1);

		btnFuncionesNa_2 = new JButton("Funciones n/a");
		btnFuncionesNa_2.setEnabled(false);
		btnFuncionesNa_2.setIconTextGap(5);
		btnFuncionesNa_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnFuncionesNa_2.setForeground(new Color(255, 255, 240));
		btnFuncionesNa_2.setFont(new Font("Consolas", Font.BOLD, 22));
		btnFuncionesNa_2.setBorder(null);
		btnFuncionesNa_2.setBackground(new Color(4, 10, 20));
		btnFuncionesNa_2.setBounds(1183, 706, 280, 37);
		panelManageTeams.add(btnFuncionesNa_2);

		btnFuncionesNa_3 = new JButton("Funciones n/a");
		btnFuncionesNa_3.setEnabled(false);
		btnFuncionesNa_3.setIconTextGap(5);
		btnFuncionesNa_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnFuncionesNa_3.setForeground(new Color(255, 255, 240));
		btnFuncionesNa_3.setFont(new Font("Consolas", Font.BOLD, 22));
		btnFuncionesNa_3.setBorder(null);
		btnFuncionesNa_3.setBackground(new Color(4, 10, 20));
		btnFuncionesNa_3.setBounds(1183, 756, 280, 37);
		panelManageTeams.add(btnFuncionesNa_3);

		btnFuncionesNa_4 = new JButton("Funciones n/a");
		btnFuncionesNa_4.setEnabled(false);
		btnFuncionesNa_4.setIconTextGap(5);
		btnFuncionesNa_4.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnFuncionesNa_4.setForeground(new Color(255, 255, 240));
		btnFuncionesNa_4.setFont(new Font("Consolas", Font.BOLD, 22));
		btnFuncionesNa_4.setBorder(null);
		btnFuncionesNa_4.setBackground(new Color(4, 10, 20));
		btnFuncionesNa_4.setBounds(1183, 806, 280, 37);
		panelManageTeams.add(btnFuncionesNa_4);

		btnFuncionesNa_5 = new JButton("Funciones n/a");
		btnFuncionesNa_5.setEnabled(false);
		btnFuncionesNa_5.setIconTextGap(5);
		btnFuncionesNa_5.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnFuncionesNa_5.setForeground(new Color(255, 255, 240));
		btnFuncionesNa_5.setFont(new Font("Consolas", Font.BOLD, 22));
		btnFuncionesNa_5.setBorder(null);
		btnFuncionesNa_5.setBackground(new Color(4, 10, 20));
		btnFuncionesNa_5.setBounds(1183, 856, 280, 37);
		panelManageTeams.add(btnFuncionesNa_5);

		lblLineUp_1 = new JLabel("Line Up / Jugadores Regulares");
		lblLineUp_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLineUp_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLineUp_1.setOpaque(true);
		lblLineUp_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLineUp_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLineUp_1.setForeground(Color.WHITE);
		lblLineUp_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblLineUp_1.setBackground(new Color(0, 30, 72));
		lblLineUp_1.setBounds(1136, 13, 375, 31);
		panelManageTeams.add(lblLineUp_1);

		lblFundado = new JLabel("- Fundado:");
		lblFundado.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblFundado.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFundado.setHorizontalTextPosition(SwingConstants.LEFT);
		lblFundado.setHorizontalAlignment(SwingConstants.LEFT);
		lblFundado.setForeground(Color.BLACK);
		lblFundado.setFont(new Font("Consolas", Font.PLAIN, 22));
		lblFundado.setBackground(new Color(0, 30, 72));
		lblFundado.setBounds(351, 99, 120, 31);
		panelManageTeams.add(lblFundado);

		lblManager = new JLabel("- Manager:");
		lblManager.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblManager.setVerticalAlignment(SwingConstants.BOTTOM);
		lblManager.setHorizontalTextPosition(SwingConstants.LEFT);
		lblManager.setHorizontalAlignment(SwingConstants.LEFT);
		lblManager.setForeground(Color.BLACK);
		lblManager.setFont(new Font("Consolas", Font.PLAIN, 22));
		lblManager.setBackground(new Color(0, 30, 72));
		lblManager.setBounds(351, 141, 120, 31);
		panelManageTeams.add(lblManager);

		lblEstadioTeam = new JLabel("");
		lblEstadioTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblEstadioTeam.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEstadioTeam.setHorizontalTextPosition(SwingConstants.LEFT);
		lblEstadioTeam.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadioTeam.setForeground(Color.BLACK);
		lblEstadioTeam.setFont(new Font("Consolas", Font.PLAIN, 22));
		lblEstadioTeam.setBackground(new Color(0, 30, 72));
		lblEstadioTeam.setBounds(528, 55, 260, 31);
		panelManageTeams.add(lblEstadioTeam);

		lblFundadoTeam = new JLabel("");
		lblFundadoTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblFundadoTeam.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFundadoTeam.setHorizontalTextPosition(SwingConstants.LEFT);
		lblFundadoTeam.setHorizontalAlignment(SwingConstants.LEFT);
		lblFundadoTeam.setForeground(Color.BLACK);
		lblFundadoTeam.setFont(new Font("Consolas", Font.PLAIN, 22));
		lblFundadoTeam.setBackground(new Color(0, 30, 72));
		lblFundadoTeam.setBounds(528, 99, 260, 31);
		panelManageTeams.add(lblFundadoTeam);

		lblManagerTeam = new JLabel("");
		lblManagerTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblManagerTeam.setVerticalAlignment(SwingConstants.BOTTOM);
		lblManagerTeam.setHorizontalTextPosition(SwingConstants.LEFT);
		lblManagerTeam.setHorizontalAlignment(SwingConstants.LEFT);
		lblManagerTeam.setForeground(Color.BLACK);
		lblManagerTeam.setFont(new Font("Consolas", Font.PLAIN, 22));
		lblManagerTeam.setBackground(new Color(0, 30, 72));
		lblManagerTeam.setBounds(528, 141, 260, 31);
		panelManageTeams.add(lblManagerTeam);

		lblEstadio = new JLabel("- Estadio:");
		lblEstadio.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblEstadio.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEstadio.setHorizontalTextPosition(SwingConstants.LEFT);
		lblEstadio.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadio.setForeground(Color.BLACK);
		lblEstadio.setFont(new Font("Consolas", Font.PLAIN, 22));
		lblEstadio.setBackground(new Color(0, 30, 72));
		lblEstadio.setBounds(351, 55, 120, 31);
		panelManageTeams.add(lblEstadio);

		panelGameSimulation = new JPanel();
		panelBgHome.add(panelGameSimulation, "name_680040644675600");
		panelGameSimulation.setLayout(null);

		panelScoreBoard = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());

				g.fillRect(0, 0, getWidth(), getHeight());

				super.paintComponent(g);
			}

		};
		panelScoreBoard.setOpaque(false);
		panelScoreBoard.setBackground(new Color(0, 0, 0, 60));
		panelScoreBoard.setBounds(300, 13, 1188, 210);
		panelGameSimulation.add(panelScoreBoard);
		panelScoreBoard.setLayout(null);

		txtEquipVisi = new JTextField() {
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
		/**********************************************************/	
		txtEquipVisi.setHorizontalAlignment(SwingConstants.CENTER);
		txtEquipVisi.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtEquipVisi.setDisabledTextColor(Color.BLACK);
		txtEquipVisi.setColumns(10);
		txtEquipVisi.setBounds(12, 62, 234, 30);
		panelScoreBoard.add(txtEquipVisi);

		lblEquipos = new JLabel("EQUIPOS");
		lblEquipos.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblEquipos.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEquipos.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipos.setForeground(new Color(255, 255, 255));
		lblEquipos.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblEquipos.setBounds(12, 28, 234, 31);
		panelScoreBoard.add(lblEquipos);

		label_1 = new JLabel("1");
		label_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_1.setBounds(275, 28, 52, 31);
		panelScoreBoard.add(label_1);

		textField_1 = new JTextField() {
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
		/**********************************************************/	
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_1.setDisabledTextColor(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBounds(275, 62, 52, 30);
		panelScoreBoard.add(textField_1);

		textField_2 = new JTextField() {
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
		/**********************************************************/	
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_2.setDisabledTextColor(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBounds(353, 62, 52, 30);
		panelScoreBoard.add(textField_2);

		label_2 = new JLabel("2");
		label_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_2.setBounds(353, 28, 52, 31);
		panelScoreBoard.add(label_2);

		textField_3 = new JTextField() {
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
		/**********************************************************/	
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_3.setDisabledTextColor(Color.BLACK);
		textField_3.setColumns(10);
		textField_3.setBounds(431, 62, 52, 30);
		panelScoreBoard.add(textField_3);

		label_3 = new JLabel("3");
		label_3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_3.setBounds(431, 28, 52, 31);
		panelScoreBoard.add(label_3);

		label_4 = new JLabel("4");
		label_4.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_4.setBounds(509, 28, 52, 31);
		panelScoreBoard.add(label_4);

		textField_4 = new JTextField() {
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
		/**********************************************************/	
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_4.setDisabledTextColor(Color.BLACK);
		textField_4.setColumns(10);
		textField_4.setBounds(509, 62, 52, 30);
		panelScoreBoard.add(textField_4);

		textField_5 = new JTextField() {
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
		/**********************************************************/	
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_5.setDisabledTextColor(Color.BLACK);
		textField_5.setColumns(10);
		textField_5.setBounds(587, 62, 52, 30);
		panelScoreBoard.add(textField_5);

		label_5 = new JLabel("5");
		label_5.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_5.setBounds(587, 28, 52, 31);
		panelScoreBoard.add(label_5);

		label_6 = new JLabel("6");
		label_6.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_6.setVerticalAlignment(SwingConstants.BOTTOM);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(255, 255, 255));
		label_6.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_6.setBounds(665, 28, 52, 31);
		panelScoreBoard.add(label_6);

		textField_6 = new JTextField() {
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
		/**********************************************************/	
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_6.setDisabledTextColor(Color.BLACK);
		textField_6.setColumns(10);
		textField_6.setBounds(665, 62, 52, 30);
		panelScoreBoard.add(textField_6);

		textField_7 = new JTextField() {
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
		/**********************************************************/	
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_7.setDisabledTextColor(Color.BLACK);
		textField_7.setColumns(10);
		textField_7.setBounds(743, 62, 52, 30);
		panelScoreBoard.add(textField_7);

		label_7 = new JLabel("7");
		label_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_7.setVerticalAlignment(SwingConstants.BOTTOM);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(255, 255, 255));
		label_7.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_7.setBounds(743, 28, 52, 31);
		panelScoreBoard.add(label_7);

		label_8 = new JLabel("8");
		label_8.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_8.setVerticalAlignment(SwingConstants.BOTTOM);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(255, 255, 255));
		label_8.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_8.setBounds(821, 28, 52, 31);
		panelScoreBoard.add(label_8);

		textField_8 = new JTextField() {
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
		/**********************************************************/	
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_8.setDisabledTextColor(Color.BLACK);
		textField_8.setColumns(10);
		textField_8.setBounds(821, 62, 52, 30);
		panelScoreBoard.add(textField_8);

		textField_9 = new JTextField() {
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
		/**********************************************************/	
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_9.setDisabledTextColor(Color.BLACK);
		textField_9.setColumns(10);
		textField_9.setBounds(899, 62, 52, 30);
		panelScoreBoard.add(textField_9);

		label_9 = new JLabel("9");
		label_9.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_9.setVerticalAlignment(SwingConstants.BOTTOM);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(new Color(255, 255, 255));
		label_9.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_9.setBounds(899, 28, 52, 31);
		panelScoreBoard.add(label_9);

		lblR = new JLabel("C");
		lblR.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblR.setVerticalAlignment(SwingConstants.BOTTOM);
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		lblR.setForeground(new Color(255, 255, 255));
		lblR.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblR.setBounds(979, 28, 52, 31);
		panelScoreBoard.add(lblR);

		textField_10 = new JTextField() {
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
		/**********************************************************/	
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_10.setDisabledTextColor(Color.BLACK);
		textField_10.setColumns(10);
		textField_10.setBounds(979, 62, 52, 30);
		panelScoreBoard.add(textField_10);

		txtEquipLocal = new JTextField() {
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
		/**********************************************************/	
		txtEquipLocal.setHorizontalAlignment(SwingConstants.CENTER);
		txtEquipLocal.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtEquipLocal.setDisabledTextColor(Color.BLACK);
		txtEquipLocal.setColumns(10);
		txtEquipLocal.setBounds(12, 105, 234, 30);
		panelScoreBoard.add(txtEquipLocal);

		textField_11 = new JTextField() {
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
		/**********************************************************/	
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_11.setDisabledTextColor(Color.BLACK);
		textField_11.setColumns(10);
		textField_11.setBounds(275, 105, 52, 30);
		panelScoreBoard.add(textField_11);

		textField_13 = new JTextField() {
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
		/**********************************************************/	
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_13.setDisabledTextColor(Color.BLACK);
		textField_13.setColumns(10);
		textField_13.setBounds(353, 105, 52, 30);
		panelScoreBoard.add(textField_13);

		textField_14 = new JTextField() {
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
		/**********************************************************/	
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_14.setDisabledTextColor(Color.BLACK);
		textField_14.setColumns(10);
		textField_14.setBounds(431, 105, 52, 30);
		panelScoreBoard.add(textField_14);

		textField_15 = new JTextField() {
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
		/**********************************************************/	
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_15.setDisabledTextColor(Color.BLACK);
		textField_15.setColumns(10);
		textField_15.setBounds(509, 105, 52, 30);
		panelScoreBoard.add(textField_15);

		textField_16 = new JTextField() {
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
		/**********************************************************/	
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_16.setDisabledTextColor(Color.BLACK);
		textField_16.setColumns(10);
		textField_16.setBounds(587, 105, 52, 30);
		panelScoreBoard.add(textField_16);

		textField_17 = new JTextField() {
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
		/**********************************************************/	
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_17.setDisabledTextColor(Color.BLACK);
		textField_17.setColumns(10);
		textField_17.setBounds(665, 105, 52, 30);
		panelScoreBoard.add(textField_17);

		textField_18 = new JTextField() {
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
		/**********************************************************/	
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_18.setDisabledTextColor(Color.BLACK);
		textField_18.setColumns(10);
		textField_18.setBounds(743, 105, 52, 30);
		panelScoreBoard.add(textField_18);

		textField_19 = new JTextField() {
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
		/**********************************************************/	
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_19.setDisabledTextColor(Color.BLACK);
		textField_19.setColumns(10);
		textField_19.setBounds(821, 105, 52, 30);
		panelScoreBoard.add(textField_19);

		lblH = new JLabel("H");
		lblH.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblH.setVerticalAlignment(SwingConstants.BOTTOM);
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setForeground(new Color(255, 255, 255));
		lblH.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblH.setBounds(1049, 28, 52, 31);
		panelScoreBoard.add(lblH);

		lblE = new JLabel("E");
		lblE.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblE.setVerticalAlignment(SwingConstants.BOTTOM);
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		lblE.setForeground(new Color(255, 255, 255));
		lblE.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblE.setBounds(1123, 28, 52, 31);
		panelScoreBoard.add(lblE);

		textField_20 = new JTextField() {
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
		/**********************************************************/	
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_20.setDisabledTextColor(Color.BLACK);
		textField_20.setColumns(10);
		textField_20.setBounds(899, 105, 52, 30);
		panelScoreBoard.add(textField_20);

		textField_21 = new JTextField() {
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
		/**********************************************************/	
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_21.setDisabledTextColor(Color.BLACK);
		textField_21.setColumns(10);
		textField_21.setBounds(979, 105, 52, 30);
		panelScoreBoard.add(textField_21);

		textField_22 = new JTextField() {
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
		/**********************************************************/	
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_22.setDisabledTextColor(Color.BLACK);
		textField_22.setColumns(10);
		textField_22.setBounds(1049, 62, 52, 30);
		panelScoreBoard.add(textField_22);

		textField_23 = new JTextField() {
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
		/**********************************************************/	
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_23.setDisabledTextColor(Color.BLACK);
		textField_23.setColumns(10);
		textField_23.setBounds(1049, 105, 52, 30);
		panelScoreBoard.add(textField_23);

		textField_24 = new JTextField() {
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
		/**********************************************************/	
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_24.setDisabledTextColor(Color.BLACK);
		textField_24.setColumns(10);
		textField_24.setBounds(1123, 62, 52, 30);
		panelScoreBoard.add(textField_24);

		textField_25 = new JTextField() {
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
		/**********************************************************/	
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Consolas", Font.PLAIN, 18));
		textField_25.setDisabledTextColor(Color.BLACK);
		textField_25.setColumns(10);
		textField_25.setBounds(1123, 105, 52, 30);
		panelScoreBoard.add(textField_25);

		separator_4 = new JSeparator();
		separator_4.setOpaque(true);
		separator_4.setBorder(null);
		separator_4.setBackground(new Color(4, 10, 20, 70));
		separator_4.setBounds(963, 62, 3, 73);
		panelScoreBoard.add(separator_4);

		separator_5 = new JSeparator();
		separator_5.setOpaque(true);
		separator_5.setBorder(null);
		separator_5.setBackground(new Color(4, 10, 20, 70));
		separator_5.setBounds(258, 62, 3, 73);
		panelScoreBoard.add(separator_5);

		panel_2 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());

				g.fillRect(0, 0, getWidth(), getHeight());

				super.paintComponent(g);
			}
		};
		panel_2.setLayout(null);
		panel_2.setOpaque(false);
		panel_2.setBackground(new Color(0, 0, 0, 60));
		panel_2.setBounds(300, 236, 1188, 515);
		panelGameSimulation.add(panel_2);

		panelGameLocal = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());

				g.fillRect(0, 0, getWidth(), getHeight());

				super.paintComponent(g);
			}
		};
		panelGameLocal.setBounds(12, 64, 370, 393);
		panel_2.add(panelGameLocal);
		panelGameLocal.setLayout(null);
		panelGameLocal.setOpaque(false);
		panelGameLocal.setBackground(new Color(0, 0, 0, 60));

		scrollPaneLocal = new JScrollPane();
		scrollPaneLocal.setViewportBorder(null);
		scrollPaneLocal.setBorder(null);
		scrollPaneLocal.setBackground(new Color(0, 0, 0, 50));
		scrollPaneLocal.setBounds(0, 0, 370, 393);	
		scrollPaneLocal.getViewport().setBackground(new Color(0,0,0,60));
		panelGameLocal.add(scrollPaneLocal);

		tableGameLocal = new JTable();
		tableGameLocal.setForeground(new Color(255, 255, 255));
		tableGameLocal.setFont(new Font("Consolas", Font.BOLD, 16));
		tableGameLocal.setRowMargin(0);
		tableGameLocal.setFocusable(false);
		tableGameLocal.setRowHeight(26);
		tableGameLocal.setIntercellSpacing(new Dimension(0, 0));
		tableGameLocal.setGridColor(new Color(255, 255, 255));
		tableGameLocal.setShowVerticalLines(false);
		tableGameLocal.getTableHeader().setReorderingAllowed(false);
		tableGameLocal.setSelectionBackground(new Color(239, 108, 0));
		tableGameLocal.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 18));
		tableGameLocal.getTableHeader().setOpaque(false);

		tableGameLocal.getTableHeader().setBackground(new Color(255,255,255));
		tableGameLocal.setOpaque(false);
		tableGameLocal.setBackground(new Color(0,0,0,60));
		tableGameLocal.setModel(new DefaultTableModel(
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

		scrollPaneLocal.setViewportView(tableGameLocal);

		lblEquipoLocal = new JLabel("Equipo Local");
		lblEquipoLocal.setBounds(12, 13, 370, 31);
		panel_2.add(lblEquipoLocal);
		lblEquipoLocal.setBackground(new Color(0, 0, 0));
		lblEquipoLocal.setOpaque(true);
		lblEquipoLocal.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEquipoLocal.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipoLocal.setForeground(Color.WHITE);
		lblEquipoLocal.setFont(new Font("Consolas", Font.PLAIN, 20));

		panelGameVisitant = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		panelGameVisitant.setBounds(806, 64, 370, 393);
		panel_2.add(panelGameVisitant);
		panelGameVisitant.setOpaque(false);
		panelGameVisitant.setLayout(null);
		panelGameVisitant.setBackground(new Color(0, 0, 0, 60));

		scrollPaneVisit = new JScrollPane();
		scrollPaneVisit.setViewportBorder(null);
		scrollPaneVisit.setBorder(null);
		scrollPaneVisit.setBackground(new Color(0, 0, 0, 50));
		scrollPaneVisit.setBounds(0, 0, 370, 393);	
		scrollPaneVisit.getViewport().setBackground(new Color(0,0,0,60));
		panelGameVisitant.add(scrollPaneVisit);

		tableGameVisit = new JTable();
		tableGameVisit.setForeground(new Color(255, 255, 255));
		tableGameVisit.setFont(new Font("Consolas", Font.BOLD, 16));
		tableGameVisit.setRowMargin(0);
		tableGameVisit .setFocusable(false);
		tableGameVisit.setRowHeight(26);
		tableGameVisit.setIntercellSpacing(new Dimension(0, 0));
		tableGameVisit.setGridColor(new Color(255, 255, 255));
		tableGameVisit.setShowVerticalLines(false);
		tableGameVisit.getTableHeader().setReorderingAllowed(false);
		tableGameVisit.setSelectionBackground(new Color(239, 108, 0));
		tableGameVisit.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 18));
		tableGameVisit.getTableHeader().setOpaque(false);

		tableGameVisit.getTableHeader().setBackground(new Color(255,255,255));
		tableGameVisit.setOpaque(false);
		tableGameVisit.setBackground(new Color(0,0,0,60));
		tableGameVisit.setModel(new DefaultTableModel(
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
		scrollPaneVisit.setViewportView(tableGameVisit);

		lblEquipoVisitante = new JLabel("Equipo Visitante");
		lblEquipoVisitante.setBounds(806, 13, 370, 31);
		panel_2.add(lblEquipoVisitante);
		lblEquipoVisitante.setBackground(new Color(0, 0, 0));
		lblEquipoVisitante.setOpaque(true);
		lblEquipoVisitante.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEquipoVisitante.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipoVisitante.setForeground(Color.WHITE);
		lblEquipoVisitante.setFont(new Font("Consolas", Font.PLAIN, 20));

		lblDefensa = new JLabel("Equipo En Defensa");
		lblDefensa.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDefensa.setOpaque(true);
		lblDefensa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDefensa.setForeground(Color.WHITE);
		lblDefensa.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblDefensa.setBackground(Color.BLACK);
		lblDefensa.setBounds(410, 64, 370, 31);
		panel_2.add(lblDefensa);

		lblOfensiva = new JLabel("Equipo En Ofensiva");
		lblOfensiva.setVerticalAlignment(SwingConstants.BOTTOM);
		lblOfensiva.setOpaque(true);
		lblOfensiva.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfensiva.setForeground(Color.WHITE);
		lblOfensiva.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblOfensiva.setBackground(Color.BLACK);
		lblOfensiva.setBounds(410, 170, 370, 31);
		panel_2.add(lblOfensiva);

		lblBateador = new JLabel("Bateador Actual");
		lblBateador.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBateador.setOpaque(true);
		lblBateador.setHorizontalAlignment(SwingConstants.CENTER);
		lblBateador.setForeground(Color.WHITE);
		lblBateador.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblBateador.setBackground(Color.BLACK);
		lblBateador.setBounds(410, 275, 370, 31);
		panel_2.add(lblBateador);

		lblEquipDef = new JLabel("");
		lblEquipDef.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEquipDef.setOpaque(true);
		lblEquipDef.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipDef.setForeground(Color.WHITE);
		lblEquipDef.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblEquipDef.setBackground(Color.BLACK);
		lblEquipDef.setBounds(410, 108, 370, 49);
		panel_2.add(lblEquipDef);

		lblEquipOfen = new JLabel("");
		lblEquipOfen.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEquipOfen.setOpaque(true);
		lblEquipOfen.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipOfen.setForeground(Color.WHITE);
		lblEquipOfen.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblEquipOfen.setBackground(Color.BLACK);
		lblEquipOfen.setBounds(410, 213, 370, 49);
		panel_2.add(lblEquipOfen);

		lblBatAct = new JLabel("");
		lblBatAct.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBatAct.setOpaque(true);
		lblBatAct.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatAct.setForeground(Color.WHITE);
		lblBatAct.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblBatAct.setBackground(Color.BLACK);
		lblBatAct.setBounds(410, 319, 370, 49);
		panel_2.add(lblBatAct);;

		panelControlBateo = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());

				g.fillRect(0, 0, getWidth(), getHeight());

				super.paintComponent(g);
			}
		};
		panelControlBateo.setBounds(300, 764, 370, 100);
		panelGameSimulation.add(panelControlBateo);
		panelControlBateo.setLayout(null);
		panelControlBateo.setOpaque(false);
		panelControlBateo.setBackground(new Color(0, 0, 0, 60));

		btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player auxPlayer = Lidom.getInstance().searchPlayerByName(lblBateador.getText());
				//Para aumentar hits del que bateo.
				((Batter) auxPlayer).setNumeroHitparapromedio((((Batter)auxPlayer).getNumeroHitparapromedio()) + 1);
				((Batter) auxPlayer).setH1(((Batter)auxPlayer).getH1() + 1);

				incrementTurno();
				bateadorQueEstaBateando(lblEquipOfen.getText());

			}
		});
		btnH.setBounds(10, 50, 60, 37);
		panelControlBateo.add(btnH);
		btnH.setIconTextGap(5);
		btnH.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnH.setForeground(new Color(255, 255, 240));
		btnH.setFont(new Font("Consolas", Font.BOLD, 22));
		btnH.setBorder(null);
		btnH.setBackground(new Color(0,30,72));

		btnH_1 = new JButton("H2");
		btnH_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Player auxPlayer = Lidom.getInstance().searchPlayerByName(lblBateador.getText());
				//Para aumentar hits del que bateo.
				((Batter) auxPlayer).setNumeroHitparapromedio((((Batter)auxPlayer).getNumeroHitparapromedio()) + 1);
				((Batter) auxPlayer).setH2(((Batter)auxPlayer).getH2() + 1);

			}
		});
		btnH_1.setBounds(82, 50, 60, 37);
		panelControlBateo.add(btnH_1);
		btnH_1.setIconTextGap(5);
		btnH_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnH_1.setForeground(new Color(255, 255, 240));
		btnH_1.setFont(new Font("Consolas", Font.BOLD, 22));
		btnH_1.setBorder(null);
		btnH_1.setBackground(new Color(0,30,72));

		btnOut = new JButton("S.O");
		btnOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Player auxPlayer = Lidom.getInstance().searchPlayerByName(lblBateador.getText());
				//Para aumentar hits del que bateo.
				//	((Batter) auxPlayer).setNumeroHitparapromedio((((Batter)auxPlayer).getNumeroHitparapromedio()) + 1);
				((Batter) auxPlayer).setStrikeOut(((Batter)auxPlayer).getStrikeOut() + 1);

			}
		});
		btnOut.setBounds(298, 50, 60, 37);
		panelControlBateo.add(btnOut);
		btnOut.setIconTextGap(5);
		btnOut.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnOut.setForeground(new Color(255, 255, 240));
		btnOut.setFont(new Font("Consolas", Font.BOLD, 22));
		btnOut.setBorder(null);
		btnOut.setBackground(new Color(0,30,72));

		btnHr = new JButton("HR");
		btnHr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Player auxPlayer = Lidom.getInstance().searchPlayerByName(lblBateador.getText());
				//Para aumentar hits del que bateo.
				((Batter) auxPlayer).setNumeroHitparapromedio((((Batter)auxPlayer).getNumeroHitparapromedio()) + 1);
				((Batter) auxPlayer).setHR(((Batter)auxPlayer).getHR() + 1);
			}
		});
		btnHr.setBounds(226, 50, 60, 37);
		panelControlBateo.add(btnHr);
		btnHr.setIconTextGap(5);
		btnHr.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnHr.setForeground(new Color(255, 255, 240));
		btnHr.setFont(new Font("Consolas", Font.BOLD, 22));
		btnHr.setBorder(null);
		btnHr.setBackground(new Color(0,30,72));

		btnH_2 = new JButton("H3");
		btnH_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Player auxPlayer = Lidom.getInstance().searchPlayerByName(lblBateador.getText());
				//Para aumentar hits del que bateo.
				((Batter) auxPlayer).setNumeroHitparapromedio((((Batter)auxPlayer).getNumeroHitparapromedio()) + 1);
				((Batter) auxPlayer).setH3(((Batter)auxPlayer).getH3() + 1);
			}
		});
		btnH_2.setBounds(154, 50, 60, 37);
		panelControlBateo.add(btnH_2);
		btnH_2.setIconTextGap(5);
		btnH_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnH_2.setForeground(new Color(255, 255, 240));
		btnH_2.setFont(new Font("Consolas", Font.BOLD, 22));
		btnH_2.setBorder(null);
		btnH_2.setBackground(new Color(0,30,72));

		lblControlBateo = new JLabel("Control Bateo");
		lblControlBateo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblControlBateo.setOpaque(true);
		lblControlBateo.setHorizontalAlignment(SwingConstants.CENTER);
		lblControlBateo.setForeground(Color.WHITE);
		lblControlBateo.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblControlBateo.setBackground(Color.BLACK);
		lblControlBateo.setBounds(0, 0, 370, 31);
		panelControlBateo.add(lblControlBateo);

		panel_4 = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		panel_4.setBounds(715, 764, 370, 100);
		panelGameSimulation.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setOpaque(false);
		panel_4.setBackground(new Color(0, 0, 0, 60));

		btnCarrera = new JButton("CARRERA");
		btnCarrera.setIconTextGap(5);
		btnCarrera.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCarrera.setForeground(new Color(255, 255, 240));
		btnCarrera.setFont(new Font("Consolas", Font.BOLD, 22));
		btnCarrera.setBorder(null);
		btnCarrera.setBackground(new Color(0, 30, 72));
		btnCarrera.setBounds(36, 50, 130, 37);
		panel_4.add(btnCarrera);

		btnOut_1 = new JButton("OUT");
		btnOut_1.setIconTextGap(5);
		btnOut_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnOut_1.setForeground(new Color(255, 255, 240));
		btnOut_1.setFont(new Font("Consolas", Font.BOLD, 22));
		btnOut_1.setBorder(null);
		btnOut_1.setBackground(new Color(0, 30, 72));
		btnOut_1.setBounds(202, 50, 130, 37);
		panel_4.add(btnOut_1);

		lblControlInnin = new JLabel("Control Entrada");
		lblControlInnin.setVerticalAlignment(SwingConstants.BOTTOM);
		lblControlInnin.setOpaque(true);
		lblControlInnin.setHorizontalAlignment(SwingConstants.CENTER);
		lblControlInnin.setForeground(Color.WHITE);
		lblControlInnin.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblControlInnin.setBackground(Color.BLACK);
		lblControlInnin.setBounds(0, 0, 370, 31);
		panel_4.add(lblControlInnin);

		panel_5 = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		panel_5.setLayout(null);
		panel_5.setOpaque(false);
		panel_5.setBackground(new Color(0, 0, 0, 60));
		panel_5.setBounds(1118, 764, 370, 100);
		panelGameSimulation.add(panel_5);

		btnNa = new JButton("N/A");
		btnNa.setIconTextGap(5);
		btnNa.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNa.setForeground(new Color(255, 255, 240));
		btnNa.setFont(new Font("Consolas", Font.BOLD, 22));
		btnNa.setBorder(null);
		btnNa.setBackground(new Color(0, 30, 72));
		btnNa.setBounds(36, 50, 130, 37);
		panel_5.add(btnNa);

		btnNa_1 = new JButton("N/A");
		btnNa_1.setIconTextGap(5);
		btnNa_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNa_1.setForeground(new Color(255, 255, 240));
		btnNa_1.setFont(new Font("Consolas", Font.BOLD, 22));
		btnNa_1.setBorder(null);
		btnNa_1.setBackground(new Color(0, 30, 72));
		btnNa_1.setBounds(202, 50, 130, 37);
		panel_5.add(btnNa_1);

		lblFinalizarPartido = new JLabel("Finalizar Partido");
		lblFinalizarPartido.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFinalizarPartido.setOpaque(true);
		lblFinalizarPartido.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalizarPartido.setForeground(Color.WHITE);
		lblFinalizarPartido.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblFinalizarPartido.setBackground(Color.BLACK);
		lblFinalizarPartido.setBounds(0, 0, 370, 31);
		panel_5.add(lblFinalizarPartido);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/BgGameSimulation.png")));
		lblNewLabel.setBounds(0, 0, 1910, 957);
		panelGameSimulation.add(lblNewLabel);

		panel = new JPanel();
		panel.setBounds(85, 373, 449, 366);

		loadGameToday();
		

		h1 = new Thread(this);
		h1.start();
	}



	/****************************************/
	/* Metodos */

	private void setColorBlue (JButton button) {
		button.setBackground(new Color(21, 101, 192));
	}

	private void setColorOrange (JButton button) {
		button.setBackground(new Color(239, 108, 0));
	}

	private void resetColor (JButton button) {
		button.setBackground(new Color(0,30,72));
	}

	// metodo para abrir la ventana de admin equipo con los datos correspondientes.
	public static void manageTeamOpen(Team auxTeam) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		if (auxTeam!=null) {
			panelBgDashboard.setVisible(false);
			panelManageTeams.setVisible(true);
			panelLineUp.setVisible(false);


			lblNameTeam.setText(auxTeam.getName());
			lblEstadioTeam.setText(auxTeam.getStadium());
			lblFundadoTeam.setText(formatter.format(auxTeam.getFoundationDate()));
			lblManagerTeam.setText(auxTeam.getManager());


			String routetosave = "Fotos_Equipos/"+ auxTeam.getName() + ".png";
			/** to adjust image at size of JLabel **/
			ImageIcon fotoJugador = new ImageIcon(routetosave);
			Icon fotoJ = new ImageIcon(fotoJugador.getImage().getScaledInstance(lblLogoTeam.getWidth(), lblLogoTeam.getHeight(), Image.SCALE_SMOOTH));
			lblLogoTeam.setIcon(fotoJ);

		}
	}
	// Metodo para cargar la lista de jugadores de un equipo, roster.
	public static void loadRosterPlayerByTeam(Team team) {

		modelRoster= (DefaultTableModel) tableRoster.getModel();
		modelRoster.setRowCount(0);
		columnRoster = new Object[modelRoster.getColumnCount()];

		for (Player playerR : team.getRosterPlayers()) {
			if (!playerR.getLesionado()) {


				columnRoster[0] = playerR.getId();
				columnRoster[1] = playerR.getName() + " " + playerR.getLastname();

				if (playerR instanceof Pitcher) {
					columnRoster[2] = "P - " + ((Pitcher) playerR).getTipo();	
				}
				else if (playerR instanceof Batter) {
					columnRoster[2] = "B - " + ((Batter) playerR).getPosition();
				}
			}
			modelRoster.addRow(columnRoster);

		}

	}
	
	// Metodo para cargar la lista de jugadores lesionados de un equipo.
	public static void loadInjuryPlayerByTeam(Team team) {

		modelLesionados= (DefaultTableModel) tableLesionados.getModel();
		modelLesionados.setRowCount(0);
		columnLesionados = new Object[modelLesionados.getColumnCount()];

		for (Player playerR : team.getRosterPlayers()) {
			if (playerR.getLesionado()== true) {
                System.out.println("ENTRE LESIONADO");
				columnLesionados[0] = playerR.getId();
				columnLesionados[1] = playerR.getName() + " " + playerR.getLastname();
				modelLesionados.addRow(columnLesionados);
			}
			

		}

	}

	// Metodo para cargar la lista de jugadores de un equipo, roster.
	public static void loadLineUpPlayerByTeam(Team team, DefaultTableModel model, Object [] column, JTable table) {

		model= (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		column = new Object[model.getColumnCount()];

		for (Player playerR : team.getLineUp()) {
			column[0] = playerR.getId();
			column[1] = playerR.getName() + " " + playerR.getLastname();

			if (playerR instanceof Pitcher) {
				column[2] = "P - " + ((Pitcher) playerR).getTipo();	
			}
			else if (playerR instanceof Batter) {
				column[2] = "B - " + ((Batter) playerR).getPosition();
			}

			model.addRow(column);

		}

	}



	//Metodo para cargar la tabla de partidos de hoy del dashboard, ventana HOME.
	public static void loadGameToday() {

		modelGameToday= (DefaultTableModel) tablePartidosHoy.getModel();
		modelGameToday.setRowCount(0);
		columnGameToday = new Object[modelGameToday.getColumnCount()];

		for (Game auxGame : Lidom.getInstance().getListGame()) {
			Locale spanishLocale = new Locale("es", "ES");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy", spanishLocale);
			//Dando formato para comparar fecha local de la maquina;
			Date auxDateLocal = new Date();
			SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MMMM-yyyy", spanishLocale);
			String dateLocalString = formatter1.format(auxDateLocal); //local date en string.

			String auxDateGame = auxGame.getDate(); // date of game.


			if (dateLocalString.equalsIgnoreCase(auxDateGame)) {

				columnGameToday[0] = auxGame.getHomeTeam();
				columnGameToday[1] = auxGame.getAwayTeam();
				columnGameToday[2] = auxGame.getStadium();
				columnGameToday[3] = auxGame.getDate();
				columnGameToday[4] = auxGame.getHora();

				if (auxGame.getAwayRun() == 0 && auxGame.getHomeRun() == 0) {
					columnGameToday[5] = "n/a";
				}
				else {
					columnGameToday[5] = auxGame.getHomeRun() + " - " +auxGame.getAwayRun();
				}
				modelGameToday.addRow(columnGameToday);

			}		
		}		
	}

	public void gameSimulationOpen(String local, String visitante, Game myGame) {

		Team auxEquipoLocal = Lidom.getInstance().searchTeamByName(local);
		Team auxEquipoVisitante = Lidom.getInstance().searchTeamByName(visitante);

		txtEquipLocal.setText(auxEquipoLocal.getName());
		txtEquipVisi.setText(auxEquipoVisitante.getName());
		loadLineUpPlayerByTeam(auxEquipoLocal, modelGameLocal, columnGameLocal, tableGameLocal);
		loadLineUpPlayerByTeam(auxEquipoVisitante, modelGameVisit, columnGameVisit, tableGameVisit);
		lblEquipOfen.setText(auxEquipoVisitante.getName());
		bateadorQueEstaBateando(visitante);



	}



	public void bateadorQueEstaBateando(String teamOfensive) {

		Team auxEquipoBateando = Lidom.getInstance().searchTeamByName(teamOfensive);
		lblBatAct.setText(auxEquipoBateando.getLineUp().get(turno).getName()+" "+
				auxEquipoBateando.getLineUp().get(turno).getLastname());



	}

	public void incrementTurno() {
		if (turno > 8) {
			turno = 0;

		}
		else {

			turno++;
		}
	}

	private static String modifyDate(Date date, int day) { // Metodo auxiliar para modificar la fecha, sumar dias o restar dias.

		Calendar calendar = Calendar.getInstance();
		Locale spanishLocale = new Locale("es", "ES");
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, day);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy",spanishLocale);
		String dateString = formatter.format(calendar.getTime());

		return dateString;
	}

	public static int random(int min, int max){
		randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}

	public static void generarPartidos() {

		/*************** para generar partidos automaticamente  *******/
		/* genera una serie completa */

		int cantByTeam = Lidom.getInstance().getListTeams().size() * 2 - 2;
		int posEquipo = 0;

		while (posEquipo < Lidom.getInstance().getListTeams().size()) {

			for (int i = 0; i <= cantByTeam/2; i++) {

				if (posEquipo != i && posEquipo == 0) {

					Game newgame0 = new Game(Lidom.getInstance().getListTeams().get(posEquipo).getName(),Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getStadium());
					Game newgame1 = new Game(Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getName(), Lidom.getInstance().getListTeams().get(i).getStadium());
					Lidom.getInstance().addGame(newgame0);
					Lidom.getInstance().addGame(newgame1);

				}
				if (posEquipo != i && posEquipo == 1 && i > 1) {

					Game newgame0 = new Game(Lidom.getInstance().getListTeams().get(posEquipo).getName(),Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getStadium());
					Game newgame1 = new Game(Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getName(), Lidom.getInstance().getListTeams().get(i).getStadium());
					Lidom.getInstance().addGame(newgame0);
					Lidom.getInstance().addGame(newgame1);

				}
				if (posEquipo != i && posEquipo == 2 && i > 2) {


					Game newgame0 = new Game(Lidom.getInstance().getListTeams().get(posEquipo).getName(),Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getStadium());
					Game newgame1 = new Game(Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getName(), Lidom.getInstance().getListTeams().get(i).getStadium());
					Lidom.getInstance().addGame(newgame0);
					Lidom.getInstance().addGame(newgame1);

				}

				if (posEquipo != i && posEquipo == 3 && i > 3) {


					Game newgame0 = new Game(Lidom.getInstance().getListTeams().get(posEquipo).getName(),Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getStadium());
					Game newgame1 = new Game(Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getName(), Lidom.getInstance().getListTeams().get(i).getStadium());
					Lidom.getInstance().addGame(newgame0);
					Lidom.getInstance().addGame(newgame1);

				}

				if (posEquipo != i && posEquipo == 4 && i > 4) {

					Game newgame0 = new Game(Lidom.getInstance().getListTeams().get(posEquipo).getName(),Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getStadium());
					Game newgame1 = new Game(Lidom.getInstance().getListTeams().get(i).getName(),Lidom.getInstance().getListTeams().get(posEquipo).getName(), Lidom.getInstance().getListTeams().get(i).getStadium());
					Lidom.getInstance().addGame(newgame0);
					Lidom.getInstance().addGame(newgame1);

				}

			}
			posEquipo++;
		}


	}

	public static void agregarFechaHoraPartido() throws ParseException {

		Date dateJuego = new Date();
		Locale spanishLocale = new Locale("es", "ES");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy", spanishLocale);
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MMMM-yyyy", spanishLocale);
		String dateJuegoFinString = modifyDate(dateJuego, 30); // para sumar 30 dias a partir de la fecha en que se genere el partido
		Date dateJuegoFin = formatter1.parse(dateJuegoFinString);
		ThreadLocalRandom r =ThreadLocalRandom.current();

		for (Game g : Lidom.getInstance().getListGame()) {
			Date rnd = new Date(r.nextLong(dateJuego.getTime(), dateJuegoFin.getTime()));
			String datePut = formatter.format(rnd);
			g.setDate(datePut);
			g.setHora(String.valueOf(random(1, 10))+ ":"+ String.valueOf(random(0, 5))+String.valueOf(random(0, 9))+ " P.M.");
		}
	}

	public void showRealTimeAndDate() {
		Calendar cale = new GregorianCalendar();
		day = cale.get(Calendar.DAY_OF_MONTH);
		mont = cale.get(Calendar.MONTH);
		year = cale.get(Calendar.YEAR);

		hour = cale.get(Calendar.HOUR);
		minute = cale.get(Calendar.MINUTE);
		second = cale.get(Calendar.SECOND);
	}

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		while (ct == h1) {

			showRealTimeAndDate();

			lblDate.setText(day + " - " + (mont+1) + " - " + year);
			lblTime.setText(hour + " : " + minute + " : " + second);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}
}
