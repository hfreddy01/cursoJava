package cursoJava.ejerciciosResueltos.condicionales.simples;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIO CONDICONAL SIMPLE UTILIZANDO OPERADORES LOGICOS :
 * 
 *         REALIZAR UN PROGRAMA QUE PIDA UNA FECHA CUALQUIERA, LUEGO VERIFICAR
 *         SI DICHA FECHA CORRESPONDE A NAVIDAD.
 *
 */

public class EjerciciosCondiconalSimple4 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA INTRODUCIR DATOS POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES PARA PERSONIFICAR LAS FECHAS.
		int dia, mes, año;
		// INTRODUCIMOS LA FECHA POR TECLADO.
		System.out.println("Ingrese numero de dia :");
		dia = teclado.nextInt();
		System.out.println("Ingrese numero de mes :");
		mes = teclado.nextInt();
		System.out.println("Ingrese numero de año :");
		año = teclado.nextInt();
		// VALIDAMOS.
		if (mes == 12 && dia == 25) {
			System.out.println("La fecha ingresda pertenece a Navidad");
		}
	}
}
