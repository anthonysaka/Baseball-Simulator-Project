package frontEnd;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;
import rojeru_san.componentes.RSDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import backEnd.Game;
import backEnd.Lidom;
import backEnd.Stadium;
import backEnd.Team;

public class AddGame extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8867271004002977275L;
	
	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblRegistroEquipo;
	private JPanel panelHeader;
	private JLabel lblInformacinPersonal;
	private JLabel lblId;
	private JLabel lblNmeroUniforme;

	private JButton btnRegistrar;
	private JButton btnCancelar;
	private JComboBox cbxEquipoLocal;
	private JComboBox cbxEquipoVisitante;
	private RSDateChooser dateChooser;
	private JLabel lblFecha;
	private JComboBox cbxHora;
	private JLabel lblHora;
	private JComboBox cbxEstadio;
	private JLabel lblEstadio;
private static Game myGame;

	/**
	 * Create the dialog.
	 */

	public AddGame(Game game) {


		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 670, 395);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 670, 395);
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

			lblRegistroEquipo = new JLabel("MODIFICACION PARTIDO");
			lblRegistroEquipo.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRegistroEquipo.setBounds(206, 0, 261, 45);
			panelHeader.add(lblRegistroEquipo);
			lblRegistroEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistroEquipo.setForeground(new Color(255, 255, 255));
			lblRegistroEquipo.setFont(new Font("Consolas", Font.BOLD, 20));

			lblInformacinPersonal = new JLabel("Informaci\u00F3n Partido");
			lblInformacinPersonal.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblInformacinPersonal.setVerticalAlignment(SwingConstants.BOTTOM);
			lblInformacinPersonal.setHorizontalAlignment(SwingConstants.LEFT);
			lblInformacinPersonal.setForeground(Color.BLACK);
			lblInformacinPersonal.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblInformacinPersonal.setBounds(55, 63, 225, 31);
			panelBg.add(lblInformacinPersonal);

			lblId = new JLabel("Equipo Local");
			lblId.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblId.setVerticalAlignment(SwingConstants.BOTTOM);
			lblId.setHorizontalAlignment(SwingConstants.LEFT);
			lblId.setForeground(Color.BLACK);
			lblId.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblId.setBounds(55, 107, 225, 31);
			panelBg.add(lblId);
			/**********************************************************/		

			Lidom.getInstance();

			lblNmeroUniforme = new JLabel("Equipo Visitante");
			lblNmeroUniforme.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNmeroUniforme.setHorizontalAlignment(SwingConstants.LEFT);
			lblNmeroUniforme.setForeground(Color.BLACK);
			lblNmeroUniforme.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblNmeroUniforme.setBounds(403, 107, 225, 31);
			panelBg.add(lblNmeroUniforme);

			btnRegistrar = new JButton("Modificar");
			btnRegistrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//	Lidom.getInstance().getListGame().removeAll(Lidom.getInstance().getListGame());
					Locale spanishLocale = new Locale("es", "ES");
					SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy", spanishLocale);
					
					String teamHome = cbxEquipoLocal.getSelectedItem().toString();
					String teamAway = cbxEquipoVisitante.getSelectedItem().toString();
					String hour = cbxHora.getSelectedItem().toString();
					String estadio = cbxEstadio.getSelectedItem().toString();
					Date dateGame = dateChooser.getDatoFecha();
					
					String dateGameString = formatter.format(dateGame);
					if (cbxHora.getSelectedIndex() > 0 && dateGameString != null) {
						myGame.setAwayTeam(teamAway);
						myGame.setHomeTeam(teamHome);
						myGame.setDate(dateGameString);
						myGame.setHora(hour);
						myGame.setStadium(estadio);
						Lidom.getInstance().updateGame(myGame);
						JOptionPane.showMessageDialog(null, "Modificado con exito!", "Alerta - Hecho!", JOptionPane.INFORMATION_MESSAGE);
						Lidom.getInstance().saveInitData(Lidom.getInstance());
						dispose();
						ViewGame.loadTableGame();
						Home.loadGameToday();
						
					}
					else {
						ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
						String[] options = {"Ok"};	
						JOptionPane.showOptionDialog(null, "Complete todos los campos, correctamente!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
				}
					
					
				}
			});
			btnRegistrar.setIcon(new ImageIcon(AddPlayer.class.getResource("/iconos_imagenes/icons8_baseball_24px.png")));
			btnRegistrar.setIconTextGap(5);
			btnRegistrar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnRegistrar.setForeground(new Color(255, 255, 240));
			btnRegistrar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnRegistrar.setBorder(null);
			btnRegistrar.setBackground(new Color(0, 30, 72));
			btnRegistrar.setBounds(324, 352, 146, 30);
			panelBg.add(btnRegistrar);

			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	
					int xOption	= JOptionPane.showOptionDialog(null, "¿Seguro que desea cancelar?, la ventana se cerrará.", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					if (xOption == 0) {
						clean();
						dispose();
					}
				}
			});
			btnCancelar.setIcon(new ImageIcon(AddPlayer.class.getResource("/iconos_imagenes/icons8_cancel_24px_2.png")));
			btnCancelar.setIconTextGap(5);
			btnCancelar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnCancelar.setForeground(new Color(255, 255, 240));
			btnCancelar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnCancelar.setBorder(null);
			btnCancelar.setBackground(new Color(0, 30, 70));
			btnCancelar.setBounds(482, 352, 146, 30);
			panelBg.add(btnCancelar);
			
			cbxEquipoLocal = new JComboBox<String>();
			cbxEquipoLocal.setEnabled(false);
			cbxEquipoLocal.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxEquipoLocal.setBounds(55, 143, 225, 30);
			panelBg.add(cbxEquipoLocal);
			
			cbxEquipoVisitante = new JComboBox();
			cbxEquipoVisitante.setEnabled(false);
			cbxEquipoVisitante.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxEquipoVisitante.setBounds(403, 143, 225, 30);
			panelBg.add(cbxEquipoVisitante);
			
			dateChooser = new RSDateChooser();
			dateChooser.setPlaceholder("");
			dateChooser.setFuente(new Font("Consolas", Font.PLAIN, 18));
			dateChooser.setFormatoFecha("dd/MM/yyyy");
			dateChooser.setColorForeground(Color.BLACK);
			dateChooser.setColorBackground(new Color(0, 30, 72));
			dateChooser.setBounds(55, 224, 225, 30);
			panelBg.add(dateChooser);
			
			lblFecha = new JLabel("Fecha");
			lblFecha.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblFecha.setVerticalAlignment(SwingConstants.BOTTOM);
			lblFecha.setHorizontalAlignment(SwingConstants.LEFT);
			lblFecha.setForeground(Color.BLACK);
			lblFecha.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblFecha.setBounds(55, 191, 238, 31);
			panelBg.add(lblFecha);
			
			cbxHora = new JComboBox();
			cbxHora.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>","8:00 AM","8:30 AM", "9:00 AM","9:30 AM", "10:00 AM","10:30 AM",
					"11:00 AM","11:30 AM", "12:00 PM","12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM",
					"4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM","7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM","10:00 PM",
					"10:30 PM","11:00 PM"}));
			cbxHora.setSelectedIndex(0);
			cbxHora.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxHora.setBounds(403, 224, 225, 30);
			panelBg.add(cbxHora);
			
			lblHora = new JLabel("Hora");
			lblHora.setVerticalAlignment(SwingConstants.BOTTOM);
			lblHora.setHorizontalAlignment(SwingConstants.LEFT);
			lblHora.setForeground(Color.BLACK);
			lblHora.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblHora.setBounds(403, 188, 225, 31);
			panelBg.add(lblHora);
			
			cbxEstadio = new JComboBox();
			cbxEstadio.setEnabled(false);
			cbxEstadio.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxEstadio.setBounds(55, 303, 225, 30);
			panelBg.add(cbxEstadio);
			
			lblEstadio = new JLabel("Estadio");
			lblEstadio.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblEstadio.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEstadio.setHorizontalAlignment(SwingConstants.LEFT);
			lblEstadio.setForeground(Color.BLACK);
			lblEstadio.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblEstadio.setBounds(55, 267, 225, 31);
			panelBg.add(lblEstadio);
		}
		myGame =  Lidom.getInstance().searchGame(game.getHomeTeam(), game.getAwayTeam(), game.getStadium(), game.getDate(), game.getHora());
		loadStadiumsCbx();
		loadTeamsCbx();
		loadGameData();
	}



	/** Metodos **/
	private void loadStadiumsCbx() {

		cbxEstadio.removeAllItems();

		for (Stadium s : Lidom.getInstance().getListStadium()) {
			cbxEstadio.addItem(s.getName());	
		}
		
		cbxEstadio.insertItemAt(new String("<Seleccionar"), 0);
		cbxEstadio.setSelectedIndex(0);
		

	}
	
	private void loadTeamsCbx() {

		cbxEquipoLocal.removeAllItems();
		cbxEquipoVisitante.removeAllItems();

		for (Team t : Lidom.getInstance().getListTeams()) {
			cbxEquipoLocal.addItem(t.getName());
			cbxEquipoVisitante.addItem(t.getName());
		}


		cbxEquipoLocal.insertItemAt(new String("<Seleccionar"), 0);
		cbxEquipoVisitante.insertItemAt(new String("<Seleccionar"), 0);
		cbxEquipoLocal.setSelectedIndex(0);
		cbxEquipoVisitante.setSelectedIndex(0);

	}

	private void clean() {
		cbxEstadio.setSelectedIndex(0);
		cbxEquipoLocal.setSelectedIndex(0);
		cbxEquipoVisitante.setSelectedIndex(0);
		cbxHora.setSelectedIndex(0);
	}
	
	private void loadGameData() {
	
		if (myGame!=null) {
			
			cbxEquipoLocal.setSelectedItem(myGame.getHomeTeam());
			cbxEquipoVisitante.setSelectedItem(myGame.getAwayTeam());
			cbxEstadio.setSelectedItem(myGame.getStadium());
			
			//dateChooser.setFormatoFecha(myGame.getDate());
			
			
		}
	}
}
