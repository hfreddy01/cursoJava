package cursoJava.ejerciciosResueltos.bucles.DoWhile;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS BUCLE DO WHILE UTILIZANDO CONDICIONALES COMPUESRAS ANIDADAS :
 * 
 *         1 - ESCRIBIR UN PROGRAMA QUE SOLICTE LA CARGA DE UN NUMERO ENTRE 0 Y
 *         999, Y NOS MUESTRE UN MENSAJE DE CUANTOS DIGITOS TIENE EL MISMO.
 *         FINALIZAR EL PROGRAMA CUANDO SE CARGUE EL VALOR 0
 *
 */

public class EjerciciosDoWhile1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		int num;
		// VALIDAMOS.
		do {
			// INTRODUCIMOS DATOS POR TECLADO.
			System.out.println("Ingrese un valor entre 0 y 999 (0 finaliza):");
			num = teclado.nextInt();
			// VALIDAMOS.
			if (num >= 100) {
				System.out.println("Tiene tres digito");
			} else {
				if (num >= 10) {
					System.out.println("Tiene dos digito");
				} else {
					System.out.println("Tiene un digito");
				}
			}
		} while (num != 0);
	}
}
