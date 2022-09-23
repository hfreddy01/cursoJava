package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO BUCLE FOR UTILIZANDO CONDICONALES COMPUESTAS ANIDADAS :
 * 
 *         REALIZAR UN PROGRAMA QUE LEA LOS LADOS DE N TRIANGULOS , E INFORMAR :
 *         A) DE CADA UNO DE ELLOS, QUE TIPO DE TRIANGULO ES : EQUILATERO("TRES
 *         LADOS IGUALES"), ISOCELES("DOS LADOS IGUALES"), ESCALENO("NINGUN LADO
 *         IGUAL"), B) CANTIDAD DE TRIANGULOS DE CADA TIPO, C) TIPO DE TRIANGULO
 *         QUE POSEE MENOR CANTIDAD.
 *
 */

public class LeerLadoTriangulo {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE DATOS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREANOS VARIABLES.
		int triangulo;
		int lado1, lado2, lado3;
		int cantidad1 = 0;
		int cantidad2 = 0;
		int cantidad3 = 0;
		// INGRESAMOS LA CANTIDAD DE TRIANGULO A VALIDAR,
		System.out.println("Ingrese cantidad de Trinagulos : ");
		triangulo = teclado.nextInt();
		// VALIDAMOS.
		for (int i = 0; i <= triangulo; i++) {
			System.out.println("Ingrese lado 1 : ");
			lado1 = teclado.nextInt();
			System.out.println("Ingrese lado 2 : ");
			lado2 = teclado.nextInt();
			System.out.println("Ingrese lado 3 : ");
			lado3 = teclado.nextInt();
			// VALIDAMOS.
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("El triangulo es equilatero...");
				cantidad1++;
			} else {
				if (lado1 == lado2 && lado2 == lado3) {
					System.out.println("Es un triángulo isósceles....");
					cantidad2++;
				} else {
					cantidad3++;
					System.out.println("Es un triángulo escaleno.");
				}
			}
		}
		// VALIDAMOS.
		if (cantidad1 < cantidad2 && cantidad1 < cantidad3) {
			System.out.print("Hay menor cantidad de triángulos equilateros.");
		} else {
			if (cantidad2 < cantidad3) {
				System.out.print("Hay menor cantidad de triángulos isósceles");
			} else {
				System.out.print("Hay menor cantidad de triángulos escalenos");
			}
		}
	}
}
