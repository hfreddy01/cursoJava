package cursoJava.ejerciciosResueltos.condicionales.aninadas;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CONDICONALES ANIDADAS :
 * 
 *         1 - CONFECCIONAR UN PROGRAMA QUE PIDA POR TECLADO TRES NOTAS DE UN
 *         ALUNNO, CALCULE EL PROMEDIO E IMPRIMA ALGUNO DE ESTOS MENSAJES : SI
 *         EL PROMEDIO ES MAYOR O IGUAL A 7 MOSTRAR "PROMOCIONADO", SI EL
 *         PROMEDIO ES MAYOR O IGUAL A 4 Y MENOR QUE 7 MOSTRAR "REGULAR" SI EL
 *         PROMEDIO ES MENOR A 4 MOSTRAR "REPROBADO"
 *
 */

public class EjerciciosCondicionalAnidada1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE SCANNER.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LAS NOTAS DEL ALUNNO.
		int nota1, nota2, nota3;
		// INGRESAMOS LAS NOTAS DEL ALUMNO.
		System.out.println("Ingrese primera nota : ");
		nota1 = teclado.nextInt();
		System.out.println("Ingrese segunda nota : ");
		nota2 = teclado.nextInt();
		System.out.println("Ingrese tercera nota : ");
		nota3 = teclado.nextInt();
		// VALIDAMOS.
		int promedio = (nota1 + nota2 + nota3) / 3;
		if (promedio >= 7) {
			System.out.println("Promocionado");
		} else {
			if (promedio >= 4) {
				System.out.println("Regular");
			} else {
				System.out.println("Reporboado");
			}
		}
	}
}
