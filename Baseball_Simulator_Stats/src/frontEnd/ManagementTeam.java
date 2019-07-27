package frontEnd;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;

import backEnd.Batter;
import backEnd.Game;
import backEnd.Lidom;
import backEnd.Pitcher;
import backEnd.Player;
import backEnd.Team;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManagementTeam extends JDialog {


	private final JPanel contentPanel = new JPanel();
	private JLabel lblRegistroEquipo;
	private JPanel panelHeader;
	private JPanel panelFondo;
	private JLabel lblFundadoTeam;
	private JLabel lblEstadioTeam;
	private JLabel lblManagerTeam;
	private JLabel lblNameTeam;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblLogoTeam;
	private JPanel panel;
	private JScrollPane scrollPaneLineUp;
	private JLabel label_8;
	private JLabel label_9;
	private JButton button;
	private JButton btnAgregarLesin;
	private JButton button_2;
	private JButton btnQuitarLesin;
	private JLabel label_10;
	private JScrollPane scrollPaneRoster;
	private JLabel label_11;
	private JScrollPane scrollPaneLesionados;
	private JPanel panelLineUp;
	private JLabel label_12;
	private JButton button_4;
	private JLabel lblBgPlayLineUp;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;


	private static JTable tableRoster;

	private static  DefaultTableModel modelRoster;
	public DefaultTableModel modelLineUp;
	private static DefaultTableModel modelLesionados;

	private static  Object[] columnRoster;
	public  Object[] columnLineUp;
	private static Object[] columnLesionados;
	static Team myTeam;
	private static JTable tableLesionados;
	private JTable tableLineUp;
	private JButton button_14;
	
	private static String nombreJugador;
	private static String nameArray[] ;

	/**
	 * Create the dialog.
	 */

	public ManagementTeam(Team team) {
		myTeam = Lidom.getInstance().searchTeamByName(team.getName());






		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 1585, 845);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 1585, 845);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);

			panelHeader = new JPanel();
			panelHeader.setLayout(null);
			panelHeader.setBackground(new Color(0, 30, 72));
			panelHeader.setBounds(0, 0, 1585, 45);
			panelBg.add(panelHeader);

			lblRegistroEquipo = new JLabel("GESTION DE EQUIPO");
			lblRegistroEquipo.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRegistroEquipo.setBounds(244, 0, 192, 45);
			panelHeader.add(lblRegistroEquipo);
			lblRegistroEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistroEquipo.setForeground(new Color(255, 255, 255));
			lblRegistroEquipo.setFont(new Font("Consolas", Font.BOLD, 20));
			
			button_14 = new JButton("");
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			button_14.setPreferredSize(new Dimension(100, 30));
			button_14.setOpaque(false);
			button_14.setHideActionText(true);
			button_14.setForeground(Color.WHITE);
			button_14.setFont(new Font("Consolas", Font.BOLD, 20));
			button_14.setBorder(null);
			button_14.setBackground(new Color(4, 10, 20));
			button_14.setActionCommand("Cancel");
			button_14.setBounds(1547, 0, 26, 30);
			panelHeader.add(button_14);

			panelFondo = new JPanel();
			panelFondo.setBounds(0, 45, 1585, 800);
			panelBg.add(panelFondo);
			panelFondo.setLayout(null);

			lblFundadoTeam = new JLabel("");

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			lblFundadoTeam.setText(formatter.format(myTeam.getFoundationDate()));

			lblFundadoTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblFundadoTeam.setVerticalAlignment(SwingConstants.BOTTOM);
			lblFundadoTeam.setHorizontalTextPosition(SwingConstants.LEFT);
			lblFundadoTeam.setHorizontalAlignment(SwingConstants.LEFT);
			lblFundadoTeam.setForeground(Color.BLACK);
			lblFundadoTeam.setFont(new Font("Consolas", Font.PLAIN, 22));
			lblFundadoTeam.setBackground(new Color(0, 30, 72));
			lblFundadoTeam.setBounds(455, 101, 260, 31);
			panelFondo.add(lblFundadoTeam);

			lblEstadioTeam = new JLabel("");

			lblEstadioTeam.setText(myTeam.getStadium());

			lblEstadioTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEstadioTeam.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEstadioTeam.setHorizontalTextPosition(SwingConstants.LEFT);
			lblEstadioTeam.setHorizontalAlignment(SwingConstants.LEFT);
			lblEstadioTeam.setForeground(Color.BLACK);
			lblEstadioTeam.setFont(new Font("Consolas", Font.PLAIN, 22));
			lblEstadioTeam.setBackground(new Color(0, 30, 72));
			lblEstadioTeam.setBounds(455, 57, 260, 31);
			panelFondo.add(lblEstadioTeam);

			lblManagerTeam = new JLabel("");

			lblManagerTeam.setText(myTeam.getManager());

			lblManagerTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblManagerTeam.setVerticalAlignment(SwingConstants.BOTTOM);
			lblManagerTeam.setHorizontalTextPosition(SwingConstants.LEFT);
			lblManagerTeam.setHorizontalAlignment(SwingConstants.LEFT);
			lblManagerTeam.setForeground(Color.BLACK);
			lblManagerTeam.setFont(new Font("Consolas", Font.PLAIN, 22));
			lblManagerTeam.setBackground(new Color(0, 30, 72));
			lblManagerTeam.setBounds(455, 143, 260, 31);
			panelFondo.add(lblManagerTeam);

			lblNameTeam = new JLabel();

			lblNameTeam.setText(myTeam.getName());

			lblNameTeam.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblNameTeam.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNameTeam.setHorizontalAlignment(SwingConstants.CENTER);
			lblNameTeam.setForeground(Color.BLACK);
			lblNameTeam.setFont(new Font("Consolas", Font.PLAIN, 36));
			lblNameTeam.setBackground(Color.WHITE);
			lblNameTeam.setBounds(229, 187, 573, 58);
			panelFondo.add(lblNameTeam);

			label_4 = new JLabel("- Manager:");
			label_4.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_4.setVerticalAlignment(SwingConstants.BOTTOM);
			label_4.setHorizontalTextPosition(SwingConstants.LEFT);
			label_4.setHorizontalAlignment(SwingConstants.LEFT);
			label_4.setForeground(Color.BLACK);
			label_4.setFont(new Font("Consolas", Font.PLAIN, 22));
			label_4.setBackground(new Color(0, 30, 72));
			label_4.setBounds(278, 143, 120, 31);
			panelFondo.add(label_4);

			label_5 = new JLabel("- Fundado:");
			label_5.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_5.setVerticalAlignment(SwingConstants.BOTTOM);
			label_5.setHorizontalTextPosition(SwingConstants.LEFT);
			label_5.setHorizontalAlignment(SwingConstants.LEFT);
			label_5.setForeground(Color.BLACK);
			label_5.setFont(new Font("Consolas", Font.PLAIN, 22));
			label_5.setBackground(new Color(0, 30, 72));
			label_5.setBounds(278, 101, 120, 31);
			panelFondo.add(label_5);

			label_6 = new JLabel("- Estadio:");
			label_6.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_6.setVerticalAlignment(SwingConstants.BOTTOM);
			label_6.setHorizontalTextPosition(SwingConstants.LEFT);
			label_6.setHorizontalAlignment(SwingConstants.LEFT);
			label_6.setForeground(Color.BLACK);
			label_6.setFont(new Font("Consolas", Font.PLAIN, 22));
			label_6.setBackground(new Color(0, 30, 72));
			label_6.setBounds(278, 57, 120, 31);
			panelFondo.add(label_6);

			lblLogoTeam = new JLabel("");
			lblLogoTeam.setToolTipText("LIDOM");
			lblLogoTeam.setOpaque(true);
			lblLogoTeam.setBackground(Color.BLACK);
			lblLogoTeam.setBounds(12, 38, 205, 205);
			panelFondo.add(lblLogoTeam);

			String routetosave = "Fotos_Equipos/"+ myTeam.getName() + ".png";
			/** to adjust image at size of JLabel **/
			ImageIcon fotoJugador = new ImageIcon(routetosave);
			Icon fotoJ = new ImageIcon(fotoJugador.getImage().getScaledInstance(lblLogoTeam.getWidth(), lblLogoTeam.getHeight(), Image.SCALE_SMOOTH));
			lblLogoTeam.setIcon(fotoJ);

			panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel.setBackground(Color.WHITE);
			panel.setBounds(12, 258, 775, 529);
			panelFondo.add(panel);
			panel.setLayout(new CardLayout(0, 0));

			panelLineUp = new JPanel();
			panel.add(panelLineUp, "name_35499254060700");
			panelLineUp.setLayout(null);

			label_12 = new JLabel("CREAR LINE UP  DEL EQUIPO");
			label_12.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_12.setVerticalAlignment(SwingConstants.BOTTOM);
			label_12.setOpaque(true);
			label_12.setHorizontalTextPosition(SwingConstants.CENTER);
			label_12.setHorizontalAlignment(SwingConstants.CENTER);
			label_12.setForeground(Color.WHITE);
			label_12.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_12.setBackground(new Color(0, 30, 72));
			label_12.setBounds(202, 13, 403, 31);
			panelLineUp.add(label_12);

			button_4 = new JButton("CF");
			button_4.setIconTextGap(5);
			button_4.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_4.setForeground(new Color(255, 255, 240));
			button_4.setFont(new Font("Consolas", Font.BOLD, 22));
			button_4.setBorder(null);
			button_4.setBackground(new Color(4, 10, 20));
			button_4.setBounds(360, 98, 60, 37);
			panelLineUp.add(button_4);

			button_5 = new JButton("LF");
			button_5.setIconTextGap(5);
			button_5.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_5.setForeground(new Color(255, 255, 240));
			button_5.setFont(new Font("Consolas", Font.BOLD, 22));
			button_5.setBorder(null);
			button_5.setBackground(new Color(4, 10, 20));
			button_5.setBounds(158, 142, 60, 37);
			panelLineUp.add(button_5);

			button_6 = new JButton("SS");
			button_6.setIconTextGap(5);
			button_6.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_6.setForeground(new Color(255, 255, 240));
			button_6.setFont(new Font("Consolas", Font.BOLD, 22));
			button_6.setBorder(null);
			button_6.setBackground(new Color(4, 10, 20));
			button_6.setBounds(262, 268, 60, 37);
			panelLineUp.add(button_6);

			button_7 = new JButton("3B");
			button_7.setIconTextGap(5);
			button_7.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_7.setForeground(new Color(255, 255, 240));
			button_7.setFont(new Font("Consolas", Font.BOLD, 22));
			button_7.setBorder(null);
			button_7.setBackground(new Color(4, 10, 20));
			button_7.setBounds(233, 344, 60, 37);
			panelLineUp.add(button_7);

			button_8 = new JButton("P");
			button_8.setIconTextGap(5);
			button_8.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_8.setForeground(new Color(255, 255, 240));
			button_8.setFont(new Font("Consolas", Font.BOLD, 22));
			button_8.setBorder(null);
			button_8.setBackground(new Color(4, 10, 20));
			button_8.setBounds(360, 363, 60, 37);
			panelLineUp.add(button_8);

			button_9 = new JButton("C");
			button_9.setIconTextGap(5);
			button_9.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_9.setForeground(new Color(255, 255, 240));
			button_9.setFont(new Font("Consolas", Font.BOLD, 22));
			button_9.setBorder(null);
			button_9.setBackground(new Color(4, 10, 20));
			button_9.setBounds(360, 549, 60, 37);
			panelLineUp.add(button_9);

			button_10 = new JButton("Finalizar Line Up");
			button_10.setIconTextGap(5);
			button_10.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_10.setForeground(new Color(255, 255, 240));
			button_10.setFont(new Font("Consolas", Font.BOLD, 22));
			button_10.setEnabled(false);
			button_10.setBorder(null);
			button_10.setBackground(new Color(4, 10, 20));
			button_10.setBounds(243, 615, 284, 37);
			panelLineUp.add(button_10);

			button_11 = new JButton("1B");
			button_11.setIconTextGap(5);
			button_11.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_11.setForeground(new Color(255, 255, 240));
			button_11.setFont(new Font("Consolas", Font.BOLD, 22));
			button_11.setBorder(null);
			button_11.setBackground(new Color(4, 10, 20));
			button_11.setBounds(474, 351, 60, 37);
			panelLineUp.add(button_11);

			button_12 = new JButton("2B");
			button_12.setIconTextGap(5);
			button_12.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_12.setForeground(new Color(255, 255, 240));
			button_12.setFont(new Font("Consolas", Font.BOLD, 22));
			button_12.setBorder(null);
			button_12.setBackground(new Color(4, 10, 20));
			button_12.setBounds(441, 268, 60, 37);
			panelLineUp.add(button_12);

			button_13 = new JButton("RF");
			button_13.setIconTextGap(5);
			button_13.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_13.setForeground(new Color(255, 255, 240));
			button_13.setFont(new Font("Consolas", Font.BOLD, 22));
			button_13.setBorder(null);
			button_13.setBackground(new Color(4, 10, 20));
			button_13.setBounds(561, 142, 60, 37);
			panelLineUp.add(button_13);

			lblBgPlayLineUp = new JLabel("");
			lblBgPlayLineUp.setBounds(30, 62, 711, 542);
			panelLineUp.add(lblBgPlayLineUp);
			/** to adjust image at size of JLabel **/
			ImageIcon bgLinePlay = new ImageIcon(getClass().getResource("/iconos_imagenes/Baseball_diamond_clean.png"));
			Icon playLine = new ImageIcon(bgLinePlay.getImage().getScaledInstance(lblBgPlayLineUp.getWidth(), lblBgPlayLineUp.getHeight(), Image.SCALE_SMOOTH));
			lblBgPlayLineUp.setIcon(playLine);

			scrollPaneLineUp = new JScrollPane();
			scrollPaneLineUp.setBounds(799, 341, 375, 152);
			panelFondo.add(scrollPaneLineUp);

			tableLineUp = new JTable();
			tableLineUp.setRowMargin(0);
			tableLineUp .setFocusable(false);
			tableLineUp.setRowHeight(20);
			tableLineUp.setIntercellSpacing(new Dimension(0, 0));
			tableLineUp.setGridColor(new Color(255, 255, 255));
			tableLineUp.setShowVerticalLines(false);
			tableLineUp.getTableHeader().setReorderingAllowed(false);
			tableLineUp.setSelectionBackground(new Color(239, 108, 0));
			tableLineUp.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableLineUp.getTableHeader().setOpaque(false);

			tableLineUp.getTableHeader().setBackground(new Color(255,255,255));
			tableLineUp.setFont(new Font("Consolas", Font.PLAIN, 15));
			tableLineUp.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"N\u00FAmero ID", "Nombre", "Posici\u00F3n"
					}
					) {
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
			scrollPaneLineUp.setViewportView(tableLineUp);

			label_8 = new JLabel("Line Up / Jugadores Regulares");
			label_8.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_8.setVerticalAlignment(SwingConstants.BOTTOM);
			label_8.setOpaque(true);
			label_8.setHorizontalTextPosition(SwingConstants.CENTER);
			label_8.setHorizontalAlignment(SwingConstants.CENTER);
			label_8.setForeground(Color.WHITE);
			label_8.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_8.setBackground(new Color(0, 30, 72));
			label_8.setBounds(799, 297, 375, 31);
			panelFondo.add(label_8);

			label_9 = new JLabel("Funciones");
			label_9.setOpaque(true);
			label_9.setHorizontalTextPosition(SwingConstants.CENTER);
			label_9.setHorizontalAlignment(SwingConstants.CENTER);
			label_9.setForeground(Color.WHITE);
			label_9.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_9.setBackground(new Color(0, 30, 72));
			label_9.setBounds(799, 143, 352, 31);
			panelFondo.add(label_9);

			button = new JButton("Crear Line Up");
			button.setIconTextGap(5);
			button.setHorizontalTextPosition(SwingConstants.RIGHT);
			button.setForeground(new Color(255, 255, 240));
			button.setFont(new Font("Consolas", Font.BOLD, 22));
			button.setBorder(null);
			button.setBackground(new Color(4, 10, 20));
			button.setBounds(981, 187, 170, 37);
			panelFondo.add(button);

			btnAgregarLesin = new JButton("Agregar Lesi\u00F3n");
			btnAgregarLesin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AddInjury injury = new AddInjury(myTeam, false);
					injury.setModal(true);
					injury.setVisible(true);
				}
			});
			btnAgregarLesin.setIconTextGap(5);
			btnAgregarLesin.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnAgregarLesin.setForeground(new Color(255, 255, 240));
			btnAgregarLesin.setFont(new Font("Consolas", Font.BOLD, 22));
			btnAgregarLesin.setBorder(null);
			btnAgregarLesin.setBackground(new Color(4, 10, 20));
			btnAgregarLesin.setBounds(981, 237, 170, 37);
			panelFondo.add(btnAgregarLesin);

			button_2 = new JButton("Funciones n/a");
			button_2.setIconTextGap(5);
			button_2.setHorizontalTextPosition(SwingConstants.RIGHT);
			button_2.setForeground(new Color(255, 255, 240));
			button_2.setFont(new Font("Consolas", Font.BOLD, 22));
			button_2.setEnabled(false);
			button_2.setBorder(null);
			button_2.setBackground(new Color(4, 10, 20));
			button_2.setBounds(799, 187, 170, 37);
			panelFondo.add(button_2);

			btnQuitarLesin = new JButton("Quitar Lesi\u00F3n");
			btnQuitarLesin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					AddInjury injury = new AddInjury(myTeam, true);
					injury.setModal(true);
					injury.setVisible(true);

				}
			});
			btnQuitarLesin.setIconTextGap(5);
			btnQuitarLesin.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnQuitarLesin.setForeground(new Color(255, 255, 240));
			btnQuitarLesin.setFont(new Font("Consolas", Font.BOLD, 22));
			btnQuitarLesin.setBorder(null);
			btnQuitarLesin.setBackground(new Color(4, 10, 20));
			btnQuitarLesin.setBounds(799, 237, 170, 37);
			panelFondo.add(btnQuitarLesin);

			label_10 = new JLabel("Roster / Jugadores Activos");
			label_10.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_10.setVerticalAlignment(SwingConstants.BOTTOM);
			label_10.setOpaque(true);
			label_10.setHorizontalTextPosition(SwingConstants.CENTER);
			label_10.setHorizontalAlignment(SwingConstants.CENTER);
			label_10.setForeground(Color.WHITE);
			label_10.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_10.setBackground(new Color(0, 30, 72));
			label_10.setBounds(1198, 13, 375, 31);
			panelFondo.add(label_10);

			scrollPaneRoster = new JScrollPane();
			scrollPaneRoster.setBounds(1198, 57, 375, 355);
			panelFondo.add(scrollPaneRoster);

			tableRoster = new JTable();
			tableRoster.setRowMargin(0);
			tableRoster .setFocusable(false);
			tableRoster.setRowHeight(20);
			tableRoster.setIntercellSpacing(new Dimension(0, 0));
			tableRoster.setGridColor(new Color(255, 255, 255));
			tableRoster.setShowVerticalLines(false);
			tableRoster.getTableHeader().setReorderingAllowed(false);
			tableRoster.setSelectionBackground(new Color(239, 108, 0));
			tableRoster.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableRoster.getTableHeader().setOpaque(false);

			tableRoster.getTableHeader().setBackground(new Color(255,255,255));
			tableRoster.setFont(new Font("Consolas", Font.PLAIN, 15));
			tableRoster.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"N\u00FAmero ID", "Nombre", "Apellido"
					}
					) {
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
			scrollPaneRoster.setViewportView(tableRoster);

			label_11 = new JLabel("Jugadores Lesionados");
			label_11.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_11.setVerticalAlignment(SwingConstants.BOTTOM);
			label_11.setOpaque(true);
			label_11.setHorizontalTextPosition(SwingConstants.CENTER);
			label_11.setHorizontalAlignment(SwingConstants.CENTER);
			label_11.setForeground(Color.WHITE);
			label_11.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_11.setBackground(new Color(0, 30, 72));
			label_11.setBounds(1198, 425, 375, 31);
			panelFondo.add(label_11);

			scrollPaneLesionados = new JScrollPane();
			scrollPaneLesionados.setBounds(1198, 469, 375, 318);
			panelFondo.add(scrollPaneLesionados);

			tableLesionados = new JTable();
			tableLesionados.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if (tableLesionados.getSelectedRow() > 0) {
						int index = tableLesionados.getSelectedRow();
						nombreJugador = (String) tableLesionados.getModel().getValueAt(index, 1);
						nameArray = nombreJugador.split(" ",0);
					//	tabbedPane.setSelectedIndex(3);
						//cargarJugadoresLesionadoPorEquipo();
						//cargarJugador(jugador);
					}
					
					
					
				}
			});
			tableLesionados.setRowMargin(0);
			tableLesionados .setFocusable(false);
			tableLesionados.setRowHeight(20);
			tableLesionados.setIntercellSpacing(new Dimension(0, 0));
			tableLesionados.setGridColor(new Color(255, 255, 255));
			tableLesionados.setShowVerticalLines(false);
			tableLesionados.getTableHeader().setReorderingAllowed(false);
			tableLesionados.setSelectionBackground(new Color(239, 108, 0));
			tableLesionados.getTableHeader().setFont(new Font("Consolas", Font.BOLD, 16));
			tableLesionados.getTableHeader().setOpaque(false);

			tableLesionados.getTableHeader().setBackground(new Color(255,255,255));
			tableLesionados.setFont(new Font("Consolas", Font.PLAIN, 15));
			tableLesionados.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"N\u00FAmero ID", "Nombre"
					}
					) {
				Class[] columnTypes = new Class[] {
						String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
						false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			scrollPaneLesionados.setViewportView(tableLesionados);
			/**********************************************************/		


		}
		loadInjuryPlayerByTeam();
		loadRosterPlayerByTeam();
		

	}


	/********* METODOS ************/


	public static void loadRosterPlayerByTeam() {

		modelRoster= (DefaultTableModel) tableRoster.getModel();
		modelRoster.setRowCount(0);
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		tableRoster.getColumnModel().getColumn(0).setCellRenderer(tcr);
		tableRoster.getColumnModel().getColumn(1).setCellRenderer(tcr);
		tableRoster.getColumnModel().getColumn(2).setCellRenderer(tcr);
		columnRoster = new Object[modelRoster.getColumnCount()];

		for (Player playerR : myTeam.getRosterPlayers()) {
			if (!playerR.getLesionado()) {

				columnRoster[0] = playerR.getId();
				columnRoster[1] = playerR.getName();
				columnRoster[2] =  playerR.getLastname();
				modelRoster.addRow(columnRoster);
			}
			

		}
	}

	// Metodo para cargar la lista de jugadores lesionados de un equipo.
	public static void loadInjuryPlayerByTeam() {

		modelLesionados= (DefaultTableModel) tableLesionados.getModel();
		modelLesionados.setRowCount(0);
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		tableLesionados.getColumnModel().getColumn(0).setCellRenderer(tcr);
		tableLesionados.getColumnModel().getColumn(1).setCellRenderer(tcr);
		columnLesionados = new Object[modelLesionados.getColumnCount()];

		for (Player playerR : myTeam.getRosterPlayers()) {
			if (playerR.getLesionado()== true) {
				columnLesionados[0] = playerR.getId();
				columnLesionados[1] = playerR.getName();
				modelLesionados.addRow(columnLesionados);
			}

		}
	}
}

