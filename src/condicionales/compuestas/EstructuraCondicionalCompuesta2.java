package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia, 
 * en caso contrario informar el producto y la división del primero respecto al segundo.
 *
 */

public class EstructuraCondicionalCompuesta2 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int num1, num2;
	private int suma, diferencia, producto, division;
	
	// METODO QUE PERMITE CARGAR VENTANA DE DIALOGO PARA EL INGRESO DE VALORES
	public void getCargarVentana() {
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		// PARSEINT
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		// PARSEINT
		num2 = Integer.parseInt(text2);
	}
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR LOS RESULTADOS.
	public void getOperaciones() {
		// VALIDAMOS.
		if(num1 > num2) {
			suma = num1 + num2;
			diferencia = num1 - num2;
			System.out.println("La suma de los dos primeros numero es : " +suma);
			System.out.println("La diferencia de los dos primeros numero es : " +diferencia);
			
		} else {
			producto = num1 * num2;
			division = num1 / num2;
			System.out.println("El resultado de los dos ultimos numero es : " +producto);
			System.out.println("El resultado de los dos ultimos numero es : " +division);
			
		}
	}

}
