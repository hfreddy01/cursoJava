package string;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Solicitar el ingreso de dos apellidos. Mostrar un mensaje si son iguales o distintos.
 *
 */

public class CadenaDeCaracteres3 {
	// PROPIEDADES DE LA CLASE.
	private String apellido1, apellido2;
	
	
	// METODO UE PERMITE CREAR VENTANADA DE DIALOGO Y MOSTRAR RESULTADO.
	public void getVentanal() {
		// VENATANA DE DIALOGO
		apellido1 = JOptionPane.showInputDialog("Ingrese apellido 1");
		apellido2 = JOptionPane.showInputDialog("Ingrese apellido 2");
		// VALIDAMOS.
		if(apellido1.equals(apellido2)) {
			System.out.print("Son iguales...");
		} else {
			System.out.print("Son distintos...");
		}
	}
	

}
