import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PEDIDO {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public PEDIDO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 894, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PEDIDOS CLIENTES BAR LOS MANOLOS");
		lblNewLabel.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setBounds(38, 23, 574, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("A\u00D1ADIR COMANDA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AÑADIRCOMANDA AÑADIRCOMANDA = new AÑADIRCOMANDA();
				AÑADIRCOMANDA.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setForeground(new Color(112, 128, 144));
		btnNewButton.setBounds(38, 298, 261, 91);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("INICIAR NUEVO PEDIDO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				INICIARNUEVOPEDIDO INICIARPEDIDO = new INICIARNUEVOPEDIDO();
				INICIARNUEVOPEDIDO.frame.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(119, 136, 153));
		btnNewButton_1.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(38, 169, 261, 91);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("OPCI\u00D3N A ELEGIR");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(38, 101, 319, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Se pedir\u00E1 el n\u00FAmero de mesa");
		lblNewLabel_2.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setBounds(347, 197, 319, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mostrar\u00E1 un listado de los pedidos existentes");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(347, 325, 413, 37);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("<< SALIR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU MENU = new MENU();
				MENU.frame.setVisible(true);
				
			}
		});
		btnNewButton_2.setForeground(new Color(30, 144, 255));
		btnNewButton_2.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_2.setBounds(702, 454, 166, 48);
		frame.getContentPane().add(btnNewButton_2);
	}
}
