package minipro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameCustAdd extends JFrame {

	private JPanel contentPane;
	private JTextField AddCustTextFieldName;
	private JTextField AddCustTextFieldAddress;
	private JTextField AddCustTextFieldCity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameCustAdd frame = new JFrameCustAdd();
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
	public JFrameCustAdd() {
		setTitle("Add Customer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		AddCustTextFieldName = new JTextField();
		AddCustTextFieldName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AddCustTextFieldName.setBounds(97, 13, 220, 26);
		contentPane.add(AddCustTextFieldName);
		AddCustTextFieldName.setColumns(10);
		
		JLabel AddCustLabelName = new JLabel("Name:");
		AddCustLabelName.setFont(new Font("Tahoma", Font.BOLD, 14));
		AddCustLabelName.setBounds(10, 13, 113, 26);
		contentPane.add(AddCustLabelName);
		
		JLabel AddCustLabelAddress = new JLabel("Address:");
		AddCustLabelAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		AddCustLabelAddress.setBounds(10, 52, 72, 20);
		contentPane.add(AddCustLabelAddress);
		
		AddCustTextFieldAddress = new JTextField();
		AddCustTextFieldAddress.setBounds(97, 49, 220, 26);
		contentPane.add(AddCustTextFieldAddress);
		AddCustTextFieldAddress.setColumns(10);
		
		JLabel AddCustLabelCity = new JLabel("City:");
		AddCustLabelCity.setFont(new Font("Tahoma", Font.BOLD, 14));
		AddCustLabelCity.setBounds(10, 82, 72, 26);
		contentPane.add(AddCustLabelCity);
		
		AddCustTextFieldCity = new JTextField();
		AddCustTextFieldCity.setBounds(97, 85, 220, 23);
		contentPane.add(AddCustTextFieldCity);
		AddCustTextFieldCity.setColumns(10);
		
		JButton AddCustButtonAdd = new JButton("Add");
		AddCustButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String custname, custadd, custcity;
				try {
					custname=AddCustTextFieldName.getText();
					custadd=AddCustTextFieldAddress.getText();
					custcity=AddCustTextFieldCity.getText();
					Customer st= new Customer(custname,custadd,custcity);
					boolean answer= CustomerDao.insertCustomerToDB(st);
					if(answer) {
						JOptionPane.showMessageDialog(null, "Customer is added successfully");
					}
					else {
						JOptionPane.showMessageDialog(null, "Something went wrong. Try Again.");
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Input");
				}
			}
		});
		AddCustButtonAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		AddCustButtonAdd.setBounds(10, 135, 92, 26);
		contentPane.add(AddCustButtonAdd);
		
		JButton AddCustButtonBack = new JButton("Back");
		AddCustButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameCust j2 = new JFrameCust();
				j2.show();
				
				dispose();
			}
		});
		AddCustButtonBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		AddCustButtonBack.setBounds(285, 135, 113, 26);
		contentPane.add(AddCustButtonBack);
		
		JButton AddCustButtonReset = new JButton("Reset");
		AddCustButtonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCustTextFieldName.setText("");
				AddCustTextFieldAddress.setText("");
				AddCustTextFieldCity.setText("");
			}
		});
		AddCustButtonReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		AddCustButtonReset.setBounds(146, 137, 97, 26);
		contentPane.add(AddCustButtonReset);
	}

}
