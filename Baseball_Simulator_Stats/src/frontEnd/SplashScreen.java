package frontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.awt.AWTUtilities;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class SplashScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2256781198012375640L;
	private JPanel contentPane;
	private JLabel lblLogo;
	private JProgressBar progressBar;
	private static Timer timer;
	private static int counter;
	private JLabel lblLoading;
	private JLabel lblNewLabel;
	
 /* Esta clase SplashScreen en la que debe ejecutarse primero,
  *  ya que es la unica que tiene main para inicializar 
  * la aplicacion, esta va a llamar a la ventana principal (HOME)
  */
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen frame = new SplashScreen();
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
	public SplashScreen() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		AWTUtilities.setWindowOpaque(this, false);
		contentPane.setLayout(null);

		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(SplashScreen.class.getResource("/iconos_imagenes/lindonLogo.png")));
		lblLogo.setBounds(50, 13, 355, 406);
		contentPane.add(lblLogo);
		/** to adjust image at size of JLabel **/
		ImageIcon logoLidom = new ImageIcon(Home.class.getResource("/iconos_imagenes/preview-lidom (2).png"));
		Icon lgLidom = new ImageIcon(logoLidom.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH));
		lblLogo.setIcon(lgLidom);



		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(25, 32, 58));
		progressBar.setBackground(new Color(196, 195, 197));
		progressBar.setBounds(0, 454, 455, 24);
		contentPane.add(progressBar);

		lblLoading = new JLabel("");
		lblLoading.setBackground(new Color(255, 255, 255));
		lblLoading.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLoading.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLoading.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoading.setForeground(Color.WHITE);
		lblLoading.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblLoading.setBounds(102, 417, 250, 31);
		contentPane.add(lblLoading);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0,0,0,70));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(102, 417, 250, 31);
		contentPane.add(lblNewLabel);

         /* Para mostrar el porcentaje y los letreros de loading */
		ActionListener action1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;

				progressBar.setValue(counter);

				lblLoading.setText("Inicializando  "  + counter + "%");
				if(counter > 20) {
					lblLoading.setText("Cargando imágenes  "  + counter + "%");
				}
				if(counter > 40){
					lblLoading.setText("Cargando archivos  "   + counter + "%");
				}
				if(counter > 80){
					lblLoading.setText("Finalizando  "  + counter + "%");
				}
				if(counter > 90) {
					lblLoading.setText("Abriendo la aplicación  "  + counter + "%");

				}
				if (counter > 100) {
					timer.stop();
					dispose();
					Home myAppHome = new Home();
					myAppHome.setVisible(true);
				}
			}
		};

		timer = new Timer(70, action1);
		timer.start();
/****************************************/
		
		

	}

}
