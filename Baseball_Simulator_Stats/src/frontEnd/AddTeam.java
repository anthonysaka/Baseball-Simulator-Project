package frontEnd;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
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
import java.text.ParseException;
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
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddTeam extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblRegistroEquipo;
	private JPanel panelHeader;
	private JButton btnClose;
	private JTextField txtName;
	private JLabel lblNombre;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblPasDeNacimiento;
	private JLabel lblInformacinPersonal;
	private RSDateChooser dateChooser;
	private JComboBox<String> cbxCountries;
	private JLabel lblId;
	private JFormattedTextField txtId;
	private JLabel lblNmeroUniforme;
	private JTextField txtNumeroUniforme;
	private JPanel panelPhoto;
	private JSeparator separator_1;
	private JLabel lblFoto;
	private JSeparator separator_2;

	private static int typePlayer= 0 ; // 1 - Pitcher, 2 - Bateador.
	private JButton btnSeleccionarFoto;
	private JButton button;
	private JButton button_1;


	/**
	 * Create the dialog.
	 */
	public AddTeam() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 1092, 485);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 1092, 485);
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

			lblRegistroEquipo = new JLabel("REGISTRO EQUIPO");
			lblRegistroEquipo.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRegistroEquipo.setBounds(453, 0, 192, 45);
			panelHeader.add(lblRegistroEquipo);
			lblRegistroEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistroEquipo.setForeground(new Color(255, 255, 255));
			lblRegistroEquipo.setFont(new Font("Consolas", Font.BOLD, 20));

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
			btnClose.setBounds(1066, 0, 26, 30);
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
			txtName.setBounds(55, 216, 573, 30);
			panelBg.add(txtName);

			lblNombre = new JLabel("  Nombre del equipo");
			lblNombre.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblNombre.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
			lblNombre.setForeground(Color.BLACK);
			lblNombre.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNombre.setBounds(55, 183, 270, 31);
			panelBg.add(lblNombre);

			lblFechaDeNacimiento = new JLabel("Fecha de fundaci\u00F3n");
			lblFechaDeNacimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblFechaDeNacimiento.setVerticalAlignment(SwingConstants.BOTTOM);
			lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
			lblFechaDeNacimiento.setForeground(Color.BLACK);
			lblFechaDeNacimiento.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblFechaDeNacimiento.setBounds(55, 259, 238, 31);
			panelBg.add(lblFechaDeNacimiento);

			lblPasDeNacimiento = new JLabel("Estadio");
			lblPasDeNacimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPasDeNacimiento.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPasDeNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
			lblPasDeNacimiento.setForeground(Color.BLACK);
			lblPasDeNacimiento.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblPasDeNacimiento.setBounds(358, 259, 238, 31);
			panelBg.add(lblPasDeNacimiento);

			lblInformacinPersonal = new JLabel("Informaci\u00F3n Equipo");
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

			cbxCountries = new JComboBox<String>();
			cbxCountries.setFont(new Font("Consolas", Font.PLAIN, 18));
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

			lblNmeroUniforme = new JLabel("  Manager");
			lblNmeroUniforme.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNmeroUniforme.setHorizontalAlignment(SwingConstants.LEFT);
			lblNmeroUniforme.setForeground(Color.BLACK);
			lblNmeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNmeroUniforme.setBounds(358, 107, 187, 31);
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
			txtNumeroUniforme.addKeyListener(new KeyAdapter() {
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
			txtNumeroUniforme.setHorizontalAlignment(SwingConstants.CENTER);
			txtNumeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtNumeroUniforme.setDisabledTextColor(Color.BLACK);
			txtNumeroUniforme.setColumns(10);
			txtNumeroUniforme.setBounds(358, 140, 270, 30);
			panelBg.add(txtNumeroUniforme);

			panelPhoto = new JPanel();
			panelPhoto.setBorder(new LineBorder(new Color(0, 30, 72)));
			panelPhoto.setBounds(785, 106, 246, 216);
			panelBg.add(panelPhoto);

			separator_1 = new JSeparator();
			separator_1.setOpaque(true);
			separator_1.setBorder(null);
			separator_1.setBackground(new Color(4, 10, 20));
			separator_1.setBounds(775, 91, 256, 2);
			panelBg.add(separator_1);

			lblFoto = new JLabel("Logo");
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

			btnSeleccionarFoto = new JButton("Seleccionar");
			btnSeleccionarFoto.setIconTextGap(30);
			btnSeleccionarFoto.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnSeleccionarFoto.setForeground(new Color(255, 255, 240));
			btnSeleccionarFoto.setFont(new Font("Consolas", Font.BOLD, 17));
			btnSeleccionarFoto.setBorder(null);
			btnSeleccionarFoto.setBackground(new Color(0,30,72));
			btnSeleccionarFoto.setBounds(830, 335, 156, 30);
			panelBg.add(btnSeleccionarFoto);

			button = new JButton("Registrar");
			button.setIcon(new ImageIcon(AddPlayer.class.getResource("/imagenes/icons8_baseball_24px.png")));
			button.setIconTextGap(5);
			button.setHorizontalTextPosition(SwingConstants.LEFT);
			button.setForeground(new Color(255, 255, 240));
			button.setFont(new Font("Consolas", Font.BOLD, 17));
			button.setBorder(null);
			button.setBackground(new Color(0, 30, 72));
			button.setBounds(755, 442, 146, 30);
			panelBg.add(button);

			button_1 = new JButton("Cancelar");
			button_1.setIcon(new ImageIcon(AddPlayer.class.getResource("/imagenes/icons8_cancel_24px_2.png")));
			button_1.setIconTextGap(5);
			button_1.setHorizontalTextPosition(SwingConstants.LEFT);
			button_1.setForeground(new Color(255, 255, 240));
			button_1.setFont(new Font("Consolas", Font.BOLD, 17));
			button_1.setBorder(null);
			button_1.setBackground(new Color(0, 30, 70));
			button_1.setBounds(913, 442, 146, 30);
			panelBg.add(button_1);
		}
	}

}
