package cursoJava.ejerciciosResueltos.bucles.While;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 		   EJERCICIO BUCLE WHILE :
 * 
 *         2 - ESCRIBIR UN PROGRAMA QUE SOLICITE LA CARGA DE UN VALOR POSITIVO Y
 *         NOS MUESTRE DESDE 1 HASTA EL VALOR INGRESADO DE UNO EN UNO, EJEMPLO
 *         SI INGRESAMOS 30 SE DEBE MOSTRAR EN PANTALLA LOS NUMEROS 1 AL 30.
 *
 */

public class EjerciciosBucleWhile2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLE.
		int n, x;
		x = 1;
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		// IMGRESAMOS VALORES POR TECLADO.
		System.out.println("Ingrese numero");
		n = teclado.nextInt();
		// VALIDAMOS
		while (x <= n) {
			System.out.println(x);
			// INCREMENTAMOS X
			x = x + 1;
		}
	}
}
