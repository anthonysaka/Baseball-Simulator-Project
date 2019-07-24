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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import backEnd.Lidom;
import backEnd.Stadium;
import backEnd.Team;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewStadium extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblListaEstadios;
	private JPanel panelHeader;
	private JScrollPane scrollPane;

	private static DefaultTableModel model;
	private static JTable tableStadiums;
	private static Object[] column;
	private JButton btnEliminar;
	private JButton btnCancelar;
	private JButton btnBuscar;
	private JTextField txtBuscar;
	private JLabel lblBuscarPor;
	private JComboBox cbxOptionsSearch;
	private String codeEstadio;
	private String nameEstadio;


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

			lblListaEstadios = new JLabel("LISTA ESTADIOS");
			lblListaEstadios.setHorizontalTextPosition(SwingConstants.CENTER);
			lblListaEstadios.setBounds(244, 0, 192, 45);
			panelHeader.add(lblListaEstadios);
			lblListaEstadios.setHorizontalAlignment(SwingConstants.CENTER);
			lblListaEstadios.setForeground(new Color(255, 255, 255));
			lblListaEstadios.setFont(new Font("Consolas", Font.BOLD, 20));

			scrollPane = new JScrollPane();
			scrollPane.setBackground(new Color(255, 255, 255));
			scrollPane.setBounds(10, 149, 665, 334);
			panelBg.add(scrollPane);

			DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
			dtcr.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);

			tableStadiums = new JTable();
			tableStadiums.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					if (tableStadiums.getSelectedRow() >= 0) {
						int index = tableStadiums.getSelectedRow();
						btnEliminar.setEnabled(true);
						codeEstadio = (String) tableStadiums.getModel().getValueAt(index, 0);	
						nameEstadio = (String) tableStadiums.getModel().getValueAt(index, 1);
					}
				}
			});
			tableStadiums.setRowMargin(0);
			tableStadiums.setFocusable(false);
			tableStadiums.setRowHeight(20);
			tableStadiums.setIntercellSpacing(new Dimension(0, 0));
			tableStadiums.setGridColor(new Color(255, 255, 255));
			tableStadiums.setShowVerticalLines(false);
			tableStadiums.getTableHeader().setReorderingAllowed(false);
			tableStadiums.setSelectionBackground(new Color(239, 108, 0));
			tableStadiums.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableStadiums.getTableHeader().setOpaque(false);

			tableStadiums.getTableHeader().setBackground(new Color(255,255,255));
			tableStadiums.setFont(new Font("Consolas", Font.PLAIN, 15));
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
			tableStadiums.getColumnModel().getColumn(1).setResizable(true);
			tableStadiums.getColumnModel().getColumn(2).setResizable(true);
			scrollPane.setViewportView(tableStadiums);
			
			
			/******** para centrar el contenido de la tabla *******/		
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
			tcr.setHorizontalAlignment(SwingConstants.CENTER);
			for (int i = 0; i < tableStadiums.getColumnCount(); i++)
				tableStadiums.getColumnModel().getColumn(i).setCellRenderer(tcr);
			

			btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Boolean found = false;


					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	
					
					ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_checked_48px_1.png"));
					String[] options1 = {"Ok"};	
					
					// Este foreach es para no permitir que se elimine un estadio si esta asignado a un equipo.
					for (Team t : Lidom.getInstance().getListTeams()) {
						if (nameEstadio.equalsIgnoreCase(t.getStadium())) {
							found = true;
						}	
					}
					
					int xOption	= JOptionPane.showOptionDialog(null, "¿Seguro que desea eliminar el estadio? " + codeEstadio + nameEstadio, "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					if (xOption == 0) {
						
					
						if (found == false) {
							Stadium auxEstadio = Lidom.getInstance().searchStadiumByID(codeEstadio);
							Lidom.getInstance().deleteStadium(auxEstadio);

							
							JOptionPane.showOptionDialog(null, "Eliminado con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1);
							loadTableStadiums();
							btnEliminar.setEnabled(false);
							
						}else {
							JOptionPane.showOptionDialog(null, "No se puede eliminar, porque esta asignado a un equipo", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options1, options1);
							loadTableStadiums();
							btnEliminar.setEnabled(false);
							
						}
						
					}

				}
			});
			btnEliminar.setIconTextGap(5);
			btnEliminar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnEliminar.setForeground(new Color(255, 255, 240));
			btnEliminar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnEliminar.setBorder(null);
			btnEliminar.setBackground(new Color(0, 30, 72));
			btnEliminar.setBounds(183, 523, 146, 30);
			panelBg.add(btnEliminar);

			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	

					int xOption	= JOptionPane.showOptionDialog(null, "¿Seguro que desea cancelar?, la ventana se cerrará.", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					if (xOption == 0) {
						dispose(); 
					}
				}
			});
			btnCancelar.setIconTextGap(5);
			btnCancelar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnCancelar.setForeground(new Color(255, 255, 240));
			btnCancelar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnCancelar.setBorder(null);
			btnCancelar.setBackground(new Color(0, 30, 70));
			btnCancelar.setBounds(341, 523, 146, 30);
			panelBg.add(btnCancelar);

			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBuscar.setIconTextGap(30);
			btnBuscar.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnBuscar.setForeground(new Color(255, 255, 240));
			btnBuscar.setFont(new Font("Consolas", Font.BOLD, 20));
			btnBuscar.setBorder(null);
			btnBuscar.setBackground(new Color(4, 10, 20));
			btnBuscar.setBounds(550, 74, 125, 30);
			panelBg.add(btnBuscar);

			txtBuscar = new JTextField() {
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
			txtBuscar.setHorizontalAlignment(SwingConstants.CENTER);
			txtBuscar.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtBuscar.setDisabledTextColor(Color.BLACK);
			txtBuscar.setColumns(10);
			txtBuscar.setBounds(272, 75, 266, 30);
			panelBg.add(txtBuscar);

			lblBuscarPor = new JLabel("Buscar por:");
			lblBuscarPor.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblBuscarPor.setVerticalAlignment(SwingConstants.BOTTOM);
			lblBuscarPor.setHorizontalAlignment(SwingConstants.LEFT);
			lblBuscarPor.setForeground(Color.BLACK);
			lblBuscarPor.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblBuscarPor.setBounds(10, 74, 125, 31);
			panelBg.add(lblBuscarPor);

			cbxOptionsSearch = new JComboBox();
			cbxOptionsSearch.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxOptionsSearch.setBounds(135, 75, 125, 30);
			panelBg.add(cbxOptionsSearch);

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

	public static void loadTableStadiums() {
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
