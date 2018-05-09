import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class PRODUCTOS {

	JFrame frame;
	private JTable table;
	private JLabel lblNewLabel;
	private JTextField ID_PRODUCTO;
	private JTextField NOM_PRODUCTO;
	private JTextField STOCK;
	private JTextField ID_CATEGORIA;
	private JTextField PRECIO;
	private ConexionBBDD conexion;
	static String ID_PROD;
	static String NOM;
	static String STCK;
	static String ID_CAT;
	static String PREC;
	
	private int indice = 0;
	
	/**
	 * Create the application.
	 * @param pREC 
	 * @param iD_CAT 
	 * @param sTCK 
	 * @param nOM_PRODUCTO2 
	 * @param id 
	 */
	public PRODUCTOS() {
		conexion = new ConexionBBDD();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 14));
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 880, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(219, 104, 635, 243);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID_PRODUCTO", "NOMBRE_PRODUCTO", "STOCK", "ID_CATEGORIA", "PRECIO"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("LISTAR PRODUCTOS");
		btnNewButton.setBounds(523, 379, 133, 34);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("PRODUCTOS");
		lblNewLabel.setBounds(30, 31, 419, 34);
		lblNewLabel.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 26));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("A\u00D1ADIR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			 ID_PROD = ID_PRODUCTO.getText();
			 NOM = NOM_PRODUCTO.getText();
			 STCK = STOCK.getText();
			 ID_CAT=ID_CATEGORIA.getText();
			 PREC = PRECIO.getText();
			
			DefaultTableModel data = (DefaultTableModel) table.getModel();
			data.addRow(new Object[]{ID_PROD,NOM,STCK,ID_CAT,PREC});
			conexion.ConsultaAñadirProductos();
				
			}
		});
		btnNewButton_1.setBounds(41, 379, 133, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		ID_PRODUCTO = new JTextField();
		ID_PRODUCTO.setBounds(110, 108, 86, 20);
		frame.getContentPane().add(ID_PRODUCTO);
		ID_PRODUCTO.setColumns(10);
		
		NOM_PRODUCTO = new JTextField();
		NOM_PRODUCTO.setBounds(110, 139, 86, 20);
		frame.getContentPane().add(NOM_PRODUCTO);
		NOM_PRODUCTO.setColumns(10);
		
		STOCK = new JTextField();
		STOCK.setBounds(110, 170, 86, 20);
		frame.getContentPane().add(STOCK);
		STOCK.setColumns(10);
		
		ID_CATEGORIA = new JTextField();
		ID_CATEGORIA.setBounds(110, 211, 86, 20);
		frame.getContentPane().add(ID_CATEGORIA);
		ID_CATEGORIA.setColumns(10);
		
		PRECIO = new JTextField();
		PRECIO.setBounds(110, 242, 86, 20);
		frame.getContentPane().add(PRECIO);
		PRECIO.setColumns(10);
		
		JLabel lblIdproducto = new JLabel("ID_PRODUCTO");
		lblIdproducto.setBounds(10, 111, 90, 14);
		frame.getContentPane().add(lblIdproducto);
		
		JLabel lblNewLabel_1 = new JLabel("NOM_PRODUCTO");
		lblNewLabel_1.setBounds(10, 141, 90, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("BORRAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ID_PRODUCTO.setText("");
				NOM_PRODUCTO.setText("");
				STOCK.setText("");
				ID_CATEGORIA.setText("");
				PRECIO.setText("");
				
		
				
		
			}
		});
		btnNewButton_2.setBounds(368, 379, 133, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("STOCK");
		lblNewLabel_2.setBounds(30, 173, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID_CATEGORIA");
		lblNewLabel_3.setBounds(10, 214, 90, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PRECIO");
		lblNewLabel_4.setBounds(30, 244, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("<< VOLVER AL MEN\u00DA");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU MENU = new MENU();
				MENU.frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(646, 492, 194, 34);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ATR\u00C1S");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADMINISTRACION ADMINISTRACION = new ADMINISTRACION();
				ADMINISTRACION.frame.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(722, 11, 118, 34);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnModificar = new JButton("MODIFICAR PRODUCTO");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnModificar.setBounds(184, 379, 163, 34);
		frame.getContentPane().add(btnModificar);
		
		//Evento del boton LISTAR PRODUCTOS
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				table.setModel(conexion.ConsultaTablaListarPRODUCTOS());
			}
		});
		
		
	}

	public static void add(PRODUCTOS p) {
		// TODO Apéndice de método generado automáticamente
		
	}
}
