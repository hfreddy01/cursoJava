package cursoJava.ejerciciosResueltos.bucles.DoWhile;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         3 - REALIZAR UN PROGRAMA QUE PERMITA INGRESAR EL PESO (EN KG) DE
 *         PIEZAS, EL PROCESO TERMINA CUANDO INGRESEMOS EL VALOR CERO, DEBE
 *         INFORMAR, CUANTAS PIEZAS TIENEN PESOS ENTRE 9.8 KG Y 10.2KG, CUANTAS
 *         CON MAS DE 10.2KG Y CUANTAS CON MENOS DE 9,8KG, LA CANTIDAD TOTAL DE
 *         PIEZAS PROCESADAS.
 *
 */

public class EjerciciosDoWhile3 {

	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);

		// CREAMOS VARIABLES.
		int cantidad1, cantidad2, cantidad3, suma;
		float peso;
		// INICLIAZAMOS VARIABLES.
		cantidad1 = 0;
		cantidad2 = 0;
		cantidad3 = 0;
		// VALIDAMOS.
		do {
			// INTRODUCIMOS DATOS POR TECLADO.
			System.out.println("Ingrese el peso de la pieza (0 pera finalizar):");
			peso = teclado.nextFloat();
			// VALIDAMOS.
			if (peso > 10.2) {
				cantidad1++;
			} else {
				if (peso < 9.8) {
					cantidad2++;
				} else {
					if (peso > 0) {
						cantidad3++;
					}
				}
			}
		} while (peso != 0);

		// VALIDAMOS.
		suma = (cantidad1 + cantidad2 + cantidad3);
		// IMPRIMIMOS.
		System.out.println("Piezas aptas : " + cantidad2);
		System.out.println("Piezas con un peso superior a 10.2 :" + cantidad1);
		System.out.println("Piezas con un peso inferior a 9.8 :" + cantidad3);
	}
}
