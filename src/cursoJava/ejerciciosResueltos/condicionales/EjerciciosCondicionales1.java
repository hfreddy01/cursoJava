package cursoJava.ejerciciosResueltos.condicionales;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *  1 - INGRESAR EL SUELDO DE UNA PERSONA, SI SUPERA LOS 3000 PESOS, DEBE MOSTRAR UN MENSAJE EN PANTALLA INDICANDO QUE 
        DEBE ABONAR IMPUESTOS.
 *
 */

public class EjerciciosCondicionales1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETOM SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		// CREAMOS VARIABLE SUELDO.
		float sueldo;
		
		System.out.println("Ingrese sueldo de empleado");
		sueldo = teclado.nextFloat();
		
		// VAIDAMOS.
		if(sueldo > 3000) {
			System.out.println("Debe abonar impuestos...");
		}
		

	}



}
