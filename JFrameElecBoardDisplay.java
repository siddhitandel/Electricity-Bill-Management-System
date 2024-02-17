package minipro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameElecBoardDisplay extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameElecBoardDisplay frame = new JFrameElecBoardDisplay();
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
	public JFrameElecBoardDisplay() {
		setTitle("Display Electricity Board");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean f= ElecBoardDao.showAllElecBoard();
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
		btnNewButton.setBounds(10, 10, 111, 28);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameElecBoard j1 = new JFrameElecBoard();
				j1.show();
				
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(325, 10, 111, 28);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(10, 56, 416, 197);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
