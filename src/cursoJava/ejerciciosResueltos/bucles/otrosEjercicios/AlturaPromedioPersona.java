package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS BUCLE WHILE :
 * 
 *         SE INGRESAN UN COJUNTO DE N ALTURAS DE PERSONAS POR TECLADO. MOSTRAR
 *         LA ALTURA PROMEDIO DE LAS PERSONAS.
 * 
 *
 */

public class AlturaPromedioPersona {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA LA EMTRADA DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		int x, personas;
		float altura, suma, promedio;
		// INGRESAMOS CANTIDAD DE PERSONAS :
		System.out.print("Ingrese cantidad de personas : ");
		personas = teclado.nextInt();
		// INICIALIZAMOS VARIABLES.
		x = 1;
		suma = 0;
		// VALIDAMOS.
		while (x <= personas) {
			System.out.println("Ingrese Altura");
			altura = teclado.nextFloat();
			suma++;
			x++;
		}
		// VALIDAMOS
		promedio = suma / personas;
		// IMPRIMIMOS.
		System.out.println("Altura promedio : " + promedio);
	}
}
