package frontEnd;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;

import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;

import rojeru_san.componentes.RSDateChooser;
import sun.java2d.pipe.TextPipe;
import rojeru_san.componentes.RSCalendar;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import backEnd.Batter;
import backEnd.Lidom;
import backEnd.Pitcher;
import backEnd.Player;
import backEnd.Team;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddPlayer extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblRegistroJugador;
	private JPanel panelHeader;
	private JTextField txtName;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JTextField txtApellido;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblPasDeNacimiento;
	private JLabel lblInformacinPersonal;
	private RSDateChooser dateChooserDateBorn;
	private JComboBox<String> cbxCountries;
	private JLabel lblId;
	private JTextField txtId;
	private JSpinner spnLibra;
	private JLabel lblPeso;
	private JLabel lblAltura;
	private JSpinner spnAltura;
	private JLabel lblNmeroUniforme;
	private JTextField txtNumeroUniforme;
	private JPanel panelPhoto;
	private JSeparator separator_1;
	private JLabel lblFoto;
	private JSeparator separator_2;
	private JLabel lblLb;
	private JLabel lblPies;
	private JPanel panelInformacionJugador;
	private JButton btnPitcher;
	private JButton btnBateador;
	private JPanel panelPitcher;
	private JLabel lblW;
	private JTextField txtWinp;
	private JLabel lblGl;
	private JLabel lblEra;
	private JLabel lblG;
	private JLabel lblGs;
	private JLabel lblSv;
	private JLabel lblHr;
	private JLabel lblR;
	private JLabel label;
	private JLabel lblSo;
	private JLabel lblIp;
	private JLabel lblAvg;
	private JTextField txtLosep;
	private JTextField txtErap;
	private JTextField txtGamesp;
	private JTextField txtGSp;
	private JTextField txtSVp;
	private JTextField txtHRp;
	private JTextField txtHp;
	private JTextField txtRp;
	private JTextField txtSOp;
	private JTextField txtIPp;
	private JTextField txtAVGp;
	private JSeparator separator_3;
	private JLabel lblEstadsticaLanzador;
	private JPanel panelBateador;
	private JSeparator separator_4;
	private JLabel lblEstadsticaBateador;
	private JLabel lblAvg_1;
	private JTextField txtAVGb;
	private JTextField txtRb;
	private JLabel lblR_1;
	private JLabel lblH;
	private JTextField txtH1b;
	private JTextField txtH2b;
	private JLabel lblH_1;
	private JLabel lblH_2;
	private JTextField txtH3b;
	private JTextField txtHRb;
	private JLabel lblHr_1;
	private JLabel lblRbi;
	private JTextField txtRBIb;
	private JTextField txtBBb;
	private JLabel lblBb;
	private JLabel lblSo_1;
	private JTextField txtSOb;
	private JTextField txtSBb;
	private JLabel lblSb;

	private static int typePlayer= 0 ; // 1 - Pitcher, 2 - Bateador.
	private static Boolean selectionFoto = false;
	private JButton btnSeleccionarFoto;
	private JLabel lblTipo;
	private JComboBox cbxTipoPitcher;
	private JLabel lblManoDeLanzar;
	private JComboBox cbxManoPitcher;
	private JLabel lblEquipo;
	private JComboBox cbxEquipoPit;
	private JSeparator separator_5;
	private JLabel lblEquipo_1;
	private JSeparator separator_6;
	private JLabel lblInformacinJugador;
	private JButton btnRegistrarJugador;
	private JButton btnCancelarJugador;
	private JSeparator separator_7;
	private JLabel lblInformacinJugador_1;
	private JComboBox cbxPosicionBat;
	private JLabel label_2;
	private JComboBox cbxManoBat;
	private JLabel label_3;
	private JComboBox cbxEquipoBat;
	private JLabel label_4;
	private JLabel lblPosicin;
	private JSeparator separator_8;

	private Player myPlayer;
	private JLabel lblFotoJugador;
	private JComboBox cbxManoBateo;
	private JLabel lblManoBateo;


	/**
	 * Create the dialog.
	 */
	public AddPlayer(Player player) {
		this.myPlayer = player;

		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 1092, 780);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 1092, 780);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);

			separator = new JSeparator();
			separator.setOpaque(true);
			separator.setBorder(null);
			separator.setBackground(new Color(4, 10, 20));
			separator.setBounds(55, 92, 573, 2);
			panelBg.add(separator);

			panelHeader = new JPanel();
			panelHeader.setLayout(null);
			panelHeader.setBackground(new Color(0, 30, 72));
			panelHeader.setBounds(0, 0, 1092, 45);
			panelBg.add(panelHeader);

			if (myPlayer == null) {
				lblRegistroJugador = new JLabel("REGISTRO JUGADOR");

			} 
			else {
				lblRegistroJugador = new JLabel("MODIFICAR JUGADOR");
			}


			lblRegistroJugador.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRegistroJugador.setBounds(453, 0, 192, 45);
			panelHeader.add(lblRegistroJugador);
			lblRegistroJugador.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistroJugador.setForeground(new Color(255, 255, 255));
			lblRegistroJugador.setFont(new Font("Consolas", Font.BOLD, 20));

			txtName = new JTextField()  {

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
			txtName.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					//Restringir a solo letras.
					char c = e.getKeyChar();
					if (Character.isDigit(c)) {
						getToolkit().beep();
						e.consume();
					}
				}
			});
			/**********************************************************/

			txtName.setHorizontalAlignment(SwingConstants.CENTER);
			txtName.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtName.setDisabledTextColor(Color.BLACK);
			txtName.setColumns(10);
			txtName.setBounds(55, 216, 270, 30);
			panelBg.add(txtName);

			lblNombre = new JLabel("  Nombres");
			lblNombre.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblNombre.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
			lblNombre.setForeground(Color.BLACK);
			lblNombre.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNombre.setBounds(55, 183, 99, 31);
			panelBg.add(lblNombre);

			lblApellido = new JLabel("  Apellidos");
			lblApellido.setVerticalAlignment(SwingConstants.BOTTOM);
			lblApellido.setHorizontalAlignment(SwingConstants.LEFT);
			lblApellido.setForeground(Color.BLACK);
			lblApellido.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblApellido.setBounds(358, 183, 128, 31);
			panelBg.add(lblApellido);

			txtApellido = new JTextField() {

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
			txtApellido.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					//Restringir a solo letras.
					char c = e.getKeyChar();
					if (Character.isDigit(c)) {
						getToolkit().beep();
						e.consume();
					}
				}
			});
			/**********************************************************/

			txtApellido.setHorizontalAlignment(SwingConstants.CENTER);
			txtApellido.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtApellido.setDisabledTextColor(Color.BLACK);
			txtApellido.setColumns(10);
			txtApellido.setBounds(358, 216, 270, 30);
			panelBg.add(txtApellido);

			lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
			lblFechaDeNacimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblFechaDeNacimiento.setVerticalAlignment(SwingConstants.BOTTOM);
			lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
			lblFechaDeNacimiento.setForeground(Color.BLACK);
			lblFechaDeNacimiento.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblFechaDeNacimiento.setBounds(55, 259, 238, 31);
			panelBg.add(lblFechaDeNacimiento);

			lblPasDeNacimiento = new JLabel("Pa\u00EDs de nacimiento");
			lblPasDeNacimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPasDeNacimiento.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPasDeNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
			lblPasDeNacimiento.setForeground(Color.BLACK);
			lblPasDeNacimiento.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblPasDeNacimiento.setBounds(358, 259, 238, 31);
			panelBg.add(lblPasDeNacimiento);

			lblInformacinPersonal = new JLabel("Informaci\u00F3n Personal");
			lblInformacinPersonal.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblInformacinPersonal.setVerticalAlignment(SwingConstants.BOTTOM);
			lblInformacinPersonal.setHorizontalAlignment(SwingConstants.LEFT);
			lblInformacinPersonal.setForeground(Color.BLACK);
			lblInformacinPersonal.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblInformacinPersonal.setBounds(55, 63, 225, 31);
			panelBg.add(lblInformacinPersonal);

			dateChooserDateBorn = new RSDateChooser();
			dateChooserDateBorn.setPlaceholder("");
			dateChooserDateBorn.setFormatoFecha("dd/MM/yyyy");
			dateChooserDateBorn.setFuente(new Font("Consolas", Font.PLAIN, 18));
			dateChooserDateBorn.setColorForeground(Color.BLACK);
			dateChooserDateBorn.setColorBackground(new Color(0, 30, 72));
			dateChooserDateBorn.setBounds(55, 292, 270, 30);
			panelBg.add(dateChooserDateBorn);

			cbxCountries = new JComboBox();
			cbxCountries.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxCountries.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Estados Unidos", "Rep\u00FAblica Dominicana", "Afganist\u00E1n", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiy\u00E1n", "Bahamas", "Banglad\u00E9s", "Barbados", "Bar\u00E9in", "B\u00E9lgica", "Belice", "Ben\u00EDn", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brun\u00E9i", "Bulgaria", "Burkina Faso", "Burundi", "But\u00E1n", "Cabo Verde", "Camboya", "Camer\u00FAn", "Canad\u00E1", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos \u00C1rabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "Espa\u00F1a", "Estonia", "Etiop\u00EDa", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gab\u00F3n", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bis\u00E1u", "Hait\u00ED", "Honduras", "Hungr\u00EDa", "India", "Indonesia", "Irak", "Ir\u00E1n", "Irlanda", "Islandia", "Islas Marshall", "Islas Salom\u00F3n", "Israel", "Italia", "Jamaica", "Jap\u00F3n", "Jordania", "Kazajist\u00E1n", "Kenia", "Kirguist\u00E1n", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "L\u00EDbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Madagascar", "Malasia", "Malaui", "Maldivas", "Mal\u00ED", "Malta", "Marruecos", "Mauricio", "Mauritania", "M\u00E9xico", "Micronesia", "Moldavia", "M\u00F3naco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "N\u00EDger", "Nigeria", "Noruega", "Nueva Zelanda", "Om\u00E1n", "Pa\u00EDses Bajos", "Pakist\u00E1n", "Palaos", "Panam\u00E1", "Pap\u00FAa Nueva Guinea", "Paraguay", "Per\u00FA", "Polonia", "Portugal", "Reino Unido", "Rep\u00FAblica Centroafricana", "Rep\u00FAblica Checa", "Rep\u00FAblica de Macedonia", "Rep\u00FAblica del Congo", "Rep\u00FAblica Democr\u00E1tica del Congo", "Rep\u00FAblica Sudafricana", "Ruanda", "Ruman\u00EDa", "Rusia", "Samoa", "San Crist\u00F3bal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Luc\u00EDa", "Santo Tom\u00E9 y Pr\u00EDncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sud\u00E1n", "Sud\u00E1n del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikist\u00E1n", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "T\u00FAnez", "Turkmenist\u00E1n", "Turqu\u00EDa", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekist\u00E1n", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"}));
			cbxCountries.setBounds(358, 292, 270, 30);
			panelBg.add(cbxCountries);

			lblId = new JLabel("  N\u00FAmero ID");
			lblId.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblId.setVerticalAlignment(SwingConstants.BOTTOM);
			lblId.setHorizontalAlignment(SwingConstants.LEFT);
			lblId.setForeground(Color.BLACK);
			lblId.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblId.setBounds(55, 107, 137, 31);
			panelBg.add(lblId);

			try {
				// Definición de la máscara para ID.
				MaskFormatter maskID = null;
				maskID = new MaskFormatter("##-###-###");
				maskID.setPlaceholderCharacter('#');
				//maskID.setPlaceholder("AC-000-001");

				txtId = new JFormattedTextField(maskID) {
					/**
					 * 
					 */
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
				/**********************************************************/		
			} 
			catch (ParseException e) {
				e.printStackTrace();
			}

			txtId.setHorizontalAlignment(SwingConstants.CENTER);
			txtId.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtId.setDisabledTextColor(Color.BLACK);
			txtId.setColumns(10);
			txtId.setBounds(55, 140, 270, 30);
			panelBg.add(txtId);

			spnLibra = new JSpinner();
			spnLibra.setModel(new SpinnerNumberModel(new Float(100.00), new Float(100.00), new Float(400.00), new Float(0.10)));
			spnLibra.setFont(new Font("Consolas", Font.PLAIN, 18));
			spnLibra.setBounds(116, 346, 99, 30);
			panelBg.add(spnLibra);



			lblPeso = new JLabel("Peso");
			lblPeso.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPeso.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPeso.setHorizontalAlignment(SwingConstants.LEFT);
			lblPeso.setForeground(Color.BLACK);
			lblPeso.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblPeso.setBounds(55, 346, 52, 31);
			panelBg.add(lblPeso);

			lblAltura = new JLabel("Altura");
			lblAltura.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblAltura.setVerticalAlignment(SwingConstants.BOTTOM);
			lblAltura.setHorizontalAlignment(SwingConstants.LEFT);
			lblAltura.setForeground(Color.BLACK);
			lblAltura.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblAltura.setBounds(358, 346, 75, 31);
			panelBg.add(lblAltura);

			spnAltura = new JSpinner();
			spnAltura.setModel(new SpinnerNumberModel(new Float(5.00), new Float(5.00), new Float(8.00), new Float(0.10)));
			spnAltura.setFont(new Font("Consolas", Font.PLAIN, 18));
			spnAltura.setBounds(445, 346, 99, 30);
			panelBg.add(spnAltura);

			lblNmeroUniforme = new JLabel(" N\u00FAmero uniforme");
			lblNmeroUniforme.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNmeroUniforme.setHorizontalAlignment(SwingConstants.LEFT);
			lblNmeroUniforme.setForeground(Color.BLACK);
			lblNmeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNmeroUniforme.setBounds(441, 107, 187, 31);
			panelBg.add(lblNmeroUniforme);


			try {
				// Definición de la máscara para ID.
				MaskFormatter maskUniNumber = null;
				maskUniNumber = new MaskFormatter("##");
				maskUniNumber.setPlaceholderCharacter('#');
				//maskID.setPlaceholder("AC-000-001");

				txtNumeroUniforme = new JFormattedTextField(maskUniNumber) {
					/**
					 * 
					 */
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
				/**********************************************************/		
			} 
			catch (ParseException e) {
				e.printStackTrace();
			}

			txtNumeroUniforme.setHorizontalAlignment(SwingConstants.CENTER);
			txtNumeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtNumeroUniforme.setDisabledTextColor(Color.BLACK);
			txtNumeroUniforme.setColumns(10);
			txtNumeroUniforme.setBounds(441, 140, 187, 30);
			panelBg.add(txtNumeroUniforme);

			panelPhoto = new JPanel();
			panelPhoto.setBorder(new LineBorder(new Color(0, 30, 72)));
			panelPhoto.setBounds(775, 106, 256, 248);
			panelBg.add(panelPhoto);
			panelPhoto.setLayout(null);

			lblFotoJugador = new JLabel("");
			lblFotoJugador.setBounds(0, 0, 256, 248);
			panelPhoto.add(lblFotoJugador);

			separator_1 = new JSeparator();
			separator_1.setOpaque(true);
			separator_1.setBorder(null);
			separator_1.setBackground(new Color(4, 10, 20));
			separator_1.setBounds(775, 91, 256, 2);
			panelBg.add(separator_1);

			lblFoto = new JLabel("Foto");
			lblFoto.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblFoto.setVerticalAlignment(SwingConstants.BOTTOM);
			lblFoto.setHorizontalAlignment(SwingConstants.LEFT);
			lblFoto.setForeground(Color.BLACK);
			lblFoto.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblFoto.setBounds(775, 62, 52, 31);
			panelBg.add(lblFoto);

			separator_2 = new JSeparator();
			separator_2.setOpaque(true);
			separator_2.setBorder(null);
			separator_2.setBackground(new Color(4, 10, 20,70));
			separator_2.setBounds(680, 106, 1, 226);
			panelBg.add(separator_2);

			lblLb = new JLabel("Lb.");
			lblLb.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblLb.setVerticalAlignment(SwingConstants.BOTTOM);
			lblLb.setHorizontalAlignment(SwingConstants.LEFT);
			lblLb.setForeground(Color.BLACK);
			lblLb.setFont(new Font("Consolas", Font.ITALIC, 18));
			lblLb.setBounds(226, 346, 33, 31);
			panelBg.add(lblLb);

			lblPies = new JLabel("Pies.");
			lblPies.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPies.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPies.setHorizontalAlignment(SwingConstants.LEFT);
			lblPies.setForeground(Color.BLACK);
			lblPies.setFont(new Font("Consolas", Font.ITALIC, 18));
			lblPies.setBounds(552, 345, 55, 31);
			panelBg.add(lblPies);


			panelInformacionJugador = new JPanel();
			panelInformacionJugador.setVisible(false);
			panelInformacionJugador.setBackground(new Color(255, 255, 255));
			panelInformacionJugador.setBounds(55, 470, 972, 241);
			panelBg.add(panelInformacionJugador);
			panelInformacionJugador.setLayout(new CardLayout(0, 0));

			panelPitcher = new JPanel();
			panelPitcher.setBorder(new LineBorder(new Color(0, 30, 72), 1, true));
			panelPitcher.setVisible(false);
			panelPitcher.setBackground(new Color(255, 255, 255));
			panelInformacionJugador.add(panelPitcher, "name_34123609144100");
			panelPitcher.setLayout(null);

			lblW = new JLabel("W");
			lblW.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblW.setVerticalAlignment(SwingConstants.BOTTOM);
			lblW.setHorizontalAlignment(SwingConstants.CENTER);
			lblW.setForeground(Color.BLACK);
			lblW.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblW.setBounds(35, 164, 52, 31);
			panelPitcher.add(lblW);

			txtWinp = new JTextField() {
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

			txtWinp.setHorizontalAlignment(SwingConstants.CENTER);
			txtWinp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtWinp.setDisabledTextColor(Color.BLACK);
			txtWinp.setColumns(10);
			txtWinp.setBounds(35, 198, 52, 30);
			panelPitcher.add(txtWinp);

			lblGl = new JLabel("L");
			lblGl.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblGl.setVerticalAlignment(SwingConstants.BOTTOM);
			lblGl.setHorizontalAlignment(SwingConstants.CENTER);
			lblGl.setForeground(Color.BLACK);
			lblGl.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblGl.setBounds(113, 164, 52, 31);
			panelPitcher.add(lblGl);

			lblEra = new JLabel("ERA");
			lblEra.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEra.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEra.setHorizontalAlignment(SwingConstants.CENTER);
			lblEra.setForeground(Color.BLACK);
			lblEra.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEra.setBounds(191, 164, 52, 31);
			panelPitcher.add(lblEra);

			lblG = new JLabel("G");
			lblG.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblG.setVerticalAlignment(SwingConstants.BOTTOM);
			lblG.setHorizontalAlignment(SwingConstants.CENTER);
			lblG.setForeground(Color.BLACK);
			lblG.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblG.setBounds(269, 164, 52, 31);
			panelPitcher.add(lblG);

			lblGs = new JLabel("GS");
			lblGs.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblGs.setVerticalAlignment(SwingConstants.BOTTOM);
			lblGs.setHorizontalAlignment(SwingConstants.CENTER);
			lblGs.setForeground(Color.BLACK);
			lblGs.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblGs.setBounds(347, 164, 52, 31);
			panelPitcher.add(lblGs);

			lblSv = new JLabel("SV");
			lblSv.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblSv.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSv.setHorizontalAlignment(SwingConstants.CENTER);
			lblSv.setForeground(Color.BLACK);
			lblSv.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblSv.setBounds(425, 164, 52, 31);
			panelPitcher.add(lblSv);

			lblHr = new JLabel("HR");
			lblHr.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblHr.setVerticalAlignment(SwingConstants.BOTTOM);
			lblHr.setHorizontalAlignment(SwingConstants.CENTER);
			lblHr.setForeground(Color.BLACK);
			lblHr.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblHr.setBounds(503, 164, 52, 31);
			panelPitcher.add(lblHr);

			lblR = new JLabel("H");
			lblR.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblR.setVerticalAlignment(SwingConstants.BOTTOM);
			lblR.setHorizontalAlignment(SwingConstants.CENTER);
			lblR.setForeground(Color.BLACK);
			lblR.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblR.setBounds(581, 164, 52, 31);
			panelPitcher.add(lblR);

			label = new JLabel("R");
			label.setVerticalTextPosition(SwingConstants.BOTTOM);
			label.setVerticalAlignment(SwingConstants.BOTTOM);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.BLACK);
			label.setFont(new Font("Consolas", Font.PLAIN, 20));
			label.setBounds(659, 164, 52, 31);
			panelPitcher.add(label);

			lblSo = new JLabel("SO");
			lblSo.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblSo.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSo.setHorizontalAlignment(SwingConstants.CENTER);
			lblSo.setForeground(Color.BLACK);
			lblSo.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblSo.setBounds(737, 164, 52, 31);
			panelPitcher.add(lblSo);

			lblIp = new JLabel("IP");
			lblIp.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblIp.setVerticalAlignment(SwingConstants.BOTTOM);
			lblIp.setHorizontalAlignment(SwingConstants.CENTER);
			lblIp.setForeground(Color.BLACK);
			lblIp.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblIp.setBounds(815, 164, 52, 31);
			panelPitcher.add(lblIp);

			lblAvg = new JLabel("AVG");
			lblAvg.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblAvg.setVerticalAlignment(SwingConstants.BOTTOM);
			lblAvg.setHorizontalAlignment(SwingConstants.CENTER);
			lblAvg.setForeground(Color.BLACK);
			lblAvg.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblAvg.setBounds(893, 164, 52, 31);
			panelPitcher.add(lblAvg);

			txtLosep = new JTextField() {
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
			txtLosep.setHorizontalAlignment(SwingConstants.CENTER);
			txtLosep.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtLosep.setDisabledTextColor(Color.BLACK);
			txtLosep.setColumns(10);
			txtLosep.setBounds(113, 198, 52, 30);
			panelPitcher.add(txtLosep);

			txtErap = new JTextField() {
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
			txtErap.setHorizontalAlignment(SwingConstants.CENTER);
			txtErap.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtErap.setDisabledTextColor(Color.BLACK);
			txtErap.setColumns(10);
			txtErap.setBounds(191, 198, 52, 30);
			panelPitcher.add(txtErap);

			txtGamesp = new JTextField() {
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
			txtGamesp.setHorizontalAlignment(SwingConstants.CENTER);
			txtGamesp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtGamesp.setDisabledTextColor(Color.BLACK);
			txtGamesp.setColumns(10);
			txtGamesp.setBounds(269, 198, 52, 30);
			panelPitcher.add(txtGamesp);

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
			/**********************************************************/
			txtGSp.setHorizontalAlignment(SwingConstants.CENTER);
			txtGSp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtGSp.setDisabledTextColor(Color.BLACK);
			txtGSp.setColumns(10);
			txtGSp.setBounds(347, 198, 52, 30);
			panelPitcher.add(txtGSp);

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
			/**********************************************************/
			txtSVp.setHorizontalAlignment(SwingConstants.CENTER);
			txtSVp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtSVp.setDisabledTextColor(Color.BLACK);
			txtSVp.setColumns(10);
			txtSVp.setBounds(425, 198, 52, 30);
			panelPitcher.add(txtSVp);

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
			/**********************************************************/
			txtHRp.setHorizontalAlignment(SwingConstants.CENTER);
			txtHRp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtHRp.setDisabledTextColor(Color.BLACK);
			txtHRp.setColumns(10);
			txtHRp.setBounds(503, 198, 52, 30);
			panelPitcher.add(txtHRp);

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
			/**********************************************************/
			txtHp.setHorizontalAlignment(SwingConstants.CENTER);
			txtHp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtHp.setDisabledTextColor(Color.BLACK);
			txtHp.setColumns(10);
			txtHp.setBounds(581, 198, 52, 30);
			panelPitcher.add(txtHp);

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
			/**********************************************************/
			txtRp.setHorizontalAlignment(SwingConstants.CENTER);
			txtRp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtRp.setDisabledTextColor(Color.BLACK);
			txtRp.setColumns(10);
			txtRp.setBounds(659, 198, 52, 30);
			panelPitcher.add(txtRp);

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
			/**********************************************************/
			txtSOp.setHorizontalAlignment(SwingConstants.CENTER);
			txtSOp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtSOp.setDisabledTextColor(Color.BLACK);
			txtSOp.setColumns(10);
			txtSOp.setBounds(737, 198, 52, 30);
			panelPitcher.add(txtSOp);

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
			/**********************************************************/
			txtAVGp.setHorizontalAlignment(SwingConstants.CENTER);
			txtAVGp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtAVGp.setDisabledTextColor(Color.BLACK);
			txtAVGp.setColumns(10);
			txtAVGp.setBounds(893, 198, 52, 30);
			panelPitcher.add(txtAVGp);

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
			/**********************************************************/
			txtIPp.setHorizontalAlignment(SwingConstants.CENTER);
			txtIPp.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtIPp.setDisabledTextColor(Color.BLACK);
			txtIPp.setColumns(10);
			txtIPp.setBounds(815, 198, 52, 30);
			panelPitcher.add(txtIPp);

			separator_3 = new JSeparator();
			separator_3.setOpaque(true);
			separator_3.setBorder(null);
			separator_3.setBackground(new Color(4, 10, 20));
			separator_3.setBounds(35, 151, 910, 2);
			panelPitcher.add(separator_3);

			lblEstadsticaLanzador = new JLabel("Estad\u00EDsticas Lanzador");
			lblEstadsticaLanzador.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEstadsticaLanzador.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEstadsticaLanzador.setHorizontalAlignment(SwingConstants.LEFT);
			lblEstadsticaLanzador.setForeground(Color.BLACK);
			lblEstadsticaLanzador.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEstadsticaLanzador.setBounds(35, 129, 231, 24);
			panelPitcher.add(lblEstadsticaLanzador);

			lblTipo = new JLabel("Tipo");
			lblTipo.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblTipo.setVerticalAlignment(SwingConstants.BOTTOM);
			lblTipo.setHorizontalAlignment(SwingConstants.LEFT);
			lblTipo.setForeground(Color.BLACK);
			lblTipo.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblTipo.setBounds(35, 61, 44, 24);
			panelPitcher.add(lblTipo);

			cbxTipoPitcher = new JComboBox();
			cbxTipoPitcher.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Abridor", "Cerrador"}));
			cbxTipoPitcher.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxTipoPitcher.setBounds(91, 57, 163, 28);
			panelPitcher.add(cbxTipoPitcher);

			lblManoDeLanzar = new JLabel("Mano de lanzar");
			lblManoDeLanzar.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblManoDeLanzar.setVerticalAlignment(SwingConstants.BOTTOM);
			lblManoDeLanzar.setHorizontalAlignment(SwingConstants.LEFT);
			lblManoDeLanzar.setForeground(Color.BLACK);
			lblManoDeLanzar.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblManoDeLanzar.setBounds(285, 61, 154, 24);
			panelPitcher.add(lblManoDeLanzar);

			cbxManoPitcher = new JComboBox();
			cbxManoPitcher.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Derecha", "Izquierda", "Ambas"}));
			cbxManoPitcher.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxManoPitcher.setBounds(451, 57, 163, 28);
			panelPitcher.add(cbxManoPitcher);

			lblEquipo = new JLabel("Equipo");
			lblEquipo.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEquipo.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEquipo.setHorizontalAlignment(SwingConstants.LEFT);
			lblEquipo.setForeground(Color.BLACK);
			lblEquipo.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEquipo.setBounds(679, 61, 66, 24);
			panelPitcher.add(lblEquipo);

			cbxEquipoPit = new JComboBox();
			cbxEquipoPit.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxEquipoPit.setBounds(757, 57, 176, 28);
			panelPitcher.add(cbxEquipoPit);

			separator_5 = new JSeparator();
			separator_5.setOpaque(true);
			separator_5.setBorder(null);
			separator_5.setBackground(new Color(4, 10, 20));
			separator_5.setBounds(680, 42, 256, 2);
			panelPitcher.add(separator_5);

			lblEquipo_1 = new JLabel("Seleccionar Equipo");
			lblEquipo_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEquipo_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEquipo_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblEquipo_1.setForeground(Color.BLACK);
			lblEquipo_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEquipo_1.setBounds(680, 20, 209, 24);
			panelPitcher.add(lblEquipo_1);

			separator_6 = new JSeparator();
			separator_6.setOpaque(true);
			separator_6.setBorder(null);
			separator_6.setBackground(new Color(4, 10, 20));
			separator_6.setBounds(26, 42, 578, 2);
			panelPitcher.add(separator_6);

			lblInformacinJugador = new JLabel("Informaci\u00F3n jugador");
			lblInformacinJugador.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblInformacinJugador.setVerticalAlignment(SwingConstants.BOTTOM);
			lblInformacinJugador.setHorizontalAlignment(SwingConstants.LEFT);
			lblInformacinJugador.setForeground(Color.BLACK);
			lblInformacinJugador.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblInformacinJugador.setBounds(35, 20, 209, 24);
			panelPitcher.add(lblInformacinJugador);

			panelBateador = new JPanel();
			panelBateador.setBorder(new LineBorder(new Color(0, 30, 72), 1, true));
			panelBateador.setBackground(new Color(255, 255, 255));
			panelInformacionJugador.add(panelBateador, "name_34931057259399");
			panelBateador.setLayout(null);

			separator_4 = new JSeparator();
			separator_4.setOpaque(true);
			separator_4.setBorder(null);
			separator_4.setBackground(new Color(4, 10, 20));
			separator_4.setBounds(30, 149, 916, 2);
			panelBateador.add(separator_4);

			lblEstadsticaBateador = new JLabel("Estad\u00EDsticas Bateador");
			lblEstadsticaBateador.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEstadsticaBateador.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEstadsticaBateador.setHorizontalAlignment(SwingConstants.LEFT);
			lblEstadsticaBateador.setForeground(Color.BLACK);
			lblEstadsticaBateador.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEstadsticaBateador.setBounds(30, 122, 231, 24);
			panelBateador.add(lblEstadsticaBateador);

			lblAvg_1 = new JLabel("AVG");
			lblAvg_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblAvg_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblAvg_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblAvg_1.setForeground(Color.BLACK);
			lblAvg_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblAvg_1.setBounds(41, 164, 52, 31);
			panelBateador.add(lblAvg_1);

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
			/**********************************************************/
			txtAVGb.setHorizontalAlignment(SwingConstants.CENTER);
			txtAVGb.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtAVGb.setDisabledTextColor(Color.BLACK);
			txtAVGb.setColumns(10);
			txtAVGb.setBounds(41, 198, 52, 30);
			panelBateador.add(txtAVGb);

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
			txtRb.setDisabledTextColor(Color.BLACK);
			txtRb.setColumns(10);
			txtRb.setBounds(134, 198, 52, 30);
			panelBateador.add(txtRb);

			lblR_1 = new JLabel("R");
			lblR_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblR_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblR_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblR_1.setForeground(Color.BLACK);
			lblR_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblR_1.setBounds(134, 164, 52, 31);
			panelBateador.add(lblR_1);

			lblH = new JLabel("H1");
			lblH.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblH.setVerticalAlignment(SwingConstants.BOTTOM);
			lblH.setHorizontalAlignment(SwingConstants.CENTER);
			lblH.setForeground(Color.BLACK);
			lblH.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblH.setBounds(227, 164, 52, 31);
			panelBateador.add(lblH);

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
			txtH1b.setDisabledTextColor(Color.BLACK);
			txtH1b.setColumns(10);
			txtH1b.setBounds(227, 198, 52, 30);
			panelBateador.add(txtH1b);

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
			txtH2b.setDisabledTextColor(Color.BLACK);
			txtH2b.setColumns(10);
			txtH2b.setBounds(320, 198, 52, 30);
			panelBateador.add(txtH2b);

			lblH_1 = new JLabel("H2");
			lblH_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblH_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblH_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblH_1.setForeground(Color.BLACK);
			lblH_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblH_1.setBounds(320, 164, 52, 31);
			panelBateador.add(lblH_1);

			lblH_2 = new JLabel("H3");
			lblH_2.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblH_2.setVerticalAlignment(SwingConstants.BOTTOM);
			lblH_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblH_2.setForeground(Color.BLACK);
			lblH_2.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblH_2.setBounds(413, 164, 52, 31);
			panelBateador.add(lblH_2);

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
			txtH3b.setDisabledTextColor(Color.BLACK);
			txtH3b.setColumns(10);
			txtH3b.setBounds(413, 198, 52, 30);
			panelBateador.add(txtH3b);

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
			txtHRb.setDisabledTextColor(Color.BLACK);
			txtHRb.setColumns(10);
			txtHRb.setBounds(506, 198, 52, 30);
			panelBateador.add(txtHRb);

			lblHr_1 = new JLabel("HR");
			lblHr_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblHr_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblHr_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHr_1.setForeground(Color.BLACK);
			lblHr_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblHr_1.setBounds(506, 164, 52, 31);
			panelBateador.add(lblHr_1);

			lblRbi = new JLabel("RBI");
			lblRbi.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblRbi.setVerticalAlignment(SwingConstants.BOTTOM);
			lblRbi.setHorizontalAlignment(SwingConstants.CENTER);
			lblRbi.setForeground(Color.BLACK);
			lblRbi.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblRbi.setBounds(599, 164, 52, 31);
			panelBateador.add(lblRbi);

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
			txtRBIb.setDisabledTextColor(Color.BLACK);
			txtRBIb.setColumns(10);
			txtRBIb.setBounds(599, 198, 52, 30);
			panelBateador.add(txtRBIb);

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
			txtBBb.setDisabledTextColor(Color.BLACK);
			txtBBb.setColumns(10);
			txtBBb.setBounds(692, 198, 52, 30);
			panelBateador.add(txtBBb);

			lblBb = new JLabel("BB");
			lblBb.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblBb.setVerticalAlignment(SwingConstants.BOTTOM);
			lblBb.setHorizontalAlignment(SwingConstants.CENTER);
			lblBb.setForeground(Color.BLACK);
			lblBb.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblBb.setBounds(692, 164, 52, 31);
			panelBateador.add(lblBb);

			lblSo_1 = new JLabel("SO");
			lblSo_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblSo_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSo_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblSo_1.setForeground(Color.BLACK);
			lblSo_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblSo_1.setBounds(785, 164, 52, 31);
			panelBateador.add(lblSo_1);

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
			txtSOb.setDisabledTextColor(Color.BLACK);
			txtSOb.setColumns(10);
			txtSOb.setBounds(785, 198, 52, 30);
			panelBateador.add(txtSOb);

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
			txtSBb.setDisabledTextColor(Color.BLACK);
			txtSBb.setColumns(10);
			txtSBb.setBounds(878, 198, 52, 30);
			panelBateador.add(txtSBb);

			lblSb = new JLabel("SB");
			lblSb.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblSb.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSb.setHorizontalAlignment(SwingConstants.CENTER);
			lblSb.setForeground(Color.BLACK);
			lblSb.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblSb.setBounds(878, 164, 52, 31);
			panelBateador.add(lblSb);

			separator_7 = new JSeparator();
			separator_7.setOpaque(true);
			separator_7.setBorder(null);
			separator_7.setBackground(new Color(4, 10, 20));
			separator_7.setBounds(30, 35, 621, 2);
			panelBateador.add(separator_7);

			lblInformacinJugador_1 = new JLabel("Informaci\u00F3n Jugador");
			lblInformacinJugador_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblInformacinJugador_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblInformacinJugador_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblInformacinJugador_1.setForeground(Color.BLACK);
			lblInformacinJugador_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblInformacinJugador_1.setBounds(39, 13, 209, 24);
			panelBateador.add(lblInformacinJugador_1);

			cbxPosicionBat = new JComboBox();
			cbxPosicionBat.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Catcher", "Primera base", "Segunda base", "Tercera base", "Short stop", "Left fielder", "Center fielder", "Right fielder"}));
			cbxPosicionBat.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxPosicionBat.setBounds(134, 50, 163, 28);
			panelBateador.add(cbxPosicionBat);

			label_2 = new JLabel("Mano de lanzar");
			label_2.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_2.setVerticalAlignment(SwingConstants.BOTTOM);
			label_2.setHorizontalAlignment(SwingConstants.LEFT);
			label_2.setForeground(Color.BLACK);
			label_2.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_2.setBounds(320, 50, 154, 24);
			panelBateador.add(label_2);

			cbxManoBat = new JComboBox();
			cbxManoBat.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Derecha", "Izquierda", "Ambas"}));
			cbxManoBat.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxManoBat.setBounds(488, 50, 163, 28);
			panelBateador.add(cbxManoBat);

			label_3 = new JLabel("Equipo");
			label_3.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_3.setVerticalAlignment(SwingConstants.BOTTOM);
			label_3.setHorizontalAlignment(SwingConstants.LEFT);
			label_3.setForeground(Color.BLACK);
			label_3.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_3.setBounds(693, 54, 66, 24);
			panelBateador.add(label_3);

			cbxEquipoBat = new JComboBox();
			cbxEquipoBat.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxEquipoBat.setBounds(771, 50, 175, 28);
			panelBateador.add(cbxEquipoBat);

			label_4 = new JLabel("Seleccionar Equipo");
			label_4.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_4.setVerticalAlignment(SwingConstants.BOTTOM);
			label_4.setHorizontalAlignment(SwingConstants.LEFT);
			label_4.setForeground(Color.BLACK);
			label_4.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_4.setBounds(693, 13, 209, 24);
			panelBateador.add(label_4);

			lblPosicin = new JLabel("Posici\u00F3n");
			lblPosicin.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPosicin.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPosicin.setHorizontalAlignment(SwingConstants.LEFT);
			lblPosicin.setForeground(Color.BLACK);
			lblPosicin.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblPosicin.setBounds(41, 54, 88, 24);
			panelBateador.add(lblPosicin);

			separator_8 = new JSeparator();
			separator_8.setOpaque(true);
			separator_8.setBorder(null);
			separator_8.setBackground(new Color(4, 10, 20));
			separator_8.setBounds(692, 35, 256, 2);
			panelBateador.add(separator_8);
			
			cbxManoBateo = new JComboBox();
			cbxManoBateo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Derecha", "Izquierda", "Ambas"}));
			cbxManoBateo.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxManoBateo.setBounds(486, 87, 163, 28);
			panelBateador.add(cbxManoBateo);
			
			lblManoBateo = new JLabel("Mano de bato");
			lblManoBateo.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblManoBateo.setVerticalAlignment(SwingConstants.BOTTOM);
			lblManoBateo.setHorizontalAlignment(SwingConstants.LEFT);
			lblManoBateo.setForeground(Color.BLACK);
			lblManoBateo.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblManoBateo.setBounds(320, 91, 154, 24);
			panelBateador.add(lblManoBateo);

			btnPitcher = new JButton("Pitcher");
			btnPitcher.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					typePlayer = 1;

					btnPitcher.setEnabled(false);
					btnBateador.setEnabled(false);

					panelInformacionJugador.setVisible(true);
					panelPitcher.setVisible(true);
					panelBateador.setVisible(false);



				}
			});
			btnPitcher.setIconTextGap(30);
			btnPitcher.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnPitcher.setForeground(new Color(255, 255, 240));
			btnPitcher.setFont(new Font("Consolas", Font.BOLD, 17));
			btnPitcher.setBorder(null);
			btnPitcher.setBackground(new Color(0,30,72));
			btnPitcher.setBounds(384, 414, 146, 30);
			panelBg.add(btnPitcher);

			btnBateador = new JButton("Bateador");
			btnBateador.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					typePlayer = 2;


					btnPitcher.setEnabled(false);
					btnBateador.setEnabled(false);

					panelInformacionJugador.setVisible(true);
					panelPitcher.setVisible(false);
					panelBateador.setVisible(true);
				}
			});
			btnBateador.setIconTextGap(30);
			btnBateador.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnBateador.setForeground(new Color(255, 255, 240));
			btnBateador.setFont(new Font("Consolas", Font.BOLD, 17));
			btnBateador.setBorder(null);
			btnBateador.setBackground(new Color(0,30,72));
			btnBateador.setBounds(542, 414, 146, 30);
			panelBg.add(btnBateador);

			btnSeleccionarFoto = new JButton("Seleccionar");
			btnSeleccionarFoto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					JFileChooser fileChooser = new JFileChooser();
					fileChooser.showOpenDialog(null);

					BufferedImage foto;
					File fileFoto = fileChooser.getSelectedFile();

					String routeOfFoto=null;

					try {
						routeOfFoto = fileFoto.getAbsolutePath();

					}catch (NullPointerException  e1) {
						e1.printStackTrace();
					}
					try {
						foto = ImageIO.read(fileFoto);
						String routetosave = "Fotos_Jugadores/"+ txtName.getText() + ".png";
						ImageIO.write(foto, "png", new File(routetosave));
						/** to adjust image at size of JLabel **/
						ImageIcon fotoJugador = new ImageIcon(routeOfFoto);
						Icon fotoJ = new ImageIcon(fotoJugador.getImage().getScaledInstance(lblFotoJugador.getWidth(), lblFotoJugador.getHeight(), Image.SCALE_SMOOTH));
						lblFotoJugador.setIcon(fotoJ);
						selectionFoto = true;

					} catch (IOException e1) {
						e1.printStackTrace();
					}catch (IllegalArgumentException e2) {
						JOptionPane.showMessageDialog(null, "Solo se permiten fotos." , "Error:", JOptionPane.ERROR_MESSAGE);
					}	
				}
			});
			btnSeleccionarFoto.setIconTextGap(30);
			btnSeleccionarFoto.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnSeleccionarFoto.setForeground(new Color(255, 255, 240));
			btnSeleccionarFoto.setFont(new Font("Consolas", Font.BOLD, 17));
			btnSeleccionarFoto.setBorder(null);
			btnSeleccionarFoto.setBackground(new Color(0,30,72));
			btnSeleccionarFoto.setBounds(825, 372, 156, 30);
			panelBg.add(btnSeleccionarFoto);

			btnRegistrarJugador = new JButton();
			if (myPlayer == null) {
				btnRegistrarJugador.setText("Registrar");

			}
			else {
				btnRegistrarJugador.setText("Guardar");
			}

			btnRegistrarJugador.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_checked_48px_1.png"));
					String[] options = {"Ok"};
					ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));

					if (myPlayer == null) {

						String id = txtId.getText();
						String number = txtNumeroUniforme.getText();
						String name = txtName.getText();
						String lastname = txtApellido.getText();
						String placeBorn = cbxCountries.getSelectedItem().toString();
						Date dateBorn = dateChooserDateBorn.getDatoFecha();
						float weight = Float.parseFloat(spnLibra.getValue().toString());
						float height = Float.parseFloat(spnAltura.getValue().toString());


						if ((selectionFoto == true) && (!id.equalsIgnoreCase("##-###-###")) && (!number.equalsIgnoreCase("##")) && (!name.equalsIgnoreCase("")) && (!lastname.equalsIgnoreCase("")) && (cbxCountries.getSelectedIndex() > 0) && (cbxCountries.getSelectedIndex() > 0) && (dateBorn != null) && (weight >= 100.00f) && (height >= 5.00f )) {
							if (Lidom.getInstance().checkIdPlayer(id)) {

								if (typePlayer == 1) { // un pitcher.

									String tipoPitcher = cbxTipoPitcher.getSelectedItem().toString();
									String manoPitcher = cbxManoPitcher.getSelectedItem().toString(); // OJO crear artributo
									String equipoPitcher = cbxEquipoPit.getSelectedItem().toString();

									if ( (cbxTipoPitcher.getSelectedIndex() > 0)  && (cbxManoPitcher.getSelectedIndex() > 0) && (cbxEquipoPit.getSelectedIndex() > 0) ) {
										
										if (Lidom.getInstance().checkNumberPlayer(number, equipoPitcher)) {
											
											Player pitcher = new Pitcher(id, name, number, lastname, equipoPitcher, dateBorn, placeBorn, height, weight, manoPitcher, tipoPitcher);
											Lidom.getInstance().addPlayer(pitcher); // agrego lista de lidom
											Lidom.getInstance().addPlayerToTeam(equipoPitcher, pitcher); // agrego a lista de roster del equipo


											JOptionPane.showOptionDialog(null, "Registro de un PITCHER con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
											clean();
											typePlayer = 0;
											panelInformacionJugador.setVisible(false);
											btnBateador.setEnabled(true);
											btnPitcher.setEnabled(true);
											selectionFoto = false;
											
										}
										else {
											
											JOptionPane.showOptionDialog(null, "El número de uniforme ya existe!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
											
										}		
									}
									else {

										JOptionPane.showOptionDialog(null, "Complete todos los campos, correctamente!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
									}

								}
								else if (typePlayer == 2) { // un bateador.
									


									String posicion = cbxPosicionBat.getSelectedItem().toString();
									String manobateador = cbxManoBat.getSelectedItem().toString(); // Ojo crear atributo
									String manoDeBateo = cbxManoBateo.getSelectedItem().toString();
									String equipoBateeador = cbxEquipoBat.getSelectedItem().toString();

									if ((cbxManoBateo.getSelectedIndex() > 0) && (cbxPosicionBat.getSelectedIndex() > 0)  && (cbxManoBat.getSelectedIndex() > 0) && (cbxEquipoBat.getSelectedIndex() > 0) ) {
										
										if (Lidom.getInstance().checkNumberPlayer(number, equipoBateeador)) {
											Player bateador = new Batter(id, name, number, lastname, equipoBateeador, dateBorn, placeBorn, height, weight, manobateador, posicion, manoDeBateo);
											Lidom.getInstance().addPlayer(bateador);// agrego lista de lidom
											Lidom.getInstance().addPlayerToTeam(equipoBateeador, bateador); // agrego a lista de roster del equipo

											JOptionPane.showOptionDialog(null, "Registro de un BATEADOR con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
											clean();
											typePlayer = 0;
											panelInformacionJugador.setVisible(false);
											btnBateador.setEnabled(true);
											btnPitcher.setEnabled(true);
											selectionFoto = false;
											
										}else {
											JOptionPane.showOptionDialog(null, "El número de uniforme ya existe!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
											
										}			
									}
									else {

										JOptionPane.showOptionDialog(null, "Complete todos los campos, correctamente!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
									}
								}
								else {
									JOptionPane.showOptionDialog(null, "Eliga Pitcher / Bateador", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
								}
							}
							else {
								JOptionPane.showOptionDialog(null, "El número de ID ya existe!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);		
							}
							}
							else {

								JOptionPane.showOptionDialog(null, "Complete todos los campos, correctamente!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);

							}
						}
						
					else {

						/*
						 *  ***************** PARA EDITAR AQUI ***************
						 */
					}

				}
			});
			btnRegistrarJugador.setIcon(new ImageIcon(AddPlayer.class.getResource("/iconos_imagenes/icons8_baseball_24px.png")));
			btnRegistrarJugador.setIconTextGap(5);
			btnRegistrarJugador.setHorizontalTextPosition(SwingConstants.LEFT);
			btnRegistrarJugador.setForeground(new Color(255, 255, 240));
			btnRegistrarJugador.setFont(new Font("Consolas", Font.BOLD, 17));
			btnRegistrarJugador.setBorder(null);
			btnRegistrarJugador.setBackground(new Color(0, 30, 72));
			btnRegistrarJugador.setBounds(765, 737, 146, 30);
			panelBg.add(btnRegistrarJugador);

			btnCancelarJugador = new JButton("Cancelar");
			btnCancelarJugador.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	


					if (typePlayer == 0) {
						int xOption	= JOptionPane.showOptionDialog(null, "¿Seguro que desea cancelar?, la ventana se cerrará.", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
						if (xOption == 0) {
							typePlayer = 0;
							dispose(); // chequear tiene un comportamiento extrano
						}

					}
					else if (typePlayer !=0) {

						int xOption	= JOptionPane.showOptionDialog(null, "Seguro que desea cancelar el tipo de jugador?", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
						if (xOption == 0) {
							// FALTA PONER METODO PARA LIMPIAR LOS CAMPOS.
							typePlayer = 0;
							panelInformacionJugador.setVisible(false);
							btnBateador.setEnabled(true);
							btnPitcher.setEnabled(true);
						}
					}


				}
			});
			btnCancelarJugador.setIcon(new ImageIcon(AddPlayer.class.getResource("/iconos_imagenes/icons8_cancel_24px_2.png")));
			btnCancelarJugador.setIconTextGap(5);
			btnCancelarJugador.setHorizontalTextPosition(SwingConstants.LEFT);
			btnCancelarJugador.setForeground(new Color(255, 255, 240));
			btnCancelarJugador.setFont(new Font("Consolas", Font.BOLD, 17));
			btnCancelarJugador.setBorder(null);
			btnCancelarJugador.setBackground(new Color(0, 30, 70));
			btnCancelarJugador.setBounds(923, 737, 146, 30);
			panelBg.add(btnCancelarJugador);
		}


		controlStats();
		loadTeamsCbx();

	}



	/* Metodos */

	private void clean() {
		txtId.setText("");
		txtNumeroUniforme.setText("");
		txtName.setText("");
		txtApellido.setText("");
		dateChooserDateBorn.setDatoFecha(null);
		cbxCountries.setSelectedIndex(0);
		cbxEquipoBat.setSelectedIndex(0);
		cbxEquipoPit.setSelectedIndex(0);
		cbxManoBat.setSelectedIndex(0);
		cbxManoPitcher.setSelectedIndex(0);
		cbxPosicionBat.setSelectedIndex(0);
		cbxTipoPitcher.setSelectedIndex(0);

	}

	private void controlStats() {


		if (myPlayer == null) {

			txtWinp.setEditable(false);
			txtLosep.setEditable(false);
			txtErap.setEditable(false);
			txtGamesp.setEditable(false);
			txtGSp.setEditable(false);
			txtSVp.setEditable(false);
			txtHRp.setEditable(false);
			txtHp.setEditable(false);
			txtRp.setEditable(false);
			txtSOp.setEditable(false);
			txtIPp.setEditable(false);
			txtAVGp.setEditable(false);

			txtAVGb.setEditable(false);
			txtRb.setEditable(false);
			txtH1b.setEditable(false);
			txtH2b.setEditable(false);
			txtH3b.setEditable(false);
			txtHRb.setEditable(false);
			txtRBIb.setEditable(false);
			txtBBb.setEditable(false);
			txtSOb.setEditable(false);
			txtSBb.setEditable(false);

			txtWinp.setText("0");
			txtLosep.setText("0");
			txtErap.setText("0");
			txtGamesp.setText("0");
			txtGSp.setText("0");
			txtSVp.setText("0");
			txtHRp.setText("0");
			txtHp.setText("0");
			txtRp.setText("0");
			txtSOp.setText("0");
			txtIPp.setText("0");
			txtAVGp.setText("0");

			txtAVGb.setText("0");
			txtRb.setText("0");
			txtH1b.setText("0");
			txtH2b.setText("0");
			txtH3b.setText("0");
			txtHRb.setText("0");
			txtRBIb.setText("0");
			txtBBb.setText("0");
			txtSOb.setText("0");
			txtSBb.setText("0");


		}


	}

	private void loadTeamsCbx() {

		cbxEquipoBat.removeAllItems();
		cbxEquipoPit.removeAllItems();

		for (Team t : Lidom.getInstance().getListTeams()) {
			cbxEquipoBat.addItem(t.getName());
			cbxEquipoPit.addItem(t.getName());
		}


		cbxEquipoBat.insertItemAt(new String("<Seleccionar"), 0);
		cbxEquipoPit.insertItemAt(new String("<Seleccionar"), 0);
		cbxEquipoBat.setSelectedIndex(0);
		cbxEquipoPit.setSelectedIndex(0);

	}

}
