package bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los valores 
 * ingresados y su promedio. Este problema ya lo desarrollamos , lo resolveremos empleando la estructura for.
 *
 */

public class EstructuraRepetitivaFor2 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int suma, promedio, valor;
	
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR TODO.
	public void getCreateAll() {
		// INICIALIZAMOS VARIABLE SUMA.
		suma=0;
		
		// VALIDAMOS.
		for(int i=0; i<=10; i=i+1) {
			text1 = JOptionPane.showInputDialog("Ingrese valor");
			valor = Integer.parseInt(text1);
			// VALIDAMOS SUMA.
			suma = suma + valor;
		}
		
		System.out.println("La suma es : " +suma);
		// VALIDAMOS PROMEDIO.
		promedio = suma / 10;	
		System.out.println("el promedio es : " +promedio);
		
	}

}
