package bucles.doWhile;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. El proceso termina cuando ingresamos el valor 0. 
 * Se debe informar:
 * 
   a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.? y cuántas con menos de 9.8 Kg.?
   b) La cantidad total de piezas procesadas.
 *
 */

public class EstructuraRepetitivaDoWhile3 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int cantidad1, cantidad2, cantidad3, suma;
	private float peso;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE VALORES E IMPRIME EL REULTADO.
	public void getCreateVentanaAll() {
		// INICIALIZAMOS.
		cantidad1 = 0;
		cantidad2 = 0;
		cantidad3 = 0;
		
		// VALIDAMOS.
		do {
			text1 = JOptionPane.showInputDialog("Ingrese el peso de la pieza (0 pera finalizar):");
			peso = Float.parseFloat(text1);
			// VALIDAMOS.
			if(peso > 10.2) {
				cantidad1++;
			} else {
				if(peso >= 9.8) {
					cantidad2++;
				} else {
					if(peso > 0) {
						cantidad3++;
					}
				}
			}
		} while(peso!=0);
		
		// VALIDAMOS SUMA.
		suma = cantidad1 + cantidad2 + cantidad3;
		System.out.println("Piezas aptas : " +cantidad2);
        System.out.println("Piezas con un peso superior a 10.2 : " +cantidad1);
        System.out.println("Piezas con un peso inferior a 9.8 : " +cantidad3);
	}

}
