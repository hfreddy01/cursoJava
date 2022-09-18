package cursoJava.ejerciciosResueltos.bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO BUCLE FOR UTILIZANDO CONDICONALES COMPUESTAS SIMPLES :
 * 
 *         5 - DESARROLLAR UN PROGRAMA QUE SOLICITE LA CARGA DE 10 NUMEROS E
 *         IMPRIMA LA SUMA DE LOS ULTIMOS 5 VALORES INGRESADOS.
 *
 */

public class EjerciciosBucleFor5 {

	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int num, suma;
		// INICIALIZAMOS VARIABLE.
		suma = 0;
		// VALIDAMOS.
		for (int i = 0; i <= 10; i++) {
			// INTRODUCIMOS DATOS POR VENTANA DE DIALOGO.
			String text = JOptionPane.showInputDialog("Ingrese numero");
			// TRANSFORMAMOS DE INT A STRING.
			num = Integer.parseInt(text);
			// VALIDMAOS.
			if (i > 5) {
				suma = suma + num;
			}
		}
		// IMPRIMIMOS.
		System.out.print("La suma de los últimos 5 valores es : " + suma);
	}
}
