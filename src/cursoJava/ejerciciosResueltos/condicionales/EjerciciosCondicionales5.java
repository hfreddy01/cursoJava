package cursoJava.ejerciciosResueltos.condicionales;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 5 - SE INGRESA POR TECLADO UN NUMERO POSOTIVO DE UNO O DOS DIGITOS(1..99) MOSTRAR UN MENSAJE INDICANDO SI EL NUMERO
       TIENE UNO O DOS DIGITOS (TENER EN CUENTA QUE CONDICION DEBE CUMPLIRSE PARA TENER DOS DIGITOS. 
       "UN NUMERO ENTERO")
 *
 */
public class EjerciciosCondicionales5 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// CREAMOS VARIABLE.
		int num;
		
		// INGRESAMOS DATOS POR TECLADO.
		System.out.println("Ingrese un numero entero entre 1 o dos digitos");
		num = teclado.nextInt();
		
		// VALIDAMOS.
		if(num < 10) {
			System.out.println("Tiene un digito");
		} else {
			System.out.println("Tiene dos digito");
		}

	}

}
