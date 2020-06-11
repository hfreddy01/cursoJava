package bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.
 *
 */

public class EstructuraRepetitivaFor7 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int num, suma;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE VALORES.
	public void getCreateVentana() {
		// INICILIZAMOS VARIABLE SUMA EN CERO (0)
		suma = 0;
		
		// VALIDAMOS
		for(int i=1; i<=5; i=i+1) {
		text1 = JOptionPane.showInputDialog("Ingrese valores");
		num = Integer.parseInt(text1);
		// VALIDAMOS SUMA.
		if(i > 3) {
			suma = suma + num;
		   }
		}
			// IMPRIMIMOS.
		    System.out.println("La suma de los ultimos tres valores es : " +suma);
	}

}
