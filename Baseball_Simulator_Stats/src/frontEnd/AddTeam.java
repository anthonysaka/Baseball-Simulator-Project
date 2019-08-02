
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

import backEnd.Lidom;
import backEnd.Stadium;
import backEnd.Team;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("unused")
public class AddTeam extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9052327416025695880L;
	
	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblRegistroEquipo;
	private JPanel panelHeader;
	private JTextField txtNameEquipo;
	private JLabel lblNombre;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblPasDeNacimiento;
	private JLabel lblInformacinPersonal;
	private RSDateChooser dateChooserFechaFundacion;
	private JComboBox<String> cbxEstadios;
	private JLabel lblId;
	private JFormattedTextField txtIdEquipo;
	private JLabel lblNmeroUniforme;
	private JTextField txtManager;
	private JPanel panelPhoto;
	private JSeparator separator_1;
	private JLabel lblFoto;
	private JSeparator separator_2;

	private static Boolean selectionFoto = false;
	private JButton btnSeleccionarFoto;
	private JButton btnRegistrarEquipo;
	private JButton btnCancelarEquipo;
	private JLabel lblLogoEquipo;


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

			txtNameEquipo = new JTextField()  {

				/**
				 * 
				 */
				private static final long serialVersionUID = 8456196556235908444L;
				
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
			txtNameEquipo.addKeyListener(new KeyAdapter() {
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

			txtNameEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			txtNameEquipo.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtNameEquipo.setDisabledTextColor(Color.BLACK);
			txtNameEquipo.setColumns(10);
			txtNameEquipo.setBounds(55, 216, 573, 30);
			panelBg.add(txtNameEquipo);

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

			dateChooserFechaFundacion = new RSDateChooser();
			dateChooserFechaFundacion.setPlaceholder("");
			dateChooserFechaFundacion.setFormatoFecha("dd/MM/yyyy");
			dateChooserFechaFundacion.setFuente(new Font("Consolas", Font.PLAIN, 18));
			dateChooserFechaFundacion.setColorForeground(Color.BLACK);
			dateChooserFechaFundacion.setColorBackground(new Color(0, 30, 72));
			dateChooserFechaFundacion.setBounds(55, 292, 270, 30);
			panelBg.add(dateChooserFechaFundacion);

			cbxEstadios = new JComboBox<String>();
			cbxEstadios.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxEstadios.setBounds(358, 292, 270, 30);
			panelBg.add(cbxEstadios);

			lblId = new JLabel("  N\u00FAmero ID");
			lblId.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblId.setVerticalAlignment(SwingConstants.BOTTOM);
			lblId.setHorizontalAlignment(SwingConstants.LEFT);
			lblId.setForeground(Color.BLACK);
			lblId.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblId.setBounds(55, 107, 137, 31);
			panelBg.add(lblId);



			txtIdEquipo = new JFormattedTextField() {

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
			txtIdEquipo.setEditable(false);
			/**********************************************************/	

			Lidom.getInstance();
			txtIdEquipo.setText("EQP-"+ Lidom.generateIdTeam);

			txtIdEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			txtIdEquipo.setFont(new Font("Consolas", Font.BOLD, 18));
			txtIdEquipo.setDisabledTextColor(Color.BLACK);
			txtIdEquipo.setColumns(10);
			txtIdEquipo.setBounds(55, 140, 270, 30);
			panelBg.add(txtIdEquipo);

			lblNmeroUniforme = new JLabel("  Manager");
			lblNmeroUniforme.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNmeroUniforme.setHorizontalAlignment(SwingConstants.LEFT);
			lblNmeroUniforme.setForeground(Color.BLACK);
			lblNmeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNmeroUniforme.setBounds(358, 107, 187, 31);
			panelBg.add(lblNmeroUniforme);

			txtManager = new JTextField() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 8814759619252211098L;
				
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
			txtManager.addKeyListener(new KeyAdapter() {
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
			txtManager.setHorizontalAlignment(SwingConstants.CENTER);
			txtManager.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtManager.setDisabledTextColor(Color.BLACK);
			txtManager.setColumns(10);
			txtManager.setBounds(358, 140, 270, 30);
			panelBg.add(txtManager);

			panelPhoto = new JPanel();
			panelPhoto.setBorder(new LineBorder(new Color(0, 30, 72)));
			panelPhoto.setBounds(785, 106, 246, 216);
			panelBg.add(panelPhoto);
			panelPhoto.setLayout(null);
			
			lblLogoEquipo = new JLabel("");
			lblLogoEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblLogoEquipo.setBounds(0, 0, 246, 216);
			panelPhoto.add(lblLogoEquipo);

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
						String routetosave = "Fotos_Equipos/"+ txtNameEquipo.getText() + ".png";
						ImageIO.write(foto, "png", new File(routetosave));
						/** to adjust image at size of JLabel **/
						ImageIcon fotoJugador = new ImageIcon(routeOfFoto);
						Icon fotoJ = new ImageIcon(fotoJugador.getImage().getScaledInstance(lblLogoEquipo.getWidth(), lblLogoEquipo.getHeight(), Image.SCALE_SMOOTH));
						lblLogoEquipo.setIcon(fotoJ);
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
			btnSeleccionarFoto.setBounds(830, 335, 156, 30);
			panelBg.add(btnSeleccionarFoto);

			btnRegistrarEquipo = new JButton("Registrar");
			btnRegistrarEquipo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String id = txtIdEquipo.getText();
					String name = txtNameEquipo.getText();
					String manager = txtManager.getText();
					String stadio = cbxEstadios.getSelectedItem().toString();
					Date fechaFundacion = dateChooserFechaFundacion.getDatoFecha();


					if ((selectionFoto == true) && (!id.equalsIgnoreCase("##-###-###")) && (!name.equalsIgnoreCase("")) && (!manager.equalsIgnoreCase("")) && (cbxEstadios.getSelectedIndex() > 0) && (fechaFundacion != null)) {

						Team team = new Team(id, name, manager, fechaFundacion, stadio);
						Lidom.getInstance().addTeam(team);

						ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_checked_48px_1.png"));
						String[] options = {"Ok"};	
						JOptionPane.showOptionDialog(null, "Registro con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
						Lidom.getInstance().saveInitData(Lidom.getInstance());
						clean();
					}
					else {
						ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
						String[] options = {"Ok"};	
						JOptionPane.showOptionDialog(null, "Complete todos los campos, correctamente!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
					}
				}
			});
			btnRegistrarEquipo.setIcon(new ImageIcon(AddPlayer.class.getResource("/iconos_imagenes/icons8_baseball_24px.png")));
			btnRegistrarEquipo.setIconTextGap(5);
			btnRegistrarEquipo.setHorizontalTextPosition(SwingConstants.LEFT);
			btnRegistrarEquipo.setForeground(new Color(255, 255, 240));
			btnRegistrarEquipo.setFont(new Font("Consolas", Font.BOLD, 17));
			btnRegistrarEquipo.setBorder(null);
			btnRegistrarEquipo.setBackground(new Color(0, 30, 72));
			btnRegistrarEquipo.setBounds(755, 442, 146, 30);
			panelBg.add(btnRegistrarEquipo);

			btnCancelarEquipo = new JButton("Cancelar");
			btnCancelarEquipo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	
					int xOption	= JOptionPane.showOptionDialog(null, "¿Seguro que desea cancelar?, la ventana se cerrará.", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					if (xOption == 0) {
						clean();
						dispose();
					}
				}
			});
			btnCancelarEquipo.setIcon(new ImageIcon(AddPlayer.class.getResource("/iconos_imagenes/icons8_cancel_24px_2.png")));
			btnCancelarEquipo.setIconTextGap(5);
			btnCancelarEquipo.setHorizontalTextPosition(SwingConstants.LEFT);
			btnCancelarEquipo.setForeground(new Color(255, 255, 240));
			btnCancelarEquipo.setFont(new Font("Consolas", Font.BOLD, 17));
			btnCancelarEquipo.setBorder(null);
			btnCancelarEquipo.setBackground(new Color(0, 30, 70));
			btnCancelarEquipo.setBounds(913, 442, 146, 30);
			panelBg.add(btnCancelarEquipo);
		}
		
		
		loadStadiumsCbx();
	}


	private void clean() {
		txtIdEquipo.setText("EQP-"+ Lidom.generateIdTeam);
		txtManager.setText("");
		txtNameEquipo.setText("");
		cbxEstadios.setSelectedIndex(0);
		dateChooserFechaFundacion.setDatoFecha(null);

	}
	
	private void loadStadiumsCbx() {

		cbxEstadios.removeAllItems();

		for (Stadium s : Lidom.getInstance().getListStadium()) {
			cbxEstadios.addItem(s.getName());	
		}
		
		cbxEstadios.insertItemAt(new String("<Seleccionar"), 0);
		cbxEstadios.setSelectedIndex(0);
		

	}


}

