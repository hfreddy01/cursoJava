package bucles.While;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.
   Emplear el operador % en la condición de la estructura condicional :
   
	if (valor%2==0)   //  Si el if da verdadero luego es par.
 *
 */

public class EstructuraRepetitivaWhile11 {
	// PROPIEDADES DE LA CLSE.
	private String text1, text2;
	private int x, n, pares, impares, num;
	
	// METODO QUE PERMITE CARGAR DATOS MEDIANTE VETANA DE DIALOGO E IMPRIMIR RESULTADOS.
	public void getCreate() {
		// INICIALIZAMOS.
		x = 1;
		pares =0;
		impares =0;
		
		// VALIDAMOS.
		text1 = JOptionPane.showInputDialog("Cuantos números ingresara");
		n = Integer.parseInt(text1);
		
		while(x <= n) {
			text2 = JOptionPane.showInputDialog("Ingrese numero");
			num = Integer.parseInt(text2);
			// VALIDAMOS.
			if(num %2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
			x++;
			
		}
		
		// IMPRIMIMOS.
		System.out.println("Cantadad de pares : " +pares);
	    System.out.println("Cantidad de impares : " +impares);

	}

}
