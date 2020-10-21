package cursoJava.ejerciciosResueltos.variables;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 3 - REALIZAR UN PROGRAMA QUE PERMITA MOSTRAR POR VENATANA DE DIALOGO TU NOMBRE Y EDAD.
 *
 */

public class EjerciciosVariables3 {

	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int edad;
		
		// INGRESAMOS DATOS POR VENTANA DE DIAOLOGO.
		String nombre = JOptionPane.showInputDialog("Ingrese nombre");
		
		String text =JOptionPane.showInputDialog("Ingrese edad");
		// TRANSFORMAMOS DE INT A STRING.
		edad = Integer.parseInt(text);
		
		// IMPRIMIMOS.
		System.out.println("Nombres : " +nombre);
		System.out.println("Edad : " +edad);
		
		
	}

}
