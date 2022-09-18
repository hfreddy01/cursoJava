package cursoJava.ejerciciosResueltos.condicionales.ejerciciosOtros;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE CONDICONALES COMPUESTAS ANIDADAS UTILIZANDO OPERADORES
 *         LOGICOS :
 * 
 *         ESCIRBIR UN PROGRAMA QUE PIDA INGRESAR LA COORDENADA DE UN PUNTO EN
 *         EL PLANO, ES DECIR DOS VALORES ENTEROS x i y (DISTINTOS A CERO).
 *         POSTERIORMENTE IMPRIMIR EN PANTALLA EN QUE CUADRANTE SE UBICA DICHO
 *         PUNTO. EJEMPLO : (PRIMER CUADRANTE SI (x > 0) Y (y > 0)) (SEGUNDO
 *         CUADRANTE SI (x < 0) Y (y > 0))
 *
 */

public class CoordenadaPuntoPlano {

	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE SCANNER PARA INGRESAR VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS LAS COORDENADAS A INGRESAR.
		int x;
		int y;
		// INGRESAMOS LAS COORDENADAS.
		System.out.println("Ingrese Coordenada X : ");
		x = teclado.nextInt();
		System.out.println("Ingrese Coordenada Y : ");
		y = teclado.nextInt();
		// VALIDAMOS.
		if (x > 0 && y > 0) {
			System.out.println("El punto se encuentra en el primer cuadrante.");
		} else {
			if (x < 0 && y > 0) {
				System.out.println("El punto se encuentra en el segundo cuadrante.");
			} else {
				if (x < 0 && y < 0) {
					System.out.println("El punto se encuentra en el tercer cuadrante.");
				} else {
					System.out.println("El punto se encuentra en el cuarto cuadrante.");
				}
			}
		}
	}
}
