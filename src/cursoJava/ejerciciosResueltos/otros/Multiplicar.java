package cursoJava.ejerciciosResueltos.otros;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO BUCLE FOR :
 * 
 *         CONFECCIONAR UN PROGRAMA QUE PERMITA INGRESAR UN VALOR DEL 1 AL 10 Y
 *         NOS MUESTRE LA TABLA DE MULTIPLICAR DEL MISMO (LOS PRIMEROS 12
 *         TERMINOS) EJEMPLO : SI INGRESO 3 DEBERA APARECER EN PANTALLA LOS
 *         VALORES 3,6,9 HASTA EL 36.
 *
 */

public class Multiplicar {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLE.
		int num;
		// INGRESAMOS VALORES.
		System.out.println("Ingresamos valores entre 1 y 10 : ");
		num = teclado.nextInt();
		// VALIDAMOS.
		for (int i = num; i <= num * 12; i = i + num) {
			System.out.println(i);
			System.out.println("-");
		}
	}
}
