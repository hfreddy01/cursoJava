package cursoJava.ejerciciosResueltos.bucles.ForEach;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         CREAR UNA MATRIZ DE N * M FILAS (CARGAR N Y M POR TECLADO) IMPRIMIR
 *         LA MATRIZ COMPLETA UTILIZANDO LA ESTRUCTURA FOR-EACH PARA RECORRER
 *         COLECCIONES.
 * 
 *
 */

public class EjerciciosForEach4 {
	// ATRIBUTOS DE LA CLASE.
	private Scanner teclado;
	private int matriz[][];

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosForEach4.
		EjerciciosForEach4 matriz = new EjerciciosForEach4();
		matriz.imprimirMatriz();
	}

	// METODO CONSTRUCTOR DE LA CLASE.
	public EjerciciosForEach4() {
		// CREAMOS EL OBJETO SCANNER.
		teclado = new Scanner(System.in);
		// INGRESAMOS FILAS
		System.out.println("Cuantas filas tiene la matriz :");
		int filas = teclado.nextInt();
		// INGRESAMOS COLUNNAS.
		System.out.println("Cuantas colunnas tiene la matriz :");
		int colunnas = teclado.nextInt();
		// CREAMOS EL OBJETO DE LA MATRIZ.
		matriz = new int[filas][colunnas];
		// VALIDAMOS.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Ingrese componentes : ");
				matriz[i][j] = teclado.nextInt();
			}
		}
	}

	// METODO QUE PERMITE IMPRIMIR LA MATRIZ.
	public void imprimirMatriz() {
		// VALIDAMOS.
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.println(elemento + " ");
				System.out.println();
			}
		}
	}
}
