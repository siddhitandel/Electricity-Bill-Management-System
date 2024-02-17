package minipro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class JFrameAdminDisplay extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameAdminDisplay frame = new JFrameAdminDisplay();
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
	public JFrameAdminDisplay() {
		setTitle("Display Admins");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean f= AdminnDao.showAllAdminn();
				if(f) {
					textField.setText(Start.st1);
					JOptionPane.showMessageDialog(null, Start.st1);
					Start.st1="";
					
					JOptionPane.showMessageDialog(null, "Displayed Successfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "Something went wrong. Try Again.");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 10, 112, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameAdmin j2 = new JFrameAdmin();
				j2.show();
				
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(323, 10, 103, 34);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(10, 54, 416, 199);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
