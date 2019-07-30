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

import backEnd.Batter;
import backEnd.Lidom;
import backEnd.Player;
import backEnd.Stadium;
import backEnd.Team;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JComboBox;



/**
 * @author Victor Rosario
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
	private JComboBox cbxTeam;

	/**
	 * Launch the application.
	 */
	//	public static void main(String[] args) {
	//		try {
	//			PlayersStatistics dialog = new PlayersStatistics();
	//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	//			dialog.setVisible(true);
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//	}

	/**
	 * Create the dialog.
	 */
	public PlayersStatistics() {

		setUndecorated(true);
		setBounds(100, 100, 837, 566);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panelBg = new JPanel();
		panelBg.setBounds(0, 0, 837, 566);
		contentPanel.add(panelBg);
		panelBg.setLayout(null);

		JPanel panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(0, 30, 72));
		panelHeader.setBounds(0, 0, 837, 45);
		panelBg.add(panelHeader);

		JLabel lblEstadisticasJugador = new JLabel("ESTAD\u00CDSTICAS DE LOS JUGADORES");
		lblEstadisticasJugador.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEstadisticasJugador.setBounds(241, 0, 319, 45);
		panelHeader.add(lblEstadisticasJugador);
		lblEstadisticasJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstadisticasJugador.setForeground(new Color(255, 255, 255));
		lblEstadisticasJugador.setFont(new Font("Consolas", Font.BOLD, 20));

		JButton btnCancelar = new JButton("Cancelar");
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

		JPanel panelBackgroundBtn = new JPanel();
		panelBackgroundBtn.setBorder(null);
		panelBackgroundBtn.setBounds(10, 100, 817, 87);
		panelBg.add(panelBackgroundBtn);
		panelBackgroundBtn.setLayout(new CardLayout(0, 0));

		JPanel panelBatBtn = new JPanel();
		panelBackgroundBtn.add(panelBatBtn, "name_31965647960600");
		panelBatBtn.setLayout(null);

		JButton btnAverage = new JButton("Average");
		btnAverage.setBounds(52, 5, 100, 30);
		panelBatBtn.add(btnAverage);
		btnAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnAverage.setIconTextGap(5);
		btnAverage.setBorder(null);
		btnAverage.setForeground(new Color(255, 255, 240));
		btnAverage.setFont(new Font("Consolas", Font.BOLD, 17));
		btnAverage.setBackground(new Color(0, 30, 70));

		JButton btnHits = new JButton("Hits");
		btnHits.setBounds(204, 5, 100, 30);
		panelBatBtn.add(btnHits);
		btnHits.setIconTextGap(5);
		btnHits.setBorder(null);
		btnHits.setForeground(new Color(255, 255, 240));
		btnHits.setFont(new Font("Consolas", Font.BOLD, 17));
		btnHits.setBackground(new Color(0, 30, 70));

		JButton btnDobles = new JButton("Dobles");
		btnDobles.setBounds(356, 5, 100, 30);
		panelBatBtn.add(btnDobles);
		btnDobles.setIconTextGap(5);
		btnDobles.setHorizontalTextPosition(SwingConstants.LEFT);
		btnDobles.setForeground(new Color(255, 255, 240));
		btnDobles.setFont(new Font("Consolas", Font.BOLD, 17));
		btnDobles.setBorder(null);
		btnDobles.setBackground(new Color(0, 30, 72));

		JButton btnTriples = new JButton("Triples");
		btnTriples.setBounds(508, 5, 100, 30);
		panelBatBtn.add(btnTriples);
		btnTriples.setIconTextGap(5);
		btnTriples.setHorizontalTextPosition(SwingConstants.LEFT);
		btnTriples.setForeground(new Color(255, 255, 240));
		btnTriples.setFont(new Font("Consolas", Font.BOLD, 17));
		btnTriples.setBorder(null);
		btnTriples.setBackground(new Color(0, 30, 72));

		JButton btnHr = new JButton("HR");
		btnHr.setBounds(660, 5, 100, 30);
		panelBatBtn.add(btnHr);
		btnHr.setIconTextGap(5);
		btnHr.setHorizontalTextPosition(SwingConstants.LEFT);
		btnHr.setForeground(new Color(255, 255, 240));
		btnHr.setFont(new Font("Consolas", Font.BOLD, 17));
		btnHr.setBorder(null);
		btnHr.setBackground(new Color(0, 30, 72));
		btnHr.setFont(new Font("Consolas", Font.PLAIN, 17));

		JPanel panelPitBtn = new JPanel();
		panelBackgroundBtn.add(panelPitBtn, "name_32013013835600");
		panelPitBtn.setLayout(null);

		JButton btnGamesWin = new JButton("W");
		btnGamesWin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGamesWin.setBounds(62, 11, 89, 30);
		panelPitBtn.add(btnGamesWin);
		btnGamesWin.setIconTextGap(5);
		btnGamesWin.setHorizontalTextPosition(SwingConstants.LEFT);
		btnGamesWin.setForeground(new Color(255, 255, 240));
		btnGamesWin.setFont(new Font("Consolas", Font.BOLD, 17));
		btnGamesWin.setBorder(null);
		btnGamesWin.setBackground(new Color(0, 30, 72));

		JButton btnGamesLose = new JButton("L");
		btnGamesLose.setBounds(213, 11, 89, 30);
		panelPitBtn.add(btnGamesLose);
		btnGamesLose.setIconTextGap(5);
		btnGamesLose.setHorizontalTextPosition(SwingConstants.LEFT);
		btnGamesLose.setForeground(new Color(255, 255, 240));
		btnGamesLose.setFont(new Font("Consolas", Font.BOLD, 17));
		btnGamesLose.setBorder(null);
		btnGamesLose.setBackground(new Color(0, 30, 72));

		JButton btnERA = new JButton("ERA");
		btnERA.setBounds(364, 11, 89, 30);
		panelPitBtn.add(btnERA);
		btnERA.setIconTextGap(5);
		btnERA.setHorizontalTextPosition(SwingConstants.LEFT);
		btnERA.setForeground(new Color(255, 255, 240));
		btnERA.setFont(new Font("Consolas", Font.BOLD, 17));
		btnERA.setBorder(null);
		btnERA.setBackground(new Color(0, 30, 72));

		JButton btnGamesPlayed = new JButton("G");
		btnGamesPlayed.setBounds(515, 11, 89, 30);
		panelPitBtn.add(btnGamesPlayed);
		btnGamesPlayed.setIconTextGap(5);
		btnGamesPlayed.setHorizontalTextPosition(SwingConstants.LEFT);
		btnGamesPlayed.setForeground(new Color(255, 255, 240));
		btnGamesPlayed.setFont(new Font("Consolas", Font.BOLD, 17));
		btnGamesPlayed.setBorder(null);
		btnGamesPlayed.setBackground(new Color(0, 30, 72));


		JButton btnGamesStarted = new JButton("GS");
		btnGamesStarted.setBounds(666, 11, 89, 30);
		panelPitBtn.add(btnGamesStarted);
		btnGamesStarted.setIconTextGap(5);
		btnGamesStarted.setHorizontalTextPosition(SwingConstants.LEFT);
		btnGamesStarted.setForeground(new Color(255, 255, 240));
		btnGamesStarted.setFont(new Font("Consolas", Font.BOLD, 17));
		btnGamesStarted.setBorder(null);
		btnGamesStarted.setBackground(new Color(0, 30, 72));

		JButton btnGamesSaved = new JButton("SV");
		btnGamesSaved.setBounds(40, 45, 89, 30);
		panelPitBtn.add(btnGamesSaved);
		btnGamesSaved.setIconTextGap(5);
		btnGamesSaved.setHorizontalTextPosition(SwingConstants.LEFT);
		btnGamesSaved.setForeground(new Color(255, 255, 240));
		btnGamesSaved.setFont(new Font("Consolas", Font.BOLD, 17));
		btnGamesSaved.setBorder(null);
		btnGamesSaved.setBackground(new Color(0, 30, 72));

		JButton btnHRPermited = new JButton("HR");
		btnHRPermited.setBounds(169, 45, 89, 30);
		panelPitBtn.add(btnHRPermited);
		btnHRPermited.setIconTextGap(5);
		btnHRPermited.setHorizontalTextPosition(SwingConstants.LEFT);
		btnHRPermited.setForeground(new Color(255, 255, 240));
		btnHRPermited.setFont(new Font("Consolas", Font.BOLD, 17));
		btnHRPermited.setBorder(null);
		btnHRPermited.setBackground(new Color(0, 30, 72));

		JButton btnHitsPermited = new JButton("H");
		btnHitsPermited.setBounds(298, 45, 89, 30);
		panelPitBtn.add(btnHitsPermited);
		btnHitsPermited.setIconTextGap(5);
		btnHitsPermited.setHorizontalTextPosition(SwingConstants.LEFT);
		btnHitsPermited.setForeground(new Color(255, 255, 240));
		btnHitsPermited.setFont(new Font("Consolas", Font.BOLD, 17));
		btnHitsPermited.setBorder(null);
		btnHitsPermited.setBackground(new Color(0, 30, 72));

		JButton btnRunsPermited = new JButton("R");
		btnRunsPermited.setBounds(427, 45, 89, 30);
		panelPitBtn.add(btnRunsPermited);
		btnRunsPermited.setIconTextGap(5);
		btnRunsPermited.setHorizontalTextPosition(SwingConstants.LEFT);
		btnRunsPermited.setForeground(new Color(255, 255, 240));
		btnRunsPermited.setFont(new Font("Consolas", Font.BOLD, 17));
		btnRunsPermited.setBorder(null);
		btnRunsPermited.setBackground(new Color(0, 30, 72));

		JButton btnInningsPitched = new JButton("IP");
		btnInningsPitched.setBounds(556, 45, 89, 30);
		panelPitBtn.add(btnInningsPitched);
		btnInningsPitched.setIconTextGap(5);
		btnInningsPitched.setHorizontalTextPosition(SwingConstants.LEFT);
		btnInningsPitched.setForeground(new Color(255, 255, 240));
		btnInningsPitched.setFont(new Font("Consolas", Font.BOLD, 17));
		btnInningsPitched.setBorder(null);
		btnInningsPitched.setBackground(new Color(0, 30, 72));

		JButton btnAVG = new JButton("AVG");
		btnAVG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAVG.setBounds(685, 45, 89, 30);
		panelPitBtn.add(btnAVG);
		btnAVG.setIconTextGap(5);
		btnAVG.setHorizontalTextPosition(SwingConstants.LEFT);
		btnAVG.setForeground(new Color(255, 255, 240));
		btnAVG.setFont(new Font("Consolas", Font.BOLD, 17));
		btnAVG.setBorder(null);
		btnAVG.setBackground(new Color(0, 30, 72));

		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIconTextGap(5);
		btnImprimir.setBorder(null);
		btnImprimir.setForeground(new Color(255, 255, 240));
		btnImprimir.setFont(new Font("Consolas", Font.BOLD, 17));
		btnImprimir.setBackground(new Color(0, 30, 70));
		btnImprimir.setBounds(358, 523, 120, 30);
		panelBg.add(btnImprimir);

		btnCancelar.setIconTextGap(5);
		btnCancelar.setHorizontalTextPosition(SwingConstants.LEFT);
		btnCancelar.setForeground(new Color(255, 255, 240));
		btnCancelar.setFont(new Font("Consolas", Font.BOLD, 17));
		btnCancelar.setBorder(null);
		btnCancelar.setBackground(new Color(0, 30, 70));
		btnCancelar.setBounds(584, 523, 146, 30);

		panelBg.add(btnCancelar);

		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setIconTextGap(5);
		btnActualizar.setHorizontalTextPosition(SwingConstants.LEFT);
		btnActualizar.setForeground(new Color(255, 255, 240));
		btnActualizar.setFont(new Font("Consolas", Font.BOLD, 17));
		btnActualizar.setBorder(null);
		btnActualizar.setBackground(new Color(0, 30, 72));
		btnActualizar.setBounds(106, 523, 146, 30);

		panelBg.add(btnActualizar);

		JLabel lblFiltrar = new JLabel("Filtrar por:");
		lblFiltrar.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblFiltrar.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFiltrar.setHorizontalAlignment(SwingConstants.LEFT);
		lblFiltrar.setForeground(Color.BLACK);
		lblFiltrar.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblFiltrar.setBounds(10, 70, 146, 31);
		panelBg.add(lblFiltrar);

		JPanel panelBackground = new JPanel();
		panelBackground.setBounds(10, 198, 817, 314);
		panelBg.add(panelBackground);
		panelBackground.setLayout(new CardLayout(0, 0));

		JScrollPane scrollPaneBat = new JScrollPane();
		panelBackground.add(scrollPaneBat, "name_79233563345800");

		StatisticsTableBat = new JTable();
		StatisticsTableBat.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Equipo", "Nombre", "Average", "Hits", "Dobles", "Triples", "HR"
				}
				) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -3449633077541811227L;

			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		StatisticsTableBat.getColumnModel().getColumn(0).setMinWidth(20);
		scrollPaneBat.setViewportView(StatisticsTableBat);

		JScrollPane scrollPanePit = new JScrollPane();
		panelBackground.add(scrollPanePit, "name_79309930304300");

		StatisticsTablePit = new JTable();
		StatisticsTablePit.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Equipo", "Nombre", "W", "L", "ERA", "G", "GS", "SV", "HR", "H", "R", "IP", "AVG"
				}
				) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 2212776801690834304L;


			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false, false, false, false, false, false, false
			};
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
		
		cbxTeam = new JComboBox();
		cbxTeam.setBounds(633, 58, 146, 30);
		panelBg.add(cbxTeam);

		loadTable();
		loadteamCbx();
	}
	
	private void loadteamCbx() {

		cbxTeam.removeAllItems();

		for (Team s : Lidom.getInstance().getListTeams()) {
			cbxTeam.addItem(s.getName());	
		}
		
		cbxTeam.insertItemAt(new String("<Seleccionar"), 0);
		cbxTeam.setSelectedIndex(0);
		

	}


	public void loadTable() {
		model = (DefaultTableModel) StatisticsTableBat.getModel();
		model.setRowCount(0);
		column = new Object[model.getColumnCount()];

		for (Player p : Lidom.getInstance().getListPlayer()) {
			if (p instanceof Batter) {
				column[0] = p.getTeamName();
				column[1] =  p.getName();
				column[2] =  ((Batter) p).getAverage();
				column[3] =   ((Batter) p).getH1();
				column[4] =  ((Batter) p).getH2();
				column[5]= ((Batter) p).getH3();
				column[6]= ((Batter) p).getHR();

				model.addRow(column);
			}


		}





	}
}
