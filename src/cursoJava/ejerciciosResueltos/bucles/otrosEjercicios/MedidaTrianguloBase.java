package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO DE BUCLE FOR UTILIZANDO CONDICONALES COMPUESTAS SIMPLES :
 * 
 *         CONFECCIONAR UN PROGRAMA QUE LEA N PARES DE DATOS. CADA PAR DE DATOS
 *         CORRESPONDE A LA MEDIDA DE LA BASE Y LA ALTURA DE UN TRIANGULO. EL
 *         PROGRAMA DEBERA INFORMAR : A) DE CADA TRIANGULO LA MEDIDA DE SU BASE,
 *         SU ALTURA Y SU SUPERFICIE. B) LA CANTIDAD DE TRIANGULOS CUYA
 *         SUPERFICIE ES MAYOR A 12.
 *
 */

public class MedidaTrianguloBase {

	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] args) {
		// CRRAMOS OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE DATOS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		int triangulo, superficie, altura, base;
		int cantidad = 0;
		// INGRESAMOS LA CANTIDAD DE TRIANGULOS A PROCESAR.
		System.out.print("Cuantos triangulos procesara : ");
		triangulo = teclado.nextInt();
		// VALIDAMOS.
		for (int i = 0; i < triangulo; i++) {
			System.out.print("Ingrese el valor de la base : ");
			base = teclado.nextInt();
			System.out.print("Ingrese el valor de la altura : ");
			altura = teclado.nextInt();
			// VALIDAMOS.
			superficie = base * altura / 2;
			System.out.println("La superficie es : " + superficie);
			// VALIDAMOS
			if (superficie > 12) {
				cantidad = cantidad + 1;
			}
		}
		// IMPRIMIMOS.
		System.out.print("La cantidad de triángulos con superficie superior a 12 son : " + cantidad);
	}
}
