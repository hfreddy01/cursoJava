package cursoJava.ejerciciosResueltos.condicionales.compuestas;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         3 - REALIZAR UN PROGRAMA QUE LEA POR TECLADO DOS NUMEROS, SI EL
 *         NUMERO PRIMERO ES MAYOR AL SEGUNDO INFORMAR SU SUMA Y SU RESTA EN
 *         CASO CONTRARIO INFORMAR LA MULTIPLICACION Y LA DIVISION DEL PRIMERO
 *         RESPECTO AL SEGUNDO.
 *
 */

public class EjercicioCondicionalCompuesta2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA INGRESAR LOS NUMEROS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LAS VARIABLES NUMEROS.
		int num1, num2;
		// INGRESAMOS LOS NUMEROS POR CONSOLA.
		System.out.println("Ingrese primer numero :");
		num1 = teclado.nextInt();
		System.out.println("Ingrese segundo numero :");
		num2 = teclado.nextInt();

		// VALIDAMOS CUAL DE LOS NUMEROS INGRESADO ES MAYOR.
		if (num1 > num2) {
			int suma = num1 + num2;
			int resta = num1 - num2;
			System.out.println("El resultado de la suma es : " + suma);
			System.out.println("El resultado de la resta es : " + resta);
		} else {
			int multiplicacion = num1 * num2;
			int division = num1 / num2;
			System.out.println("El resultado de la multiplicacion es : " + multiplicacion);
			System.out.println("El resultado de la division es : " + division);
		}
	}
}
