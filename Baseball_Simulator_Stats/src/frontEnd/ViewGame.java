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
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SpinnerModel;

import rojeru_san.componentes.RSDateChooser;
import sun.awt.DefaultMouseInfoPeer;
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
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;

import backEnd.Game;
import backEnd.Lidom;
import backEnd.Player;
import backEnd.Stadium;
import backEnd.Team;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unused")
public class ViewGame extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1289376254530677283L;
	
	private final JPanel contentPanel = new JPanel();
	private JLabel lblListaPartidos;
	private JPanel panelHeader;
	private JScrollPane scrollPane;

	private static DefaultTableModel model;
	private static Object[] column;
	private JButton btnEliminar;
	private JButton btnCancelar;
	private JLabel lblBuscar;
	private JTextField txtFiltro;

	private static JTable tableGame;
	
	private String equipoLocal;
	private String equipoVisitante;
	private String fecha;
	private String hora;
	private String estadio;
	private JButton btnGenerar;
	private JButton btnModificar;


	/**
	 * Create the dialog.
	 */

	public ViewGame() {

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

			lblListaPartidos = new JLabel("LISTA PARTIDOS");
			lblListaPartidos.setHorizontalTextPosition(SwingConstants.CENTER);
			lblListaPartidos.setBounds(269, 0, 192, 45);
			panelHeader.add(lblListaPartidos);
			lblListaPartidos.setHorizontalAlignment(SwingConstants.CENTER);
			lblListaPartidos.setForeground(new Color(255, 255, 255));
			lblListaPartidos.setFont(new Font("Consolas", Font.BOLD, 20));

			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 154, 710, 329);
			panelBg.add(scrollPane);
			
			tableGame = new JTable();
			
			tableGame.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if (tableGame.getSelectedRow() >= 0) {
						int index = tableGame.getSelectedRow();
						btnEliminar.setEnabled(true);
						
						equipoLocal = (String) tableGame.getModel().getValueAt(index, 0);	
						equipoVisitante = (String) tableGame.getModel().getValueAt(index, 1);
						estadio = (String) tableGame.getModel().getValueAt(index, 2);
						fecha = (String) tableGame.getModel().getValueAt(index, 3);
						hora = (String) tableGame.getModel().getValueAt(index, 4);	
					}
				}
			});
			tableGame.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Equipo local", "Equipo visitante", "Estadio", "Fecha", "Hora"
				}
			) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1665962479029189562L;
				
				
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
			
			scrollPane.setViewportView(tableGame);

			btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Lidom.getInstance().getListGame().removeAll(Lidom.getInstance().getListGame());
					
				ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	
					int xOption	= JOptionPane.showOptionDialog(null, "¿Seguro que desea eliminar el juego? ", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					if (xOption == 0) {
						
						Game auxGame = Lidom.getInstance().searchGame(equipoLocal, equipoVisitante, estadio, fecha, hora);
						Lidom.getInstance().deleteGame(auxGame);

						ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_checked_48px_1.png"));
						String[] options1 = {"Ok"};	
						JOptionPane.showOptionDialog(null, "Eliminado con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options1, options1);

						loadTableGame();
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
			btnEliminar.setBounds(367, 523, 146, 30);
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
			btnCancelar.setBounds(525, 523, 146, 30);
			panelBg.add(btnCancelar);

			lblBuscar = new JLabel("Buscar:");
			lblBuscar.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblBuscar.setVerticalAlignment(SwingConstants.BOTTOM);
			lblBuscar.setHorizontalAlignment(SwingConstants.LEFT);
			lblBuscar.setForeground(Color.BLACK);
			lblBuscar.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblBuscar.setBounds(61, 80, 95, 31);
			panelBg.add(lblBuscar);

			txtFiltro = new JTextField() {
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
			txtFiltro.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					DefaultTableModel table = (DefaultTableModel) tableGame.getModel();
					String filtro = txtFiltro.getText();
					TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
					tableGame.setRowSorter(tr);
					tr.setRowFilter(RowFilter.regexFilter("(?i)" +filtro));
					
				}
			});
			/**********************************************************/	
			txtFiltro.setHorizontalAlignment(SwingConstants.CENTER);
			txtFiltro.setFont(new Font("Consolas", Font.PLAIN, 18));
			txtFiltro.setDisabledTextColor(Color.BLACK);
			txtFiltro.setColumns(10);
			txtFiltro.setBounds(213, 80, 466, 30);
			panelBg.add(txtFiltro);
			
			btnGenerar = new JButton("Generar");
			btnGenerar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Home.generarPartidos();
					try {
						Home.agregarFechaHoraPartido();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					loadTableGame();
					
				}
			});
			btnGenerar.setToolTipText("Generar partidos de una ronda todos contro todos.");
			btnGenerar.setIconTextGap(5);
			btnGenerar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnGenerar.setForeground(new Color(255, 255, 240));
			btnGenerar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnGenerar.setBorder(null);
			btnGenerar.setBackground(new Color(0, 30, 72));
			btnGenerar.setBounds(51, 523, 146, 30);
			panelBg.add(btnGenerar);
			
			btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Game auxGame = Lidom.getInstance().searchGame(equipoLocal, equipoVisitante, estadio, fecha, hora);
					AddGame modGame = new AddGame(auxGame);
					modGame.setModal(true);
					modGame.setVisible(true);
				}
			});
			btnModificar.setToolTipText("Modifique fecha y hora.");
			btnModificar.setIconTextGap(5);
			btnModificar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnModificar.setForeground(new Color(255, 255, 240));
			btnModificar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnModificar.setBorder(null);
			btnModificar.setBackground(new Color(0, 30, 72));
			btnModificar.setBounds(209, 523, 146, 30);
			panelBg.add(btnModificar);

		}


		loadTableGame(); // para cargar la tabla de los jugadores registrados.
	}



	/** Metodos **/

	public static void loadTableGame() {
		model= (DefaultTableModel) tableGame.getModel();
		column = new Object[model.getColumnCount()];
		model.setRowCount(0);
	

		for (int i = 0; i < Lidom.getInstance().getListGame().size(); i++) {
			column[0] = Lidom.getInstance().getListGame().get(i).getHomeTeam();
			column[1] =  Lidom.getInstance().getListGame().get(i).getAwayTeam();
			column[2] =  Lidom.getInstance().getListGame().get(i).getStadium();
			column[3] =  Lidom.getInstance().getListGame().get(i).getDate();
			column[4] =   Lidom.getInstance().getListGame().get(i).getHora();			

			model.addRow(column);

		}
	}
}
