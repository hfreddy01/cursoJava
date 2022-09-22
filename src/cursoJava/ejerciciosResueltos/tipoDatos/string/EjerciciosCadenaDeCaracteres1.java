package cursoJava.ejerciciosResueltos.tipoDatos.string;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CADENA DE CARACTERES :
 * 
 *         SOLICITAR EL INGRESO DEL NOMBRE Y EDAD DE DOS PERSONAS. MOSTRAR EL
 *         NOMBRE DE LA PERSONA CON MAYOR EDAD.
 * 
 *
 */

public class EjerciciosCadenaDeCaracteres1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
	 // CREAMOS EL OBJETO DE LA CLASE SCANNER PARA LA ENTRADA DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		String nombre1, nombre2;
		int edad1, edad2;
		// INGRESAMOS DATOS POR TECLADO.
		System.out.println("Ingrese nombre : ");
		nombre1 = teclado.next();
		System.out.println("Ingrese edad : ");
		edad1 = teclado.nextInt();
		System.out.println("Ingrese nombre : ");
		nombre2 = teclado.next();
		System.out.println("Ingrese edad : ");
		edad2 = teclado.nextInt();
		// VALIDAMOS.
		if(edad1 > edad2) {
			System.out.println("La persona con mayor edad es : "+nombre1 +" con " +edad1 +" años");
		} else {
			System.out.println("La persona con mayor edad es : "+nombre2 +" con " +edad2 +" años");
		}
	}
}
