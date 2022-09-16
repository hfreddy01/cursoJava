package cursoJava.ejerciciosResueltos.condicionales.simples;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 		   EJERCICIOS CONDICIONALES SIMPLES :
 *         1 INGRESAR EL SUELDO DE UNA PERSONA, SI SUPERA LOS 3000 PESOS, DEBE
 *         MOSTRAR UN MENSAJE EN PANTALLA INDICANDO QUE DEBE ABONAR IMPUESTOS.
 *
 */

public class EjercicioCondicionalSimple1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] ar) {
		// CREAMOS EL OBJETO SCANNER PARA INGRESAR EL SUELDO DE LA PERSONA.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLE SUELDO.
		float suedoPersona;
		// INGRESAMOS EL SUELDO DE LA PERSONA.
		System.out.println("Ingrese sueldo se la persona :");
		suedoPersona = teclado.nextFloat();
		// VALIDAMOS SI LA PERSONA DEBE ABONAR IMPUESTOS.
		if (suedoPersona > 3000) {
			System.out.println("Esta persona debe abonar impuestos...");
		}
	}
}
