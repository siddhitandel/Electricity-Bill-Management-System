package minipro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class starting extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					starting frame = new starting();
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
	public starting() {
		setTitle("Start");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logInLabel = new JLabel("Who do you want to log in as?");
		logInLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		logInLabel.setBounds(66, 24, 280, 45);
		contentPane.add(logInLabel);
		
		JButton AdminButton = new JButton("Admin");
		AdminButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JFrameAdminLogin j2 = new JFrameAdminLogin();
				j2.show();
				
				dispose();
			}
		});
		AdminButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		AdminButton.setBounds(46, 139, 125, 45);
		contentPane.add(AdminButton);
		
		JButton btnNewButton = new JButton("Customer");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JFrameCustUpdatesCust j1 = new JFrameCustUpdatesCust();
				j1.show();
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(232, 139, 114, 45);
		contentPane.add(btnNewButton);
	}

}

