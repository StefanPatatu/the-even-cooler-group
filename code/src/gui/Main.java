package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Main extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Western Style");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSale = new JLabel("Sale");
		lblSale.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSale.setBounds(87, 176, 89, 14);
		contentPane.add(lblSale);
		
		JButton btnCreateSale = new JButton("Create sale");
		btnCreateSale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SaleCreate.main(null);
			}
		});
		btnCreateSale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCreateSale.setBounds(87, 194, 143, 56);
		contentPane.add(btnCreateSale);
		
		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCustomer.setBounds(10, 11, 89, 14);
		contentPane.add(lblCustomer);
		
		JButton btnNewCustomer = new JButton("New customer");
		btnNewCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			JFrame customerCreate= new CustomerCreate();
			customerCreate.setVisible(true);;
			}
		});
		btnNewCustomer.setBackground(SystemColor.inactiveCaption);
		btnNewCustomer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewCustomer.setBounds(10, 29, 143, 56);
		contentPane.add(btnNewCustomer);
		
		JButton btnFindCustomer = new JButton("Find customer");
		btnFindCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CustomerFind.main(null);
			}
		});
		btnFindCustomer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFindCustomer.setBounds(10, 96, 143, 56);
		contentPane.add(btnFindCustomer);
		
		
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProduct.setBounds(182, 11, 89, 14);
		contentPane.add(lblProduct);
		
		JButton btnNewProduct = new JButton("New product");
		btnNewProduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProductCreate.main(null);
			}
		});
		btnNewProduct.setBackground(SystemColor.inactiveCaption);
		btnNewProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewProduct.setBounds(182, 29, 143, 56);
		contentPane.add(btnNewProduct);
		
		JButton btnFindProduct = new JButton("Find product");
		btnFindProduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProductFind.main(null);
			}
		});
		btnFindProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFindProduct.setBounds(182, 94, 143, 56);
		contentPane.add(btnFindProduct);
	}
	CustomerCreate cc = new CustomerCreate();
}
