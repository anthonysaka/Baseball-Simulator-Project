package frontEnd;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.io.Serializable;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import backEnd.Lidom;
import backEnd.Team;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Ranking_Team extends JDialog  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1289376254530677283L;
	
	private final JPanel contentPanel = new JPanel();
	private JLabel lnTituloPosiciones;
	private JPanel panelHeader;
	private JScrollPane scrollPane;

	private static DefaultTableModel model;
	private static Object[] column;

	private static JTable tableTeam;
	private JButton button;


	/**
	 * Create the dialog.
	 */

	public Ranking_Team() {
		
//		Lidom.getInstance().getListTeams().get(0).setGames(5);
//		Lidom.getInstance().getListTeams().get(0).setGamesWin(2);
//		
//		Lidom.getInstance().getListTeams().get(1).setGames(6);
//		Lidom.getInstance().getListTeams().get(1).setGamesWin(2);
//		
//		Lidom.getInstance().getListTeams().get(2).setGames(2);
//		Lidom.getInstance().getListTeams().get(2).setGamesWin(5);
//		
//		Lidom.getInstance().getListTeams().get(3).setGames(9);
//		Lidom.getInstance().getListTeams().get(3).setGamesWin(3);

		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 732, 371);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 732, 358);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);

			panelHeader = new JPanel();
			panelHeader.setLayout(null);
			panelHeader.setBackground(new Color(0, 30, 72));
			panelHeader.setBounds(0, 0, 732, 45);
			panelBg.add(panelHeader);

			lnTituloPosiciones = new JLabel("TABLA DE POSICIONES");
			lnTituloPosiciones.setHorizontalTextPosition(SwingConstants.CENTER);
			lnTituloPosiciones.setBounds(224, 0, 257, 45);
			panelHeader.add(lnTituloPosiciones);
			lnTituloPosiciones.setHorizontalAlignment(SwingConstants.CENTER);
			lnTituloPosiciones.setForeground(new Color(255, 255, 255));
			lnTituloPosiciones.setFont(new Font("Consolas", Font.BOLD, 20));
			
			button = new JButton("");
			button.setIcon(new ImageIcon(Ranking_Team.class.getResource("/iconos_imagenes/icons8_close_window_24px_1.png")));
			button.setPreferredSize(new Dimension(100, 30));
			button.setOpaque(false);
			button.setHideActionText(true);
			button.setForeground(Color.WHITE);
			button.setFont(new Font("Consolas", Font.BOLD, 20));
			button.setBorder(null);
			button.setBackground(new Color(4, 10, 20));
			button.setActionCommand("Cancel");
			button.setBounds(694, 0, 26, 30);
			panelHeader.add(button);

			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 85, 710, 273);
			panelBg.add(scrollPane);
			
			tableTeam = new JTable();
		
			tableTeam.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Equipo", "Ganados", "Perdidos", "Porcentaje"
				}
			) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1665962479029189562L;
				
				
				Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class
				};
			
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			tableTeam.setRowMargin(0);
			tableTeam .setFocusable(false);
			tableTeam.setRowHeight(20);
			tableTeam.setIntercellSpacing(new Dimension(0, 0));
			tableTeam.setGridColor(new Color(255, 255, 255));
			tableTeam.setShowVerticalLines(false);
			tableTeam.getTableHeader().setReorderingAllowed(false);
			tableTeam.setSelectionBackground(new Color(239, 108, 0));
			tableTeam.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableTeam.getTableHeader().setOpaque(false);

			tableTeam.getTableHeader().setBackground(new Color(255,255,255));
			tableTeam.setFont(new Font("Consolas", Font.PLAIN, 20));
			tableTeam.getColumnModel().getColumn(0).setMinWidth(155);
			tableTeam.setAutoCreateRowSorter(true);
			scrollPane.setViewportView(tableTeam);

		}
		
		loadTablePosiciones();


	}



	/** Metodos **/

	public void loadTablePosiciones() {
		
		model = (DefaultTableModel) tableTeam.getModel();
		model.setRowCount(0);
		column = new Object[model.getColumnCount()];
		DecimalFormat decimalFormat = new DecimalFormat("#.000");       
		String avg = null;
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		tableTeam.getColumnModel().getColumn(0).setCellRenderer(tcr);
		tableTeam.getColumnModel().getColumn(1).setCellRenderer(tcr);
		tableTeam.getColumnModel().getColumn(2).setCellRenderer(tcr);
		tableTeam.getColumnModel().getColumn(3).setCellRenderer(tcr);

		for (Team p : Lidom.getInstance().getListTeams()) {
			
			   avg = decimalFormat.format((Lidom.getInstance().TeamAvr(p.getGamesWin(), p.getGames())));
			   
				column[0] = p.getName();
				column[1] = p.getGamesWin();
				column[2] = p.getGamesLose();
				column[3] = avg;
			//	column[4] =  7;//Falta el metodo para buscar los juegos que le faltan a los equipos para llegar a la primera posicion
				
				
				model.addRow(column);
			}
			

		}
}
