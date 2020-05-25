package condicionales.anidadas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.
 *
 */

public class EstructuraCondicionalAnidada3 {
	// 	PROPIEDADES DE LA CLASE.
	private String text1;
	private int num;
	
	
	// METODO QUE PERMITE INGRESAR VALORES POR VENTANA DE DIALOGO.
	public void getVenatan() {
		text1 = JOptionPane.showInputDialog("Ingrese numero");
		num = Integer.parseInt(text1);
		
	}
	
	
	// METODO QUE VALIDA LA CONDICION DEL NUMERO.
	public void getNumero() {
		// VALIDAMOS.
		if(num == 0) {
			System.out.println("Se ingreso el cero");
		} else {
			if(num > 0 ) {
				System.out.println("Se ingreso un valor positivo");
			} else {
				System.out.println("Se ingreso un valor negativo");
			}
		}
	}

}
