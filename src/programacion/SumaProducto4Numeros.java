package programacion;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma de los dos primeros y el producto 
 * del tercero y el cuarto.
 *
 */
public class SumaProducto4Numeros {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3, text4;
	private int num1, num2, num3, num4, suma, producto;
	
	// METODO QUE PERMITE CARGAR VENTANA.
	public void getCargarVentana() {
		// VENTANA JOPTIONPANE
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		// TRANSFORMAMOS DE INT A STRING
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer numero");
		num3 = Integer.parseInt(text3);
		
		text4 = JOptionPane.showInputDialog("Ingrese cuarto numero");
		num4 = Integer.parseInt(text4);
	}
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR LOS VALORES.
	public void getOperaciones() {
		// VALIDAMOS
		suma = num1 + num2;
		System.out.println("La suma de los dos primeros numeros es : " +suma);
		
		producto = num3 + num4;
		System.out.println("El producto de los dos ultimos numeros es : " +producto);
	}

}
