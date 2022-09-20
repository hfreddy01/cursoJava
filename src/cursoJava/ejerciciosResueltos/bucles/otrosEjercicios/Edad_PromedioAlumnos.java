package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS BUCLE FOR UTILIZANDO CONDICONALES COMPUESTAS ANIDADAS Y
 *         OPERADORES LOGICOS :
 * 
 *         SE CUENTA CON LA SIGUIENTE INFORMACION : LAS EDADES DE 5 ESTUDIANTES
 *         DEL TURNO MAÑANA. LAS EDADES DE 6 ESTUDIANTES DEL TURNO TARDE. LAS
 *         EDADES DE 8 ESTUDIANTES DEL TURNO NOCHE. LAS EDADES DE CADA
 *         ESTUDIANTE DEBEN INGRESARSE POR TECLADO. A) OBTENER EL PROMEDIO DE
 *         LAS EDADES DE CADA TURNO (TRES PROMEDIO) B) IMPRIMIR DICHOS PROMEDIOS
 *         (PROMEDIO DE CADA TURNO) C) MOSTRAR POR PANTALLA UN MENSAJE QUE
 *         INDIQUE CUAL DE LOS TRES TURNOS TIENE UN PROMEDIO DE EDADES MENOR.
 *
 */

public class Edad_PromedioAlumnos {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER PARA EL INGRESO DE DATOS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// INGRESAMOS VARIABLES.
		int edad;
		int promedio1, promedio2, promedio3;
		int suma1 = 0;
		int suma2 = 0;
		int suma3 = 0;
		// VALIDAMOS.
		for (int i = 0; i <= 5; i++) {
			System.out.println("Ingrese edad : ");
			edad = teclado.nextInt();
		}
		// VALIDAMOS.
		promedio1 = suma1 / 5;
		// IMPRIMIMOS.
		System.out.println("Promedio de edades del turno mañana : " + promedio1);
		// VALIDAMOS.
		for (int i = 0; i <= 6; i++) {
			System.out.println("Ingrese edad : ");
			edad = teclado.nextInt();
			suma2 = suma2 + edad;
		}
		// VALIDAMOS.
		promedio2 = suma2 / 6;
		System.out.println("Promedio de edades del turno tarde : " + promedio2);
		// VALIDAMOS.
		for (int i = 0; i <= 8; i++) {
			System.out.println("Ingrese edad :");
			edad = teclado.nextInt();
			suma3 = suma3 + edad;
		}
		// VALIDAMOS.
		promedio3 = suma3 / 8;
		System.out.println("Promedio de edades del turno noche : " + promedio3);
		// VALIDAMOS.
		if (promedio1 < promedio2 && promedio1 < promedio3) {
			System.out.println("El turno mañana tiene un promedio menor de edades.");
		} else {
			if (promedio2 < promedio3) {
				System.out.println("El turno tarde tiene un promedio menor de edades.");
			} else {
				System.out.println("El turno noche tiene un promedio menor de edades.");
			}
		}
	}
}
