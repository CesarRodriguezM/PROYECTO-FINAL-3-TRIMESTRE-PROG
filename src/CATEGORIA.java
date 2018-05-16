import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CATEGORIA {

	JFrame frame;
	private JTable table;
	private JTextField Id_categoria;
	private JTextField Nom_categoria;
	private JTextField descripcion;
	private ConexionBBDD conexion;
	static String ID_CAT;
	static String NOM;
	static String DESCRIPCION;
	
	

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public CATEGORIA() {
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
		frame.setBounds(100, 100, 607, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(216, 53, 349, 249);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int seleccion = table.rowAtPoint(arg0.getPoint());
				Id_categoria.setText((String)table.getValueAt(seleccion, 0));
				Nom_categoria.setText((String)table.getValueAt(seleccion, 1));
				descripcion.setText((String)table.getValueAt(seleccion, 2));
				
				
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Id_Categoria", "Nom_Categoria", "Descripcion"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 26));
		lblCategoria.setBounds(29, 21, 126, 25);
		frame.getContentPane().add(lblCategoria);
		
		JLabel lblNewLabel = new JLabel("Id_Categoria");
		lblNewLabel.setBounds(29, 69, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		Id_categoria = new JTextField();
		Id_categoria.setBounds(120, 66, 86, 20);
		frame.getContentPane().add(Id_categoria);
		Id_categoria.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nom_Categoria");
		lblNewLabel_1.setBounds(29, 114, 74, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		Nom_categoria = new JTextField();
		Nom_categoria.setBounds(120, 111, 86, 20);
		frame.getContentPane().add(Nom_categoria);
		Nom_categoria.setColumns(10);
		
		descripcion = new JTextField();
		descripcion.setBounds(120, 152, 86, 20);
		frame.getContentPane().add(descripcion);
		descripcion.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Descripcion");
		lblNewLabel_2.setBounds(34, 155, 58, 14);
		frame.getContentPane().add(lblNewLabel_2);
		//BOTON AÑADIR
		JButton btnAadir = new JButton("A\u00D1ADIR");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ID_CAT = Id_categoria.getText();
				NOM = Nom_categoria.getText();
				DESCRIPCION = descripcion.getText();
				 
				
				DefaultTableModel data = (DefaultTableModel) table.getModel();
				data.addRow(new Object[]{ID_CAT,NOM,DESCRIPCION});
				conexion.ConsultaAñadirListarCATEGORIA();//ENLACE A CONEXION BBDD
				table.setModel(conexion.ConsultaTablaListarCATEGORIA()); //ACTUALIZAR BASE DE DATOS CUANDO LE DEMOS AL BOTON AÑADIR
					
				}
			
		});
		btnAadir.setBounds(14, 351, 89, 23);
		frame.getContentPane().add(btnAadir);
		//BOTON MODIFICAR
		JButton btnNewButton = new JButton("MODIFICAR CATEGORIA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ID_CAT = Id_categoria.getText();
				NOM = Nom_categoria.getText();
				DESCRIPCION = descripcion.getText();
				
				
				conexion.ConsultaModificarCATEGORIA();//ENLACE A CONEXION BBDD
				table.setModel(conexion.ConsultaTablaListarCATEGORIA()); //ACTUALIZAR BASE DE DATOS CUANDO LE DEMOS AL BOTON MODIFICAR
				
			}
		});
		btnNewButton.setBounds(120, 351, 171, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		//BOTON BORRAR CONTIENE LA CONEXION A LA BBDD
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Id_categoria.setText("");
				Nom_categoria.setText("");
				descripcion.setText("");
				
				
				
				
			}
		});
		btnBorrar.setBounds(120, 198, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		
		//BOTON LISTAR CONTIENE LA CONEXION A LA BBDD
		
		JButton btnListar = new JButton("LISTAR  CATEGORIA");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				table.setModel(conexion.ConsultaTablaListarCATEGORIA());
					
				
				
				
			}
		});
		btnListar.setBounds(436, 351, 143, 23);
		frame.getContentPane().add(btnListar);
		
		
		//BOTON SALIR AL MENU
		
		JButton button = new JButton("<< SALIR AL MENU");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU MENU = new MENU();
				MENU.frame.setVisible(true);
			}
		});
		button.setBounds(404, 418, 175, 25);
		frame.getContentPane().add(button);
		
		
		//BOTON ATRAS
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ADMINISTRACION ADMINISTRACION = new ADMINISTRACION();//Muestra la ventana a la que quieres dirigirte
				ADMINISTRACION.frame.setVisible(true);
				
			}
		});
		btnAtras.setBounds(476, 11, 89, 23);
		frame.getContentPane().add(btnAtras);
		
		//BOTON ELIMINAR CATEGORIA CONTIENE CONEXION A LA BBDD
		
		JButton btnNewButton_1 = new JButton("ELIMINAR CATEGORIA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ID_CAT = Id_categoria.getText();
				 NOM = Nom_categoria.getText();
				 DESCRIPCION = descripcion.getText();
				
				conexion.ConsultaBORRARCATEGORIA();
				table.setModel(conexion.ConsultaTablaListarCATEGORIA());
			}
		});
		btnNewButton_1.setBounds(301, 351, 125, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
