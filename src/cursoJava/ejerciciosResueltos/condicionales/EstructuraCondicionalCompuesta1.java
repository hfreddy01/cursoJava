package cursoJava.ejerciciosResueltos.condicionales;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *  2 - REALIZAR UN PROGRAMA QUE SOLICITE INGRESAR DOS NUMEROS DISTINTOS Y MUESTRE POR PANTALLA EL MAYOR DE ELLOS.
 *
 */

public class EstructuraCondicionalCompuesta1 {
	

	// METODO PRINCIPA DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int num1, num2;
		String text1, text2;
		
		
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE SUELDO POR PANTALLA.
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		
		// PASAMOS DE STRING A FLOAT CON parseFloat.
		num1 = Integer.parseInt(text1);
				
        text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		
		// PASAMOS DE STRING A FLOAT CON parseFloat.
		num2 = Integer.parseInt(text2);
		
		// VALIDAMOS EL NUMERO MAYOR.
		if(num1 > num2) {
			System.out.println(num1 +" Es mayor");
		} else {
			System.out.println(num2 +" Es mayor");
		}
		
		

	}

}
