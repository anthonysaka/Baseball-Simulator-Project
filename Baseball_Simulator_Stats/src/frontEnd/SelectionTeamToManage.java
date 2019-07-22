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
import java.util.UUID;
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
import javax.swing.text.MaskFormatter;

import backEnd.Lidom;
import backEnd.Stadium;
import backEnd.Team;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SelectionTeamToManage extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblRegistroEquipo;
	private JPanel panelHeader;

	private JButton btnSeleccionar;
	private JButton btnCancelar;
	private JLabel label_1;
	private JComboBox cbxTeams;
	
	public static Team auxTeam;


	/**
	 * Create the dialog.
	 */
	public SelectionTeamToManage() {

		getContentPane().setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		setBounds(100, 100, 502, 275);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBg = new JPanel();
			panelBg.setBackground(new Color(255, 255, 255));
			panelBg.setBounds(0, 0, 502, 275);
			contentPanel.add(panelBg);
			panelBg.setLayout(null);

			panelHeader = new JPanel();
			panelHeader.setLayout(null);
			panelHeader.setBackground(new Color(0, 30, 72));
			panelHeader.setBounds(0, 0, 687, 45);
			panelBg.add(panelHeader);

			lblRegistroEquipo = new JLabel("SELECCIONAR EQUIPO PARA GESTIONAR");
			lblRegistroEquipo.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRegistroEquipo.setBounds(51, 13, 385, 24);
			panelHeader.add(lblRegistroEquipo);
			lblRegistroEquipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistroEquipo.setForeground(new Color(255, 255, 255));
			lblRegistroEquipo.setFont(new Font("Consolas", Font.BOLD, 20));
			/**********************************************************/		

			Lidom.getInstance();

			btnSeleccionar = new JButton("Seleccionar");
			btnSeleccionar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					String[] options = {"Ok"};
					ImageIcon icon1 = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));

					if (cbxTeams.getSelectedIndex() > 0) {
						String nameTeam = cbxTeams.getSelectedItem().toString();
						auxTeam = Lidom.getInstance().searchTeamByName(nameTeam);
						auxTeam.getLineUp().removeAll(auxTeam.getLineUp());
						
						Home.manageTeamOpen(auxTeam);
						Home.loadRosterPlayerByTeam(auxTeam);
					Home.loadLineUpPlayerByTeam(auxTeam);
						
						cbxTeams.setSelectedIndex(0);
						dispose();

					}
					else {
						JOptionPane.showOptionDialog(null, "Seleccione un equipo!", "Error!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon1, options, options);
					}


				}
			});
			btnSeleccionar.setIcon(new ImageIcon(AddPlayer.class.getResource("/iconos_imagenes/icons8_baseball_24px.png")));
			btnSeleccionar.setIconTextGap(5);
			btnSeleccionar.setHorizontalTextPosition(SwingConstants.LEFT);
			btnSeleccionar.setForeground(new Color(255, 255, 240));
			btnSeleccionar.setFont(new Font("Consolas", Font.BOLD, 17));
			btnSeleccionar.setBorder(null);
			btnSeleccionar.setBackground(new Color(0, 30, 72));
			btnSeleccionar.setBounds(96, 205, 146, 30);
			panelBg.add(btnSeleccionar);

			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = new ImageIcon(getClass().getResource("/iconos_imagenes/icons8_cancel_2_48px_1.png"));
					String[] options = {"Si", "No"};	
					int xOption	= JOptionPane.showOptionDialog(null, "¿Seguro que desea cancelar?, la ventana se cerrará.", "Aviso!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options);

					if (xOption == 0) {
						//	clean();
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
			btnCancelar.setBounds(254, 205, 146, 30);
			panelBg.add(btnCancelar);

			label_1 = new JLabel("Equipo");
			label_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			label_1.setVerticalAlignment(SwingConstants.BOTTOM);
			label_1.setHorizontalAlignment(SwingConstants.LEFT);
			label_1.setForeground(Color.BLACK);
			label_1.setFont(new Font("Consolas", Font.PLAIN, 20));
			label_1.setBounds(58, 96, 66, 24);
			panelBg.add(label_1);

			cbxTeams = new JComboBox();
			cbxTeams.setFont(new Font("Consolas", Font.PLAIN, 18));
			cbxTeams.setBounds(136, 95, 302, 28);
			panelBg.add(cbxTeams);
		}


		loadTeamsCbx();
	}



	/** Metodos **/



	private void loadTeamsCbx() {

		cbxTeams.removeAllItems();

		for (Team t : Lidom.getInstance().getListTeams()) {
			cbxTeams.addItem(t.getName());

		}

		cbxTeams.insertItemAt(new String("<Seleccionar"), 0);
		cbxTeams.setSelectedIndex(0);
	}

}
