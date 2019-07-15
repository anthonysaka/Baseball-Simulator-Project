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
import rojeru_san.componentes.RSDateChooser;
import sun.java2d.pipe.TextPipe;
import rojeru_san.componentes.RSCalendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class AddPlayer extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblRegistroJugador;
	private JPanel panelHeader;
	private JButton btnMini;
	private JButton btnClose;
	private JTextField txtName;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JTextField txtApellido;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblPasDeNacimiento;
	private JLabel lblInformacinPersonal;
	private RSDateChooser dateChooser;
	private JComboBox cbxCountries;
	private JLabel lblId;
	private JTextField txtId;
	private JSpinner spinner;
	private JLabel lblPeso;
	private JLabel lblAltura;
	private JSpinner spinner_1;
	private JLabel lblNmeroUniforme;
	private JTextField txtNumeroUniforme;


	/**
	 * Create the dialog.
	 */
	public AddPlayer() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 1100, 700);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 1100, 700);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBounds(0, 653, 1100, 47);
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
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}

			separator = new JSeparator();
			separator.setOpaque(true);
			separator.setBorder(null);
			separator.setBackground(new Color(4, 10, 20));
			separator.setBounds(12, 91, 573, 2);
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

			btnMini = new JButton("");
			btnMini.setOpaque(false);
			btnMini.setIcon(new ImageIcon(AddPlayer.class.getResource("/imagenes/icons8_minimize_window_24px.png")));
			btnMini.setPreferredSize(new Dimension(100, 30));
			btnMini.setHideActionText(true);
			btnMini.setForeground(Color.WHITE);
			btnMini.setFont(new Font("Consolas", Font.BOLD, 20));
			btnMini.setBorder(null);
			btnMini.setBackground(new Color(4, 10, 20));
			btnMini.setActionCommand("Cancel");
			btnMini.setBounds(1046, 0, 26, 30);
			panelHeader.add(btnMini);

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
			txtName.setBounds(12, 215, 270, 30);
			panelBg.add(txtName);

			lblNombre = new JLabel("  Nombres");
			lblNombre.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblNombre.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
			lblNombre.setForeground(Color.BLACK);
			lblNombre.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNombre.setBounds(12, 182, 99, 31);
			panelBg.add(lblNombre);

			lblApellido = new JLabel("  Apellidos");
			lblApellido.setVerticalAlignment(SwingConstants.BOTTOM);
			lblApellido.setHorizontalAlignment(SwingConstants.LEFT);
			lblApellido.setForeground(Color.BLACK);
			lblApellido.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblApellido.setBounds(315, 182, 128, 31);
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
			/**********************************************************/

			txtApellido.setHorizontalAlignment(SwingConstants.CENTER);
			txtApellido.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtApellido.setDisabledTextColor(Color.BLACK);
			txtApellido.setColumns(10);
			txtApellido.setBounds(315, 215, 270, 30);
			panelBg.add(txtApellido);

			lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
			lblFechaDeNacimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblFechaDeNacimiento.setVerticalAlignment(SwingConstants.BOTTOM);
			lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
			lblFechaDeNacimiento.setForeground(Color.BLACK);
			lblFechaDeNacimiento.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblFechaDeNacimiento.setBounds(12, 269, 238, 31);
			panelBg.add(lblFechaDeNacimiento);

			lblPasDeNacimiento = new JLabel("Pa\u00EDs de nacimiento");
			lblPasDeNacimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPasDeNacimiento.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPasDeNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
			lblPasDeNacimiento.setForeground(Color.BLACK);
			lblPasDeNacimiento.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblPasDeNacimiento.setBounds(315, 269, 238, 31);
			panelBg.add(lblPasDeNacimiento);

			lblInformacinPersonal = new JLabel("Informaci\u00F3n personal");
			lblInformacinPersonal.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblInformacinPersonal.setVerticalAlignment(SwingConstants.BOTTOM);
			lblInformacinPersonal.setHorizontalAlignment(SwingConstants.LEFT);
			lblInformacinPersonal.setForeground(Color.BLACK);
			lblInformacinPersonal.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblInformacinPersonal.setBounds(12, 62, 225, 31);
			panelBg.add(lblInformacinPersonal);

			dateChooser = new RSDateChooser();
			dateChooser.setPlaceholder("");
			dateChooser.setFormatoFecha("dd/MM/yyyy");
			dateChooser.setFuente(new Font("Consolas", Font.PLAIN, 18));
			dateChooser.setColorForeground(Color.BLACK);
			dateChooser.setColorBackground(new Color(0, 30, 72));
			dateChooser.setBounds(12, 302, 270, 30);
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
			cbxCountries.setBounds(315, 302, 270, 30);
			panelBg.add(cbxCountries);
			
			lblId = new JLabel("  N\u00FAmero ID");
			lblId.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblId.setVerticalAlignment(SwingConstants.BOTTOM);
			lblId.setHorizontalAlignment(SwingConstants.LEFT);
			lblId.setForeground(Color.BLACK);
			lblId.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblId.setBounds(12, 106, 137, 31);
			panelBg.add(lblId);
			
			txtId = new JTextField() {
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
			txtId.setBounds(12, 139, 270, 30);
			panelBg.add(txtId);
			
			spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Float(100), new Float(1), null, new Float(1)));
			spinner.setFont(new Font("Consolas", Font.PLAIN, 18));
			spinner.setBounds(12, 379, 75, 30);
			panelBg.add(spinner);
			
			lblPeso = new JLabel("Peso");
			lblPeso.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPeso.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPeso.setHorizontalAlignment(SwingConstants.LEFT);
			lblPeso.setForeground(Color.BLACK);
			lblPeso.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblPeso.setBounds(12, 345, 75, 31);
			panelBg.add(lblPeso);
			
			lblAltura = new JLabel("Altura");
			lblAltura.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblAltura.setVerticalAlignment(SwingConstants.BOTTOM);
			lblAltura.setHorizontalAlignment(SwingConstants.LEFT);
			lblAltura.setForeground(Color.BLACK);
			lblAltura.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblAltura.setBounds(145, 345, 75, 31);
			panelBg.add(lblAltura);
			
			spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerNumberModel(new Float(5), new Float(1), null, new Float(1)));
			spinner_1.setFont(new Font("Consolas", Font.PLAIN, 18));
			spinner_1.setBounds(145, 379, 75, 30);
			panelBg.add(spinner_1);
			
			lblNmeroUniforme = new JLabel(" N\u00FAmero uniforme");
			lblNmeroUniforme.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNmeroUniforme.setHorizontalAlignment(SwingConstants.LEFT);
			lblNmeroUniforme.setForeground(Color.BLACK);
			lblNmeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNmeroUniforme.setBounds(398, 106, 187, 31);
			panelBg.add(lblNmeroUniforme);
			
			txtNumeroUniforme = new JTextField() {
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
			txtNumeroUniforme.setBounds(398, 139, 187, 30);
			panelBg.add(txtNumeroUniforme);
		}
	}
}
