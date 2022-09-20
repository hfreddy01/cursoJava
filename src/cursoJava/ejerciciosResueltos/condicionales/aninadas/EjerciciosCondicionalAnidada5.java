package cursoJava.ejerciciosResueltos.condicionales.aninadas;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         5 - UN POSTULANTE A UN EMPLEO, REALIZA UN TEST DE CAPACITACION, SE
 *         OBTUVO LA SIGUIENTE INFORMACION: CANTIDAD TOTAL DE PREGUNTAS QUE SE
 *         REALIZARON Y LA CANTIDAD DE PREGUNTAS QUE CONTESTO CORRECTAMENTE. SE
 *         PIDE CONFECCIONAR UN PROGRAMA QUE INGRESE LOS DOS DATOS POR TECLADO E
 *         INFORMAR EL NIVEL DEL MISMO SEGUN EL PORCENTAJE DE RESPUESTAS
 *         CORRECTAS QUE SE HA OBTENIDO SABIENDO QUE: NIVEL MAXIMO
 *         Porcentaje>=90% NIVEL MEDIO Porcentaje>=75% y <90% NIVEL REGULAR
 *         Porcentaje>=50% y <75% FUERA DE NIVEL Porcentaje<50%
 *
 */

public class EjerciciosCondicionalAnidada5 {
	public static void main(String[] ar) {
		// CREAMOS OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE DATOSS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		int totalPreguntas, totalCorrectas;
		System.out.print("Ingrese la cantidad total de preguntas del examen :");
		totalPreguntas = teclado.nextInt();
		System.out.print("Ingrese la cantidad total de preguntas contestadas correctamente :");
		totalCorrectas = teclado.nextInt();
		// VALIDAMOS
		int porcentaje = totalCorrectas * 100 / totalPreguntas;
		// VALIDAMOS
		if (porcentaje >= 90) {
			System.out.print("Nivel máximo");
		} else {
			if (porcentaje >= 75) {
				System.out.print("Nivel medio");
			} else {
				if (porcentaje >= 50) {
					System.out.print("Nivel regular");
				} else {
					System.out.print("Fuera de nivel");
				}
			}
		}
	}
}
