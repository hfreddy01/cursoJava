package cursoJava.ejerciciosResueltos.tipoDatos.string;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO CADENAS DE CARACTERES :
 * 
 *         SOLICITAR EL INGRESO DEL APELLIDO, NOMBRE Y EDAD DE DOS PERSONAS.
 *         MOSTRAR EL NOMBRE DE LA PERSONA CON MAYOR EDAD. REALIZAR LA CARGA DEL
 *         APELLIDO Y NOMBRE EN UNA VARIABLE DE TIPO STRING.
 *
 */

public class EjerciciosCadenaDeCaracteres2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] ar) {
		// CREAMOS OBJETO SCANNER
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES
		String apenom1, apenom2;
		int edad1, edad2;
		// INGRESAAMOS DATOS POR TECLADO.
		System.out.print("Ingrese el apellido y el nombre:");
		apenom1 = teclado.nextLine();
		System.out.print("Ingrese edad:");
		edad1 = teclado.nextInt();
		System.out.print("Ingrese el apellido y el nombre:");
		teclado.nextLine();
		apenom2 = teclado.nextLine();
		System.out.print("Ingrese edad:");
		edad2 = teclado.nextInt();
		System.out.print("La persona de mayor edad es:");
		// VALIDAMOS
		if (edad1 > edad2) {
			System.out.print(apenom1);
		} else {
			System.out.print(apenom2);
		}
	}
}
