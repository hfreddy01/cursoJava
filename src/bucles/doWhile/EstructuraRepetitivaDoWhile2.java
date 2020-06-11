package bucles.doWhile;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa que solicite la carga de números por teclado, obtener su promedio. Finalizar la carga de valores 
 * cuando se cargue el valor 0.
 *
 */

public class EstructuraRepetitivaDoWhile2 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int num, cantidad, promedio, suma;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO E IMPRIMIR EL RESULTADO.
	public void getCreateVentaana() {
		// INICIALIZAMOS.
		cantidad = 0 ;
		suma = 0;
		
		// VALIDAMOS.
		do {
			text1 = JOptionPane.showInputDialog("Ingrese valores  (0 finaliza)");
			num = Integer.parseInt(text1);
			// VALIDAMOS.
			if(num != 0) {
				suma = suma + num;
				cantidad++;
			}
			
		} while(num != 0);
			if(cantidad !=0) {
				promedio = suma / cantidad;
				 System.out.println("El promedio de los valores ingresados es : " +promedio);
			} else {
				System.out.println("No se ingresaron valores");
			}
	}

}
