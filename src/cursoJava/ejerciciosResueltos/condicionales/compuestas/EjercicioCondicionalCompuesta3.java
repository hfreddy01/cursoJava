package cursoJava.ejerciciosResueltos.condicionales.compuestas;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CONDICIONALES COMPUESTAS :
 * 
 *         5 - SE INGRESA POR TECLADO UN NUMERO POSOTIVO DE UNO O DOS
 *         DIGITOS(1..99) MOSTRAR UN MENSAJE INDICANDO SI EL NUMERO TIENE UNO O
 *         DOS DIGITOS (TENER EN CUENTA QUE CONDICION DEBE CUMPLIRSE PARA TENER
 *         DOS DIGITOS. "UN NUMERO ENTERO")
 *
 */

public class EjercicioCondicionalCompuesta3 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main() {
		// CREAMOS OBJETO SCANNER PARA EL INGRESO DEL DIGITO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS EL DIGITO A INGRESAR.
		int digito;
		// INGRESAMOS EL DIGITO POR TECLADO.
		System.out.println("Ingrese un valor entero de 1 o 2 dígitos : ");
		digito = teclado.nextInt();
		// VALIDAMOS SI EL NUMERO INGRESADO TIENE UNO O DOS DIGITOS.
		if (digito < 10) {
			System.out.println("El numero ingresado tiene un digito");
		} else {
			System.out.println("El numero ingresado tiene dos digito");
		}
	}
}
