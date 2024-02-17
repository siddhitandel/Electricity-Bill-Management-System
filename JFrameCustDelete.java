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

public class JFrameCustDelete extends JFrame {

	private JPanel contentPane;
	private JTextField DeleteCustTextFieldID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameCustDelete frame = new JFrameCustDelete();
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
	public JFrameCustDelete() {
		setTitle("Delete Customer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DeleteCustTextFieldID = new JTextField();
		DeleteCustTextFieldID.setBounds(101, 18, 103, 21);
		contentPane.add(DeleteCustTextFieldID);
		DeleteCustTextFieldID.setColumns(10);
		
		JLabel DeleteCustLabelID = new JLabel("Enter ID:");
		DeleteCustLabelID.setFont(new Font("Tahoma", Font.BOLD, 16));
		DeleteCustLabelID.setBounds(10, 12, 93, 28);
		contentPane.add(DeleteCustLabelID);
		
		JButton DeleteCustButtonDelete = new JButton("Delete");
		DeleteCustButtonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num;
				try {
					num=Integer.parseInt(DeleteCustTextFieldID.getText());
					boolean f=CustomerDao.deleteCustomer(num);
					if(f) {
						JOptionPane.showMessageDialog(null,"Deleted Successfully");
					}
					else {
						JOptionPane.showMessageDialog(null,"Something went wrong. Try Again.");
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid ID");
				}
			}
		});
		DeleteCustButtonDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		DeleteCustButtonDelete.setBounds(10, 225, 108, 28);
		contentPane.add(DeleteCustButtonDelete);
		
		JButton DeleteCustButtonBack = new JButton("Back");
		DeleteCustButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrameCust j2 = new JFrameCust();
				j2.show();
				
				dispose();
			}
		});
		DeleteCustButtonBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		DeleteCustButtonBack.setBounds(318, 225, 108, 28);
		contentPane.add(DeleteCustButtonBack);
		
		JButton DeleteCustButtonReset = new JButton("Reset");
		DeleteCustButtonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteCustTextFieldID.setText("");
			}
		});
		DeleteCustButtonReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		DeleteCustButtonReset.setBounds(162, 225, 115, 28);
		contentPane.add(DeleteCustButtonReset);
	}

}
