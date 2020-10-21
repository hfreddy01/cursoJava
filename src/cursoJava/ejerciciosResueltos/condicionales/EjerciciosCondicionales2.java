package cursoJava.ejerciciosResueltos.condicionales;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *  2 - REALIZAR UN PROGRAMA QUE SOLICITE INGRESAR DOS NUMEROS DISTINTOS Y MUESTRE POR PANTALLA EL MAYOR DE ELLOS.
 *
 */

public class EjerciciosCondicionales2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		//  CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// CREAMOS VARIABLES.
		int num1;
		int num2;
		
		// INGRESAMO DATOS POR TECLADO.
		System.out.println("Ingrese primer numero");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese segundo numero");
		num2 = teclado.nextInt();
		
		// VALIDAMOS.
		if(num1 > num2) {
			System.out.println(num1 +" es mayor");
		} else  {
			System.out.println(num2 +" es mayor");
		}

	}

}
