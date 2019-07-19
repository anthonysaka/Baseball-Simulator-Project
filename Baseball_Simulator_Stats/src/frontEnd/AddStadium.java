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
import javax.swing.JOptionPane;

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

import backEnd.Lidom;
import backEnd.Stadium;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddStadium extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblRegistroEquipo;
	private JPanel panelHeader;
	private JButton btnClose;
	private JTextField txtDireccion;
	private JLabel lblNombre;
	private JLabel lblInformacinPersonal;
	private JLabel lblId;
	private JFormattedTextField txtId;
	private JLabel lblNmeroUniforme;
	private JTextField txtName;

	private JButton btnRegistrar;
	private JButton btnCancelar;


	/**
	 * Create the dialog.
	 */
	public AddStadium() {

		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 687, 332);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 687, 332);
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
			panelHeader.setBounds(0, 0, 687, 45);
			panelBg.add(panelHeader);

			lblRegistroEquipo = new JLabel("REGISTRO ESTADIO");
			lblRegistroEquipo.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRegistroEquipo.setBounds(244, 0, 192, 45);
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
			btnClose.setBounds(661, 0, 26, 30);
			panelHeader.add(btnClose);

			txtDireccion = new JTextField()  {

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
			txtDireccion.addKeyListener(new KeyAdapter() {
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

			txtDireccion.setHorizontalAlignment(SwingConstants.CENTER);
			txtDireccion.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtDireccion.setDisabledTextColor(Color.BLACK);
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(55, 216, 573, 30);
			panelBg.add(txtDireccion);

			lblNombre = new JLabel("  Direcci\u00F3n");
			lblNombre.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblNombre.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
			lblNombre.setForeground(Color.BLACK);
			lblNombre.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNombre.setBounds(55, 183, 270, 31);
			panelBg.add(lblNombre);

			lblInformacinPersonal = new JLabel("Informaci\u00F3n Estadio");
			lblInformacinPersonal.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblInformacinPersonal.setVerticalAlignment(SwingConstants.BOTTOM);
			lblInformacinPersonal.setHorizontalAlignment(SwingConstants.LEFT);
			lblInformacinPersonal.setForeground(Color.BLACK);
			lblInformacinPersonal.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblInformacinPersonal.setBounds(55, 63, 225, 31);
			panelBg.add(lblInformacinPersonal);

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

			lblNmeroUniforme = new JLabel("  Name");
			lblNmeroUniforme.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNmeroUniforme.setHorizontalAlignment(SwingConstants.LEFT);
			lblNmeroUniforme.setForeground(Color.BLACK);
			lblNmeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNmeroUniforme.setBounds(358, 107, 187, 31);
			panelBg.add(lblNmeroUniforme);

			txtName = new JTextField() {
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
			txtName.setBounds(358, 140, 270, 30);
			panelBg.add(txtName);

			btnRegistrar = new JButton("Registrar");
			btnRegistrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String id = txtId.getText();
					String name = txtName.getText();
					String address = txtDireccion.getText();

					if (!id.equalsIgnoreCase("##-###-###") && !name.equalsIgnoreCase("") && !address.equalsIgnoreCase("")) {
						Stadium stadio = new Stadium(id, name, address);
						Lidom.getInstance().addStadium(stadio);

						ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/icons8_checked_48px_1.png"));
						String[] options = {"Ok"};	
						JOptionPane.showOptionDialog(null, "Registro con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
						clean();
					}
					else {
						ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/icons8_cancel_2_48px_1.png"));
						String[] options = {"Ok"};	
						JOptionPane.showOptionDialog(null, "Complete todos los campos, correctamente!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					}



				}
			});
			btnRegistrar.setIcon(new ImageIcon(AddPlayer.class.getResource("/imagenes/icons8_baseball_24px.png")));
			btnRegistrar.setIconTextGap(5);
			btnRegistrar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnRegistrar.setForeground(new Color(255, 255, 240));
			btnRegistrar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnRegistrar.setBorder(null);
			btnRegistrar.setBackground(new Color(0, 30, 72));
			btnRegistrar.setBounds(302, 286, 146, 30);
			panelBg.add(btnRegistrar);

			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnCancelar.setIcon(new ImageIcon(AddPlayer.class.getResource("/imagenes/icons8_cancel_24px_2.png")));
			btnCancelar.setIconTextGap(5);
			btnCancelar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnCancelar.setForeground(new Color(255, 255, 240));
			btnCancelar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnCancelar.setBorder(null);
			btnCancelar.setBackground(new Color(0, 30, 70));
			btnCancelar.setBounds(460, 286, 146, 30);
			panelBg.add(btnCancelar);
		}
	}



	/** Metodos **/




	private void clean() {
		txtId.setText("");
		txtName.setText("");
		txtDireccion.setText("");
	}
}
