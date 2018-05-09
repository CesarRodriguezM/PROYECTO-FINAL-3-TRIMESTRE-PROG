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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INICIARNUEVOPEDIDO window = new INICIARNUEVOPEDIDO();
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
	public INICIARNUEVOPEDIDO() {
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
		btnNewButton_2.setBounds(22, 337, 182, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BORRAR ");
		btnNewButton_3.setBounds(529, 337, 163, 39);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("MODIFICAR PEDIDO");
		btnNewButton_4.setBounds(301, 338, 163, 36);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnNewButton_4);
		
		JComboBox SeleccionarCategoria = new JComboBox();
		SeleccionarCategoria.setBounds(22, 169, 182, 30);
		SeleccionarCategoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SeleccionarCategoria.setModel(new DefaultComboBoxModel(new String[] {"SELECCIONAR CATEGORIA", "Carne", "Pescados", "Postres", "Refrescos", "mariscos"}));
		frame.getContentPane().add(SeleccionarCategoria);
		
		JComboBox ElegirCliente = new JComboBox();
		ElegirCliente.setBounds(22, 122, 182, 36);
		ElegirCliente.setModel(new DefaultComboBoxModel(new String[] {"ELEGIR CLIENTE", "1", "2", "3", "4", "5"}));
		frame.getContentPane().add(ElegirCliente);
		
		JLabel lblNewLabel = new JLabel("PEDIDO");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(51, 31, 129, 36);
		frame.getContentPane().add(lblNewLabel);
		
		CANTIDAD_PEDIDO = new JTextField();
		CANTIDAD_PEDIDO.setBounds(22, 210, 182, 30);
		frame.getContentPane().add(CANTIDAD_PEDIDO);
		CANTIDAD_PEDIDO.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(314, 88, 420, 185);
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
			},
			new String[] {
				"CANTIDAD_PEDIDO", "PEDIDO_CLIENTE", "ID_CLIENTE", "ID_PEDIDO"
			}
		));
		scrollPane.setViewportView(table);
	}
}
