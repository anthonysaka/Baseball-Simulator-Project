/**
 * 
 */
package frontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;

/**
 * @author Victor Rosario
 *
 */
public class Estadisticas_Juego extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7482776779253616131L;
	
	private JPanel contentPane;
	private JTable tblPuntuaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estadisticas_Juego frame = new Estadisticas_Juego();
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
	public Estadisticas_Juego() {
		setTitle("Informaci\u00F3n del Juego en Vivo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(null);
		
		JPanel EstadisticasEquipos = new JPanel();
		EstadisticasEquipos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		EstadisticasEquipos.setBounds(6, 6, 225, 463);
		panelPrincipal.add(EstadisticasEquipos);
		EstadisticasEquipos.setLayout(null);
		
		JList<Object> lstEquipos = new JList<Object>();
		lstEquipos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lstEquipos.setBackground(Color.GRAY);
		lstEquipos.setBounds(6, 6, 213, 451);
		EstadisticasEquipos.add(lstEquipos);
		
		JPanel InformaciónJugadores = new JPanel();
		InformaciónJugadores.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		InformaciónJugadores.setBounds(541, 6, 225, 463);
		panelPrincipal.add(InformaciónJugadores);
		InformaciónJugadores.setLayout(null);
		
		JList<Object> lstJugadores = new JList<Object>();
		lstJugadores.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lstJugadores.setBackground(Color.GRAY);
		lstJugadores.setBounds(6, 6, 213, 451);
		InformaciónJugadores.add(lstJugadores);
		
		JPanel TablaPuntuaciones = new JPanel();
		TablaPuntuaciones.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		TablaPuntuaciones.setBounds(243, 6, 286, 463);
		panelPrincipal.add(TablaPuntuaciones);
		TablaPuntuaciones.setLayout(null);
		
		tblPuntuaciones = new JTable();
		tblPuntuaciones.setBackground(Color.DARK_GRAY);
		tblPuntuaciones.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblPuntuaciones.setBounds(6, 6, 274, 250);
		TablaPuntuaciones.add(tblPuntuaciones);
		
		JButton btnModificarTabla = new JButton("Modificar Tabla");
		btnModificarTabla.setBounds(6, 289, 274, 61);
		TablaPuntuaciones.add(btnModificarTabla);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setBounds(6, 362, 274, 61);
		TablaPuntuaciones.add(btnNewButton);
	}
}
