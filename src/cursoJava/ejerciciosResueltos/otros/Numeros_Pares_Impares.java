package cursoJava.ejerciciosResueltos.otros;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS BUCLE WHILE UTILIZANDO CONDICONALES COMPUESTA Y OPERADORES
 *         LOGICOS :
 * 
 *         DESARROLLAR UN PROGRAMA QUE PERMITA CARGAR N NUMEROS ENTEROS Y LUEGO
 *         NOS INFORME CUANTOS VALORES FUERON PARES Y CUANTOS VALORES FUERON
 *         IMPARES. EMPLEAR EL OPERADOR % EN LA CONDICION DE LA ESTRUCTURA
 *         CONDICIONAL EJEMPLO : if (valor%2==0) Si el if da verdadero luego es
 *         par.
 *
 */

public class Numeros_Pares_Impares {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		int x = 1;
		int pares = 0;
		int impares = 0;
		int valores;
		int num;
		// INGRESAMOS LA CANTIDAD DE NUMEROS A VALIDAR.
		System.out.println("¿Cuantos numeros ingresara : ? ");
		num = teclado.nextInt();
		// VALIDAMOS
		while (x <= num) {
			System.out.println("Ingrese Valores : ");
			valores = teclado.nextInt();
			// VALIDAMOS
			if (valores % 2 == 0) {
				pares = pares + 1;
			} else {
				impares = impares + 1;
			}
			// INCREMENTAMOS.
			x++;
		}
		// IMPRIMIMOS.
		System.out.println("Cantadad de pares : " + pares);
		System.out.println("Cantadad de impares : " + impares);
	}
}
