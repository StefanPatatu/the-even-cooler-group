package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SaleCreate extends JFrame {

	private JPanel contentPane;
	private JTextField textDate;
	private JTextField textField_zipCode;
	private JTextField textField_street;
	private JTextField textField_address;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleCreate frame = new SaleCreate();
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
	public SaleCreate() {
		setTitle("Create sale");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 315, 278);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerCpr = new JLabel("Customer CPR");
		lblCustomerCpr.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCustomerCpr.setBounds(10, 11, 91, 14);
		contentPane.add(lblCustomerCpr);
		
		JRadioButton rdbtnDelivery = new JRadioButton("Delivery");
		rdbtnDelivery.setBackground(SystemColor.activeCaption);
		rdbtnDelivery.setBounds(10, 32, 109, 17);
		contentPane.add(rdbtnDelivery);
		
		JRadioButton rdbtnPayedNow = new JRadioButton("Payed now");
		rdbtnPayedNow.setBackground(SystemColor.activeCaption);
		rdbtnPayedNow.setBounds(10, 150, 109, 23);
		contentPane.add(rdbtnPayedNow);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(16, 56, 46, 14);
		contentPane.add(lblDate);
		
		JLabel lblZipcode = new JLabel("ZipCode");
		lblZipcode.setBounds(16, 78, 46, 14);
		contentPane.add(lblZipcode);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setBounds(16, 101, 46, 14);
		contentPane.add(lblStreet);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(16, 125, 46, 14);
		contentPane.add(lblAddress);
		
		textDate = new JTextField();
		textDate.setBounds(66, 53, 86, 20);
		contentPane.add(textDate);
		textDate.setColumns(10);
		
		textField_zipCode = new JTextField();
		textField_zipCode.setColumns(10);
		textField_zipCode.setBounds(66, 75, 86, 20);
		contentPane.add(textField_zipCode);
		
		textField_street = new JTextField();
		textField_street.setColumns(10);
		textField_street.setBounds(66, 98, 86, 20);
		contentPane.add(textField_street);
		
		textField_address = new JTextField();
		textField_address.setColumns(10);
		textField_address.setBounds(66, 122, 86, 20);
		contentPane.add(textField_address);
		
		
		
		JButton btnAddProducts = new JButton("Add products");
		btnAddProducts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFrame line = new Line();
				line.setVisible(true);
			}
		});
		btnAddProducts.setBounds(12, 180, 140, 23);
		contentPane.add(btnAddProducts);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SaleCreate.this.setVisible(false);
			}
		});
		btnCancel.setBounds(12, 209, 140, 23);
		contentPane.add(btnCancel);
		
		JLabel lblFillOnlyIf = new JLabel("Fill only if delivery checked");
		lblFillOnlyIf.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblFillOnlyIf.setBounds(162, 56, 132, 14);
		contentPane.add(lblFillOnlyIf);
		
		JLabel label = new JLabel("Fill only if delivery checked");
		label.setFont(new Font("Tahoma", Font.ITALIC, 11));
		label.setBounds(162, 78, 132, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Fill only if delivery checked");
		label_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		label_1.setBounds(162, 101, 132, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Fill only if delivery checked");
		label_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		label_2.setBounds(162, 125, 132, 14);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(102, 9, 114, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.setBounds(218, 8, 76, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Finish sale");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SaleCreate.this.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(162, 180, 132, 23);
		contentPane.add(btnNewButton_1);
	}
}
