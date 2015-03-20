package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerCreate extends JFrame {

	private JPanel contentPane;
	private JTextField textField_cpr;
	private JTextField textField_name;
	private JTextField textField_phone;
	private JTextField textField_city;
	private JTextField textField_zipCode;
	private JTextField textField_street;
	private int test=2;


	
	public int getTest()
	{
	return test;
	}

	/**
	 * Create the frame.
	 */
	public CustomerCreate() {
	
		setTitle("New customer");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 231, 379);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsertCustomerData = new JLabel("Insert customer data:");
		lblInsertCustomerData.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInsertCustomerData.setBounds(10, 11, 188, 14);
		contentPane.add(lblInsertCustomerData);
		
		JLabel lblCpr = new JLabel("Cpr");
		lblCpr.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCpr.setBounds(20, 38, 46, 14);
		contentPane.add(lblCpr);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(20, 69, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPhone.setBounds(20, 100, 46, 14);
		contentPane.add(lblPhone);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCity.setBounds(20, 131, 46, 14);
		contentPane.add(lblCity);
		
		JLabel lblZipcode = new JLabel("ZipCode");
		lblZipcode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblZipcode.setBounds(20, 162, 46, 14);
		contentPane.add(lblZipcode);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStreet.setBounds(20, 193, 46, 14);
		contentPane.add(lblStreet);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(20, 224, 46, 14);
		contentPane.add(lblType);
		
		textField_cpr = new JTextField();
		textField_cpr.setBounds(87, 36, 86, 20);
		contentPane.add(textField_cpr);
		textField_cpr.setColumns(10);
		
		textField_name = new JTextField();
		textField_name.setBounds(87, 67, 86, 20);
		contentPane.add(textField_name);
		textField_name.setColumns(10);
		
		textField_phone = new JTextField();
		textField_phone.setBounds(87, 98, 86, 20);
		contentPane.add(textField_phone);
		textField_phone.setColumns(10);
		
		textField_city = new JTextField();
		textField_city.setBounds(87, 129, 86, 20);
		contentPane.add(textField_city);
		textField_city.setColumns(10);
		
		textField_zipCode = new JTextField();
		textField_zipCode.setBounds(87, 160, 86, 20);
		contentPane.add(textField_zipCode);
		textField_zipCode.setColumns(10);
		
		textField_street = new JTextField();
		textField_street.setBounds(87, 191, 86, 20);
		contentPane.add(textField_street);
		textField_street.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(10, 306, 73, 23);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CustomerCreate.this.setVisible(false);
				
			}
		});
		btnCancel.setBounds(93, 306, 73, 23);
		contentPane.add(btnCancel);
		
		Choice choice = new Choice();
		choice.setBounds(87, 218, 86, 20);
		choice.addItem("club");
		choice.addItem("private");
		contentPane.add(choice);
	}
}
