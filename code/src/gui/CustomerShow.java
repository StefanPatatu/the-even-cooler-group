package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class CustomerShow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerShow frame = new CustomerShow();
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
	public CustomerShow() {
		setTitle("Customer show");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 289);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Cpr");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(20, 11, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(20, 42, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Phone");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(20, 73, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("City");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(20, 104, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("ZipCode");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(20, 135, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Street");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(20, 166, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Type");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(20, 197, 46, 14);
		contentPane.add(label_6);
		
		JButton button = new JButton("Ok");
		button.setBounds(112, 223, 73, 23);
		contentPane.add(button);
		
		JLabel label_cpr = new JLabel("New label");
		label_cpr.setBounds(76, 12, 191, 14);
		contentPane.add(label_cpr);
		
		JLabel label_name = new JLabel("New label");
		label_name.setBounds(76, 43, 191, 14);
		contentPane.add(label_name);
		
		JLabel label_phone = new JLabel("New label");
		label_phone.setBounds(76, 74, 191, 14);
		contentPane.add(label_phone);
		
		JLabel label_city = new JLabel("New label");
		label_city.setBounds(76, 104, 191, 14);
		contentPane.add(label_city);
		
		JLabel label_zipCode = new JLabel("New label");
		label_zipCode.setBounds(76, 136, 191, 14);
		contentPane.add(label_zipCode);
		
		JLabel label_street = new JLabel("New label");
		label_street.setBounds(76, 167, 191, 14);
		contentPane.add(label_street);
		
		JLabel label_type = new JLabel("New label");
		label_type.setBounds(76, 198, 191, 14);
		contentPane.add(label_type);
	}

}
