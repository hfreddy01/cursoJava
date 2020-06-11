package bucles.While;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los 
 * valores ingresados y su promedio.
 *
 */

public class EstructuraRepetitivaWhile3 {
	// PROPIEDADES DE LA CLASE.
	private String text;
	private int suma, promedio, num, x;

	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO E IMPRIMIR RESULTADOS.
	public void getCreateAll() {
		// INICILIZAMOS VARIABLES.
		x = 1;
		suma = 0;
		
		// VALIDAMOS.
		while(x <= 10){
			text = JOptionPane.showInputDialog("Ingrese un numero");
			num = Integer.parseInt(text);
			// CALCULAMOS LA SUMA.
			suma = suma + num;
			x = x+1;
		}
		
		// CALCULAMOS PROMEDIO.
		promedio = suma / 10;
		
		// IMPRIMIMOS.
		  System.out.println("La suma de los 10 valores es : " +suma);
	      System.out.println("El promedio es : " +promedio);

		

	}

}
