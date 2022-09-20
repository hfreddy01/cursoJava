package cursoJava.ejerciciosResueltos.bucles.While;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO BUCLE WHILE
 * 
 *         3 - DESARROLLAR UN PROGRAMA QUE PERMITA LA CARGA DE 10 VALORES POR
 *         TECLADO Y NOS MUESTRE POSTERIORMENTE LA SUMA DE LOS VALORES
 *         INGRESADOS Y SU PROMEDIO.
 *
 */

public class EjerciciosBucleWhile3 {

	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLE.
		int num, suma, promedio, x;
		x = 1;
		suma = 0;
		// VALIDAMOS.
		while (x < 10) {
			// INTRODUCIMOS VALORES POR TECLADO.
			System.out.println("Ingrese numero");
			num = teclado.nextInt();
			suma = suma + num;
			// INCREMENTAMOS X
			x++;
		}
		// VALIDAMOS PROMEDIO.
		promedio = suma / 10;
		System.out.println("La suma de los 10 valores es : " + suma);
		System.out.println("El promedio de los valores es " + promedio);
	}
}
