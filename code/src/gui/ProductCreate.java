package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProductCreate extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textField_barcode;
	private JTextField textField_purPr;
	private JTextField textField_salPr;
	private JTextField textField_country;
	private JTextField textField_currSt;
	private JTextField textField_minSt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductCreate frame = new ProductCreate();
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
	public ProductCreate() {
		setTitle("New Product");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 226, 308);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsertProductsData = new JLabel("Insert product's data");
		lblInsertProductsData.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInsertProductsData.setBounds(10, 11, 208, 14);
		contentPane.add(lblInsertProductsData);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(10, 35, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(10, 63, 46, 14);
		contentPane.add(lblType);
		
		JLabel lblBarcode = new JLabel("Barcode");
		lblBarcode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBarcode.setBounds(10, 88, 46, 14);
		contentPane.add(lblBarcode);
		
		JLabel lblPurchasePrice = new JLabel("Purchase price");
		lblPurchasePrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPurchasePrice.setBounds(10, 113, 114, 14);
		contentPane.add(lblPurchasePrice);
		
		JLabel lblSalesPrice = new JLabel("Sales Price");
		lblSalesPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSalesPrice.setBounds(10, 138, 87, 14);
		contentPane.add(lblSalesPrice);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCountry.setBounds(10, 163, 99, 14);
		contentPane.add(lblCountry);
		
		JLabel lblCurrentStock = new JLabel("Current Stock");
		lblCurrentStock.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCurrentStock.setBounds(10, 188, 99, 14);
		contentPane.add(lblCurrentStock);
		
		JLabel lblMinStock = new JLabel("Min stock");
		lblMinStock.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMinStock.setBounds(10, 213, 99, 14);
		contentPane.add(lblMinStock);
		
		textName = new JTextField();
		textName.setBounds(116, 33, 86, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textField_barcode = new JTextField();
		textField_barcode.setBounds(116, 86, 86, 20);
		contentPane.add(textField_barcode);
		textField_barcode.setColumns(10);
		
		textField_purPr = new JTextField();
		textField_purPr.setBounds(116, 111, 86, 20);
		contentPane.add(textField_purPr);
		textField_purPr.setColumns(10);
		
		textField_salPr = new JTextField();
		textField_salPr.setBounds(116, 136, 86, 20);
		contentPane.add(textField_salPr);
		textField_salPr.setColumns(10);
		
		textField_country = new JTextField();
		textField_country.setBounds(116, 161, 86, 20);
		contentPane.add(textField_country);
		textField_country.setColumns(10);
		
		textField_currSt = new JTextField();
		textField_currSt.setBounds(116, 186, 86, 20);
		contentPane.add(textField_currSt);
		textField_currSt.setColumns(10);
		
		textField_minSt = new JTextField();
		textField_minSt.setBounds(116, 211, 86, 20);
		contentPane.add(textField_minSt);
		textField_minSt.setColumns(10);
		
		Choice choice = new Choice();
		choice.setBounds(116, 57, 86, 20);
		contentPane.add(choice);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(10, 238, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProductCreate.this.setVisible(false);
			}
		});
		btnCancel.setBounds(116, 238, 86, 23);
		contentPane.add(btnCancel);
		choice.addItem("clothing");
		choice.addItem("equipment");
		choice.addItem("gunReplica");
	}

}
