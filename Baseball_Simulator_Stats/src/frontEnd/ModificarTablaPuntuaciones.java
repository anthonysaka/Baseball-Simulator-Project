/**
 * 
 */
package frontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * @author Victor Rosario
 *
 */
public class ModificarTablaPuntuaciones extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8490650641824691403L;
	
	private JPanel contentPane;
	private JTable tblDatosInnings;
	private JTable tblDatosCarreras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarTablaPuntuaciones frame = new ModificarTablaPuntuaciones();
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
	public ModificarTablaPuntuaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(null);
		
		tblDatosInnings = new JTable();
		tblDatosInnings.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblDatosInnings.setBounds(6, 6, 379, 224);
		panelPrincipal.add(tblDatosInnings);
		
		tblDatosCarreras = new JTable();
		tblDatosCarreras.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblDatosCarreras.setBounds(6, 266, 379, 224);
		panelPrincipal.add(tblDatosCarreras);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(397, 439, 341, 51);
		panelPrincipal.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(397, 376, 341, 51);
		panelPrincipal.add(btnSalvar);
	}
}
