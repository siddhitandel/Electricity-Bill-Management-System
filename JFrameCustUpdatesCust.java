package minipro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameCustUpdatesCust extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameCustUpdatesCust frame = new JFrameCustUpdatesCust();
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
	public JFrameCustUpdatesCust() {
		setTitle("Customer ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CustomerUpdatesCustLabel = new JLabel("Enter the data to be updated:");
		CustomerUpdatesCustLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		CustomerUpdatesCustLabel.setBounds(10, 10, 366, 33);
		contentPane.add(CustomerUpdatesCustLabel);
		
		JLabel CustUpdatesCustID = new JLabel("ID:");
		CustUpdatesCustID.setFont(new Font("Tahoma", Font.BOLD, 16));
		CustUpdatesCustID.setBounds(10, 53, 47, 22);
		contentPane.add(CustUpdatesCustID);
		
		textField = new JTextField();
		textField.setBounds(49, 53, 129, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel CustUpdatesCustName = new JLabel("Name:");
		CustUpdatesCustName.setFont(new Font("Tahoma", Font.BOLD, 16));
		CustUpdatesCustName.setBounds(10, 85, 90, 27);
		contentPane.add(CustUpdatesCustName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(73, 85, 234, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel CustUpdatesCustAddress = new JLabel("Address:");
		CustUpdatesCustAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		CustUpdatesCustAddress.setBounds(10, 122, 90, 22);
		contentPane.add(CustUpdatesCustAddress);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 122, 308, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel CustUpdatesCustCity = new JLabel("City:");
		CustUpdatesCustCity.setFont(new Font("Tahoma", Font.BOLD, 16));
		CustUpdatesCustCity.setBounds(10, 154, 47, 33);
		contentPane.add(CustUpdatesCustCity);
		
		textField_3 = new JTextField();
		textField_3.setBounds(61, 162, 274, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String custname, custadd, custcity;
				int custid;
				try {
					custid=Integer.parseInt(textField.getText());
					custname=textField_1.getText();
					custadd=textField_2.getText();
					custcity=textField_3.getText();
					
					Customer st= new Customer(custid,custname,custadd,custcity);
					boolean answer= CustomerDao.updateCustomerToDB(custid,st);
					if(answer) {
						JOptionPane.showMessageDialog(null,"Customer is updated successfully");
					}
					else {
						JOptionPane.showMessageDialog(null,"Something went wrong. Try Again.");
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Input");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 220, 107, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				starting j2 = new starting();
				j2.show();
				
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(330, 220, 96, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(158, 220, 119, 33);
		contentPane.add(btnNewButton_2);
	}

}
