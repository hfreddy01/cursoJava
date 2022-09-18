package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO BUCLE WHILE CON CONDICONALES COMPUESTAS ANIDADAS Y
 *         OPERADORES LOGICOS :
 * 
 *         REALIZAR UN PROGRAMA QUE PERMITA CARGAR DOS LISTAS DE 5 VALORES CADA
 *         UNA. INFORMAR CON UN MENSAJE CUAL DE LAS DOS LISTAS TIENE UN VALOR
 *         ACUMULADO MAYOR. (MENSAJES "Lista 1 mayor", "Lista 2 mayor", "Listas
 *         iguales") TENER EN CUANTA QUE PUEDE HABER DOS O MAS ESTRUCTURAS
 *         REPETITIVAS EN UN ALGORITMO.
 *
 */

public class ListaValorAcomuladoMayor {
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LAS VARIABLES.
		int valor;
		int listaMayor = 0;
		int listaMenor = 0;
		int x = 1;
		// PRIMERA LISTA :
		System.out.println("Primera lista");
		while (x <= 5) {
			System.out.print("Ingrese Valores : ");
			valor = teclado.nextInt();
			listaMayor = listaMayor + 1;
			x++;
		}
		// SEGUNDA LISTA
		System.out.println("Segunda Lista");
		x = 1;
		while (x <= 5) {
			System.out.print("Ingrese Valores : ");
			listaMenor = teclado.nextInt();
			listaMenor = listaMenor + 1;
			x++;
		}
		// VALIDAMOS :
		if (listaMayor > listaMenor) {
			System.out.println("Primera Lista Mayor");
		} else {
			if (listaMenor > listaMayor) {
				System.out.println("Segunda Lista Mayor");
			} else {
				System.out.println("Listas Iguales");
			}
		}
	}
}
