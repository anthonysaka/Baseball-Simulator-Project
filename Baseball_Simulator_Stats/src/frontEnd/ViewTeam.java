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
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;
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
import javax.swing.table.TableRowSorter;
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

@SuppressWarnings("unused")
public class ViewTeam extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1130109053948345935L;
	
	private final JPanel contentPanel = new JPanel();
	private JLabel lblListaEquipos;
	private JPanel panelHeader;
	private JScrollPane scrollPane;

	private static DefaultTableModel model;
	private static JTable tableTeams;
	private static Object[] column;
	private JButton btnEliminar;
	private JButton btnCancelar;
	private JLabel lblBuscar;
	private JTextField textField;

	private String codeEquipo;
	private String nameEquipo;


	/**
	 * Create the dialog.
	 */
	@SuppressWarnings("rawtypes")
	public ViewTeam() {

		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 732, 566);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 732, 566);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);

			panelHeader = new JPanel();
			panelHeader.setLayout(null);
			panelHeader.setBackground(new Color(0, 30, 72));
			panelHeader.setBounds(0, 0, 732, 45);
			panelBg.add(panelHeader);

			lblListaEquipos = new JLabel("LISTA EQUIPOS");
			lblListaEquipos.setHorizontalTextPosition(SwingConstants.CENTER);
			lblListaEquipos.setBounds(269, 0, 192, 45);
			panelHeader.add(lblListaEquipos);
			lblListaEquipos.setHorizontalAlignment(SwingConstants.CENTER);
			lblListaEquipos.setForeground(new Color(255, 255, 255));
			lblListaEquipos.setFont(new Font("Consolas", Font.BOLD, 20));

			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 156, 710, 327);
			panelBg.add(scrollPane);

			tableTeams = new JTable();
			tableTeams.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					if (tableTeams.getSelectedRow() >= 0) {
						int index = tableTeams.getSelectedRow();
						btnEliminar.setEnabled(true);
						codeEquipo = (String) tableTeams.getModel().getValueAt(index, 0);	
						nameEquipo = (String) tableTeams.getModel().getValueAt(index, 1);
					}
				}
			});
			tableTeams.setRowMargin(0);
			tableTeams .setFocusable(false);
			tableTeams.setRowHeight(20);
			tableTeams.setIntercellSpacing(new Dimension(0, 0));
			tableTeams.setGridColor(new Color(255, 255, 255));
			tableTeams.setShowVerticalLines(false);
			tableTeams.getTableHeader().setReorderingAllowed(false);
			tableTeams.setSelectionBackground(new Color(239, 108, 0));
			tableTeams.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableTeams.getTableHeader().setOpaque(false);

			tableTeams.getTableHeader().setBackground(new Color(255,255,255));
			tableTeams.setFont(new Font("Consolas", Font.PLAIN, 15));
			tableTeams.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"N\u00FAmero ID", "Nombre", "Fecha fundaci\u00F3n", "Manager", "Estadio"
					}
					) {
				/**
						 * 
						 */
						private static final long serialVersionUID = 4801298072712266563L;
						
				Class[] columnTypes = new Class[] {
						String.class, String.class, String.class, String.class, String.class
				};
				@SuppressWarnings({ "unchecked" })
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
						false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			tableTeams.getColumnModel().getColumn(0).setResizable(false);
			tableTeams.getColumnModel().getColumn(1).setResizable(true);
			tableTeams.getColumnModel().getColumn(2).setResizable(true);
			tableTeams.getColumnModel().getColumn(3).setResizable(true);
			tableTeams.getColumnModel().getColumn(4).setResizable(true);
			scrollPane.setViewportView(tableTeams);
			
			
			/******** para centrar el contenido de la tabla *******/		
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
			tcr.setHorizontalAlignment(SwingConstants.CENTER);
			for (int i = 0; i < tableTeams.getColumnCount(); i++)
				tableTeams.getColumnModel().getColumn(i).setCellRenderer(tcr);
			

			btnEliminar = new JButton("Eliminar");
			btnEliminar.setEnabled(false);
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	
					int xOption	= JOptionPane.showOptionDialog(null, "¿Seguro que desea eliminar el estadio? " + codeEquipo + nameEquipo, "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					if (xOption == 0) {
						Team auxTeam = Lidom.getInstance().searchTeamByID(codeEquipo);
						Lidom.getInstance().deleteTeam(auxTeam);

						ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_checked_48px_1.png"));
						String[] options1 = {"Ok"};	
						JOptionPane.showOptionDialog(null, "Eliminado con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1);

						loadTableTeams();
						btnEliminar.setEnabled(false);
					}

				}
			});
			btnEliminar.setIconTextGap(5);
			btnEliminar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnEliminar.setForeground(new Color(255, 255, 240));
			btnEliminar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnEliminar.setBorder(null);
			btnEliminar.setBackground(new Color(0, 30, 72));
			btnEliminar.setBounds(218, 523, 146, 30);
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
			btnCancelar.setBounds(376, 523, 146, 30);
			panelBg.add(btnCancelar);

			lblBuscar = new JLabel("Buscar:");
			lblBuscar.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblBuscar.setVerticalAlignment(SwingConstants.BOTTOM);
			lblBuscar.setHorizontalAlignment(SwingConstants.LEFT);
			lblBuscar.setForeground(Color.BLACK);
			lblBuscar.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblBuscar.setBounds(54, 80, 95, 31);
			panelBg.add(lblBuscar);

			textField = new JTextField() {
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
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					DefaultTableModel table = (DefaultTableModel) tableTeams.getModel();
					String filtro = textField.getText();
					TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
					tableTeams.setRowSorter(tr);
					tr.setRowFilter(RowFilter.regexFilter("(?i)" +filtro));
				}
			});
			/**********************************************************/
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Consolas", Font.PLAIN, 18));
			textField.setDisabledTextColor(Color.BLACK);
			textField.setColumns(10);
			textField.setBounds(206, 81, 466, 30);
			panelBg.add(textField);

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


		loadTableTeams(); // para cargar la tabla de los estadios registrados.
	}



	/** Metodos **/

	public void loadTableTeams() {
		model = (DefaultTableModel) tableTeams.getModel();
		model.setRowCount(0);
		column = new Object[model.getColumnCount()];

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		//String dateString = formatter.format(dateSoli);

		for (int i = 0; i < Lidom.getInstance().getListTeams().size(); i++) {
			column[0] = Lidom.getInstance().getListTeams().get(i).getId();
			column[1] =  Lidom.getInstance().getListTeams().get(i).getName();
			column[2] =  formatter.format(Lidom.getInstance().getListTeams().get(i).getFoundationDate());
			column[3] =  Lidom.getInstance().getListTeams().get(i).getManager();
			column[4] =  Lidom.getInstance().getListTeams().get(i).getStadium();

			model.addRow(column);
		}
	}



}
