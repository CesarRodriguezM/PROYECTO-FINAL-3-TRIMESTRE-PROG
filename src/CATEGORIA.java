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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CATEGORIA window = new CATEGORIA();
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
		
		JButton btnAadir = new JButton("A\u00D1ADIR");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ID_CAT = Id_categoria.getText();
				NOM = Nom_categoria.getText();
				DESCRIPCION = descripcion.getText();
				 
				
				DefaultTableModel data = (DefaultTableModel) table.getModel();
				data.addRow(new Object[]{ID_CAT,NOM,DESCRIPCION});
				conexion.ConsultaAñadirListarCATEGORIA();
					
				}
			
		});
		btnAadir.setBounds(14, 351, 89, 23);
		frame.getContentPane().add(btnAadir);
		
		JButton btnNewButton = new JButton("MODIFICAR CATEGORIA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(138, 351, 153, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Id_categoria.setText("");
				Nom_categoria.setText("");
				descripcion.setText("");
				
				
				
				
			}
		});
		btnBorrar.setBounds(311, 351, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		JButton btnListar = new JButton("LISTAR  CATEGORIA");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				table.setModel(conexion.ConsultaTablaListarCATEGORIA());
					
				
				
				
			}
		});
		btnListar.setBounds(446, 351, 133, 23);
		frame.getContentPane().add(btnListar);
		
		JButton button = new JButton("<< SALIR AL MENU");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU MENU = new MENU();
				MENU.frame.setVisible(true);
			}
		});
		button.setBounds(404, 418, 175, 25);
		frame.getContentPane().add(button);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ADMINISTRACION ADMINISTRACION = new ADMINISTRACION();//Muestra la ventana a la que quieres dirigirte
				ADMINISTRACION.frame.setVisible(true);
				
			}
		});
		btnAtras.setBounds(476, 11, 89, 23);
		frame.getContentPane().add(btnAtras);
	}
}
