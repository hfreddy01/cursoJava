package cursoJava.ejerciciosResueltos.condicionales.aninadas;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CONDICONALES ANIDADAS :
 * 
 *         2 - SE CARGAN POR TECLADO TRES NUMEROS DISTINTOS, MOSTRAR POR
 *         PANTALLA EL MAYOR DE ELLOS.
 *
 */

public class EjerciciosCondicionalAnidada2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA INGRESAR NUMEROS POR TECLADO
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LOS NUMEROS.
		int num1;
		int num2;
		int num3;
		// INGRESAMOS LOS NUMEROS POR CONSOLA.
		System.out.println("Ingrese primer numero :");
		num1 = teclado.nextInt();
		System.out.println("Ingrese segundo numero :");
		num2 = teclado.nextInt();
		System.out.println("Ingrese tercer numero :");
		num3 = teclado.nextInt();

		// VALIDAMOS CUAL DE LOS TRES NUMEROS INGRESADOS ES MAYOR.
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El numero mayor es : " + num1);
			} else {
				System.out.println("El numero mayor es : " + num3);
			}
		} else {
			if (num2 > num3) {
				System.out.println("El numero mayor es : " + num2);
			} else {
				System.out.println("El numero mayor es : " + num3);
			}
		}
	}
}