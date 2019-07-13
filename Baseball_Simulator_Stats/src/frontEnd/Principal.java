package frontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Baseball");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnplay = new JButton("Play");
		btnplay.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnplay.setBounds(414, 58, 134, 40);
		contentPane.add(btnplay);
		
		JButton btnTeamplayers = new JButton("Team/Players");
		btnTeamplayers.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnTeamplayers.setBounds(414, 119, 134, 40);
		contentPane.add(btnTeamplayers);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSchedule.setBounds(414, 181, 134, 40);
		contentPane.add(btnSchedule);
		
		JButton btnLeaderBoard = new JButton("Leader Board");
		btnLeaderBoard.setBounds(414, 243, 134, 40);
		contentPane.add(btnLeaderBoard);
	}
}
