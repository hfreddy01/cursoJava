package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos.
 *
 */

public class EstructuraCondicionalCompuesta1 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int num1, num2;
	
	
	// METODO QUE PERMITE CARGAR VENTANA DE DIALOGO PARA EL INGRESO DE VALORES.
	public void getCargarVentana() {
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		// PASAMOS DE INT A STRING
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		// PASAMOS DE INT A STRING
		num2 = Integer.parseInt(text2);
	}
	
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR EL RESULTADO DE LAS OPERACIONES
	public void getNumeroMayor() {
		// VALIDAMOS.
		if(num1 > num2) {
			System.out.println(num1 +" es mayor");
		} else {
			System.out.println(num2 +" es mayor");
		}
	}

}
