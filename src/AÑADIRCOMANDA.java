import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AÑADIRCOMANDA {

	JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AÑADIRCOMANDA window = new AÑADIRCOMANDA();
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
	public AÑADIRCOMANDA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 633, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAadirComanda = new JLabel("A\u00D1ADIR COMANDA");
		lblAadirComanda.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 25));
		lblAadirComanda.setBounds(23, 22, 221, 42);
		frame.getContentPane().add(lblAadirComanda);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(204, 83, 403, 204);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"CANTIDA_PEDIDO", "PEDIDO_CLIENTE", "ID_CLIENTE", "ID_PEDIDO"
			}
		));
		scrollPane.setViewportView(table);
		
		JComboBox comboBoxSeleccCliente = new JComboBox();
		comboBoxSeleccCliente.setModel(new DefaultComboBoxModel(new String[] {"SELECCIONA CLIENTE", "1", "2", "3", "4", "5"}));
		comboBoxSeleccCliente.setBounds(10, 87, 152, 20);
		frame.getContentPane().add(comboBoxSeleccCliente);
		
		JComboBox comboBoxNuevoProducto = new JComboBox();
		comboBoxNuevoProducto.setModel(new DefaultComboBoxModel(new String[] {"SELECCIONA NUEVO PRODUCTO", "cachopo", "entrecot", "dorada", "lubina", "yogur", "helado", "coca-cola", "fanta-naranja", "nestea"}));
		comboBoxNuevoProducto.setBounds(10, 128, 184, 20);
		frame.getContentPane().add(comboBoxNuevoProducto);
		
		JButton btnAadir = new JButton("A\u00D1ADIR");
		btnAadir.setBounds(10, 172, 89, 23);
		frame.getContentPane().add(btnAadir);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(10, 217, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		JButton btnModificarComanda = new JButton("MODIFICAR COMANDA");
		btnModificarComanda.setBounds(10, 264, 146, 23);
		frame.getContentPane().add(btnModificarComanda);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PEDIDO PEDIDO = new PEDIDO();
				PEDIDO.frame.setVisible(true);
			}
		});
		btnAtras.setBounds(316, 387, 89, 23);
		frame.getContentPane().add(btnAtras);
		
		JButton button = new JButton("<<SALIR AL MENU");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU MENU = new MENU();
				MENU.frame.setVisible(true);
			}
		});
		button.setBounds(433, 387, 140, 23);
		frame.getContentPane().add(button);
	}
}
