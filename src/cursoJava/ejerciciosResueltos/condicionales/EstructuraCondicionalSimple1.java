package cursoJava.ejerciciosResueltos.condicionales;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *   1 - INGRESAR EL SUELDO DE UNA PERSONA, SI SUPERA LOS 3000 PESOS, DEBE MOSTRAR UN MENSAJE EN PANTALLA INDICANDO QUE 
 *       DEBE ABONAR IMPUESTOS.
 *
 */

public class EstructuraCondicionalSimple1 {
	
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		float sueldo;
		String text1;
		
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE SUELDO POR PANTALLA.
		text1 = JOptionPane.showInputDialog("Ingrese sueldo");
		
		// PASAMOS DE STRING A FLOAT CON parseFloat.
		sueldo = Float.parseFloat(text1);	
		
		// VALIDAMOS CON EL CONDICIONAL SI EL SUELDO SUPERA LOS 3000 PESOS.
		if(sueldo > 3000) {
			System.out.println("Debe abonar Impuestos");
		}
		
	}

}
