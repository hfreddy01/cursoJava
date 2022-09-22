package cursoJava.ejerciciosResueltos.poo.metodos.constructor;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         1 - SE DESEA GUARDAR LOS SUELDOS DE 5 OPERARIOS EN UN ARRAYS.
 *         REALIZAR LA CREACION Y CARGA DEL ARRAYS EN EL CONSTRUCTOR DE LA
 *         CLASE.
 */

public class Operarios {
	// PROPIEDADES DE LA CLASE.
	private Scanner teclado;
	private int[] sueldos;

	// METODO CONSTRUCTOR DE LA CLASE.
	public Operarios() {
		// CREAMOS OBJETO SCANNER.
		teclado = new Scanner(System.in);
		// CREAMOS OBJETO DEL ARRAYS.
		sueldos = new int[5];
		try {

			for (int i = 0; i < 5; i = i + 1) {
				System.out.println("Ingrese sueldo de los operarios : ");
				sueldos[i] = teclado.nextInt();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// METODO QUE PERMITE IMPRIMIR LOS SUELDOS DE LOS OPERARIOS.
	public void imprimirSueldOperarios() {

		try {

			for (int i = 0; i < 5; i++) {
				System.out.println(sueldos[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
