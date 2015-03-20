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

public class ProductShow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductShow frame = new ProductShow();
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
	public ProductShow() {
		setTitle("Product show");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 340);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(10, 11, 46, 14);
		contentPane.add(lblName);
		
		JLabel label_name = new JLabel("New label");
		label_name.setBounds(66, 12, 46, 14);
		contentPane.add(label_name);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(10, 42, 46, 14);
		contentPane.add(lblType);
		
		JLabel label_type = new JLabel("New label");
		label_type.setBounds(66, 43, 46, 14);
		contentPane.add(label_type);
		
		JLabel lblBarcode = new JLabel("Barcode");
		lblBarcode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBarcode.setBounds(10, 73, 46, 14);
		contentPane.add(lblBarcode);
		
		JLabel label_barcode = new JLabel("New label");
		label_barcode.setBounds(66, 74, 46, 14);
		contentPane.add(label_barcode);
		
		JLabel lblPurchasePrice = new JLabel("Purchase price");
		lblPurchasePrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPurchasePrice.setBounds(10, 104, 46, 14);
		contentPane.add(lblPurchasePrice);
		
		JLabel label_purchasePrice = new JLabel("New label");
		label_purchasePrice.setBounds(66, 104, 46, 14);
		contentPane.add(label_purchasePrice);
		
		JLabel lblSalesPrice = new JLabel("Sales price");
		lblSalesPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSalesPrice.setBounds(10, 135, 46, 14);
		contentPane.add(lblSalesPrice);
		
		JLabel label_salesPrice = new JLabel("New label");
		label_salesPrice.setBounds(66, 136, 46, 14);
		contentPane.add(label_salesPrice);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCountry.setBounds(10, 166, 46, 14);
		contentPane.add(lblCountry);
		
		JLabel label_country = new JLabel("New label");
		label_country.setBounds(66, 167, 46, 14);
		contentPane.add(label_country);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStock.setBounds(10, 197, 46, 14);
		contentPane.add(lblStock);
		
		JLabel label_stock = new JLabel("New label");
		label_stock.setBounds(66, 198, 46, 14);
		contentPane.add(label_stock);
		
		JButton button = new JButton("Ok");
		button.setBounds(131, 267, 73, 23);
		contentPane.add(button);
		
		JLabel label_minStock = new JLabel("New label");
		label_minStock.setBounds(66, 223, 46, 14);
		contentPane.add(label_minStock);
		
		JLabel lblMinStock = new JLabel("Min stock");
		lblMinStock.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMinStock.setBounds(10, 222, 46, 14);
		contentPane.add(lblMinStock);
	}

}
