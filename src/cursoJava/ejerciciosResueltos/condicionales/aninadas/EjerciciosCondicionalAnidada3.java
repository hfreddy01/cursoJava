package cursoJava.ejerciciosResueltos.condicionales.aninadas;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CONDICONALES ANIDADAS :
 * 
 *         3 - SE INGRESAN POR TECLADO UN VALOR ENTERO, MOSTRAR UN MENSAJE QUE
 *         INDIQUE SI EL NUMERO ES POSITIVO, NULO O NEGATIVO.
 *
 */

public class EjerciciosCondicionalAnidada3 {

	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA INGRESAR EL VALOR.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS EL DIGITO A COMPROBAR.
		int num;
		// INGRESAMOS EL VALOR POR TECLADO.
		System.out.println("Ingrese un valor :");
		num = teclado.nextInt();
		// VALIDAMOS.
		if (num == 0) {
			System.out.println("Se ingreso el cero");
		} else {
			if (num > 0) {
				System.out.println("Se ingreso un valor positivo");
			} else {
				System.out.println("Se ingreso un valor negativo");
			}
		}
	}
}