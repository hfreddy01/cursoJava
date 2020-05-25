package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e informe su rango de variación
 *  (debe mostrar el mayor y el menor de ellos)
 *
 */

public class CondicionesCompuestas9 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int num1, num2, num3;
	
	
	// METODO QUE PERMITE CARGAR VALORES POR VENTANA DE DIALOGO.
	public void getVentanas() {
		// VALIDAMOS.
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer numero");
		num3 = Integer.parseInt(text3);
	}
	
	
	// METODO Q PERMITE MOSTRAR RANGO DE VARIACION DE LOS VALORES.
	public void getRangoValores() {
		// IMPRIMIMOS MENSAJE
		JOptionPane.showMessageDialog(null, "Rango de Valores...");
		// VALIDAMOS.
		if(num1 < num2 && num1 < num3) {
			System.out.println(num1);
		} else {
			if(num2 < num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}
		}
		
		System.out.println(" - ");
		// VALIDAMOS.
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1);
		} else if(num2 > num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
	}

}
