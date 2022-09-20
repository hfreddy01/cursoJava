package cursoJava.ejerciciosResueltos.condicionales.simples;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO CONDICONALES COMPUESTAS SIMPLES UTILIZANDO OPERADORES
 *         LOGICOS :
 * 
 *         SE CARGA UNA FECHA (DIA, MES Y AÑO) POR TECLADO. MOSTRAR UN MENSAJE
 *         SI CORRESPONDE AL PRIMER TRISMETRE DE AÑO (ENERO, FEBREO MARZO)
 *         CARGAR POR TECLADO EL VALOR NUMERICO DEL DIA, MES Y AÑO. EJEMPLO :
 *         dia:10 mes:1 año:2010
 *
 * 
 */

public class EjercicioCondicionalSimple3 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA INGRSAR DATOS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES CORRESPONDIENTES AL DIA, MES Y AÑO.
		int dia, mes, año;
		// INGRESAMOS DATOS POR TECLADO.
		System.out.println("Ingrese numero de dia");
		dia = teclado.nextInt();
		System.out.println("Ingrese numero de mes");
		mes = teclado.nextInt();
		System.out.println("Ingrese numero de año");
		año = teclado.nextInt();
		// VALIDAMOS.
		if(mes == 1 || mes == 2 || mes == 3) {
			System.out.println("La fecha ingresada corresponde al prmer trismestre");
		}
	}
}
