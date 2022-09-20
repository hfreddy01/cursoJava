package cursoJava.ejerciciosResueltos.bucles.DoWhile;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 		   EJERCICIOS BUCLE DO WILE UTILIZANDO CONDICONALES COMPUESTAS CON OPERADORES LOGICOS :
 * 
 *         2 - ESCRIBIR UN PROGRAMA QUE SOLICTE LA CARGA DE NUMEROS POR TECLADO,
 *         OBTENER SU PROMEDIO. FINALIZAR LA CARGA DE VALORES CUANDO SE CARGUE
 *         EL VALOR CERO(O).
 *
 */
public class EjerciciosDoWhile2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		// CREMAOS VARIABLES.
		int num, cantidad, suma, promedio;
		// INICIALIZAMOS VARIABLES.
		cantidad = 0;
		suma = 0;
		// VALIDAMOS
		do {
			// INTRODUCIMOS DATOS POR TECLADO.
			System.out.println("Ingrese un valor (0 para finalizar):");
			num = teclado.nextInt();
			// VALIDAMOS.
			if (num != 0) {
				suma = suma + num;
				cantidad++;
			}
		} while (num != 0);

		// VALIDAMOS.
		if (cantidad != 0) {
			promedio = suma / cantidad;
			// IMPRIMIMOS.
			System.out.println("El promedio de los valores ingresados es : " + promedio);
		} else {
			System.out.println("No se ingresaron valores...");
		}
	}
}
