import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class MODIFICARPROD {

	private JFrame frame;
	private JTextField ID_PRODUCTO;
	private JTextField STOCK;
	private JTextField ID_CATEGORIA;
	private JTextField PRECIO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MODIFICARPROD window = new MODIFICARPROD();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MODIFICARPROD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 603, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ID_PRODUCTO = new JTextField();
		ID_PRODUCTO.setBounds(159, 33, 86, 20);
		frame.getContentPane().add(ID_PRODUCTO);
		ID_PRODUCTO.setColumns(10);
		
		STOCK = new JTextField();
		STOCK.setBounds(159, 87, 86, 20);
		frame.getContentPane().add(STOCK);
		STOCK.setColumns(10);
		
		ID_CATEGORIA = new JTextField();
		ID_CATEGORIA.setBounds(159, 145, 86, 20);
		frame.getContentPane().add(ID_CATEGORIA);
		ID_CATEGORIA.setColumns(10);
		
		PRECIO = new JTextField();
		PRECIO.setBounds(159, 210, 86, 20);
		frame.getContentPane().add(PRECIO);
		PRECIO.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NOM_PRODUCTO");
		lblNewLabel.setBounds(37, 36, 112, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STOCK");
		lblNewLabel_1.setBounds(37, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID_CATEGORIA");
		lblNewLabel_2.setBounds(37, 148, 112, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PRECIO");
		lblNewLabel_3.setBounds(37, 213, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("GUARDAR");
		btnNewButton.setBounds(37, 291, 132, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ATR\u00C1S");
		btnNewButton_1.setBounds(216, 286, 123, 56);
		frame.getContentPane().add(btnNewButton_1);
	}
}
