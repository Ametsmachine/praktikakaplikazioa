package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Konexioa {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String usuario="root";
	private static String password="1WMG2023";
	private static String url="jdbc:mysql://localhost:3306/praktikak";
	
	static {
		try {
			Class.forName(driver);
			JOptionPane.showMessageDialog(null, "Driver Conectado");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Driver no Conectado");
		}
	}
	
		Connection con=null;
		public Connection getConnection() {
			try {
				con=DriverManager.getConnection(url, usuario, password);
				JOptionPane.showMessageDialog(null, "Conexion a Mysql Correcta");
			}catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error de Conexion");
			}
			return con;
		}
}
