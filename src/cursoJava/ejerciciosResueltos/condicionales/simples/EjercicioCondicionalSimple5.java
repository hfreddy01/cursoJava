package cursoJava.ejerciciosResueltos.condicionales.simples;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CONDICONALES SIMPLES UTILIZANDO OPERADORES LOGICOS :
 * 
 *         SE INGRESAN TRES VALORES POR TECLADO, SI TODOS SON IGUALES SE IMPRIME
 *         LA SUMA DEL PRIMERO CON EL SEGUNDO Y A ESTE RESULTADO SE LO
 *         MULTIPLICA POR EL TERCERO.
 *
 * 
 */
public class EjercicioCondicionalSimple5 {

	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA EL INGRESO POR TECLADO DE LOS VALORES.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES A UTILIZAR.
		int num1, num2, num3;
		int suma, producto;
		// INGRESAMOS LOS NUMEROS POR TECLADO.
		System.out.println("Ingrese primer valor : ");
		num1 = teclado.nextInt();
		System.out.println("Ingrese segundo valor : ");
		num2 = teclado.nextInt();
		System.out.println("Ingrese tercer valor : ");
		num3 = teclado.nextInt();
		// VALIDAMOS.
		if (num1 == num2 && num1 == num3) {
			suma = num1 + num2;
			System.out.println("La suma de los dos primeros numero es : " + suma);
			producto = suma * num3;
			System.out.println("La suma del primer y segundo numero, multiplicado por el tercero : " + producto);
		}
	}
}
