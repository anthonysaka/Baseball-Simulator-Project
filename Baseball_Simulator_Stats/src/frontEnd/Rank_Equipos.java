package frontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import backEnd.Batter;
import backEnd.Lidom;
import backEnd.Player;
import backEnd.Team;

public class Rank_Equipos extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static DefaultTableModel model;
	private static Object[] column;
	private JTable RankEquipostable;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rank_Equipos frame = new Rank_Equipos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Rank_Equipos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 679, 418);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 659, 279);
		panel.add(scrollPane);
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"TEAM", "WIN", "LOSE", "PTC", "GB"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	
	
	
	
	public void loadTable() {
		model = (DefaultTableModel)RankEquipostable.getModel();
		model.setRowCount(0);
		column = new Object[model.getColumnCount()];

		for (Team p : Lidom.getInstance().getListTeams()) {
			
				column[0] = p.getName();
				column[1] = p.getGamesWin();
				column[2] = p.getGamesLose();
				column[3] = Lidom.getInstance().TeamAvr(p.getGamesWin(), p.getGames());
				column[4] =  7;//Falta el metodo para buscar los juegos que le faltan a los equipos para llegar a la primera posicion
				
				
				model.addRow(column);
			}
			

		}
}
