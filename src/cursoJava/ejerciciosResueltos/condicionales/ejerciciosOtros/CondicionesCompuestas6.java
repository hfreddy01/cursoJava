package cursoJava.ejerciciosResueltos.condicionales.ejerciciosOtros;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE CONDICONALES COMPUESTAS SIMPLES UTILIZANDO OPERADORES
 *         LOGICOS :
 * 
 *         SE INGRESAN POR TECLADO TRES NUMEROS, SI MENOS UNO LOS VALORES
 *         INGRESADOS ES MENOR A 10, IMPRIMIR EN PANTALLA LA LEYENDA. "Alguno de
 *         los números es menor a diez".
 * 
 *
 */

public class CondicionesCompuestas6 {
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA INGRESAR VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LOS NUMERO A INGRESAR POR TECLADO.
		int num1, num2, num3;
		// INGRESAMOS LOS VALORES.
		System.out.println("Ingrese primer valor :");
		num1 = teclado.nextInt();
		System.out.println("Ingrese segundo valor :");
		num2 = teclado.nextInt();
		System.out.println("Ingrese tercero valor :");
		num3 = teclado.nextInt();
		// VALIDAMOS.
		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los números es menor a diez");
		}
	}
}
