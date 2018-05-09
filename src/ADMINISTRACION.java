import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ADMINISTRACION {

	JFrame frame;

	
	/**
	 * Create the application.
	 */
	public ADMINISTRACION() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("PRODUCTOS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PRODUCTOS PRODUCTOS = new PRODUCTOS();
				PRODUCTOS.frame.setVisible(true);
				
			}
		});
		btnNewButton.setForeground(new Color(105, 105, 105));
		btnNewButton.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 27));
		btnNewButton.setBounds(25, 117, 366, 242);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CATEGORIA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CATEGORIA CATEGORIA = new CATEGORIA();
				CATEGORIA.frame.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(105, 105, 105));
		btnNewButton_1.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 27));
		btnNewButton_1.setBounds(435, 119, 410, 236);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<< VOLVER AL MEN\u00DA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU VOLVER = new MENU();
				MENU.frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_2.setBounds(634, 445, 186, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRACI\u00D3N");
		lblNewLabel.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(25, 21, 644, 51);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 884, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
