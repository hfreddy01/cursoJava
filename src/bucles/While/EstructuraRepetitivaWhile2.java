package bucles.While;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en uno.
   Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.
 *
 */

public class EstructuraRepetitivaWhile2 {
	// PROPIEDADES DE LA CLASE.
	private String text;
	private int num=1, x;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DATOS PARA INGRESAR DATOS.
	public void getCreateVentana() {
		text = JOptionPane.showInputDialog("Ingrese valor final");
		x = Integer.parseInt(text);
		
		// VALIDAMOS
		while(num <= x) {
			// IMPRIMIMOS.
			System.out.println(num);
			num = num+1;
		}
	}
	

}
