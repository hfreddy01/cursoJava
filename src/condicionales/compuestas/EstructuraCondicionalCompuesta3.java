package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando si el número tiene uno o
 *  dos dígitos. (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 *
 */


public class EstructuraCondicionalCompuesta3 {
	// PROPIEDADES DE LA CLASE.
	private String num;
	private int num1;
	
	
	// METODO QUE PERMITE INGRESAR Y MOSTRAR VALORES POR VENTANA DE DIALOGO.
	public void getOperacion() {
		// VALIDAMOS VENTANA DE DIALOGO.
		num = JOptionPane.showInputDialog("Ingrese un numero de uno o dos digitos");
		num1 = Integer.parseInt(num);
		
		// VALIDAMOS.
		if(num1 < 10) {
			System.out.println("Tiene un digito");
		} else {
			System.out.println("Tiene dos digito");
		}
	}

}
