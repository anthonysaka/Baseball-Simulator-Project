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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import Animacion.Animacion;
import backEnd.Batter;
import backEnd.Game;
import backEnd.Lidom;
import backEnd.Pitcher;
import backEnd.Player;
import backEnd.Team;
import sun.util.locale.provider.AuxLocaleProviderAdapter;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

import com.sun.javafx.geom.transform.CanTransformVec3d;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;

public class Home extends JFrame implements Runnable {

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

	private JPanel panel;
	private static JPanel panelBgDashboard;
	private JLabel lblPlay_Blur;
	private static JTable tablePartidosHoy;
	private static JTable tableGameVisit;
	private static JTable tableGameLocal;

	public static DefaultTableModel modelLineUp;

	private static DefaultTableModel modelGameToday;
	private static DefaultTableModel modelGameLocal;
	private static DefaultTableModel modelGameVisit;


	public static Object[] columnLineUp;

	private static Object[] columnGameToday;
	private static Object[] columnGameLocal;
	private static Object[] columnGameVisit;
	private JButton btnHome;

	private JButton btnPartidos;
	private JPanel panelPartidosDashboard;
	private JPanel panelMenuPartidos;
	private JButton btnBoxScores;
	private JButton btnButtonsNa;
	private JButton btnButtonNa;
	private JPanel panelPartidoHoy;
	private JPanel panel_3;
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

	private JLabel label_2;

	private JLabel label_3;
	private JLabel label_4;

	private JLabel label_5;
	private JLabel label_6;

	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel lblR;

	
	private static JTextField txtIni1Visit;
	private  static JTextField txtIni2Visit;
	private  static JTextField txtIni3Visit;
	private  static JTextField txtIni4Visit;
	private  static JTextField txtIni5Visit;
	private  static JTextField txtIni6Visit;
	private  static JTextField txtIni7Visit;
	private  static JTextField txtIni8Visit;
	private  static JTextField txtIni9Visit;

	private  static JTextField txtEquipLocal;
	private static  JTextField txtIni1Local;
	private  static JTextField txtIni2Local;
	private  static JTextField txtIni3Local;
	private  static JTextField txtIni4Local;
	private static  JTextField txtIni5Local;
	private  static JTextField txtIni6Local;
	private  static JTextField txtIni7Local;
	private static  JTextField txtIni8Local;
	private static  JTextField txtIni9Local;
	private JLabel lblH;
	private JLabel lblE;


	private JTextField txtHitsVisita;
	private JTextField txtHitsLocal;
	private JTextField txtErroresVisita;
	private JTextField txtErroresLocal;
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
	private JButton btnCarreraControl;
	private JButton btnOutControl;
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

	private JButton btnListar;
	private JPanel panel_1;
	private static JLabel lblName;
	private static JLabel lblFotoJugador;
	private JLabel label_11;
	private JLabel lblEstadsticasBateadorEn;
	private JSeparator separator_3;
	private JLabel label_13;
	private static JTextField txtAVGb;
	private static JTextField txtH1b;
	private  JLabel label_14;
	private JLabel label_15;
	private static JTextField txtH2b;
	private JLabel label_16;
	private   static JTextField txtSBb;
	private  static JTextField txtRb;
	private JLabel label_17;
	private  static JTextField txtRBIb;
	private JLabel label_18;
	private  static JTextField txtH3b;
	private JLabel label_19;
	private JLabel label_20;
	private  static JTextField txtBBb;
	private  static JTextField txtSOb;
	private JLabel label_21;
	private  static JTextField txtHRb;
	private JLabel label_22;
	private static JLabel lblNumero;
	
	
	/*********** variables para el juego **********/
	
	public static int numberOut = 0;
	public static int turno=0;
	private static JTextField txtCarrerasLocal;
	private static JTextField txtCarerasVisita;
	private static int carrerasPorInningLocal = 0;
	private static int carrerasPorInningVisita = 0;
	private JLabel lblNewLabel_1;
	
	private  static int i = 0 ;
	
	/********************************************/



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
				int xOption	= JOptionPane.showOptionDialog(null, "�Seguro que desea cerrar la aplicaci�n?", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

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
		panelMenuLateral.setBounds(0, 63, 400, 957);
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
		btnButtonNa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayersStatistics p = new PlayersStatistics();
				p.setModal(true);
				p.setVisible(true);
			}
		});
		btnButtonNa.setIconTextGap(5);
		btnButtonNa.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnButtonNa.setForeground(new Color(255, 255, 240));
		btnButtonNa.setFont(new Font("Consolas", Font.BOLD, 22));
		btnButtonNa.setBorder(null);
		btnButtonNa.setBackground(new Color(4, 10, 20));
		btnButtonNa.setBounds(12, 348, 307, 37);
		panelMenuLateral.add(btnButtonNa);
		panelMenuEstadio.setBounds(693, 50, 170, 77);
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
		panelMenuEquipo.setBounds(329, 50, 170, 141);
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
					JOptionPane.showOptionDialog(null, "No hay estadio. Debe existir 1 estadio m�nimo.", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
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
		panelMenuJugadores.setBounds(511, 50, 170, 77);
		panelBackGround.add(panelMenuJugadores);
		panelMenuJugadores.setLayout(null);

		btnRegistrarPlayer = new JButton("Registrar");
		btnRegistrarPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {



				String[] options = {"Ok"};
				ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));

				if (backEnd.Lidom.getInstance().getListTeams().size() > 0) {
					AddPlayer newPlayer = new AddPlayer(null,null);
					newPlayer.setModal(true);
					newPlayer.setVisible(true);

				}else {
					JOptionPane.showOptionDialog(null, "No hay equipo. Debe existir 1 equipo m�nimo.", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
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
		tablePartidosHoy.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);


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
		tablePartidosHoy.getColumnModel().getColumn(0).setPreferredWidth(120);
		tablePartidosHoy.getColumnModel().getColumn(1).setPreferredWidth(120);
		tablePartidosHoy.getColumnModel().getColumn(2).setPreferredWidth(125);
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
					if (verificarEquipoLineUp(equipoLocal, equipoVisitante) == true) {
						panelBgDashboard.setVisible(false);
						panelGameSimulation.setVisible(true);
						btnMenu.setEnabled(false);
						btnHome.setEnabled(false);
						btnJugadores.setEnabled(false);
						btnPartidos.setEnabled(false);
						btnEquipos.setEnabled(false);
						btnEstadios.setEnabled(false);
						gameSimulationOpen(equipoLocal, equipoVisitante, auxGame);

					} else {
						int answer = JOptionPane.showConfirmDialog(null,
								"El Line up de uno o ambos equipo no esta completo\n�Desea Verificar?", null,
								JOptionPane.YES_NO_OPTION);
						if (answer == JOptionPane.YES_OPTION) {
							SelectionTeamToManage sl = new SelectionTeamToManage();
							sl.setModal(true);
							sl.setVisible(true);
						}
					}

				} else {
					JOptionPane.showMessageDialog(null, "El Partido ya est� finalizado.", "Error",
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

		panelPartidosDashboard.setBounds(1283, 13, 590, 883);
		panelBgDashboard.add(panelPartidosDashboard);
		panelPartidosDashboard.setLayout(null);

		lblPlay_Blur = new JLabel("");
		lblPlay_Blur.setBounds(0, 0, 1910, 957);
		panelBgDashboard.add(lblPlay_Blur);
		/** to adjust image at size of JLabel **/
		ImageIcon bgPlay = new ImageIcon(getClass().getResource("/iconos_imagenes/fondoPlay.png"));
		Icon play = new ImageIcon(bgPlay.getImage().getScaledInstance(lblPlay_Blur.getWidth(), lblPlay_Blur.getHeight(), Image.SCALE_SMOOTH));
		lblPlay_Blur.setIcon(play);
		/** to adjust image at size of JLabel **/
		ImageIcon bgLinePlay = new ImageIcon(getClass().getResource("/iconos_imagenes/Baseball_diamond_clean.png"));

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

		txtIni1Visit = new JTextField() {
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
		txtIni1Visit.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni1Visit.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni1Visit.setDisabledTextColor(Color.BLACK);
		txtIni1Visit.setColumns(10);
		txtIni1Visit.setBounds(275, 62, 52, 30);
		panelScoreBoard.add(txtIni1Visit);

		txtIni2Visit = new JTextField() {
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
		txtIni2Visit.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni2Visit.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni2Visit.setDisabledTextColor(Color.BLACK);
		txtIni2Visit.setColumns(10);
		txtIni2Visit.setBounds(353, 62, 52, 30);
		panelScoreBoard.add(txtIni2Visit);

		label_2 = new JLabel("2");
		label_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_2.setBounds(353, 28, 52, 31);
		panelScoreBoard.add(label_2);

		txtIni3Visit = new JTextField() {
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
		txtIni3Visit.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni3Visit.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni3Visit.setDisabledTextColor(Color.BLACK);
		txtIni3Visit.setColumns(10);
		txtIni3Visit.setBounds(431, 62, 52, 30);
		panelScoreBoard.add(txtIni3Visit);

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

		txtIni4Visit = new JTextField() {
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
		txtIni4Visit.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni4Visit.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni4Visit.setDisabledTextColor(Color.BLACK);
		txtIni4Visit.setColumns(10);
		txtIni4Visit.setBounds(509, 62, 52, 30);
		panelScoreBoard.add(txtIni4Visit);

		txtIni5Visit = new JTextField() {
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
		txtIni5Visit.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni5Visit.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni5Visit.setDisabledTextColor(Color.BLACK);
		txtIni5Visit.setColumns(10);
		txtIni5Visit.setBounds(587, 62, 52, 30);
		panelScoreBoard.add(txtIni5Visit);

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

		txtIni6Visit = new JTextField() {
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
		txtIni6Visit.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni6Visit.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni6Visit.setDisabledTextColor(Color.BLACK);
		txtIni6Visit.setColumns(10);
		txtIni6Visit.setBounds(665, 62, 52, 30);
		panelScoreBoard.add(txtIni6Visit);

		txtIni7Visit = new JTextField() {
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
		txtIni7Visit.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni7Visit.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni7Visit.setDisabledTextColor(Color.BLACK);
		txtIni7Visit.setColumns(10);
		txtIni7Visit.setBounds(743, 62, 52, 30);
		panelScoreBoard.add(txtIni7Visit);

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

		txtIni8Visit = new JTextField() {
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
		txtIni8Visit.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni8Visit.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni8Visit.setDisabledTextColor(Color.BLACK);
		txtIni8Visit.setColumns(10);
		txtIni8Visit.setBounds(821, 62, 52, 30);
		panelScoreBoard.add(txtIni8Visit);

		txtIni9Visit = new JTextField() {
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
		txtIni9Visit.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni9Visit.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni9Visit.setDisabledTextColor(Color.BLACK);
		txtIni9Visit.setColumns(10);
		txtIni9Visit.setBounds(899, 62, 52, 30);
		panelScoreBoard.add(txtIni9Visit);

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

		txtCarerasVisita = new JTextField() {
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
		txtCarerasVisita.setHorizontalAlignment(SwingConstants.CENTER);
		txtCarerasVisita.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtCarerasVisita.setDisabledTextColor(Color.BLACK);
		txtCarerasVisita.setColumns(10);
		txtCarerasVisita.setBounds(979, 62, 52, 30);
		panelScoreBoard.add(txtCarerasVisita);

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

		txtIni1Local = new JTextField() {
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
		txtIni1Local.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni1Local.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni1Local.setDisabledTextColor(Color.BLACK);
		txtIni1Local.setColumns(10);
		txtIni1Local.setBounds(275, 105, 52, 30);
		panelScoreBoard.add(txtIni1Local);

		txtIni2Local = new JTextField() {
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
		txtIni2Local.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni2Local.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni2Local.setDisabledTextColor(Color.BLACK);
		txtIni2Local.setColumns(10);
		txtIni2Local.setBounds(353, 105, 52, 30);
		panelScoreBoard.add(txtIni2Local);

		txtIni3Local = new JTextField() {
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
		txtIni3Local.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni3Local.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni3Local.setDisabledTextColor(Color.BLACK);
		txtIni3Local.setColumns(10);
		txtIni3Local.setBounds(431, 105, 52, 30);
		panelScoreBoard.add(txtIni3Local);

		txtIni4Local = new JTextField() {
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
		txtIni4Local.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni4Local.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni4Local.setDisabledTextColor(Color.BLACK);
		txtIni4Local.setColumns(10);
		txtIni4Local.setBounds(509, 105, 52, 30);
		panelScoreBoard.add(txtIni4Local);

		txtIni5Local = new JTextField() {
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
		txtIni5Local.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni5Local.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni5Local.setDisabledTextColor(Color.BLACK);
		txtIni5Local.setColumns(10);
		txtIni5Local.setBounds(587, 105, 52, 30);
		panelScoreBoard.add(txtIni5Local);

		txtIni6Local = new JTextField() {
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
		txtIni6Local.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni6Local.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni6Local.setDisabledTextColor(Color.BLACK);
		txtIni6Local.setColumns(10);
		txtIni6Local.setBounds(665, 105, 52, 30);
		panelScoreBoard.add(txtIni6Local);

		txtIni7Local = new JTextField() {
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
		txtIni7Local.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni7Local.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni7Local.setDisabledTextColor(Color.BLACK);
		txtIni7Local.setColumns(10);
		txtIni7Local.setBounds(743, 105, 52, 30);
		panelScoreBoard.add(txtIni7Local);

		txtIni8Local = new JTextField() {
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
		txtIni8Local.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni8Local.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni8Local.setDisabledTextColor(Color.BLACK);
		txtIni8Local.setColumns(10);
		txtIni8Local.setBounds(821, 105, 52, 30);
		panelScoreBoard.add(txtIni8Local);

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

		txtIni9Local = new JTextField() {
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
		txtIni9Local.setHorizontalAlignment(SwingConstants.CENTER);
		txtIni9Local.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtIni9Local.setDisabledTextColor(Color.BLACK);
		txtIni9Local.setColumns(10);
		txtIni9Local.setBounds(899, 105, 52, 30);
		panelScoreBoard.add(txtIni9Local);

		txtCarrerasLocal = new JTextField() {
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
		txtCarrerasLocal.setHorizontalAlignment(SwingConstants.CENTER);
		txtCarrerasLocal.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtCarrerasLocal.setDisabledTextColor(Color.BLACK);
		txtCarrerasLocal.setColumns(10);
		txtCarrerasLocal.setBounds(979, 105, 52, 30);
		panelScoreBoard.add(txtCarrerasLocal);

		txtHitsVisita = new JTextField() {
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
		txtHitsVisita.setHorizontalAlignment(SwingConstants.CENTER);
		txtHitsVisita.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtHitsVisita.setDisabledTextColor(Color.BLACK);
		txtHitsVisita.setColumns(10);
		txtHitsVisita.setBounds(1049, 62, 52, 30);
		panelScoreBoard.add(txtHitsVisita);

		txtHitsLocal = new JTextField() {
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
		txtHitsLocal.setHorizontalAlignment(SwingConstants.CENTER);
		txtHitsLocal.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtHitsLocal.setDisabledTextColor(Color.BLACK);
		txtHitsLocal.setColumns(10);
		txtHitsLocal.setBounds(1049, 105, 52, 30);
		panelScoreBoard.add(txtHitsLocal);

		txtErroresVisita = new JTextField() {
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
		txtErroresVisita.setHorizontalAlignment(SwingConstants.CENTER);
		txtErroresVisita.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtErroresVisita.setDisabledTextColor(Color.BLACK);
		txtErroresVisita.setColumns(10);
		txtErroresVisita.setBounds(1123, 62, 52, 30);
		panelScoreBoard.add(txtErroresVisita);

		txtErroresLocal = new JTextField() {
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
		txtErroresLocal.setHorizontalAlignment(SwingConstants.CENTER);
		txtErroresLocal.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtErroresLocal.setDisabledTextColor(Color.BLACK);
		txtErroresLocal.setColumns(10);
		txtErroresLocal.setBounds(1123, 105, 52, 30);
		panelScoreBoard.add(txtErroresLocal);

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
		lblEquipoLocal.setBackground(new Color(0, 30,72));
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
		lblEquipoVisitante.setBackground(new Color(0, 30,72));
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
		lblDefensa.setBackground(new Color(0, 30,72));
		lblDefensa.setBounds(410, 64, 370, 31);
		panel_2.add(lblDefensa);

		lblOfensiva = new JLabel("Equipo En Ofensiva");
		lblOfensiva.setVerticalAlignment(SwingConstants.BOTTOM);
		lblOfensiva.setOpaque(true);
		lblOfensiva.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfensiva.setForeground(Color.WHITE);
		lblOfensiva.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblOfensiva.setBackground(new Color(0, 30,72));
		lblOfensiva.setBounds(410, 170, 370, 31);
		panel_2.add(lblOfensiva);

		lblBateador = new JLabel("Bateador Actual");
		lblBateador.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBateador.setOpaque(true);
		lblBateador.setHorizontalAlignment(SwingConstants.CENTER);
		lblBateador.setForeground(Color.WHITE);
		lblBateador.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblBateador.setBackground(new Color(0, 30,72));
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
				incrementTurno();
				Team auxEquipoBateando = Lidom.getInstance().searchTeamByName(lblEquipOfen.getText());
				String codePlayer = auxEquipoBateando.getLineUp().get(turno).getId();
				loadStatsSimulationPlayer(codePlayer);
				loadPerfilPlayerSimulation(codePlayer);
				bateadorQueEstaBateando(lblEquipOfen.getText());

				Player auxPlayer = Lidom.getInstance().searchPlayerByID(codePlayer);

				if (auxPlayer instanceof Batter) {
					//	((Batter) auxPlayer).setNumeroHitparapromedio(0); //Para aumentar hits del que bateo, para avg.
					((Batter) auxPlayer).setH1(((Batter)auxPlayer).getH1() + 1); // para aumentar numeros de h1.
					((Batter) auxPlayer).setTurnos(((Batter) auxPlayer).getTurnos() + 1); // para aumentar cantidad de turnos.
				}






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
				incrementTurno();
				Team auxEquipoBateando = Lidom.getInstance().searchTeamByName(lblEquipOfen.getText());
				String codePlayer = auxEquipoBateando.getLineUp().get(turno).getId();
				//	loadStatsSimulationPlayer(codePlayer);
				loadPerfilPlayerSimulation(codePlayer);
				bateadorQueEstaBateando(lblEquipOfen.getText());

				Player auxPlayer = Lidom.getInstance().searchPlayerByID(codePlayer);

				if (auxPlayer instanceof Batter) {
					//	((Batter) auxPlayer).setNumeroHitparapromedio(0); //Para aumentar hits del que bateo, para avg.
					((Batter) auxPlayer).setH1(((Batter)auxPlayer).getH2() + 1); // para aumentar numeros de h1.
					((Batter) auxPlayer).setTurnos(((Batter) auxPlayer).getTurnos() + 1); // para aumentar cantidad de turnos.
				}

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
				incrementTurno();
				Team auxEquipoBateando = Lidom.getInstance().searchTeamByName(lblEquipOfen.getText());
				String codePlayer = auxEquipoBateando.getLineUp().get(turno).getId();
				loadPerfilPlayerSimulation(codePlayer);
				bateadorQueEstaBateando(lblEquipOfen.getText());

				Player auxPlayer = Lidom.getInstance().searchPlayerByID(codePlayer);

				if (auxPlayer instanceof Batter) {
					//	((Batter) auxPlayer).setNumeroHitparapromedio(0); //Para aumentar hits del que bateo, para avg.
					((Batter) auxPlayer).setH1(((Batter)auxPlayer).getStrikeOut() + 1); // para aumentar numeros de h1.
					((Batter) auxPlayer).setTurnos(((Batter) auxPlayer).getTurnos() + 1); // para aumentar cantidad de turnos.
				}
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
				incrementTurno();
				Team auxEquipoBateando = Lidom.getInstance().searchTeamByName(lblEquipOfen.getText());
				String codePlayer = auxEquipoBateando.getLineUp().get(turno).getId();
				loadPerfilPlayerSimulation(codePlayer);
				bateadorQueEstaBateando(lblEquipOfen.getText());

				Player auxPlayer = Lidom.getInstance().searchPlayerByID(codePlayer);

				if (auxPlayer instanceof Batter) {
					//	((Batter) auxPlayer).setNumeroHitparapromedio(0); //Para aumentar hits del que bateo, para avg.
					((Batter) auxPlayer).setH1(((Batter)auxPlayer).getHR() + 1); // para aumentar numeros de h1.
					((Batter) auxPlayer).setTurnos(((Batter) auxPlayer).getTurnos() + 1); // para aumentar cantidad de turnos.
				}
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
				incrementTurno();
				Team auxEquipoBateando = Lidom.getInstance().searchTeamByName(lblEquipOfen.getText());
				String codePlayer = auxEquipoBateando.getLineUp().get(turno).getId();
				loadPerfilPlayerSimulation(codePlayer);
				bateadorQueEstaBateando(lblEquipOfen.getText());
				Player auxPlayer = Lidom.getInstance().searchPlayerByID(codePlayer);

				if (auxPlayer instanceof Batter) {
					//	((Batter) auxPlayer).setNumeroHitparapromedio(0); //Para aumentar hits del que bateo, para avg.
					((Batter) auxPlayer).setH1(((Batter)auxPlayer).getH3() + 1); // para aumentar numeros de h1.
					((Batter) auxPlayer).setTurnos(((Batter) auxPlayer).getTurnos() + 1); // para aumentar cantidad de turnos.
				}
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
		lblControlBateo.setBackground(new Color(0, 30,72));
		lblControlBateo.setBounds(0, 0, 370, 31);
		panelControlBateo.add(lblControlBateo);

		panel_4 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());

				g.fillRect(0, 0, getWidth(), getHeight());

				super.paintComponent(g);

			}
		};
		panel_4.setBounds(715, 764, 370, 100);
		panelGameSimulation.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setOpaque(false);
		panel_4.setBackground(new Color(0, 0, 0, 60));

		btnCarreraControl = new JButton("CARRERA");
		btnCarreraControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//numberOut % 2 == 0
			
				if ( i < 3) { // para visita
					auxGame.setAwayRun(auxGame.getAwayRun() + 1);
					carrerasPorInningVisita++;
					carrerasPorInningLocal = 0;
					loadBoxScoreGameSimulation(auxGame);
					
				}
				
				if (i < 6 && i >= 3) {
					auxGame.setHomeRun(auxGame.getHomeRun() + 1);
					carrerasPorInningLocal++;
					carrerasPorInningVisita = 0;
					loadBoxScoreGameSimulation(auxGame);
			
				}
				// para local			
			}
		});
		btnCarreraControl.setIconTextGap(5);
		btnCarreraControl.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCarreraControl.setForeground(new Color(255, 255, 240));
		btnCarreraControl.setFont(new Font("Consolas", Font.BOLD, 22));
		btnCarreraControl.setBorder(null);
		btnCarreraControl.setBackground(new Color(0, 30, 72));
		btnCarreraControl.setBounds(36, 50, 130, 37);
		panel_4.add(btnCarreraControl);

		btnOutControl = new JButton("OUT");
		btnOutControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				incrementOut();
				
				i++;
				if (i == 6 && carrerasPorInningLocal != 0) {
					carrerasPorInningLocal = 0;
					i=0;
					loadBoxScoreGameSimulationOut();
					
				}
				if (i == 3 && carrerasPorInningVisita != 0) {
					carrerasPorInningVisita = 0;
					loadBoxScoreGameSimulationOut();
			}
				lblNewLabel_1.setText(String.valueOf(numberOut));
				
				
			}
		});
		btnOutControl.setIconTextGap(5);
		btnOutControl.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnOutControl.setForeground(new Color(255, 255, 240));
		btnOutControl.setFont(new Font("Consolas", Font.BOLD, 22));
		btnOutControl.setBorder(null);
		btnOutControl.setBackground(new Color(0, 30, 72));
		btnOutControl.setBounds(202, 50, 130, 37);
		panel_4.add(btnOutControl);

		lblControlInnin = new JLabel("Control Entrada");
		lblControlInnin.setVerticalAlignment(SwingConstants.BOTTOM);
		lblControlInnin.setOpaque(true);
		lblControlInnin.setHorizontalAlignment(SwingConstants.CENTER);
		lblControlInnin.setForeground(Color.WHITE);
		lblControlInnin.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblControlInnin.setBackground(new Color(0, 30,72));
		lblControlInnin.setBounds(0, 0, 370, 31);
		panel_4.add(lblControlInnin);

		panel_5 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());

				g.fillRect(0, 0, getWidth(), getHeight());

				super.paintComponent(g);

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
		lblFinalizarPartido.setBackground(new Color(0, 30,72));
		lblFinalizarPartido.setBounds(0, 0, 370, 31);
		panel_5.add(lblFinalizarPartido);

		panel_1 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());

				g.fillRect(0, 0, getWidth(), getHeight());

				super.paintComponent(g);

			}
		};
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 0, 0, 60));
		panel_1.setBounds(1500, 13, 398, 509);
		panelGameSimulation.add(panel_1);

		lblName = new JLabel();
		lblName.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblName.setVerticalAlignment(SwingConstants.BOTTOM);
		lblName.setText("NOMBRE");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Consolas", Font.BOLD, 32));
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(12, 181, 374, 38);
		panel_1.add(lblName);

		lblFotoJugador = new JLabel("");
		lblFotoJugador.setToolTipText("LIDOM");
		lblFotoJugador.setOpaque(true);
		lblFotoJugador.setBackground(Color.BLACK);
		lblFotoJugador.setBounds(12, 13, 160, 160);
		panel_1.add(lblFotoJugador);

		label_11 = new JLabel();
		label_11.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_11.setVerticalAlignment(SwingConstants.BOTTOM);
		label_11.setText("#");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(new Color(255, 255, 255));
		label_11.setFont(new Font("Consolas", Font.BOLD, 32));
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(316, 130, 70, 38);
		panel_1.add(label_11);

		lblEstadsticasBateadorEn = new JLabel("Estad\u00EDsticas Bateador En Turno");
		lblEstadsticasBateadorEn.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblEstadsticasBateadorEn.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEstadsticasBateadorEn.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadsticasBateadorEn.setForeground(new Color(255, 255, 255));
		lblEstadsticasBateadorEn.setFont(new Font("Consolas", Font.BOLD, 20));
		lblEstadsticasBateadorEn.setBounds(12, 232, 374, 24);
		panel_1.add(lblEstadsticasBateadorEn);

		separator_3 = new JSeparator();
		separator_3.setOpaque(true);
		separator_3.setBorder(null);
		separator_3.setBackground(new Color(4, 10, 20));
		separator_3.setBounds(12, 269, 374, -8);
		panel_1.add(separator_3);

		label_13 = new JLabel("AVG");
		label_13.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_13.setVerticalAlignment(SwingConstants.BOTTOM);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(new Color(255, 255, 255));
		label_13.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_13.setBounds(12, 269, 85, 31);
		panel_1.add(label_13);
		/**********************************************************/		

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
		/**********************************************************/	
		txtH1b.setHorizontalAlignment(SwingConstants.CENTER);
		txtH1b.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtH1b.setEditable(false);
		txtH1b.setDisabledTextColor(Color.BLACK);
		txtH1b.setColumns(10);
		txtH1b.setBounds(204, 303, 85, 30);
		panel_1.add(txtH1b);

		label_14 = new JLabel("H1");
		label_14.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_14.setVerticalAlignment(SwingConstants.BOTTOM);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(new Color(255, 255, 255));
		label_14.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_14.setBounds(204, 269, 85, 31);
		panel_1.add(label_14);

		label_15 = new JLabel("H2");
		label_15.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_15.setVerticalAlignment(SwingConstants.BOTTOM);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(new Color(255, 255, 255));
		label_15.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_15.setBounds(301, 269, 85, 31);
		panel_1.add(label_15);

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
		/**********************************************************/	
		txtH2b.setHorizontalAlignment(SwingConstants.CENTER);
		txtH2b.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtH2b.setEditable(false);
		txtH2b.setDisabledTextColor(Color.BLACK);
		txtH2b.setColumns(10);
		txtH2b.setBounds(301, 303, 85, 30);
		panel_1.add(txtH2b);

		label_16 = new JLabel("SB");
		label_16.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_16.setVerticalAlignment(SwingConstants.BOTTOM);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(new Color(255, 255, 255));
		label_16.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_16.setBounds(204, 346, 85, 31);
		panel_1.add(label_16);

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
		/**********************************************************/	
		txtSBb.setHorizontalAlignment(SwingConstants.CENTER);
		txtSBb.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtSBb.setEditable(false);
		txtSBb.setDisabledTextColor(Color.BLACK);
		txtSBb.setColumns(10);
		txtSBb.setBounds(204, 380, 85, 30);
		panel_1.add(txtSBb);

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
		/**********************************************************/	
		txtRb.setHorizontalAlignment(SwingConstants.CENTER);
		txtRb.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtRb.setEditable(false);
		txtRb.setDisabledTextColor(Color.BLACK);
		txtRb.setColumns(10);
		txtRb.setBounds(109, 303, 85, 30);
		panel_1.add(txtRb);

		label_17 = new JLabel("R");
		label_17.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_17.setVerticalAlignment(SwingConstants.BOTTOM);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(new Color(255, 255, 255));
		label_17.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_17.setBounds(109, 269, 85, 31);
		panel_1.add(label_17);

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
		/**********************************************************/	
		txtRBIb.setHorizontalAlignment(SwingConstants.CENTER);
		txtRBIb.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtRBIb.setEditable(false);
		txtRBIb.setDisabledTextColor(Color.BLACK);
		txtRBIb.setColumns(10);
		txtRBIb.setBounds(301, 380, 85, 30);
		panel_1.add(txtRBIb);

		label_18 = new JLabel("RBI");
		label_18.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_18.setVerticalAlignment(SwingConstants.BOTTOM);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(new Color(255, 255, 255));
		label_18.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_18.setBounds(301, 346, 85, 31);
		panel_1.add(label_18);

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
		/**********************************************************/	
		txtH3b.setHorizontalAlignment(SwingConstants.CENTER);
		txtH3b.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtH3b.setEditable(false);
		txtH3b.setDisabledTextColor(Color.BLACK);
		txtH3b.setColumns(10);
		txtH3b.setBounds(12, 380, 85, 30);
		panel_1.add(txtH3b);

		label_19 = new JLabel("H3");
		label_19.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_19.setVerticalAlignment(SwingConstants.BOTTOM);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(new Color(255, 255, 255));
		label_19.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_19.setBounds(12, 346, 85, 31);
		panel_1.add(label_19);

		label_20 = new JLabel("BB");
		label_20.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_20.setVerticalAlignment(SwingConstants.BOTTOM);
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(new Color(255, 255, 255));
		label_20.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_20.setBounds(12, 423, 85, 31);
		panel_1.add(label_20);

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
		/**********************************************************/	
		txtBBb.setHorizontalAlignment(SwingConstants.CENTER);
		txtBBb.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtBBb.setEditable(false);
		txtBBb.setDisabledTextColor(Color.BLACK);
		txtBBb.setColumns(10);
		txtBBb.setBounds(12, 457, 85, 30);
		panel_1.add(txtBBb);

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
		/**********************************************************/	
		txtSOb.setHorizontalAlignment(SwingConstants.CENTER);
		txtSOb.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtSOb.setEditable(false);
		txtSOb.setDisabledTextColor(Color.BLACK);
		txtSOb.setColumns(10);
		txtSOb.setBounds(109, 457, 85, 30);
		panel_1.add(txtSOb);

		label_21 = new JLabel("SO");
		label_21.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_21.setVerticalAlignment(SwingConstants.BOTTOM);
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setForeground(new Color(255, 255, 255));
		label_21.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_21.setBounds(109, 423, 85, 31);
		panel_1.add(label_21);

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
		/**********************************************************/	
		txtHRb.setHorizontalAlignment(SwingConstants.CENTER);
		txtHRb.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtHRb.setEditable(false);
		txtHRb.setDisabledTextColor(Color.BLACK);
		txtHRb.setColumns(10);
		txtHRb.setBounds(109, 380, 85, 30);
		panel_1.add(txtHRb);

		label_22 = new JLabel("HR");
		label_22.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_22.setVerticalAlignment(SwingConstants.BOTTOM);
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(new Color(255, 255, 255));
		label_22.setFont(new Font("Consolas", Font.PLAIN, 20));
		label_22.setBounds(109, 346, 85, 31);
		panel_1.add(label_22);

		lblNumero = new JLabel("3B");
		lblNumero.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNumero.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNumero.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setForeground(new Color(255, 255, 255));
		lblNumero.setFont(new Font("Consolas", Font.BOLD, 32));
		lblNumero.setBackground(new Color(0, 30, 72));
		lblNumero.setBounds(184, 123, 70, 50);
		panel_1.add(lblNumero);

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
		txtAVGb.setBounds(12, 303, 85, 30);
		panel_1.add(txtAVGb);
		txtAVGb.setHorizontalAlignment(SwingConstants.CENTER);
		txtAVGb.setFont(new Font("Consolas", Font.PLAIN, 18));
		txtAVGb.setEditable(false);
		txtAVGb.setDisabledTextColor(Color.BLACK);
		txtAVGb.setColumns(10);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(65, 131, 143, 132);
		panelGameSimulation.add(lblNewLabel_1);

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

	public boolean verificarEquipoLineUp(String local, String visitante) {
		boolean correct = false;
		Team auxLocal = Lidom.getInstance().searchTeamByName(local);
		Team auxVisita = Lidom.getInstance().searchTeamByName(visitante);

		if (auxLocal.getLineUp().size() > 9 && auxVisita.getLineUp().size() > 9) {
			correct = true;

		}
		else{
			correct = false;
		}

		return correct;


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
		Team auxEquipoBateando = Lidom.getInstance().searchTeamByName(lblEquipOfen.getText());
		String codePlayer = auxEquipoBateando.getLineUp().get(turno).getId();
		Player auxPlayer = Lidom.getInstance().searchPlayerByID(codePlayer);
		((Batter) auxPlayer).setTurnos(((Batter) auxPlayer).getTurnos() + 1);
		loadPerfilPlayerSimulation(codePlayer);
		loadStatsSimulationPlayer(codePlayer);



	}

	public void bateadorQueEstaBateando(String teamOfensive) {

		Team auxEquipoBateando = Lidom.getInstance().searchTeamByName(teamOfensive);
		lblBatAct.setText(auxEquipoBateando.getLineUp().get(turno).getName()+" "+
				auxEquipoBateando.getLineUp().get(turno).getLastname());



	}

	public void incrementTurno() {
		if (turno > 7) {
			turno = 0;

		}
		else {

			turno++;
		}
	}
	
	public void incrementOut() {
		if (numberOut >= 54) {
			numberOut = 0;

		}
		else {

			numberOut++;
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

	//** BLOQUE CODIGO PARA MOSTRAR RELOJ Y FECHA ***//
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
	/*************/

	public static void loadPerfilPlayerSimulation(String codePlayer) {
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

			//	lblBT.setText(bat + "/" + mano);
		}
		else if (auxP instanceof Pitcher) {

			bat = "-";
			//		lblBT.setText( bat +"/" + mano);
		}

		//	lblPosion.setText(pos);
		//	lblPesoAlt.setText(auxP.getHeight()+"/"+auxP.getWeight());
		//	lblLugarNacimiento.setText(auxP.getBirthplace());
		//	Locale spanishLocale = new Locale("es", "ES");
		//	SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy", spanishLocale);
		//	lblFechaNacimiento.setText(formatter.format(auxP.getBirthdate()));

	}


	public static void loadStatsSimulationPlayer(String codePlayer) {
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
		}
		//		else if (auxP instanceof Pitcher) {
		//			txtWp.setText(String.valueOf(((Pitcher) auxP).getGameWin()));
		//			txtLp.setText(String.valueOf(((Pitcher) auxP).getGameLose()));
		//			txtERA.setText(String.valueOf(((Pitcher) auxP).getERA()));
		//			txtGp.setText(String.valueOf(((Pitcher) auxP).getPlayedGame()));
		//			txtGSp.setText(String.valueOf(((Pitcher) auxP).getStartedGame()));
		//			txtSVp.setText(String.valueOf(((Pitcher) auxP).getSavedGame()));
		//			txtHRp.setText(String.valueOf(((Pitcher) auxP).getNumberHR()));
		//			txtHp.setText(String.valueOf(((Pitcher) auxP).getNumberHit()));
		//			txtRp.setText(String.valueOf(((Pitcher) auxP).getNumberRun()));
		//			txtSOp.setText(String.valueOf(((Pitcher) auxP).getNumberStrikeOut()));
		//			txtIPp.setText(String.valueOf(((Pitcher) auxP).getIP()));
		//			txtAVGp.setText(String.valueOf(((Pitcher) auxP).getAverage()));
		//	}


	}
	
	public static void loadBoxScoreGameSimulation(Game game) {
		
		txtCarerasVisita.setText(String.valueOf(game.getAwayRun()));
		txtCarrerasLocal.setText(String.valueOf(game.getHomeRun()));
		
		if (numberOut < 3 && numberOut >= 0) {
			txtIni1Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut < 6 && numberOut >= 3) {
			txtIni1Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut < 9 && numberOut >= 6) {
			txtIni2Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut < 12 && numberOut >= 9) {
			txtIni2Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut < 15 && numberOut >= 12) {
			txtIni3Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut < 18 && numberOut >= 15) {
			txtIni3Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut < 21 && numberOut >= 18) {
			txtIni4Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut < 24 && numberOut >= 21) {
			txtIni4Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut < 27 && numberOut >= 24) {
			txtIni5Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut < 30 && numberOut >= 27) {
			txtIni5Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut < 33 && numberOut >= 30) {
			txtIni6Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut < 36 && numberOut >= 33) {
			txtIni6Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut < 39 && numberOut >= 36) {
			txtIni7Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut < 42 && numberOut >= 39) {
			txtIni7Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut < 45 && numberOut >= 42) {
			txtIni8Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut < 48 && numberOut >= 45) {
			txtIni8Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut < 51 && numberOut >= 48) {
			txtIni9Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut < 54 && numberOut >= 51) {
			txtIni9Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		

	}


public static void loadBoxScoreGameSimulationOut() {
		
		if (numberOut <= 3 && numberOut >= 0) {
			txtIni1Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut <= 6 && numberOut > 3) {
			txtIni1Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut <= 9 && numberOut > 6) {
			txtIni2Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut <= 12 && numberOut > 9) {
			txtIni2Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut <= 15 && numberOut > 12) {
			txtIni3Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut <= 18 && numberOut > 15) {
			txtIni3Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut <= 21 && numberOut > 18) {
			txtIni4Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut <= 24 && numberOut > 21) {
			txtIni4Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut <= 27 && numberOut > 24) {
			txtIni5Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut <= 30 && numberOut > 27) {
			txtIni5Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut <= 33 && numberOut > 30) {
			txtIni6Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut <= 36 && numberOut >33) {
			txtIni6Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut <= 39 && numberOut >36) {
			txtIni7Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut <= 42 && numberOut >39) {
			txtIni7Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut <= 45 && numberOut > 42) {
			txtIni8Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut <= 48 && numberOut > 45) {
			txtIni8Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		if (numberOut <= 51 && numberOut > 48) {
			txtIni9Visit.setText(String.valueOf(carrerasPorInningVisita));

		}
		if (numberOut <= 54 && numberOut > 51) {
			txtIni9Local.setText(String.valueOf(carrerasPorInningLocal));

		}
		

	}
}


