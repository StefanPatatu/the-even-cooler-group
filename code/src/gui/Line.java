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
import java.awt.List;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Line extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Line frame = new Line();
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
	public Line() {
		setTitle("Line");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 493, 374);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBarcode = new JLabel("Barcode");
		lblBarcode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBarcode.setBounds(10, 11, 109, 14);
		contentPane.add(lblBarcode);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAmount.setBounds(10, 36, 109, 14);
		contentPane.add(lblAmount);
		
		textField = new JTextField();
		textField.setBounds(67, 10, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(67, 35, 152, 20);
		contentPane.add(textField_1);
		
		JButton btnAddAndAdd = new JButton("Add product");
		btnAddAndAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			//	Line.main(null);
			textField.setText("");
			textField_1.setText("");
			}
		});
		btnAddAndAdd.setBounds(10, 115, 209, 23);
		contentPane.add(btnAddAndAdd);
		
		JButton btnAddAndFinish = new JButton("Add and finish");
		btnAddAndFinish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Line.this.setVisible(false);
			}
		});
		btnAddAndFinish.setBounds(10, 149, 209, 23);
		contentPane.add(btnAddAndFinish);
		
		JLabel lblAmountByNow = new JLabel("Amount by now");
		lblAmountByNow.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAmountByNow.setBounds(10, 77, 97, 14);
		contentPane.add(lblAmountByNow);
		
		JLabel lblAmount_1 = new JLabel("Amount");
		lblAmount_1.setBounds(119, 78, 46, 14);
		contentPane.add(lblAmount_1);
		
		List list = new List();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		list.setBounds(225, 11, 242, 314);
		contentPane.add(list);
	}
}
