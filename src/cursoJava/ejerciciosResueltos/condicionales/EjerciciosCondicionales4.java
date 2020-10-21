package cursoJava.ejerciciosResueltos.condicionales;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 4 - SE INGRESAN TRES NOTAS DE UN ALUNNO, SI EL PROMEDIO ES MAYOR O IGUAL A SIETE MOSTRAR UN MENSAJE "Promocionado"
 *
 */

public class EjerciciosCondicionales4 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// CREAMOS VARIABLES NOTAS.
		int nota1, nota2, nota3, promedio;
		
		// INGRESAMOS LAS NOTAS POR TECLADO.
		System.out.println("Ingrse primera nota :");
		nota1 = teclado.nextInt();
		
		System.out.println("Ingrse segunda nota :");
		nota2 = teclado.nextInt();
		
		System.out.println("Ingrse tercera nota :");
		nota3 = teclado.nextInt();
		
		// VALIDAMOS EL PROMEDIO.
		promedio = (nota1 + nota2 + nota3)/3;
		// VALIDAMOS.
		if(promedio >= 7) {
			System.out.println("Promocionado...");
		}
		
	}

}
