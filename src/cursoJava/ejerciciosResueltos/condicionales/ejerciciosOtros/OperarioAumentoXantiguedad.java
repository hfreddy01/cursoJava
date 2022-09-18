package cursoJava.ejerciciosResueltos.condicionales.ejerciciosOtros;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS CONDICONALES COMPUESTAS ANIDADAS UTILIZANDO OPERARIOS
 *         LOGICOS :
 * 
 *         DE UN OPERARIO SE CONOCE SU SUELDO Y LOS AÑOS DE ANTIGUEDAD. SE PIDE
 *         CONFECCIONAR UN PROGRAMA QUE LEA LOS DATOS DE ENTRADA E INFORME : A)
 *         SI EL SUELDO ES INFERIOR A 500 Y SU ANTIGUEDAD ES IGUAL O SUPERIOR A
 *         10 AÑOS, OTORGARLE UN AUMENTO DE 20%, MOSTRAR EL SUELDO A PAGAR. B)
 *         SI EL SUELDO ES INFERIOR O IGUAL A 500 PERO SU ANTIGUEDAD ES MENOR A
 *         10 AÑOS, OTORGARLE UN AUMENTO DE 5% C) SI EL SUELDO ES MAYOR O IGUAL
 *         A 500 MOSTRAR EL SUELDO EN PANTALLA SIN CAMBIOS.
 * 
 */

public class OperarioAumentoXantiguedad {

	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES.
		float sueldo;
		int antiguedad;
		// INGRESAMOS VALORES POR TECLADO.
		System.out.println("Ingrese sueldo del empleado :");
		sueldo = teclado.nextFloat();
		System.out.println("Ingrese su antiguedad en años : ");
		antiguedad = teclado.nextInt();
		// VALIDAMOS :
		if (sueldo < 500 && antiguedad > 10) {
			float aumento = sueldo * 20.0f;
			float sueldoTotal = sueldo + aumento;
			System.out.println("Sueldo a pagar : " + sueldoTotal);
		} else {
			if (sueldo < 500) {
				float aumento = sueldo * 0.05f;
				float sueldoTotal = sueldo + aumento;
				System.out.println("Sueldo a pagar : " + sueldoTotal);
			} else {
				System.out.println("Sueldo a pagar : " + sueldo);
			}
		}
	}
}
