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
import javax.swing.JSeparator;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JLabel lblLogoLidom;
	private JPanel panelBgHome;
	private JLabel lblBgImagen;
	private JLabel label;
	private JButton button;
	private JButton button_1;

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
	}

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
		btnEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTeam newTeam = new AddTeam();
				newTeam.setVisible(true);
				newTeam.setModal(true);
			}
		});
		btnEquipos.setOpaque(false);
		btnEquipos.setIconTextGap(10);
		btnEquipos.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnEquipos.setForeground(new Color(255, 255, 240));
		btnEquipos.setFont(new Font("Consolas", Font.BOLD, 22));
		btnEquipos.setBorder(null);
		btnEquipos.setBackground(new Color(0,30,72));
		btnEquipos.setBounds(329, 0, 170, 50);
		panelMenuBar.add(btnEquipos);

		btnJugadores = new JButton("JUGADORES");
		btnJugadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPlayer newPlayer = new AddPlayer();
				newPlayer.setVisible(true);
				newPlayer.setModal(true);
			}
		});
		btnJugadores.setOpaque(false);
		btnJugadores.setIconTextGap(10);
		btnJugadores.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnJugadores.setForeground(new Color(255, 255, 240));
		btnJugadores.setFont(new Font("Consolas", Font.BOLD, 22));
		btnJugadores.setBorder(null);
		btnJugadores.setBackground(new Color(0,30,72));
		btnJugadores.setBounds(511, 0, 170, 50);
		panelMenuBar.add(btnJugadores);

		lblLogoLidom = new JLabel("");
		lblLogoLidom.setBorder(null);
		lblLogoLidom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLogoLidom.setBounds(12, 0, 58, 50);
		panelMenuBar.add(lblLogoLidom);
		/** to adjust image at size of JLabel **/
		ImageIcon logoLidom = new ImageIcon(Home.class.getResource("/imagenes/preview-lidom (2).png"));
		Icon lgLidom = new ImageIcon(logoLidom.getImage().getScaledInstance(lblLogoLidom.getWidth(), lblLogoLidom.getHeight(), Image.SCALE_SMOOTH));
		lblLogoLidom.setIcon(lgLidom);

		lblLogoLidom.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLogoLidom.setOpaque(true);
		lblLogoLidom.setIconTextGap(10);
		lblLogoLidom.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoLidom.setForeground(Color.WHITE);
		lblLogoLidom.setFont(new Font("Consolas", Font.BOLD, 20));
		lblLogoLidom.setBackground(Color.WHITE);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(Home.class.getResource("/imagenes/icons8_minimize_window_24px.png")));
		button.setPreferredSize(new Dimension(100, 30));
		button.setOpaque(false);
		button.setHideActionText(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Consolas", Font.BOLD, 20));
		button.setBorder(null);
		button.setBackground(new Color(4, 10, 20));
		button.setActionCommand("Cancel");
		button.setBounds(1856, 0, 26, 30);
		panelMenuBar.add(button);
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(Home.class.getResource("/imagenes/icons8_close_window_24px_1.png")));
		button_1.setPreferredSize(new Dimension(100, 30));
		button_1.setOpaque(false);
		button_1.setHideActionText(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Consolas", Font.BOLD, 20));
		button_1.setBorder(null);
		button_1.setBackground(new Color(4, 10, 20));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(1884, 0, 26, 30);
		panelMenuBar.add(button_1);

		panelBgHome = new JPanel();
		panelBgHome.setBounds(0, 63, 1910, 957);
		panelBackGround.add(panelBgHome);
		panelBgHome.setLayout(new CardLayout(0, 0));
		
		label = new JLabel("");
		panelBgHome.add(label, "name_5748905232900");
		label.setIcon(new ImageIcon(Home.class.getResource("/imagenes/fondoPlay.png")));
		
		
	}
}
