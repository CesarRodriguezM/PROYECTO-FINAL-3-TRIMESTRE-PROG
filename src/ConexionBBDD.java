import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.table.DefaultTableModel;


public class ConexionBBDD {

	private String url= "jdbc:oracle:thin:@localhost:1521:XE";
	private String usr = "SYSTEM";
	private String pwd = "lorca1";
	private Connection conexion;
	

	public ConexionBBDD()  {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			
			if(!conexion.isClosed()) {
				System.out.println("Conexión establecida");
			}
			else
				System.out.println("Fallo en Conexión");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexión con ORACLE");	
			e.printStackTrace();
		}
		
	}
	
	public DefaultTableModel ConsultaTablaListarPRODUCTOS() {
		String [] columnas={"ID_PRODUCTO","NOMBRE_PRODUCTO","STOCK","ID_CATEGORIA","PRECIO"};
		String [] registro=new String[5];
		DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
		String query = "SELECT * FROM LORCA1.PRODUCTO ORDER BY ID_PRODUCTO ASC";
		 
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			while(rset.next()) {
				 registro[0]=rset.getString("ID_PRODUCTO");
		         registro[1]=rset.getString("NOMBRE_PRODUCTO");
		         registro[2]=rset.getString("STOCK");
		         registro[3]=rset.getString("ID_CATEGORIA");
		         registro[4]=rset.getString("PRECIO");
		         ModeloTabla.addRow(registro);
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return ModeloTabla;
	}
		
		public int ConsultaAñadirProductos() {
		
				
		int resultado = 0;
		String update = "INSERT INTO LORCA1.PRODUCTO VALUES ("+PRODUCTOS.ID_PROD + " , '" + PRODUCTOS.NOM + "' , " + PRODUCTOS.STCK + " , " + PRODUCTOS.ID_CAT + " , " + PRODUCTOS.PREC + "  )";
		System.out.println(update);
		try {
			Statement stmt = conexion.createStatement();
			int rset = stmt.executeUpdate(update );
			
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		return resultado;
		
	}
		
		public DefaultTableModel ConsultaTablaListarCATEGORIA() {
			String [] columnas={"Id_Categoria","Nom_Categoria","Descripcion"};
			String [] registro=new String[3];
			DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
			String query = "SELECT * FROM LORCA1.CATEGORIA ORDER BY Id_Categoria ASC";
			 
			try {
				Statement stmt = conexion.createStatement();
				ResultSet rset = stmt.executeQuery(query);
				while(rset.next()) {
					 registro[0]=rset.getString("Id_Categoria");
			         registro[1]=rset.getString("Nom_Categoria");
			         registro[2]=rset.getString("Descripcion");
			         ModeloTabla.addRow(registro);
				}
				rset.close();
				stmt.close();
				
			}catch (SQLException s){
				s.printStackTrace();
			}
			
			return ModeloTabla;
			
		}
		
		public int ConsultaAñadirListarCATEGORIA() {
			int resultado = 0;
			String update = "INSERT INTO LORCA1.CATEGORIA VALUES ("+CATEGORIA.ID_CAT + " , '" + CATEGORIA.NOM + "' , '" + CATEGORIA.DESCRIPCION + "' )";
			System.out.println(update);
			try {
				Statement stmt = conexion.createStatement();
				int rset = stmt.executeUpdate(update );
				
				stmt.close();
				
			}catch (SQLException s){
				s.printStackTrace();
			}
			return resultado;
			
		}
		
		public int ConsultaModificarPRODUCTOS() {
			int resultado = 0;
			String update = "UPDATE LORCA1.PRODUCTO SET ID_PRODUCTO="+PRODUCTOS.ID_PROD+", NOMBRE_PRODUCTO ='"+ PRODUCTOS.NOM + "',  STOCK = "+PRODUCTOS.STCK+", ID_CATEGORIA = "+PRODUCTOS.ID_CAT+", PRECIO ="+ PRODUCTOS.PREC+" "
					+ "WHERE ID_PRODUCTO ="+PRODUCTOS.ID_PROD+" ";
			System.out.println(update);
			try {
				Statement stmt = conexion.createStatement();
				int rset = stmt.executeUpdate(update);
				
				stmt.close();
				
			}catch (SQLException s){
				s.printStackTrace();
			}
			return resultado;
			
		}
			
}
