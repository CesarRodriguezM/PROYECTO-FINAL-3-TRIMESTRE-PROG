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
import javax.swing.JTextField;

public class AÑADIRCOMANDA {

	JFrame frame;
	private JTable table;
	private JTextField txtSeleccionaCantidad;
	private JTextField txtSeleccionaProducto;
	private JTextField txtSeleccionaCliente;
	private JTextField txtSeleccionaIdPedido;
	private ConexionBBDD conexion;
	static String CANTIDAD_PEDIDO;
	static String PEDIDO_CLIENTE;
	static String ID_CLIENTE;
	static String ID_PEDIDO;

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
		conexion = new ConexionBBDD();
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
		//BOTON AÑADIR COMANDA
		JButton btnAadir = new JButton("A\u00D1ADIR");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CANTIDAD_PEDIDO = txtSeleccionaCantidad.getText();
				PEDIDO_CLIENTE = txtSeleccionaProducto.getText();
				ID_CLIENTE = txtSeleccionaCliente.getText();
				ID_PEDIDO = txtSeleccionaIdPedido.getText();
				conexion.ConsultaAñadirPedirComanda();//Enlace a la BBDD
				table.setModel(conexion.ConsultaTablaListarComanda());//Actualizar cuando añadimos
				
			}
		});
		btnAadir.setBounds(50, 328, 89, 23);
		frame.getContentPane().add(btnAadir);
		//BOTON ELIMINAR PEDIDO
		JButton btnBorrar = new JButton("ELIMINAR PEDIDO");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CANTIDAD_PEDIDO = txtSeleccionaCantidad.getText();
				PEDIDO_CLIENTE = txtSeleccionaProducto.getText();
				ID_CLIENTE = txtSeleccionaCliente.getText();
				ID_PEDIDO = txtSeleccionaIdPedido.getText();
				conexion.ConsultaBORRARComanda();//Enlace a la BBDD
				table.setModel(conexion.ConsultaTablaListarComanda());//Borrar comandas
				
			}
		});
		btnBorrar.setBounds(178, 328, 125, 23);
		frame.getContentPane().add(btnBorrar);
		
		JButton btnModificarComanda = new JButton("MODIFICAR COMANDA");
		btnModificarComanda.setBounds(326, 328, 146, 23);
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
		
		txtSeleccionaCantidad = new JTextField();
		txtSeleccionaCantidad.setText("Selecciona Cantidad");
		txtSeleccionaCantidad.setBounds(37, 87, 113, 20);
		frame.getContentPane().add(txtSeleccionaCantidad);
		txtSeleccionaCantidad.setColumns(10);
		
		txtSeleccionaProducto = new JTextField();
		txtSeleccionaProducto.setText("Selecciona producto");
		txtSeleccionaProducto.setBounds(37, 136, 113, 20);
		frame.getContentPane().add(txtSeleccionaProducto);
		txtSeleccionaProducto.setColumns(10);
		
		txtSeleccionaCliente = new JTextField();
		txtSeleccionaCliente.setText("Selecciona Cliente");
		txtSeleccionaCliente.setBounds(37, 186, 113, 20);
		frame.getContentPane().add(txtSeleccionaCliente);
		txtSeleccionaCliente.setColumns(10);
		
		txtSeleccionaIdPedido = new JTextField();
		txtSeleccionaIdPedido.setText("Selecciona ID Pedido");
		txtSeleccionaIdPedido.setBounds(37, 233, 113, 20);
		frame.getContentPane().add(txtSeleccionaIdPedido);
		txtSeleccionaIdPedido.setColumns(10);
		
		//BOTON LISTAR
		JButton btnListarPedidos = new JButton("LISTAR PEDIDOS");
		btnListarPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				table.setModel(conexion.ConsultaTablaListarComanda());
			}
		});
		btnListarPedidos.setBounds(482, 328, 125, 23);
		frame.getContentPane().add(btnListarPedidos);
		//BOTON BORRAR CAMPOS TEXT
		JButton btnBorrar_1 = new JButton("BORRAR");
		btnBorrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSeleccionaCantidad.setText("");
				txtSeleccionaProducto.setText("");
				txtSeleccionaCliente.setText("");
				txtSeleccionaIdPedido.setText("");
			}
		});
		btnBorrar_1.setBounds(50, 279, 89, 23);
		frame.getContentPane().add(btnBorrar_1);
	}
	
	
}
