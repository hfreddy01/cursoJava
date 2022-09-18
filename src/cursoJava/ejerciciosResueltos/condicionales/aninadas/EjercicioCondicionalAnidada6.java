package cursoJava.ejerciciosResueltos.condicionales.aninadas;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE CONDICIONALES COMPUESTAS CON OPERADORES LOGICOS :
 * 
 *         CONFECCIONAR UN PROGRAMA QUE LEA POR TECLADO TRES NUMEROS DISTINTOS Y
 *         NOS MUESTRE EL MAYOR.
 *
 */

public class EjercicioCondicionalAnidada6 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA EL INGRESO DE LOS VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LOS NUMEROS A INGRESAR POR TECLADO.
		int num1, num2, num3;
		// INGRESAMOS LOS VALORES.
		System.out.println("Ingrese primer valor :");
		num1 = teclado.nextInt();
		System.out.println("Ingrese segundo valor :");
		num2 = teclado.nextInt();
		System.out.println("Ingrese tercer valor :");
		num3 = teclado.nextInt();
		// VALDAMOS CUAL DE LOS VALORES ES EL MAYOR.
		if (num1 > num2 && num1 > num3) {
			System.out.println("El numero mayor es : " + num1);
		} else {
			if (num2 > num3) {
				System.out.println("El numero mayor es : " + num2);
			} else {
				System.out.println("El numero mayor es : " + num3);
			}
		}
	}
}
