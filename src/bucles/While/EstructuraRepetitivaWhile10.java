package bucles.While;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un mensaje cual de las dos listas 
 * tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales") Tener en cuenta que puede haber
 *  dos o más estructuras repetitivas en un algoritmo.
 *
 */

public class EstructuraRepetitivaWhile10 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int x, valor, suma1, suma2;
	
	
	// METODO QUE PERMITE CARGAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getCreateVentana() {
		// INICIALIZAMOS.
		x = 1;
		suma1 = 0;
		suma2 = 0;
		// PRIMERA LISTA
		JOptionPane.showMessageDialog(null, "Primera lista");
		// VALIDAMOS.
		while(x <= 5) {
			text1 = JOptionPane.showInputDialog("Ingrse valor");
			valor = Integer.parseInt(text1);
			suma1 = suma1 + valor;
			x++;
		}
		
		// SEGUNDA LISTA
		JOptionPane.showMessageDialog(null, "Segunda lista");
		x = 1;
		// VALIDAMOS.
		while(x <= 5) {
			text2 = JOptionPane.showInputDialog("Ingrse valor");
			valor = Integer.parseInt(text2);
			suma2 = suma2 + valor;
			x++;
		}
		
		// VALIDAMOS LA MAYOR DE LA LISTA.
		if(suma1 > suma2) {
			System.out.println("Lista 1 mayor");
		} else if(suma2 > suma1) {
			System.out.println("Lista 2 mayor");
		} else {
			System.out.println("Listas iguales.");
		}
		
		
	}

}
