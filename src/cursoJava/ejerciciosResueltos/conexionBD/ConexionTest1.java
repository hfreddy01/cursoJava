package cursoJava.ejerciciosResueltos.conexionBD;

import java.sql.*;

/**
 * 
 * @author cursoJava
 * 
 * CLASE QUE PERMITE CONECTAR Y CONSULTAR UNA TABLA DE UNA BASE DE DATOS.
 *
 */
public class ConexionTest1 {

	public static void main(String[] args) {
		
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/freddy", "root", "");
			//System.out.println("Conexion Exitosa");
			Statement st = miConexion.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM persona");
			while(rs.next()) {
				
				System.out.println("Nombre Persona  : " +rs.getString("nombresPersona"));
				System.out.println("Telefono Persona  : " +rs.getString("TelefonoPersona"));
				System.out.println("Ocupacion Persona  : " +rs.getString("ocupacionPersona"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	

	}

}
