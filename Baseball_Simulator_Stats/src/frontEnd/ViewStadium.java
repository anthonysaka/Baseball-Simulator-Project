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
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import backEnd.Lidom;
import backEnd.Stadium;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewStadium extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblRegistroEquipo;
	private JPanel panelHeader;
	private JButton btnClose;
	private JScrollPane scrollPane;

	private static DefaultTableModel model;
	private static JTable tableStadiums;
	private static Object[] column;


	/**
	 * Create the dialog.
	 */
	public ViewStadium() {

		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 687, 566);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 687, 566);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);

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
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 58, 665, 425);
			panelBg.add(scrollPane);
			
			tableStadiums = new JTable();
			tableStadiums.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"N\u00FAmero ID", "Nombre", "Direcci\u00F3n"
				}
			) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
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
			tableStadiums.getColumnModel().getColumn(0).setResizable(false);
			tableStadiums.getColumnModel().getColumn(1).setResizable(false);
			tableStadiums.getColumnModel().getColumn(2).setResizable(false);
			scrollPane.setViewportView(tableStadiums);

			try {
				// Definición de la máscara para ID.
				MaskFormatter maskID = null;
				maskID = new MaskFormatter("##-###-###");
				maskID.setPlaceholderCharacter('#');
				/**********************************************************/		
			} 
			catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		
		loadTableStadiums(); // para cargar la tabla de los estadios registrados.
	}



	/** Metodos **/
	
	public void loadTableStadiums() {
		model = (DefaultTableModel) tableStadiums.getModel();
		model.setRowCount(0);
		column = new Object[model.getColumnCount()];

		for (int i = 0; i < Lidom.getInstance().getListStadium().size(); i++) {
			column[0] = Lidom.getInstance().getListStadium().get(i).getId();
			column[1] =  Lidom.getInstance().getListStadium().get(i).getName();
			column[2] =  Lidom.getInstance().getListStadium().get(i).getAddress();
			
				model.addRow(column);
			}
	}



}
