import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MENU {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public MENU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1. ADMINISTRACI\u00D3N");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ADMINISTRACION ADMINISTRACION = new ADMINISTRACION();
				ADMINISTRACION.frame.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(105, 105, 105));
		btnNewButton.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(10, 11, 407, 487);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. PEDIDOS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PEDIDO PEDIDO = new PEDIDO();
				PEDIDO.frame.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(105, 105, 105));
		btnNewButton_1.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_1.setBounds(440, 11, 422, 487);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 888, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
