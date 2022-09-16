package cursoJava.ejerciciosResueltos.condicionales.compuestas;

import java.util.Scanner;

/**
 * 
 * @author cursoJava 
 * EJERCICIOS CONDICIONALES COMPUESTAS : 
 *     2 - REALIZAR UN
 *         PROGRAMA QUE SOLICITE INGRESAR DOS NUMEROS DISTINTOS Y MUESTRE POR
 *         PANTALLA EL MAYOR DE ELLOS.
 *
 */

public class EjercicioCondicionalCompuesta1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA INGRESAR LOS NUMEROS POR CONSOLA.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LAS VARIABLES NUMEROS.
		int num1;
		int num2;
		// INGRESAMOS LOS NUMEROS POR TECLADO.
		System.out.println("Ingrese primer numero :");
		num1 = teclado.nextInt();

		System.out.println("Ingrese segundo numero :");
		num2 = teclado.nextInt();
		// VALIDAMOS CUAL DE LOS DOS NUMEROS ES MAYOR
		if (num1 > num2) {
			System.out.println("El numero mayor es : " + num1);
		} else {
			System.out.println("El numero mayor es : " + num2);
		}
	}
}
