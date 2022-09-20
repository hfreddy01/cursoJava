package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava 
 * 
 *         EJERCICIOS BUCLE FOR CON CONDICONALES COMPUESTAS ANIDADAS
 *         CON OPERADORES LOGICOS :
 * 
 *         ESCRIBIR UN PROGRAMA QUE PIDA INGRESAR COORDENADAS (X,Y) QUE
 *         REPRESENTAN PUNTO EN EL PLANO INFORMAR CUANTOS PUNTOS SE HAN
 *         INGRESADO EM EL PRIMER, SEGUNDO, TERCER Y CUARTO CUADRANTE. AL
 *         COMENZAR EL PROGRAMA SE PIDE QUE SE INGRESE LA CANTIDAD DE PUNTOS A
 *         CESAR.
 */

public class CoordenadasPuntoPlano {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER PARA EL INGRESO DE DATOS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VAERIABLES.
		int punto;
		int cantidad1, cantidad2, cantidad3, cantidad4;
		int x, y;
		// INICIALIZAMOS LAS VARIABLES.
		cantidad1 = 0;
		cantidad2 = 0;
		cantidad3 = 0;
		cantidad4 = 0;
		// INGRESAMOS LA CANTIDAD DE PUNTOS A PROCESAR.
		System.out.println("Ingrese cantidad de puntos a procesar :");
		punto = teclado.nextInt();
		// VALIDAMOS.
		for (int i = 0; i < punto; i++) {
			System.out.println("Ingrese Coordenada X : ");
			x = teclado.nextInt();
			System.out.println("Ingrese Coordenada Y: ");
			y = teclado.nextInt();
			// VALIDAMOS.
			if (x > 0 && y > 0) {
				cantidad1++;
			} else {
				if (x < 0 && y > 0) {
					cantidad2++;
				} else {
					if (x < 0 && y < 0) {
						cantidad3++;
					} else {
						if (x > 0 && y < 0) {
							cantidad4++;
						}
					}
				}
			}
		}
		// IMPRIMIMOS.
		System.out.println("Cantidad de puntos en el primer cuadrante : " + cantidad1);
		System.out.println("Cantidad de puntos en el segundo cuadrante : " + cantidad2);
		System.out.println("Cantidad de puntos en el tercer cuadrante : " + cantidad3);
		System.out.println("Cantidad de puntos en el cuarto cuadrante : " + cantidad4);
	}
}
