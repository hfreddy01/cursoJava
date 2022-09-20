package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava}
 * 
 *         EJERCICIOS BUCLE DO WHILE :
 * 
 *         EN UN BANCO SE PROCESAN DATOS DE LAS CUENTAS CORRIENTES DE SUS
 *         CLIENTES. CADA CUENTA CORRIENTE SE CONOCE : NUMERO DE CUENTA Y SALDO
 *         ACTUAL. EL INGRESO DE DATOS DEBEE FIBALIZAR AL INGRESAR UN VALOR
 *         NEGATIVO EN EL NUMERO DE CUENTA SE PIDE CONFECCIONAR UN PROGRAMA QUE
 *         LEA LOS DATOS DE LAS CUENTAS CORRIENTES E INFORME : A) DE CADA CUENTA
 *         : NUMERO DE CUENTA Y ESTADO DE LA CUENTA SEGUN SU SALDO SABIENDO QUE
 *         : ESTADO DE LA CUENTA 'ACREADOR' SI EL SUELDO ES MAYOR A CERO(0),
 *         'DEUDOR' SI EL SALDO ES MENOR A CERO(0), 'NULO' SI EL SALDO ES IGUAL
 *         A CERO(0). B) LA SUMA TOTAL DE LOS SALDOS ACREEDORES.
 * 
 *
 */

public class EjerciciosBucle5 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE SCANNER.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		int cuenta;
		float saldo, suma;
		suma = 0;
		// VALIDAMOS
		do {
			System.out.print("Ingrese número de cuenta:");
			cuenta = teclado.nextInt();
			// VALIDAMOS
			if (cuenta >= 0) {
				System.out.print("Ingrese saldo:");
				saldo = teclado.nextFloat();
				if (saldo > 0) {
					System.out.println("Saldo Acreedor.");
					suma = suma + saldo;
				} else {
					if (saldo < 0) {
						System.out.println("Saldo Deudor.");
					} else {
						System.out.println("Saldo Nulo.");
					}
				}
			}
		} while (cuenta >= 0);
		System.out.print("Total de saldos Acreedores:");
		System.out.print(suma);
	}
}
