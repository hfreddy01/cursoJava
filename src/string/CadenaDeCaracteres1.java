package string;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Solicitar el ingreso del nombre y edad de dos personas. Mostrar el nombre de la persona con mayor edad.
 *
 */

public class CadenaDeCaracteres1 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int edad1, edad2;
	
	
	// METODO QUE PERMITE  CREAR VENTANA DE DIALOGO.
	public void getCreateVentana() {
		JOptionPane.showInputDialog("Ingrese nombre");
		
		text1 = JOptionPane.showInputDialog("Ingrese edad");
		edad1 = Integer.parseInt(text1);
		
		JOptionPane.showInputDialog("Ingrese nombre");
		
		text2 = JOptionPane.showInputDialog("Ingrese edad");
		edad2 = Integer.parseInt(text2);
			
	}
	
	
	// METODO QUE PERMITE VALIDAR CUAL EDAD ES MAYOYR.
	public void getEdadMayor() {
		// VALIDAMOS.
		if(edad1 > edad2) {
			System.out.println(text1);
		} else {
			System.out.println(text2);
		}
	}

}
