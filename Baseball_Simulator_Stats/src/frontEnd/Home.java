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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Home extends JFrame {

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
	private static JTable tableLineUp;
	private static JTable tableLesionados;
	private static JTable tablePartidosHoy;

	private static DefaultTableModel modelRoster;
	private static DefaultTableModel modelLineUp;
	private static DefaultTableModel modelLesionados;
	private static DefaultTableModel modelGameToday;

	private static Object[] columnRoster;
	private static Object[] columnLineUp;
	private static Object[] columnLesionados;
	private static Object[] columnGameToday;
	
	
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
	private JButton btnListarPartido;
	private JButton btnRegistrarPartido;
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
	}             /*    ESTA VENTANA SE LEVANTARA AUTOMATICAMENTE DESDE LA CLASE SplashScreen*/

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
				setColorBlue(btnEquipos);
				panelMenuEquipo.setVisible(true);
				if (panelMenuLateral.getX() >= 0) {
					Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);

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
				setColorBlue(btnJugadores);
				panelMenuJugadores.setVisible(true);
				if (panelMenuLateral.getX() >= 0) {
					Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);

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
				setColorBlue(btnEstadios);
				panelMenuEstadio.setVisible(true);
				if (panelMenuLateral.getX() >= 0) {
					Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);

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
				setColorBlue(btnHome);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnHome);
			}
		});

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnPartidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//	panelMenuJugadores.setSize(170,218);
				setColorBlue(btnPartidos);
				panelMenuPartidos.setVisible(true);
				if (panelMenuLateral.getX() >= 0) {
					Animacion.mover_izquierda(0, -400, 3, 3, panelMenuLateral);	
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
		panelMenuEstadio.setBounds(693, 50, 170, 141);
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
		panelMenuJugadores.setBounds(511, 50, 170, 141);
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
		panelMenuPartidos.setBounds(875, 50, 170, 141);
		panelBackGround.add(panelMenuPartidos);
		panelMenuPartidos.setLayout(null);

		btnListarPartido = new JButton("Listar");
		btnListarPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewGame listGame = new ViewGame();
				listGame.setModal(true);
				listGame.setVisible(true);
				
			}
		});
		btnListarPartido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListarPartido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColorBlue(btnPartidos);
				setColorOrange(btnListarPartido);
				panelMenuPartidos.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnListarPartido);
				resetColor(btnPartidos);
				panelMenuPartidos.setVisible(false);
			}
		});
		btnListarPartido.setIconTextGap(10);
		btnListarPartido.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnListarPartido.setForeground(new Color(255, 255, 240));
		btnListarPartido.setFont(new Font("Consolas", Font.BOLD, 22));
		btnListarPartido.setBorder(null);
		btnListarPartido.setBackground(new Color(0, 30, 72));
		btnListarPartido.setBounds(0, 76, 170, 50);
		panelMenuPartidos.add(btnListarPartido);

		btnRegistrarPartido = new JButton("Registrar");
		btnRegistrarPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddGame newGame= new AddGame();
				newGame.setModal(true);
				newGame.setVisible(true);
			}
		});
		btnRegistrarPartido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrarPartido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColorBlue(btnPartidos);
				setColorOrange(btnRegistrarPartido);
				panelMenuPartidos.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(btnRegistrarPartido);
				resetColor(btnPartidos);
				panelMenuPartidos.setVisible(false);
			}
		});
		btnRegistrarPartido.setIconTextGap(10);
		btnRegistrarPartido.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnRegistrarPartido.setForeground(new Color(255, 255, 240));
		btnRegistrarPartido.setFont(new Font("Consolas", Font.BOLD, 22));
		btnRegistrarPartido.setBorder(null);
		btnRegistrarPartido.setBackground(new Color(0, 30, 72));
		btnRegistrarPartido.setBounds(0, 13, 170, 50);
		panelMenuPartidos.add(btnRegistrarPartido);

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
		tablePartidosHoy.setBackground(new Color(0,0,0,50));
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

					lblRf.setText(seleccionarjugador+ " " +  auxPlayerN.getLastname());
					Player auxPlayer = Lidom.getInstance().searchPlayerByName(seleccionarjugador);
					auxTeam.addPlayerLineUp(auxPlayer);

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
				loadLineUpPlayerByTeam(auxTeam);
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
		btnFuncionesNa_1.setIconTextGap(5);
		btnFuncionesNa_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnFuncionesNa_1.setForeground(new Color(255, 255, 240));
		btnFuncionesNa_1.setFont(new Font("Consolas", Font.BOLD, 22));
		btnFuncionesNa_1.setBorder(null);
		btnFuncionesNa_1.setBackground(new Color(4, 10, 20));
		btnFuncionesNa_1.setBounds(1183, 656, 280, 37);
		panelManageTeams.add(btnFuncionesNa_1);

		btnFuncionesNa_2 = new JButton("Funciones n/a");
		btnFuncionesNa_2.setIconTextGap(5);
		btnFuncionesNa_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnFuncionesNa_2.setForeground(new Color(255, 255, 240));
		btnFuncionesNa_2.setFont(new Font("Consolas", Font.BOLD, 22));
		btnFuncionesNa_2.setBorder(null);
		btnFuncionesNa_2.setBackground(new Color(4, 10, 20));
		btnFuncionesNa_2.setBounds(1183, 706, 280, 37);
		panelManageTeams.add(btnFuncionesNa_2);

		btnFuncionesNa_3 = new JButton("Funciones n/a");
		btnFuncionesNa_3.setIconTextGap(5);
		btnFuncionesNa_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnFuncionesNa_3.setForeground(new Color(255, 255, 240));
		btnFuncionesNa_3.setFont(new Font("Consolas", Font.BOLD, 22));
		btnFuncionesNa_3.setBorder(null);
		btnFuncionesNa_3.setBackground(new Color(4, 10, 20));
		btnFuncionesNa_3.setBounds(1183, 756, 280, 37);
		panelManageTeams.add(btnFuncionesNa_3);

		btnFuncionesNa_4 = new JButton("Funciones n/a");
		btnFuncionesNa_4.setIconTextGap(5);
		btnFuncionesNa_4.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnFuncionesNa_4.setForeground(new Color(255, 255, 240));
		btnFuncionesNa_4.setFont(new Font("Consolas", Font.BOLD, 22));
		btnFuncionesNa_4.setBorder(null);
		btnFuncionesNa_4.setBackground(new Color(4, 10, 20));
		btnFuncionesNa_4.setBounds(1183, 806, 280, 37);
		panelManageTeams.add(btnFuncionesNa_4);

		btnFuncionesNa_5 = new JButton("Funciones n/a");
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
		panelScoreBoard.setBounds(300, 13, 1250, 210);
		panelGameSimulation.add(panelScoreBoard);
		panelScoreBoard.setLayout(null);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/BgGameSimulation.png")));
		lblNewLabel.setBounds(0, 0, 1910, 957);
		panelGameSimulation.add(lblNewLabel);

		panel = new JPanel();
		panel.setBounds(85, 373, 449, 366);
		
		loadGameToday();


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
			columnRoster[0] = playerR.getId();
			columnRoster[1] = playerR.getName() + " " + playerR.getLastname();

			if (playerR instanceof Pitcher) {
				columnRoster[2] = "P - " + ((Pitcher) playerR).getTipo();	
			}
			else if (playerR instanceof Batter) {
				columnRoster[2] = "B - " + ((Batter) playerR).getPosition();
			}

			modelRoster.addRow(columnRoster);

		}

	}

	// Metodo para cargar la lista de jugadores de un equipo, roster.
	public static void loadLineUpPlayerByTeam(Team team) {

		modelLineUp= (DefaultTableModel) tableLineUp.getModel();
		modelLineUp.setRowCount(0);
		columnLineUp = new Object[modelLineUp.getColumnCount()];

		for (Player playerR : team.getLineUp()) {
			columnLineUp[0] = playerR.getId();
			columnLineUp[1] = playerR.getName() + " " + playerR.getLastname();

			if (playerR instanceof Pitcher) {
				columnLineUp[2] = "P - " + ((Pitcher) playerR).getTipo();	
			}
			else if (playerR instanceof Batter) {
				columnLineUp[2] = "B - " + ((Batter) playerR).getPosition();
			}

			modelLineUp.addRow(columnLineUp);

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
	
	
}
