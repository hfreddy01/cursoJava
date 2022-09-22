package cursoJava.ejerciciosResueltos.poo.clases.string;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         1 - CONFECCIONA UNA CLASE QUE SOLICTE EL INGRESO DE DOS VARIABLES DE
 *         TIPO "STRING" Y LUEGO EMPLEE LOS METODOS MAS COMUNES DE LA CLASE
 *         STRING.
 *
 */

public class Cadena1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES DE TIPO STRING.
		String nombre1;
		String nombre2;
		// INTRODUCIMOS DATOS POR TECLADO.
		System.out.println("Ingrese nombre1");
		nombre1 = teclado.nextLine();
		System.out.println("Ingrese nombre2");
		nombre2 = teclado.nextLine();
		// VALIDAMOS.
		if (nombre2.equals(nombre2) == true) {
			System.out.println("NO son iguales");
		} else {
			System.out.println("son iguales");
		}
		if (nombre1.equalsIgnoreCase(nombre2) == true) {
			System.out.println("son iguales");
		} else {
			System.out.println("NO son iguales");
		}
		if (nombre1.compareTo(nombre2) == 0) {
			System.out.println(nombre1 + " es exactamente igual a " + nombre2);
		} else {
			if (nombre1.compareTo(nombre2) > 0) {
				System.out.println(nombre1 + " es mayor alfabéticamente que " + nombre2);
			} else {
				System.out.println(nombre2 + " es mayor alfabéticamente que " + nombre1);
			}
		}
		// VALIDAMOS.
		char caracter1 = nombre1.charAt(0);
		System.out.println("El primer caracter de " + nombre1 + " es " + caracter1);
		int largo = nombre1.length();
		System.out.println("El largo del String " + nombre1 + " es " + largo);
		String caracter3 = nombre1.substring(0, 3);
		System.out.println("Los primeros tres caracteres de " + nombre1 + " son " + caracter3);
		int posicion = nombre1.indexOf(nombre2);
		// VALIDAMOS.
		if (posicion == -1) {
			System.out.println(nombre2 + " no está contenido en " + nombre1);
		} else {
			System.out.println(nombre2 + " está contenido en " + nombre1 + " a partir de la posición " + posicion);
		}
		// IMPRIMIMOS.
		System.out.println(nombre1 + " convertido a mayúsculas es " + nombre1.toUpperCase());
		System.out.println(nombre1 + " convertido a minúsculas es " + nombre1.toLowerCase());
	}
}
