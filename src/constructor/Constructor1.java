package constructor;

import javax.swing.JOptionPane;

public class Constructor1 {
	// PROPIEDADES DE LA CLASE.
	private String nombre, edad1;
	private String apellido;
	private int edad;
	
	
	// CONSTRICTOR DE LA CLASE.
	public Constructor1(String nomb, String ape, int eda) {
		// DEFININOS
		nombre = nomb;
		apellido = ape;
		edad = eda;
	}
	
	// SOBRE CARGA DE CONSTRUCTORES.
	public Constructor1(String nomb) {
		this("Freddy Second, ", " Herrera", 28);
	}

	
	// METODO QUE PERMITE ENVIAR LOS DATOS.
	public String setDatos() {
		String datos = "Nombre : " +nombre +" Apellido : " +apellido +" Edad : " +edad;
		
		return datos;
		
	}

}
