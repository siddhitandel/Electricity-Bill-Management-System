package minipro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class JFrameCust extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameCust frame = new JFrameCust();
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
	public JFrameCust() {
		setTitle("Admin-Customer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CustLabel = new JLabel("What do you want to do?");
		CustLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		CustLabel.setBounds(10, 10, 416, 31);
		contentPane.add(CustLabel);
		
		JRadioButton addCustRadio = new JRadioButton("Add");
		addCustRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add
				JFrameCustAdd j1 = new JFrameCustAdd();
				j1.show();
				
				dispose();
			}
		});
		addCustRadio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addCustRadio.setBounds(10, 47, 193, 21);
		contentPane.add(addCustRadio);
		
		JRadioButton deleteCustRadio = new JRadioButton("Delete");
		deleteCustRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete
				JFrameCustDelete j1 = new JFrameCustDelete();
				j1.show();
				
				dispose();
			}
		});
		deleteCustRadio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deleteCustRadio.setBounds(10, 72, 103, 21);
		contentPane.add(deleteCustRadio);
		
		JRadioButton updateCustRadio = new JRadioButton("Update");
		updateCustRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//update
				JFrameCustUpdate j1 = new JFrameCustUpdate();
				j1.show();
				
				dispose();
			}
		});
		updateCustRadio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		updateCustRadio.setBounds(10, 96, 103, 21);
		contentPane.add(updateCustRadio);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show records");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display records
				JFrameCustDisplay j1 = new JFrameCustDisplay();
				j1.show();
				
				dispose();
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(10, 119, 149, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameAdminOption j2 = new JFrameAdminOption();
				j2.show();
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 215, 103, 38);
		contentPane.add(btnNewButton);
	}
}
