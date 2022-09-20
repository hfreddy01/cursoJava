package cursoJava.ejerciciosResueltos.otros;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERICICO BUCLE FOR UTILIZANDO CONDICONALES COMPUESTAS SIMPLES :
 * 
 *         DESARROLLARA UN PROGRAMA QUE SOLICITE LA CARGA DE 5 NUMEROS E IMPRIMA
 *         LA SUMA DE LOS UTIMOS 3 VALORES INGRESADOS.
 * 
 *
 */

public class SumaValor {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		int num;
		int suma = 0;
		// INGRESAMOS VALORES.
		for (int i = 0; i <= 5; i++) {
			System.out.println("Ingrese valores :");
			num = teclado.nextInt();
			// VALIDAMOS.
			if (i > 3) {
				suma = suma + num;
			}
		}
		// IMPRIMIMOS.
		System.out.print("La suma de los últimos 3 valores es : " + suma);
	}

}
