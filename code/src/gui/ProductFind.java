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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProductFind extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductFind frame = new ProductFind();
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
	public ProductFind() {
		setTitle("Product find");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 223, 141);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsertProductsBarcode = new JLabel("Insert product's barcode");
		lblInsertProductsBarcode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInsertProductsBarcode.setBounds(10, 11, 214, 14);
		contentPane.add(lblInsertProductsBarcode);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 36, 186, 20);
		contentPane.add(textField);
		
		JButton button = new JButton("Ok");
		button.setBounds(10, 67, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProductFind.this.setVisible(false);
			}
		});
		button_1.setBounds(107, 67, 89, 23);
		contentPane.add(button_1);
	}

}
