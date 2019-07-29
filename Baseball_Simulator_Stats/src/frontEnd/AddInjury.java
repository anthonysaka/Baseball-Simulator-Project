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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;
import rojeru_san.componentes.RSDateChooser;


import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import backEnd.Game;
import backEnd.Injury;
import backEnd.Lidom;
import backEnd.Player;
import backEnd.Stadium;
import backEnd.Team;
import javax.swing.border.LineBorder;

public class AddInjury extends JDialog {

	/**
	 * 
	 */


	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblRegistroEquipo;
	private JPanel panelHeader;
	private JLabel lblInformacinPersonal;
	private JLabel lblId;

	private JButton btnRegistrar;
	private JButton btnCancelar;
	private JComboBox cbxTipoLesion;
	private JLabel lblHora;
	private JComboBox cbxJugadoresLesion;
	private JLabel lblJugadores;
	private JLabel lblTeamLesion;

	private RSDateChooser dateChooser;
	private JLabel lblFechaDeLesin;


	/**
	 * Create the dialog.
	 */

	public AddInjury(Team auxTeam, Boolean quitar) {



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

			lblRegistroEquipo = new JLabel("REGISTRO LESION");
			if (quitar) {
				lblRegistroEquipo = new JLabel("ELIMINAR LESION");
			}
			else {
				lblRegistroEquipo = new JLabel("REGISTRO LESION");
			}
			lblRegistroEquipo.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRegistroEquipo.setBounds(244, 0, 192, 45);
			panelHeader.add(lblRegistroEquipo);
			lblRegistroEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistroEquipo.setForeground(new Color(255, 255, 255));
			lblRegistroEquipo.setFont(new Font("Consolas", Font.BOLD, 20));

			lblInformacinPersonal = new JLabel("Informaci\u00F3n Lesi\u00F3n");
			lblInformacinPersonal.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblInformacinPersonal.setVerticalAlignment(SwingConstants.BOTTOM);
			lblInformacinPersonal.setHorizontalAlignment(SwingConstants.LEFT);
			lblInformacinPersonal.setForeground(Color.BLACK);
			lblInformacinPersonal.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblInformacinPersonal.setBounds(55, 63, 225, 31);
			panelBg.add(lblInformacinPersonal);

			lblId = new JLabel("Equipo");
			lblId.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblId.setVerticalAlignment(SwingConstants.BOTTOM);
			lblId.setHorizontalAlignment(SwingConstants.CENTER);
			lblId.setForeground(Color.BLACK);
			lblId.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblId.setBounds(55, 107, 225, 31);
			panelBg.add(lblId);
			/**********************************************************/		

			Lidom.getInstance();

			btnRegistrar = new JButton();
			if (quitar) {
				btnRegistrar.setText("Eliminar");

			}
			else {
				btnRegistrar.setText("Registrar");
			}

			btnRegistrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String nameTeam = auxTeam.getName();

					String nameCompletePlayer = cbxJugadoresLesion.getSelectedItem().toString();
					String nameArray[] = nameCompletePlayer.split(" ",0);



					if (quitar==false) {
						String injuryType = cbxTipoLesion.getSelectedItem().toString();
						Date date = dateChooser.getDatoFecha();
						DateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
						String fechalesion = df.format(date);
						if (cbxTipoLesion.getSelectedIndex() > 0 && cbxJugadoresLesion.getSelectedIndex() > 0 && date != null) {

							Injury injurys = new Injury(nameTeam, nameCompletePlayer, fechalesion, injuryType);

							auxTeam.addLesion(nameArray[0],nameArray[1], injurys);
							ManagementTeam.loadInjuryPlayerByTeam();
							ManagementTeam.loadRosterPlayerByTeam();						
							ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_checked_48px_1.png"));
							String[] options = {"Ok"};	
							JOptionPane.showOptionDialog(null, "Registro con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
							clean();
							loadcombobox(auxTeam, quitar);
							dispose();

						}else {
							ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
							String[] options = {"Ok"};	
							JOptionPane.showOptionDialog(null, "Complete todos los campos, correctamente!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
						}
					}
					else {
						//BLOQUE PARA ELIMINAR LESION
						if (cbxJugadoresLesion.getSelectedIndex()>0) {


							auxTeam.deleteLesion(nameArray[0],nameArray[1], null);
							ManagementTeam.loadInjuryPlayerByTeam();
							ManagementTeam.loadRosterPlayerByTeam();						
							ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_checked_48px_1.png"));
							String[] options = {"Ok"};	
							JOptionPane.showOptionDialog(null, "Eliminación con exito!", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
							clean();
							dispose();
						}else {
							ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
							String[] options = {"Ok"};	
							JOptionPane.showOptionDialog(null, "Complete todos los campos, correctamente!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);
						}

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

			cbxTipoLesion = new JComboBox();
			if (quitar) {
				cbxTipoLesion.setEnabled(false);

			}
			cbxTipoLesion.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>","Lesiones musculares", "Fracturas", "Ampollas","Desgarro muscular",
					"Esguinces","Lesion de codo"}));
			cbxTipoLesion.setSelectedIndex(0);
			cbxTipoLesion.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxTipoLesion.setBounds(358, 224, 270, 30);
			panelBg.add(cbxTipoLesion);

			lblHora = new JLabel("Tipo Lesi\u00F3n");
			lblHora.setVerticalAlignment(SwingConstants.BOTTOM);
			lblHora.setHorizontalAlignment(SwingConstants.LEFT);
			lblHora.setForeground(Color.BLACK);
			lblHora.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblHora.setBounds(358, 188, 270, 31);
			panelBg.add(lblHora);

			cbxJugadoresLesion = new JComboBox();
			cbxJugadoresLesion.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxJugadoresLesion.setBounds(55, 224, 225, 30);
			panelBg.add(cbxJugadoresLesion);

			lblJugadores = new JLabel("Jugador a lesionar");
			lblJugadores.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblJugadores.setVerticalAlignment(SwingConstants.BOTTOM);
			lblJugadores.setHorizontalAlignment(SwingConstants.LEFT);
			lblJugadores.setForeground(Color.BLACK);
			lblJugadores.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblJugadores.setBounds(55, 188, 225, 31);
			panelBg.add(lblJugadores);

			lblTeamLesion = new JLabel("");
			lblTeamLesion.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			lblTeamLesion.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblTeamLesion.setVerticalAlignment(SwingConstants.BOTTOM);
			lblTeamLesion.setHorizontalAlignment(SwingConstants.LEFT);
			lblTeamLesion.setForeground(Color.BLACK);
			lblTeamLesion.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblTeamLesion.setBounds(55, 144, 225, 31);
			panelBg.add(lblTeamLesion);

			dateChooser = new RSDateChooser();
			if (quitar) {
				dateChooser.setEnabled(false);
				dateChooser.setFocusable(false);

			}
			dateChooser.setPlaceholder("");
			dateChooser.setFuente(new Font("Consolas", Font.PLAIN, 18));
			dateChooser.setFormatoFecha("dd/MM/yyyy");
			dateChooser.setColorForeground(Color.BLACK);
			dateChooser.setColorBackground(new Color(0, 30, 72));
			dateChooser.setBounds(358, 144, 270, 30);
			panelBg.add(dateChooser);

			lblFechaDeLesin = new JLabel("Fecha de lesi\u00F3n");
			lblFechaDeLesin.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblFechaDeLesin.setVerticalAlignment(SwingConstants.BOTTOM);
			lblFechaDeLesin.setHorizontalAlignment(SwingConstants.LEFT);
			lblFechaDeLesin.setForeground(Color.BLACK);
			lblFechaDeLesin.setFont(new Font("Consolas", Font.PLAIN, 20));
			lblFechaDeLesin.setBounds(358, 107, 238, 31);
			panelBg.add(lblFechaDeLesin);
		}
		lblTeamLesion.setText(auxTeam.getName());

		loadcombobox(auxTeam, quitar);



	}

	/** Metodos **/
	private void loadcombobox(Team auxTeam, Boolean quitar) {
		for (int i = 0; i < auxTeam.getRosterPlayers().size(); i++) {
			if (quitar) {
				if(auxTeam.getRosterPlayers().get(i).getLesionado()==true){
					cbxJugadoresLesion.addItem(auxTeam.getRosterPlayers().get(i).getName() + " "+ auxTeam.getRosterPlayers().get(i).getLastname() );
				}
			}else {
				if(auxTeam.getRosterPlayers().get(i).getLesionado()==false){
					cbxJugadoresLesion.addItem(auxTeam.getRosterPlayers().get(i).getName() + " "+ auxTeam.getRosterPlayers().get(i).getLastname() );
				}		
			}
		}
		cbxJugadoresLesion.insertItemAt(new String("<Seleccionar"), 0);
		cbxJugadoresLesion.setSelectedIndex(0);

	}


	private void clean() {
		cbxJugadoresLesion.setSelectedIndex(0);
		cbxTipoLesion.setSelectedIndex(0);
		dateChooser.setDatoFecha(null);
	}
}
