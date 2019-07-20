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
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import Animacion.Animacion;

import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Dimension dimention;
	private JPanel panelBackGround;
	private JPanel panelMenuBar;
	private JButton btnEquipos;
	private JButton btnJugadores;
	private JPanel panelBgHome;
	private JLabel lblBgImagen;
	private JLabel lblBgHome_Play_Blur;
	private JButton btnMini;
	private JButton btnClose;
	private JPanel panelMenuEquipo;
	private JPanel panelMenuJugadores;
	private JButton btnRegistrarTeam;
	private JButton btnListarTeams;
	private JButton btnNa;
	private JButton btnRegistrarPlayer;
	private JButton btnListarPlayers;
	private JButton btnNa_1;
	private JButton btnEstadios;
	private JPanel panelMenuEstadio;
	private JButton btnregistrarEstadio;
	private JButton btnListarEstadio;
	private JButton button_3;
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
		super.setSize(dimention.width, (dimention.height-50));
		setLocationRelativeTo(null);

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
				Icon Lidom = new ImageIcon(logoIconLidom.getImage().getScaledInstance(lblLogoLidomMenuLateral.getWidth(), lblLogoLidomMenuLateral.getHeight(), Image.SCALE_SMOOTH));
				lblLogoLidomMenuLateral.setIcon(Lidom);

				
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
				
				lblTitle = new JLabel("Title 1");
				lblTitle.setVerticalTextPosition(SwingConstants.BOTTOM);
				lblTitle.setOpaque(true);
				lblTitle.setIconTextGap(10);
				lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
				lblTitle.setForeground(Color.WHITE);
				lblTitle.setFont(new Font("Consolas", Font.BOLD, 20));
				lblTitle.setBackground(new Color(8, 18, 30));
				lblTitle.setBounds(12, 373, 376, 37);
				panelMenuLateral.add(lblTitle);
				
				btnButtons = new JButton("buttons #");
				btnButtons.setIconTextGap(30);
				btnButtons.setHorizontalTextPosition(SwingConstants.RIGHT);
				btnButtons.setHorizontalAlignment(SwingConstants.LEADING);
				btnButtons.setForeground(new Color(255, 255, 240));
				btnButtons.setFont(new Font("Consolas", Font.BOLD, 22));
				btnButtons.setBorder(null);
				btnButtons.setBackground(new Color(4, 10, 20));
				btnButtons.setBounds(12, 423, 307, 37);
				panelMenuLateral.add(btnButtons);
				
				separator_1 = new JSeparator();
				separator_1.setOpaque(true);
				separator_1.setBorder(null);
				separator_1.setBackground(Color.WHITE);
				separator_1.setBounds(12, 161, 376, 4);
				panelMenuLateral.add(separator_1);
				
				lblTitle_1 = new JLabel("Title 2");
				lblTitle_1.setVerticalTextPosition(SwingConstants.BOTTOM);
				lblTitle_1.setOpaque(true);
				lblTitle_1.setIconTextGap(10);
				lblTitle_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblTitle_1.setForeground(Color.WHITE);
				lblTitle_1.setFont(new Font("Consolas", Font.BOLD, 20));
				lblTitle_1.setBackground(new Color(8, 18, 30));
				lblTitle_1.setBounds(12, 473, 376, 37);
				panelMenuLateral.add(lblTitle_1);
				
				btnButtons_1 = new JButton("buttons #");
				btnButtons_1.setIconTextGap(30);
				btnButtons_1.setHorizontalTextPosition(SwingConstants.RIGHT);
				btnButtons_1.setHorizontalAlignment(SwingConstants.LEADING);
				btnButtons_1.setForeground(new Color(255, 255, 240));
				btnButtons_1.setFont(new Font("Consolas", Font.BOLD, 22));
				btnButtons_1.setBorder(null);
				btnButtons_1.setBackground(new Color(4, 10, 20));
				btnButtons_1.setBounds(12, 523, 307, 37);
				panelMenuLateral.add(btnButtons_1);
				
				btnButtons_2 = new JButton("buttons #");
				btnButtons_2.setIconTextGap(30);
				btnButtons_2.setHorizontalTextPosition(SwingConstants.RIGHT);
				btnButtons_2.setHorizontalAlignment(SwingConstants.LEADING);
				btnButtons_2.setForeground(new Color(255, 255, 240));
				btnButtons_2.setFont(new Font("Consolas", Font.BOLD, 22));
				btnButtons_2.setBorder(null);
				btnButtons_2.setBackground(new Color(4, 10, 20));
				btnButtons_2.setBounds(12, 623, 307, 37);
				panelMenuLateral.add(btnButtons_2);
				
				lblTitle_2 = new JLabel("Title 3");
				lblTitle_2.setVerticalTextPosition(SwingConstants.BOTTOM);
				lblTitle_2.setOpaque(true);
				lblTitle_2.setIconTextGap(10);
				lblTitle_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblTitle_2.setForeground(Color.WHITE);
				lblTitle_2.setFont(new Font("Consolas", Font.BOLD, 20));
				lblTitle_2.setBackground(new Color(8, 18, 30));
				lblTitle_2.setBounds(12, 573, 376, 37);
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
		panelMenuEstadio.setBounds(693, 50, 170, 218);
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
		
		button_3 = new JButton("n/a");
		button_3.setIconTextGap(10);
		button_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		button_3.setForeground(new Color(255, 255, 240));
		button_3.setFont(new Font("Consolas", Font.BOLD, 22));
		button_3.setBorder(null);
		button_3.setBackground(new Color(0, 30, 72));
		button_3.setBounds(0, 139, 170, 50);
		panelMenuEstadio.add(button_3);
		panelMenuEquipo.setBounds(329, 50, 170, 218);
		panelBackGround.add(panelMenuEquipo);
		panelMenuEquipo.setLayout(null);

		btnRegistrarTeam = new JButton("Registrar");
		btnRegistrarTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTeam newTeam = new AddTeam();
				newTeam.setModal(true);
				newTeam.setVisible(true);
				
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

		btnNa = new JButton("n/a");
		btnNa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelMenuEquipo.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelMenuEquipo.setVisible(false);
			}
		});
		btnNa.setIconTextGap(10);
		btnNa.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNa.setForeground(new Color(255, 255, 240));
		btnNa.setFont(new Font("Consolas", Font.BOLD, 22));
		btnNa.setBorder(null);
		btnNa.setBackground(new Color(0, 30, 72));
		btnNa.setBounds(0, 139, 170, 50);
		panelMenuEquipo.add(btnNa);

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
		panelMenuJugadores.setBounds(511, 50, 170, 218);
		panelBackGround.add(panelMenuJugadores);
		panelMenuJugadores.setLayout(null);

		btnRegistrarPlayer = new JButton("Registrar");
		btnRegistrarPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPlayer newPlayer = new AddPlayer(null);
				newPlayer.setModal(true);
				newPlayer.setVisible(true);
		
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

		btnNa_1 = new JButton("n/a");
		btnNa_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelMenuJugadores.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelMenuJugadores.setVisible(false);
			}
		});
		btnNa_1.setIconTextGap(10);
		btnNa_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNa_1.setForeground(new Color(255, 255, 240));
		btnNa_1.setFont(new Font("Consolas", Font.BOLD, 22));
		btnNa_1.setBorder(null);
		btnNa_1.setBackground(new Color(0, 30, 72));
		btnNa_1.setBounds(0, 139, 170, 50);
		panelMenuJugadores.add(btnNa_1);
		
				panelBgHome = new JPanel();
				panelBgHome.setBounds(0, 63, 1910, 957);
				panelBackGround.add(panelBgHome);
				
						lblBgHome_Play_Blur = new JLabel("");
						lblBgHome_Play_Blur.setVisible(false);
						panelBgHome.setLayout(new CardLayout(0, 0));
						panelBgHome.add(lblBgHome_Play_Blur, "name_517116948731300");
						lblBgHome_Play_Blur.setIcon(new ImageIcon(Home.class.getResource("/iconos_imagenes/fondoPlay.png")));


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
}
