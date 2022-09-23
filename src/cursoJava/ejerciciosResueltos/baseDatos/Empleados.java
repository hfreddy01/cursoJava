package cursoJava.ejerciciosResueltos.baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Empleados {

	public static void main(String[] args) {
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/freddy", "root", "");
			//System.out.println("Conexion Exitosa");
			Statement st = miConexion.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM empleados");
			while(rs.next()) {
				
				System.out.println("Nombre Empleado  : " +rs.getString("nombreEmpleado"));
				System.out.println("Ocupacion Empleado  : " +rs.getString("cargoEmpleado"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	

	}

	}


