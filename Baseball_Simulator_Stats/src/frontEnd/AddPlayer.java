package frontEnd;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;

import rojeru_san.componentes.RSDateChooser;
import sun.java2d.pipe.TextPipe;
import rojeru_san.componentes.RSCalendar;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.CardLayout;

public class AddPlayer extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1658484356818098183L;
	
	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblRegistroJugador;
	private JPanel panelHeader;
	private JButton btnClose;
	private JTextField txtName;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JTextField txtApellido;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblPasDeNacimiento;
	private JLabel lblInformacinPersonal;
	private RSDateChooser dateChooser;
	private JComboBox<String> cbxCountries;
	private JLabel lblId;
	private JTextField txtId;
	private JSpinner spinner;
	private JLabel lblPeso;
	private JLabel lblAltura;
	private JSpinner spinner_1;
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
	private JTextField textField;
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
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JSeparator separator_3;
	private JLabel lblEstadsticaLanzador;
	private JPanel panelBateador;
	private JSeparator separator_4;
	private JLabel lblEstadsticaBateador;
	private JLabel lblAvg_1;
	private JTextField textField_12;
	private JTextField textField_13;
	private JLabel lblR_1;
	private JLabel lblH;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel lblH_1;
	private JLabel lblH_2;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel lblHr_1;
	private JLabel lblRbi;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel lblBb;
	private JLabel lblSo_1;
	private JTextField textField_20;
	private JTextField textField_21;
	private JLabel lblSb;
	
	@SuppressWarnings("unused")
	private static int typePlayer= 0 ; // 1 - Pitcher, 2 - Bateador.


	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public AddPlayer() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 1100, 750);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 1100, 750);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBounds(0, 703, 1100, 47);
				panelBg.add(buttonPane);
				buttonPane.setBackground(new Color(255, 255, 255));
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				{
					JButton okButton = new JButton("OK");
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							btnPitcher.setEnabled(true);
							btnBateador.setEnabled(true);
						
						}
					});
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}

			separator = new JSeparator();
			separator.setOpaque(true);
			separator.setBorder(null);
			separator.setBackground(new Color(4, 10, 20));
			separator.setBounds(55, 92, 573, 2);
			panelBg.add(separator);

			panelHeader = new JPanel();
			panelHeader.setLayout(null);
			panelHeader.setBackground(new Color(0, 30, 72));
			panelHeader.setBounds(0, 0, 1100, 45);
			panelBg.add(panelHeader);

			lblRegistroJugador = new JLabel("REGISTRO JUGADOR");
			lblRegistroJugador.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRegistroJugador.setBounds(454, 0, 192, 45);
			panelHeader.add(lblRegistroJugador);
			lblRegistroJugador.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistroJugador.setForeground(new Color(255, 255, 255));
			lblRegistroJugador.setFont(new Font("Consolas", Font.BOLD, 20));

			btnClose = new JButton("");
			btnClose.setOpaque(false);
			btnClose.setIcon(new ImageIcon(AddPlayer.class.getResource("/imagenes/icons8_close_window_24px_1.png")));
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnClose.setPreferredSize(new Dimension(100, 30));
			btnClose.setHideActionText(true);
			btnClose.setForeground(new Color(255, 255, 255));
			btnClose.setFont(new Font("Consolas", Font.BOLD, 20));
			btnClose.setBorder(null);
			btnClose.setBackground(new Color(4, 10, 20));
			btnClose.setActionCommand("Cancel");
			btnClose.setBounds(1074, 0, 26, 30);
			panelHeader.add(btnClose);

			txtName = new JTextField()  {

				/**
				 * 
				 */
				private static final long serialVersionUID = 4739881032280318705L;
				
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

				/**
				 * 
				 */
				private static final long serialVersionUID = 8565552011756206292L;
				
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

			lblInformacinPersonal = new JLabel("Informaci\u00F3n personal");
			lblInformacinPersonal.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblInformacinPersonal.setVerticalAlignment(SwingConstants.BOTTOM);
			lblInformacinPersonal.setHorizontalAlignment(SwingConstants.LEFT);
			lblInformacinPersonal.setForeground(Color.BLACK);
			lblInformacinPersonal.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblInformacinPersonal.setBounds(55, 63, 225, 31);
			panelBg.add(lblInformacinPersonal);

			dateChooser = new RSDateChooser();
			dateChooser.setPlaceholder("");
			dateChooser.setFormatoFecha("dd/MM/yyyy");
			dateChooser.setFuente(new Font("Consolas", Font.PLAIN, 18));
			dateChooser.setColorForeground(Color.BLACK);
			dateChooser.setColorBackground(new Color(0, 30, 72));
			dateChooser.setBounds(55, 292, 270, 30);
			panelBg.add(dateChooser);

			cbxCountries = new JComboBox();
			cbxCountries.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxCountries.setModel(new DefaultComboBoxModel(new String[] {
					"<Seleccione>", "Estados Unidos", "Rep\u00FAblica Dominicana", "Afganist\u00E1n", "Albania", "Alemania", "Andorra", "Angola", 
					"Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiy\u00E1n", "Bahamas",
					"Banglad\u00E9s", "Barbados", "Bar\u00E9in", "B\u00E9lgica", "Belice", "Ben\u00EDn", "Bielorrusia", "Birmania", "Bolivia", 
					"Bosnia y Herzegovina", "Botsuana", "Brasil", "Brun\u00E9i", "Bulgaria", "Burkina Faso", "Burundi", "But\u00E1n", "Cabo Verde",
					"Camboya", "Camer\u00FAn", "Canad\u00E1", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras",
					"Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto",
					"El Salvador", "Emiratos \u00C1rabes Unidos", "Eritrea", "Eslovaquia","Eslovenia", "Espa\u00F1a", "Estonia", "Etiop\u00EDa", "Filipinas",
					"Finlandia", "Fiyi", "Francia", "Gab\u00F3n", "Gambia", "Georgia", "Ghana", "Granada","Grecia", "Guatemala", "Guyana", "Guinea",
					"Guinea ecuatorial", "Guinea-Bis\u00E1u", "Hait\u00ED", "Honduras", "Hungr\u00EDa", "India", "Indonesia", "Irak", "Ir\u00E1n", "Irlanda", 
					"Islandia", "Islas Marshall", "Islas Salom\u00F3n", "Israel", "Italia", "Jamaica", "Jap\u00F3n", "Jordania", "Kazajist\u00E1n", "Kenia", 
					"Kirguist\u00E1n", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "L\u00EDbano", "Liberia", "Libia", "Liechtenstein", "Lituania",
					"Luxemburgo", "Madagascar", "Malasia", "Malaui", "Maldivas", "Mal\u00ED", "Malta", "Marruecos", "Mauricio", "Mauritania", "M\u00E9xico", 
					"Micronesia", "Moldavia", "M\u00F3naco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "N\u00EDger", 
					"Nigeria", "Noruega", "Nueva Zelanda", "Om\u00E1n", "Pa\u00EDses Bajos", "Pakist\u00E1n", "Palaos", "Panam\u00E1", "Pap\u00FAa Nueva Guinea", 
					"Paraguay", "Per\u00FA", "Polonia", "Portugal", "Reino Unido", "Rep\u00FAblica Centroafricana", "Rep\u00FAblica Checa", "Rep\u00FAblica de Macedonia", 
					"Rep\u00FAblica del Congo", "Rep\u00FAblica Democr\u00E1tica del Congo", "Rep\u00FAblica Sudafricana", "Ruanda", "Ruman\u00EDa", "Rusia", "Samoa", 
					"San Crist\u00F3bal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Luc\u00EDa", "Santo Tom\u00E9 y Pr\u00EDncipe", "Senegal", "Serbia",
					"Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sud\u00E1n", "Sud\u00E1n del Sur", "Suecia", "Suiza", "Surinam", 
					"Tailandia", "Tanzania", "Tayikist\u00E1n", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "T\u00FAnez", "Turkmenist\u00E1n", "Turqu\u00EDa", "Tuvalu",
					"Ucrania", "Uganda", "Uruguay", "Uzbekist\u00E1n", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"}));
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

			txtId = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1505249453418318846L;
				
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

			txtId.setHorizontalAlignment(SwingConstants.CENTER);
			txtId.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtId.setDisabledTextColor(Color.BLACK);
			txtId.setColumns(10);
			txtId.setBounds(55, 140, 270, 30);
			panelBg.add(txtId);

			spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Float(100.00), new Float(1.00), new Float(400.00), new Float(0.10)));
			spinner.setFont(new Font("Consolas", Font.PLAIN, 18));
			spinner.setBounds(116, 346, 99, 30);
			panelBg.add(spinner);



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

			spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerNumberModel(new Float(5.00), new Float(1.00), new Float(8.00), new Float(0.10)));
			spinner_1.setFont(new Font("Consolas", Font.PLAIN, 18));
			spinner_1.setBounds(445, 346, 99, 30);
			panelBg.add(spinner_1);

			lblNmeroUniforme = new JLabel(" N\u00FAmero uniforme");
			lblNmeroUniforme.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNmeroUniforme.setHorizontalAlignment(SwingConstants.LEFT);
			lblNmeroUniforme.setForeground(Color.BLACK);
			lblNmeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNmeroUniforme.setBounds(441, 107, 187, 31);
			panelBg.add(lblNmeroUniforme);

			txtNumeroUniforme = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 5312005918110838593L;
				
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
			txtNumeroUniforme.setHorizontalAlignment(SwingConstants.CENTER);
			txtNumeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtNumeroUniforme.setDisabledTextColor(Color.BLACK);
			txtNumeroUniforme.setColumns(10);
			txtNumeroUniforme.setBounds(441, 140, 187, 30);
			panelBg.add(txtNumeroUniforme);
			
			panelPhoto = new JPanel();
			panelPhoto.setBounds(775, 106, 256, 248);
			panelBg.add(panelPhoto);
			
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
			panelInformacionJugador.setBounds(55, 488, 972, 120);
			panelBg.add(panelInformacionJugador);
			panelInformacionJugador.setLayout(new CardLayout(0, 0));
			
			panelPitcher = new JPanel();
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
			lblW.setBounds(26, 42, 52, 31);
			panelPitcher.add(lblW);
			
			textField = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 7247417383852758508L;
				
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
		
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Consolas", Font.PLAIN, 18));
			textField.setDisabledTextColor(Color.BLACK);
			textField.setColumns(10);
			textField.setBounds(26, 76, 52, 30);
			panelPitcher.add(textField);
			
			lblGl = new JLabel("L");
			lblGl.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblGl.setVerticalAlignment(SwingConstants.BOTTOM);
			lblGl.setHorizontalAlignment(SwingConstants.CENTER);
			lblGl.setForeground(Color.BLACK);
			lblGl.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblGl.setBounds(104, 42, 52, 31);
			panelPitcher.add(lblGl);
			
			lblEra = new JLabel("ERA");
			lblEra.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEra.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEra.setHorizontalAlignment(SwingConstants.CENTER);
			lblEra.setForeground(Color.BLACK);
			lblEra.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEra.setBounds(182, 42, 52, 31);
			panelPitcher.add(lblEra);
			
			lblG = new JLabel("G");
			lblG.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblG.setVerticalAlignment(SwingConstants.BOTTOM);
			lblG.setHorizontalAlignment(SwingConstants.CENTER);
			lblG.setForeground(Color.BLACK);
			lblG.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblG.setBounds(260, 42, 52, 31);
			panelPitcher.add(lblG);
			
			lblGs = new JLabel("GS");
			lblGs.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblGs.setVerticalAlignment(SwingConstants.BOTTOM);
			lblGs.setHorizontalAlignment(SwingConstants.CENTER);
			lblGs.setForeground(Color.BLACK);
			lblGs.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblGs.setBounds(338, 42, 52, 31);
			panelPitcher.add(lblGs);
			
			lblSv = new JLabel("SV");
			lblSv.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblSv.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSv.setHorizontalAlignment(SwingConstants.CENTER);
			lblSv.setForeground(Color.BLACK);
			lblSv.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblSv.setBounds(416, 42, 52, 31);
			panelPitcher.add(lblSv);
			
			lblHr = new JLabel("HR");
			lblHr.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblHr.setVerticalAlignment(SwingConstants.BOTTOM);
			lblHr.setHorizontalAlignment(SwingConstants.CENTER);
			lblHr.setForeground(Color.BLACK);
			lblHr.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblHr.setBounds(494, 42, 52, 31);
			panelPitcher.add(lblHr);
			
			lblR = new JLabel("H");
			lblR.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblR.setVerticalAlignment(SwingConstants.BOTTOM);
			lblR.setHorizontalAlignment(SwingConstants.CENTER);
			lblR.setForeground(Color.BLACK);
			lblR.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblR.setBounds(572, 42, 52, 31);
			panelPitcher.add(lblR);
			
			label = new JLabel("R");
			label.setVerticalTextPosition(SwingConstants.BOTTOM);
			label.setVerticalAlignment(SwingConstants.BOTTOM);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.BLACK);
			label.setFont(new Font("Consolas", Font.PLAIN, 20));
			label.setBounds(650, 42, 52, 31);
			panelPitcher.add(label);
			
			lblSo = new JLabel("SO");
			lblSo.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblSo.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSo.setHorizontalAlignment(SwingConstants.CENTER);
			lblSo.setForeground(Color.BLACK);
			lblSo.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblSo.setBounds(728, 42, 52, 31);
			panelPitcher.add(lblSo);
			
			lblIp = new JLabel("IP");
			lblIp.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblIp.setVerticalAlignment(SwingConstants.BOTTOM);
			lblIp.setHorizontalAlignment(SwingConstants.CENTER);
			lblIp.setForeground(Color.BLACK);
			lblIp.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblIp.setBounds(806, 42, 52, 31);
			panelPitcher.add(lblIp);
			
			lblAvg = new JLabel("AVG");
			lblAvg.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblAvg.setVerticalAlignment(SwingConstants.BOTTOM);
			lblAvg.setHorizontalAlignment(SwingConstants.CENTER);
			lblAvg.setForeground(Color.BLACK);
			lblAvg.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblAvg.setBounds(884, 42, 52, 31);
			panelPitcher.add(lblAvg);
			
			textField_1 = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 3956255546944534400L;
				
				/************* PARA REDONDEAR JTEXTFIELD *************/
				@Override 
				protected void paintComponent(Graphics g) {
					if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
						Graphics2D g2 = (Graphics2D) g.create();
						g2.setPaint(getBackground());
						g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
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
			textField_1.setBounds(104, 76, 52, 30);
			panelPitcher.add(textField_1);
			
			textField_2 = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 4059016494301269566L;
				
				/************* PARA REDONDEAR JTEXTFIELD *************/
				@Override 
				protected void paintComponent(Graphics g) {
					if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
						Graphics2D g2 = (Graphics2D) g.create();
						g2.setPaint(getBackground());
						g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
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
			textField_2.setBounds(182, 76, 52, 30);
			panelPitcher.add(textField_2);
			
			textField_3 = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = -5199349132939587088L;
				
				/************* PARA REDONDEAR JTEXTFIELD *************/
				@Override 
				protected void paintComponent(Graphics g) {
					if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
						Graphics2D g2 = (Graphics2D) g.create();
						g2.setPaint(getBackground());
						g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
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
			textField_3.setBounds(260, 76, 52, 30);
			panelPitcher.add(textField_3);
			
			textField_4 = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 2109767031727162985L;
				
				/************* PARA REDONDEAR JTEXTFIELD *************/
				@Override 
				protected void paintComponent(Graphics g) {
					if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
						Graphics2D g2 = (Graphics2D) g.create();
						g2.setPaint(getBackground());
						g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
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
			textField_4.setBounds(338, 76, 52, 30);
			panelPitcher.add(textField_4);
			
			textField_5 = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 5032541922362533657L;
				
				/************* PARA REDONDEAR JTEXTFIELD *************/
				@Override 
				protected void paintComponent(Graphics g) {
					if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
						Graphics2D g2 = (Graphics2D) g.create();
						g2.setPaint(getBackground());
						g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
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
			textField_5.setBounds(416, 76, 52, 30);
			panelPitcher.add(textField_5);
			
			textField_6 = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 2751677839397771534L;
				
				/************* PARA REDONDEAR JTEXTFIELD *************/
				@Override 
				protected void paintComponent(Graphics g) {
					if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
						Graphics2D g2 = (Graphics2D) g.create();
						g2.setPaint(getBackground());
						g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
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
			textField_6.setBounds(494, 76, 52, 30);
			panelPitcher.add(textField_6);
			
			textField_7 = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = -5169980214119263848L;
				
				/************* PARA REDONDEAR JTEXTFIELD *************/
				@Override 
				protected void paintComponent(Graphics g) {
					if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
						Graphics2D g2 = (Graphics2D) g.create();
						g2.setPaint(getBackground());
						g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
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
			textField_7.setBounds(572, 76, 52, 30);
			panelPitcher.add(textField_7);
			
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
			textField_8.setBounds(650, 76, 52, 30);
			panelPitcher.add(textField_8);
			
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
			textField_9.setBounds(728, 76, 52, 30);
			panelPitcher.add(textField_9);
			
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
			textField_11.setBounds(884, 76, 52, 30);
			panelPitcher.add(textField_11);
			
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
			textField_10.setBounds(806, 76, 52, 30);
			panelPitcher.add(textField_10);
			
			separator_3 = new JSeparator();
			separator_3.setOpaque(true);
			separator_3.setBorder(null);
			separator_3.setBackground(new Color(4, 10, 20));
			separator_3.setBounds(26, 29, 910, 2);
			panelPitcher.add(separator_3);
			
			lblEstadsticaLanzador = new JLabel("Estad\u00EDstica Lanzador");
			lblEstadsticaLanzador.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEstadsticaLanzador.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEstadsticaLanzador.setHorizontalAlignment(SwingConstants.LEFT);
			lblEstadsticaLanzador.setForeground(Color.BLACK);
			lblEstadsticaLanzador.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEstadsticaLanzador.setBounds(26, 0, 225, 31);
			panelPitcher.add(lblEstadsticaLanzador);
			
			panelBateador = new JPanel();
			panelBateador.setVisible(false);
			panelBateador.setBackground(new Color(255, 255, 255));
			panelInformacionJugador.add(panelBateador, "name_34931057259399");
			panelBateador.setLayout(null);
			
			separator_4 = new JSeparator();
			separator_4.setOpaque(true);
			separator_4.setBorder(null);
			separator_4.setBackground(new Color(4, 10, 20));
			separator_4.setBounds(30, 29, 910, 2);
			panelBateador.add(separator_4);
			
			lblEstadsticaBateador = new JLabel("Estad\u00EDstica Bateador");
			lblEstadsticaBateador.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEstadsticaBateador.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEstadsticaBateador.setHorizontalAlignment(SwingConstants.LEFT);
			lblEstadsticaBateador.setForeground(Color.BLACK);
			lblEstadsticaBateador.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEstadsticaBateador.setBounds(30, 0, 225, 31);
			panelBateador.add(lblEstadsticaBateador);
			
			lblAvg_1 = new JLabel("AVG");
			lblAvg_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblAvg_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblAvg_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblAvg_1.setForeground(Color.BLACK);
			lblAvg_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblAvg_1.setBounds(30, 42, 52, 31);
			panelBateador.add(lblAvg_1);
			
			textField_12 = new JTextField() {
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
			textField_12.setHorizontalAlignment(SwingConstants.CENTER);
			textField_12.setFont(new Font("Consolas", Font.PLAIN, 18));
			textField_12.setDisabledTextColor(Color.BLACK);
			textField_12.setColumns(10);
			textField_12.setBounds(30, 76, 52, 30);
			panelBateador.add(textField_12);
			
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
			textField_13.setBounds(108, 76, 52, 30);
			panelBateador.add(textField_13);
			
			lblR_1 = new JLabel("R");
			lblR_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblR_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblR_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblR_1.setForeground(Color.BLACK);
			lblR_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblR_1.setBounds(108, 42, 52, 31);
			panelBateador.add(lblR_1);
			
			lblH = new JLabel("H1");
			lblH.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblH.setVerticalAlignment(SwingConstants.BOTTOM);
			lblH.setHorizontalAlignment(SwingConstants.CENTER);
			lblH.setForeground(Color.BLACK);
			lblH.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblH.setBounds(186, 42, 52, 31);
			panelBateador.add(lblH);
			
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
			textField_14.setBounds(186, 76, 52, 30);
			panelBateador.add(textField_14);
			
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
			textField_15.setBounds(264, 76, 52, 30);
			panelBateador.add(textField_15);
			
			lblH_1 = new JLabel("H2");
			lblH_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblH_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblH_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblH_1.setForeground(Color.BLACK);
			lblH_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblH_1.setBounds(264, 42, 52, 31);
			panelBateador.add(lblH_1);
			
			lblH_2 = new JLabel("H3");
			lblH_2.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblH_2.setVerticalAlignment(SwingConstants.BOTTOM);
			lblH_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblH_2.setForeground(Color.BLACK);
			lblH_2.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblH_2.setBounds(342, 42, 52, 31);
			panelBateador.add(lblH_2);
			
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
			textField_16.setBounds(342, 76, 52, 30);
			panelBateador.add(textField_16);
			
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
			textField_17.setBounds(420, 76, 52, 30);
			panelBateador.add(textField_17);
			
			lblHr_1 = new JLabel("HR");
			lblHr_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblHr_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblHr_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHr_1.setForeground(Color.BLACK);
			lblHr_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblHr_1.setBounds(420, 42, 52, 31);
			panelBateador.add(lblHr_1);
			
			lblRbi = new JLabel("RBI");
			lblRbi.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblRbi.setVerticalAlignment(SwingConstants.BOTTOM);
			lblRbi.setHorizontalAlignment(SwingConstants.CENTER);
			lblRbi.setForeground(Color.BLACK);
			lblRbi.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblRbi.setBounds(498, 42, 52, 31);
			panelBateador.add(lblRbi);
			
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
			textField_18.setBounds(498, 76, 52, 30);
			panelBateador.add(textField_18);
			
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
			textField_19.setBounds(576, 76, 52, 30);
			panelBateador.add(textField_19);
			
			lblBb = new JLabel("BB");
			lblBb.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblBb.setVerticalAlignment(SwingConstants.BOTTOM);
			lblBb.setHorizontalAlignment(SwingConstants.CENTER);
			lblBb.setForeground(Color.BLACK);
			lblBb.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblBb.setBounds(576, 42, 52, 31);
			panelBateador.add(lblBb);
			
			lblSo_1 = new JLabel("SO");
			lblSo_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblSo_1.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSo_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblSo_1.setForeground(Color.BLACK);
			lblSo_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblSo_1.setBounds(654, 42, 52, 31);
			panelBateador.add(lblSo_1);
			
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
			textField_20.setBounds(654, 76, 52, 30);
			panelBateador.add(textField_20);
			
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
			textField_21.setBounds(732, 76, 52, 30);
			panelBateador.add(textField_21);
			
			lblSb = new JLabel("SB");
			lblSb.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblSb.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSb.setHorizontalAlignment(SwingConstants.CENTER);
			lblSb.setForeground(Color.BLACK);
			lblSb.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblSb.setBounds(732, 42, 52, 31);
			panelBateador.add(lblSb);
			
			btnPitcher = new JButton("Lanzador");
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
			btnPitcher.setBackground(new Color(4, 10, 20));
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
			btnBateador.setBackground(new Color(4, 10, 20));
			btnBateador.setBounds(542, 414, 146, 30);
			panelBg.add(btnBateador);
		}
	}
}
