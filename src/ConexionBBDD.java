import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.table.DefaultTableModel;


public class ConexionBBDD {

	private String url;
	private String usr;
	private String pwd;
	private String esquema;
	private Connection conexion;
	

	public ConexionBBDD()  {
		FicheroINI ();
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
		String query = "SELECT * FROM "+ esquema +".PRODUCTO ORDER BY ID_PRODUCTO ASC";
		 
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
		String update = "INSERT INTO "+ esquema +".PRODUCTO VALUES ("+PRODUCTOS.ID_PROD + " , '" + PRODUCTOS.NOM + "' , " + PRODUCTOS.STCK + " , " + PRODUCTOS.ID_CAT + " , " + PRODUCTOS.PREC + "  )";
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
			String query = "SELECT * FROM "+ esquema +".CATEGORIA ORDER BY Id_Categoria ASC";
			 
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
			String update = "INSERT INTO "+ esquema +".CATEGORIA VALUES ("+CATEGORIA.ID_CAT + " , '" + CATEGORIA.NOM + "' , '" + CATEGORIA.DESCRIPCION + "' )";
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
			String update = "UPDATE "+ esquema +".PRODUCTO SET ID_PRODUCTO="+PRODUCTOS.ID_PROD+", NOMBRE_PRODUCTO ='"+ PRODUCTOS.NOM + "',  STOCK = "+PRODUCTOS.STCK+", ID_CATEGORIA = "+PRODUCTOS.ID_CAT+", PRECIO ="+ PRODUCTOS.PREC+" "
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
		
		public int ConsultaModificarCATEGORIA() {
			int resultado = 0;
			String update = "UPDATE "+ esquema +".CATEGORIA SET Id_Categoria="+CATEGORIA.ID_CAT+", Nom_Categoria='"+ CATEGORIA.NOM + "', Descripcion= '"+CATEGORIA.DESCRIPCION+"' " + "WHERE Id_Categoria="+CATEGORIA.ID_CAT+" ";
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
		
		public int ConsultaBORRARPRODUCTO() {
			int resultado = 0;
			String update = "DELETE "+ esquema +".PRODUCTO WHERE ID_PRODUCTO="+PRODUCTOS.ID_PROD+" AND NOMBRE_PRODUCTO ='"+ PRODUCTOS.NOM + "' AND  STOCK = "+PRODUCTOS.STCK+" AND ID_CATEGORIA = "+PRODUCTOS.ID_CAT+" AND PRECIO ="+ PRODUCTOS.PREC+" ";
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
		
		public int ConsultaBORRARCATEGORIA() {
			int resultado = 0;
			String update = "DELETE "+ esquema +".CATEGORIA WHERE Id_Categoria="+CATEGORIA.ID_CAT+" AND Nom_Categoria='"+ CATEGORIA.NOM + "' AND Descripcion= '"+CATEGORIA.DESCRIPCION+"'";
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
		public DefaultTableModel ConsultaTablaListarComanda() {
			String [] columnas={"CANTIDAD_PEDIDO ","PEDIDO_CLIENTE","ID_CLIENTE","ID_PEDIDO"};
			String [] registro=new String[4];
			DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
			String query = "SELECT * FROM "+ esquema +".PEDIR ORDER BY ID_CLIENTE ASC";
			 
			try {
				Statement stmt = conexion.createStatement();
				ResultSet rset = stmt.executeQuery(query);
				while(rset.next()) {
					 registro[0]=rset.getString("CANTIDAD_PEDIDO");
			         registro[1]=rset.getString("PEDIDO_CLIENTE");
			         registro[2]=rset.getString("ID_CLIENTE");
			         registro[3]=rset.getString("ID_PEDIDO");
			         ModeloTabla.addRow(registro);
				}
				rset.close();
				stmt.close();
				
			}catch (SQLException s){
				s.printStackTrace();
			}
			
			return ModeloTabla;
			
		}	
		public int ConsultaAñadirPedirComanda() {
			int resultado = 0;
			String update = "INSERT INTO "+ esquema +".PEDIR VALUES ('"+AÑADIRCOMANDA.CANTIDAD_PEDIDO + "' , '" + AÑADIRCOMANDA.PEDIDO_CLIENTE + "' , " + AÑADIRCOMANDA.ID_CLIENTE + ", " +AÑADIRCOMANDA.ID_PEDIDO+" )";
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
		public int ConsultaBORRARComanda() {
			
			int resultado = 0;
			String update = "DELETE "+ esquema +".PEDIR WHERE CANTIDAD_PEDIDO='"+AÑADIRCOMANDA.CANTIDAD_PEDIDO+"' AND PEDIDO_CLIENTE='"+ AÑADIRCOMANDA.PEDIDO_CLIENTE + "' AND ID_CLIENTE= "+AÑADIRCOMANDA.ID_CLIENTE+" AND ID_PEDIDO="+ AÑADIRCOMANDA.ID_PEDIDO+"";
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
		
		public DefaultTableModel ConsultaTablaListarINICIARNUEVOPEDIDO() {
			String [] columnas={"ID_PEDIDO","CANTIDAD_PEDIDO"};
			String [] registro=new String[5];
			DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
			String query = "SELECT * FROM "+ esquema +".PEDIDO ORDER BY ID_PEDIDO ASC";
			 
			try {
				Statement stmt = conexion.createStatement();
				ResultSet rset = stmt.executeQuery(query);
				while(rset.next()) {
					 registro[0]=rset.getString("ID_PEDIDO");
			         registro[1]=rset.getString("CANTIDAD_PEDIDO");
			         
			         ModeloTabla.addRow(registro);
				}
				rset.close();
				stmt.close();
				
			}catch (SQLException s){
				s.printStackTrace();
			}
			
			return ModeloTabla;
		}
		
		public void FicheroINI () {
			
			Properties propiedades = new Properties();
			InputStream entrada = null;
			try {
				File miFichero = new File("src/archivo.ini");
				if(miFichero.exists()) {
					entrada =new FileInputStream(miFichero);
					propiedades.load(entrada);
					url =propiedades.getProperty("Basededatos");
					usr =propiedades.getProperty("usuario");
					pwd =propiedades.getProperty("contraseña");
					esquema =propiedades.getProperty("esquema");
				}
				else {System.err.println("fichero no encontrado");
			}
		
		
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			if(entrada != null) {
				try {
					entrada.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
			
		}

}
