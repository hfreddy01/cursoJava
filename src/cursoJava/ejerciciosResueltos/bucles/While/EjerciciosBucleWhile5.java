package cursoJava.ejerciciosResueltos.bucles.While;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE BUCLE WHILE UTILIZANDO CONDICONAL SIMPLE Y OPERADRES LOGICO :
 * 
 *         UNA PLANTA QUE FABRICA PERFILES DE BIERRO POSEE UN LOTE DE N PIEZAS.
 *         CONFECCIONAR UN PROGRAMA QUE PIDA INGRESAR POR TECLADO LA CANTIDAD DE
 *         PIEZAS Y LUEGO INGRESE LA LONGITUD DE CADA PERFIL, SABIENDO QUE LA
 *         PIEZA CUYA LONGITUD ESTE COMPRENDIDA EN EL RANGO DE 1,20 Y 1,30 SON
 *         APTAS. IMPRIMIR POR PANTALLA LA CANTIDAD DE PIEZAS APTAS QUE HAY EN
 *         EL LOTE.
 *
 */

public class EjerciciosBucleWhile5 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO SCANNER PARA LA ENTRADA DE DATOS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		int n;
		float largo;
		int cantidad = 0;
		int x = 1;
		// INGRESAMOS VALORES POR TECLADO.
		System.out.print("¿Cuantas piezas desea procesar? : ");
		n = teclado.nextInt();
		// VALIDAMOS :
		while (x <= n) {
			System.out.print("Ingrese la medida de la pieza : ");
			largo = teclado.nextFloat();
			// VALIDAMOS :
			if (largo >= 1.20 && largo <= 1.30) {
				cantidad = cantidad + 1;
			}
			x = x + 1;
		}
		// IMPRIMIMOS.
		System.out.println("Cantidad de piezas aptas : " + cantidad);
	}
}
