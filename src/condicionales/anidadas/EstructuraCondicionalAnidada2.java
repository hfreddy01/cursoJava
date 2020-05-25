package condicionales.anidadas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
 *
 */

public class EstructuraCondicionalAnidada2 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int num1, num2, num3;
	
	
	// METODO QUE PERMITE INGRESAR VALORES POR VENTANA DE DIALOGO.
	public void getVentana() {
		// CREAMOS VENTANA.
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		// TRANSFORMAMOS DE INT A STRING
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		// TRANSFORMAMOS DE INT A STRING
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer numero");
		// TRANSFORMAMOS DE INT A STRING
		num3 = Integer.parseInt(text3);
	}
	
	
	
	// METODO QUE SE ENCARGA DE VALIDAR CUAL NUMERO ES MAYOR.
	public void getNumeroMayor() {
		// VALIDAMOS.
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("Numero uno es mayor con : " +num1);
			} else {
				System.out.println("Numero tres es mayor con : " +num3);
			}
		} else {
			if(num2 > num3) {
				System.out.println("Numero dos es mayor con : " +num2);
			} else {
				System.out.println("Numero tres es mayor con : " +num3);
			}
		}
	
		
	}

}
