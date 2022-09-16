package cursoJava.ejerciciosResueltos.condicionales.simples;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 	EJERCICIOS CONDICONALES SIMPLES :
 * 
 *  4 - SE INGRESAN TRES NOTAS DE UN ALUNNO, SI EL PROMEDIO ES MAYOR O IGUAL A SIETE (7) MOSTRAR UN MENSAJE "Promocionado...".
 *
 */

public class EjercicioCondicionalSimple2 {
	
	// METOD PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA INGRESAR LAS NOTAS POR CONSOLA.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LAS NOTAS DEL ALUMNO
		int nota1;
		int nota2;
		int nota3;
		// INGRESAMOS LAS NOTAS DE UN ALUMNO POR CONSOLA.
		System.out.println("Ingrese primera nota : ");
		nota1 = teclado.nextInt();
		System.out.println("Ingrese primera nota : ");
		nota2 = teclado.nextInt();
		System.out.println("Ingrese primera nota : ");
		nota3 = teclado.nextInt();
		
		// VALIDAMOS SI EL ALUMNO ESTA PROMOCIONADO.
		int promedio = (nota1 + nota2 + nota3) /3;
		if(promedio > 7) {
			System.out.println("Promocionado....");
		}
	}
}
