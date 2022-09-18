package cursoJava.ejerciciosResueltos.condicionales.ejerciciosOtros;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CONDICONALES COMPUESTAS ANIDADAS UTILIZANDO OPERARIOS
 *         LOGICOS :
 * 
 *         ESCRIBIR UN PROGRAMA EN EL CUAL DADA UNA LISTA DE TRES VALORES
 *         NUMERICOS DISTINTOS SE CALCULE E INFORME SU RANGO DE VARIACION DEBE
 *         MOSTRAR EL MAYOR Y EL MENOR DE ELLOS
 * 
 */

public class RngoVariacionNumerica {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER PARA LA ENTRADA DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VALORES
		int num1, num2, num3;
		// INGRESAMOS VALORES POR TECLADO.
		System.out.println("Ingrese primer numero :");
		num1 = teclado.nextInt();
		System.out.println("Ingrese segundo numero :");
		num2 = teclado.nextInt();
		System.out.println("Ingrese tercer numero :");
		num3 = teclado.nextInt();
		// VALIDAMOS EL RANGO DE LOS VALORES.
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1);
		} else if (num2 < num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
		System.out.println("--");
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		} else if (num2 > num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
	}
}
