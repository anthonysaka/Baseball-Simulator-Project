/**
 * 
 */
package frontEnd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import backEnd.Batter;
import backEnd.Lidom;
import backEnd.Pitcher;
import backEnd.Player;
import backEnd.Team;
import jdk.nashorn.internal.runtime.ListAdapter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

/**
 * @author Victor Rosario
 *
 *
 */
public class PlayersStatistics extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7935540646406375402L;

	private final JPanel contentPanel = new JPanel();

	private static DefaultTableModel model;
	private static Object[] column;
	private JTable StatisticsTableBat;
	private JTable StatisticsTablePit;
	private JComboBox cbxTeams;

	private ArrayList<Player> Listar_Equipos;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */

	public PlayersStatistics() {

		setUndecorated(true);
		setBounds(100, 100, 954, 566);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panelBg = new JPanel();
		panelBg.setBounds(0, 0, 954, 566);
		contentPanel.add(panelBg);
		panelBg.setLayout(null);

		JPanel panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(0, 30, 72));
		panelHeader.setBounds(0, 0, 954, 45);
		panelBg.add(panelHeader);

		JLabel lblEstadisticasJugador = new JLabel("ESTAD\u00CDSTICAS DE LOS JUGADORES");
		lblEstadisticasJugador.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEstadisticasJugador.setBounds(318, 0, 319, 45);
		panelHeader.add(lblEstadisticasJugador);
		lblEstadisticasJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstadisticasJugador.setForeground(new Color(255, 255, 255));
		lblEstadisticasJugador.setFont(new Font("Consolas", Font.BOLD, 20));

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(
				new ImageIcon(PlayersStatistics.class.getResource("/iconos_imagenes/icons8_cancel_24px_2.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
				String[] options = { "Si", "No" };

				int xOption = JOptionPane.showOptionDialog(null, "¿Seguro que desea cancelar?, la ventana se cerrará.",
						"Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

				if (xOption == 0) {
					dispose();
				}
			}
		});

		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setHorizontalTextPosition(SwingConstants.LEFT);
		btnImprimir.setIcon(new ImageIcon(PlayersStatistics.class.getResource("/iconos_imagenes/Print 24px.png")));
		btnImprimir.setIconTextGap(5);
		btnImprimir.setBorder(null);
		btnImprimir.setForeground(new Color(255, 255, 240));
		btnImprimir.setFont(new Font("Consolas", Font.BOLD, 17));
		btnImprimir.setBackground(new Color(0, 30, 70));
		btnImprimir.setBounds(220, 523, 146, 30);
		panelBg.add(btnImprimir);

		btnCancelar.setIconTextGap(5);
		btnCancelar.setHorizontalTextPosition(SwingConstants.LEFT);
		btnCancelar.setForeground(new Color(255, 255, 240));
		btnCancelar.setFont(new Font("Consolas", Font.BOLD, 17));
		btnCancelar.setBorder(null);
		btnCancelar.setBackground(new Color(0, 30, 70));
		btnCancelar.setBounds(586, 523, 146, 30);

		panelBg.add(btnCancelar);

		JLabel lblFiltrar = new JLabel("Filtrar por equipo:");
		lblFiltrar.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblFiltrar.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFiltrar.setHorizontalAlignment(SwingConstants.LEFT);
		lblFiltrar.setForeground(Color.BLACK);
		lblFiltrar.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblFiltrar.setBounds(10, 70, 209, 31);
		panelBg.add(lblFiltrar);

		JPanel panelBackground = new JPanel();
		panelBackground.setBounds(10, 153, 934, 359);
		panelBg.add(panelBackground);
		panelBackground.setLayout(new CardLayout(0, 0));

		JScrollPane scrollPaneBat = new JScrollPane();
		panelBackground.add(scrollPaneBat, "name_79233563345800");

		StatisticsTableBat = new JTable();
		StatisticsTableBat.setAutoCreateRowSorter(true);

		// SE USA PARA TENER MEJOR CONTROL SOBRE LA TABLA.
		// TableRowSorter<TableModel> sorter = new
		// TableRowSorter<>(StatisticsTableBat.getModel());
		// StatisticsTableBat.setRowSorter(sorter);
		// java.util.List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
		// sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
		// sortKeys.add(new RowSorter.SortKey(2,SortOrder.DESCENDING));
		// sorter.setSortKeys(sortKeys);
		//
		StatisticsTableBat.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Equipo", "Nombre", "Average", "Hits", "Dobles", "Triples", "HR" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -3449633077541811227L;

			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class };

			@SuppressWarnings({})
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		StatisticsTableBat.getColumnModel().getColumn(0).setMinWidth(20);
		scrollPaneBat.setViewportView(StatisticsTableBat);

		JScrollPane scrollPanePit = new JScrollPane();
		panelBackground.add(scrollPanePit, "name_79309930304300");

		StatisticsTablePit = new JTable();
		StatisticsTablePit.setAutoCreateRowSorter(true);
		StatisticsTablePit.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Equipo", "Nombre", "W", "L", "ERA", "G", "GS", "SV", "HR", "H", "R", "IP", "AVG" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 2212776801690834304L;

			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, String.class, String.class, String.class, String.class,
					String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false, false,
					false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		StatisticsTablePit.getColumnModel().getColumn(0).setMinWidth(40);
		StatisticsTablePit.getColumnModel().getColumn(1).setMinWidth(40);
		StatisticsTablePit.getColumnModel().getColumn(2).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(3).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(4).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(5).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(6).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(7).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(8).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(9).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(10).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(11).setMinWidth(20);
		StatisticsTablePit.getColumnModel().getColumn(12).setMinWidth(20);
		scrollPanePit.setViewportView(StatisticsTablePit);

		JLabel lblVer = new JLabel("Ver:");
		lblVer.setBounds(702, 75, 60, 31);
		lblVer.setForeground(Color.BLACK);
		lblVer.setFont(new Font("Consolas", Font.PLAIN, 20));
		panelBg.add(lblVer);

		JComboBox cbxBatPit = new JComboBox();
		cbxBatPit.setForeground(Color.BLACK);
		cbxBatPit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> BatPit = (JComboBox<String>) e.getSource();
				String string = (String) BatPit.getSelectedItem();

				if (string.equals("Bateador")) {
					scrollPaneBat.setVisible(true);
					scrollPanePit.setVisible(false);

					// panelBatBtn.setVisible(true);
					// panelPitBtn.setVisible(false);

				} else if (string.equals("Pitcher")) {
					scrollPaneBat.setVisible(false);
					scrollPanePit.setVisible(true);

					// panelBatBtn.setVisible(false);
					// panelPitBtn.setVisible(true);
				}
			}
		});
		cbxBatPit.setFont(new Font("Consolas", Font.PLAIN, 18));
		cbxBatPit.setModel(new DefaultComboBoxModel(new String[] { "Bateador", "Pitcher" }));
		cbxBatPit.setBounds(772, 75, 172, 30);
		panelBg.add(cbxBatPit);

		cbxTeams = new JComboBox();
		cbxTeams.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				JComboBox<String> cbteam = (JComboBox<String>) e.getSource();
				String string = (String) (e.getItem());

				Listar_Equipos = new ArrayList<Player>(Lidom.getInstance().Filtrar_Equipo(string));

				loadTable();
				loadTablePit();

				//				System.out.println(Listar_Equipos);
			}
		});
		//		cbxTeams.addActionListener(new ActionListener() {
		//			public void actionPerformed(ActionEvent e) {
		//				JComboBox<String> cbteam = (JComboBox<String>) e.getSource();
		//				String string = (String) cbteam.getSelectedItem();
		//
		//				//Listar_Equipos = Lidom.getInstance().Filtrar_Equipo(string);
		////				Listar_Equipos = new ArrayList<Player>(Lidom.getInstance().Filtrar_Equipo(string));
		//				
		////				System.out.print(Lidom.getInstance().Filtrar_Equipo(string));
		//
		//			}
		//		});
		cbxTeams.setBounds(229, 76, 146, 30);
		panelBg.add(cbxTeams);

		loadTable();

		loadTablePit();

		loadTeamsCbx();

	}

	private void loadTeamsCbx() {

		cbxTeams.removeAllItems();

		for (Team t : Lidom.getInstance().getListTeams()) {
			cbxTeams.addItem(t.getName());
		}

		cbxTeams.insertItemAt(new String("Todos"), 0);
		cbxTeams.setSelectedIndex(0);

	}

	public void loadTable() {
		model = (DefaultTableModel) StatisticsTableBat.getModel();
		model.setRowCount(0);
		column = new Object[model.getColumnCount()];

		// System.out.println(Listar_Equipos);
		if (Listar_Equipos != null) {
			for (Player p : Listar_Equipos) {
				// System.out.println(p);

				if (p instanceof Batter) {
					column[0] = p.getTeamName();
					column[1] = p.getName();
					column[2] = String.valueOf(((Batter) p).getAverage());
					column[3] = String.valueOf(((Batter) p).getH1());
					column[4] = String.valueOf(((Batter) p).getH2());
					column[5] = String.valueOf(((Batter) p).getH3());
					column[6] = String.valueOf(((Batter) p).getHR());

					model.addRow(column);
				}

			}
		}
	}

	public void loadTablePit() {
		model = (DefaultTableModel) StatisticsTablePit.getModel();
		model.setRowCount(0);
		column = new Object[model.getColumnCount()];

		if (Listar_Equipos != null) {
			for (Player p : Listar_Equipos) {
				if (p instanceof Pitcher) {
					column[0] = p.getTeamName();
					column[1] = p.getName();
					column[2] = String.valueOf(((Pitcher) p).getGameWin()); // Convertir el tipo de variable a String
					column[3] = String.valueOf(((Pitcher) p).getGameLose());
					column[4] = String.valueOf(((Pitcher) p).getERA());
					column[5] = String.valueOf(((Pitcher) p).getPlayedGame());
					column[6] = String.valueOf(((Pitcher) p).getStartedGame());
					column[7] = String.valueOf(((Pitcher) p).getSavedGame());
					column[8] = String.valueOf(((Pitcher) p).getNumberHR());
					column[9] = String.valueOf(((Pitcher) p).getNumberHit());
					column[10] = String.valueOf(((Pitcher) p).getNumberRun());
					column[11] = String.valueOf(((Pitcher) p).getIP());
					column[12] = String.valueOf(((Pitcher) p).getAverage());

					model.addRow(column);
				}
			}
		}
	}

}
