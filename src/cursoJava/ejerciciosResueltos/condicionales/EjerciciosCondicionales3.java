package cursoJava.ejerciciosResueltos.condicionales;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 3 - REALIZAR UN PROGRAMA QUE LEA POR TECLADO DOS NUMEROS, SI EL NUMERO PRIMERO ES MAYOR AL SEGUNDO INFORMAR SU SUMA 
       Y SU RESTA EN CASO CONTRARIO INFORMAR EL PRODUCTO Y LA DIVISION DEL PRIMERO RESPECTO AL SEGUNDO.
 *
 */
public class EjerciciosCondicionales3 {

	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// CREAMOS VARIABLES
		int num1;
		int num2;
		int suma, resta, producto, division;
		
		// INGRESAMOS DATOS POR TECLADO.
		System.out.println("Ingrse primer numero");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrse segundo numero");
		num2 = teclado.nextInt();
		
		// VALIDAMOS.
		if(num1 > num2) {
			suma = num1 +  num2;
			resta = num1 - num2;
			System.out.println("La suma de los numeros es : " +suma);
			System.out.println("La resta de los numeros es : " +resta);
		} else {
			producto = num1 * num2;
			division = num1 / num2;
			System.out.println("La multiplicacion de los numeros es : " +producto);
			System.out.println("La division de los numeros es : " +division);
			
		}

	}

}
