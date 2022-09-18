package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS BUCLE WHILE CON CONDICONALES COMPUESTA Y OPERADORES
 *         LOGICOS :
 * 
 *         ESCRIBIR UN PROGRAMA QUE SOLICITE INGRESAR 5 NOTAS DE ALUMNOS Y NOS
 *         INFORME CUANTOS TIENEN NOTAS MAYORES O IGUALES A 7 Y CUANTOS MENORES
 *
 */

public class NotasAlumnosMayorMenores {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER PARA LA ENTADA DE DATOS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES A UTILIZAR.
		int x = 1;
		int notas;
		int mayor = 0;
		int menor = 0;
		// INGRESAMOS NOTAS.
		while (x <= 5) {
			System.out.print("Ingrese notas : ");
			notas = teclado.nextInt();
			// VALIDAMOS.
			if (notas >= 7) {
				mayor++;
			} else {
				menor++;
			}
			x++;
		}
		// IMPRIMIMOS :
		System.out.println("La cantidad de alumnos con notas mayores o iguales  7 son : " + mayor);
		System.out.println("La cantidad de alumnos con notas menores o iguales  7 son : " + menor);
	}
}
