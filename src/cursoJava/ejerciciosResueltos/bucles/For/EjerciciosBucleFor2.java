package cursoJava.ejerciciosResueltos.bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO DE BUCLE FOR :
 * 
 *         2 - DESAROLLAR UN PROGRAMA QUE PERMITA LA CARGA DE 5 VALORES POR
 *         TECLADO Y NOS MUESTRE POSTERIORMENTE LA SUMA DE LOS VALORES
 *         INGRESADOS Y SU PROMEDIO.
 *
 */

public class EjerciciosBucleFor2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int num, promedio, suma;
		// IMICILIZAMOS VARIABLES;
		suma = 0;

		// VALIDAMOS.
		for (int i = 1; i < 5; i++) {
			// INGRESAMOS DATOS POR VENTANA DE DIALOGO.
			String text = JOptionPane.showInputDialog("Ingrese valores");
			// TRANSFORMAMOS DE INT A STRING.
			num = Integer.parseInt(text);
			suma = suma + num;
		}
		// IMPRIMIMOS.
		System.out.println("La suma es : " + suma);
		// VALIDAMOS EL PROMEDIO.
		promedio = suma / 10;
		// IMPRIMIMOS.
		System.out.println("El promedio es : " + promedio);
	}
}
