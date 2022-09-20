package cursoJava.ejerciciosResueltos.condicionales.aninadas;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         4 - CONFECCIONAR UN PROGRAMA QUE PERMITA CARGAR UN NUMERO ENTERO
 *         POSITIVO DE HASTA TRES CIFRAS Y MUESTRE UN MENSAJE INDICANDO SI TIENE
 *         1, 2, 3 CIFRAS. MOSTRAR UN MENSAJE DE ERROR SI EL NUMERO DE CIFRAS ES
 *         MAYOR.
 *
 */
public class EjerciciosCondicionalAnidada4 {
	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] ar) {
		// CREAMOS EL OBJETO SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES
		int num;
		System.out.print("Ingrese un valor de hasta tres dígitos positivo :");
		num = teclado.nextInt();
		// VALIDAMOS
		if (num < 10) {
			System.out.print("Tiene un dígito");
		} else {
			if (num < 100) {
				System.out.print("Tiene dos dígitos");
			} else {
				if (num < 1000) {
					System.out.print("Tiene tres dígitos");
				} else {
					System.out.print("Error en la entrada de datos.");
				}
			}
		}
	}
}
