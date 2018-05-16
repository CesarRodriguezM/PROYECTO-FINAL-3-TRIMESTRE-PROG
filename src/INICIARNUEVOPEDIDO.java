import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;

public class INICIARNUEVOPEDIDO {

	static JFrame frame;
	private JTextField CANTIDAD_PEDIDO;
	private JTable table;
	private JTextField txtIdpedido;
	private ConexionBBDD conexion;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public INICIARNUEVOPEDIDO() {
		conexion = new ConexionBBDD();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 862, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("<< SALIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU MENU = new MENU();
				MENU.frame.setVisible(true);
		
			}
		});
		btnNewButton.setBounds(700, 444, 109, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLVER ATR\u00C1S");
		btnNewButton_1.setBounds(541, 444, 124, 39);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PEDIDO PEDIDO = new PEDIDO();
				PEDIDO.frame.setVisible(true);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("A\u00D1ADIR PEDIDO");
		btnNewButton_2.setBounds(22, 337, 201, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BORRAR ");
		btnNewButton_3.setBounds(33, 234, 163, 39);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ELIMINAR PEDIDO");
		btnNewButton_4.setBounds(301, 338, 182, 36);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("PEDIDO");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(51, 31, 129, 36);
		frame.getContentPane().add(lblNewLabel);
		
		CANTIDAD_PEDIDO = new JTextField();
		CANTIDAD_PEDIDO.setText("CANTIDAD_PEDIDO");
		CANTIDAD_PEDIDO.setBounds(22, 176, 182, 30);
		frame.getContentPane().add(CANTIDAD_PEDIDO);
		CANTIDAD_PEDIDO.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(314, 88, 420, 185);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"ID_PEDIDO", "CANTIDAD_PEDIDO"
			}
		));
		scrollPane.setViewportView(table);
		
		txtIdpedido = new JTextField();
		txtIdpedido.setText("ID_PEDIDO");
		txtIdpedido.setBounds(22, 120, 182, 30);
		frame.getContentPane().add(txtIdpedido);
		txtIdpedido.setColumns(10);
		
		//BOTON LISTAR PERMITE VER TODOS LOS PEDIDOS
		JButton btnNewButton_5 = new JButton("LISTAR PEDIDOS");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				table.setModel(conexion.ConsultaTablaListarINICIARNUEVOPEDIDO());
			}
		});
		btnNewButton_5.setBounds(556, 337, 163, 39);
		frame.getContentPane().add(btnNewButton_5);
	}
}
