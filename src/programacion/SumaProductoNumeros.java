package programacion;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy.
 * 
 * Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.
 *
 */

public class SumaProductoNumeros {
	// Propiedades de la clase.
	private String text1, text2;
	private int num1, num2, suma, producto;
	
	// metodo que permite cargar ventana.
	public void getCargarVentana() {
		text1 = JOptionPane.showInputDialog("Ingrese numero");
		// convertimos de int a String
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese numero");
		// convertimos de int a String
		num2 = Integer.parseInt(text2);
	}
	
	// Metodo que imprime la suma y el producto.
	public void getOperaciones() {
		// Imprimimos las Suma.
		suma = num1 + num2;
		producto = num1 * num2;
		System.out.println("La suma de los valores es : " +suma);
		System.out.println("El producto de los valores es : " +producto);
	
	}

}
