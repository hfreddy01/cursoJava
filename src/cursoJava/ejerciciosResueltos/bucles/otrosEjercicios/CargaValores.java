package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO BUCLE FOR CON CONDICIONALES COMPUESTAS ANIDADAS :
 * 
 *         SE REALIZA LA CARGA DE 5 VALORES ENTEROS POR TECLADO. SE DESEA
 *         CONOCER: A) LA CANTIDAD DE VALORES INGRESADOS NEGATIVOS. B) LA
 *         CANTIDAD DE VALORES INGRESADOS POSITIVOS. C) LA CANTIDAD DE MULTIPLOS
 *         DE 15. D) EL VALOR ACUMULADO DE LOS NUMEROS INGRESADOS QUE SON PARES.
 *
 */

public class CargaValores {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS LA CLASE SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		int numPositivo = 0;
		int numNegativo = 0;
		int multiplo15 = 0;
		int sumaPares = 0;
		// VALIDAMOS.
		for (int i = 0; i <= 5; i++) {
			System.out.print("Ingrese valores : ");
			int valor = teclado.nextInt();
			// VALIDAMOS.
			if (valor < 0) {
				numNegativo++;
			} else {
				if (valor > 0) {
					numPositivo++;
				}
			}
			if (valor % 15 == 0) {
				multiplo15++;
			}
			if (valor % 2 == 0) {
				sumaPares = sumaPares + valor;
			}
		}
		// IMPRIMIMOS.
		System.out.println("Cantidad de valores negativos : " + numNegativo);
		System.out.println("Cantidad de valores positivos : " + numPositivo);
		System.out.println("Cantidad de valores múltiplos de 15 : " + multiplo15);
		System.out.println("Suma de los valores pares : " + sumaPares);
	}
}
