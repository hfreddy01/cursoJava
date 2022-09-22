package cursoJava.ejerciciosResueltos.tipoDatos.string;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CADENAS DE CARACTERES :
 * 
 *         SOLICITAR EL INGRESO DE DOS APELLIDOS. MOSTRAR UN MENSAJE SI SON
 *         IGUALES O DISTINTOS.
 * 
 *
 */

public class EjerciciosCadenaDeCaracteres3 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA EL INGRESO DE DATOS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LAS VARIABLES.
		String apellido1, apellido2;
		// CARGAMOS DATOS POR TECLADO.
		System.out.print("Ingrese primer apellido:");
		apellido1 = teclado.next();
		System.out.print("Ingrese segundo apellido:");
		apellido2 = teclado.next();
		// VALIDAMOS
		if (apellido1.equals(apellido2)) {
			System.out.print("Los apellidos son iguales");
		} else {
			System.out.print("Los apellidos son distintos");
		}
	}
}
