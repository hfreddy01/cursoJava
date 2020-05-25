package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.
 *
 */

public class CondicionesCompuestas3 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int dia, mes;
	
	// METODO QUE PERMITE CARGAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getCargarVentana() {
		JOptionPane.showMessageDialog(null, "Ingrese fecha que corresponda a navidad");
		text1 = JOptionPane.showInputDialog("Ingrese dia");
		dia = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese mes");
		mes = Integer.parseInt(text2);
	}
	
	
	// METODO QUE PERMITE VERIFICAR SI LA FECHA PERTENECE A NAVIDAD.
	public void getOperacion() {
		// VALIDAMOS.
		if(dia == 25 && mes == 12 ) {
			System.out.println("La fecha ingresada corresponde a navidad");
		}
	}

}
