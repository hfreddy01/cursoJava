package cursoJava.ejerciciosResueltos.bucles.otrosEjercicios;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS BUCLE WHILE TILIZANDO CONDICONALES COMPUESTAS Y OPERADORES
 *         LOGICOS :
 * 
 *         EN UNA EMPRESA TRABAJAN N EMPLEADOS CUYOS SUELDOS OSCILAN ENTRE $100
 *         Y $500, REALIZAR UN PROGRAMA QUE LEA LOS SUELDOS QUE COBRA CADA
 *         EMPLEADO E INFORME CUANTOS EMPLEADOS COBRAN ENTRE 10$0 Y $300. Y
 *         CUANTOS COBRAN MAS DE $300. ADEMAS EL PROGRAMA DEBERA INFORMAR EL
 *         IMPORTE QUE GASTA LA EMPRESA EN SUELDOS AL PERSONAL.
 */

public class ImporteSueldoPersonalEmpresa {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		Scanner teclado = new Scanner(System.in);
		// CREAMOS VARIABLES :
		float sueldo, gastos;
		int empleados, menor, mayor, x;
		// INTRODUCIMOS LOS EMPLEADOS A VALIDAR
		System.out.print("¿Cuantos empleados tiene la empresa ? : ");
		empleados = teclado.nextInt();
		// INICIALIZAMOS VARIABLES.
		x = 1;
		mayor = 0;
		menor = 0;
		gastos = 0;
		// VALIDAMOS.
		while (x <= empleados) {
			System.out.println("Ingrese sueldo del empleado :");
			sueldo = teclado.nextFloat();
			// VALIDAMOS.
			if (sueldo <= 300) {
				mayor = mayor + 1;
			} else {
				menor = menor + 1;
			}
			// VALIDAMOS LOS GASTOS.
			gastos = gastos + sueldo;
			// INCREMENTAMOS
			x++;
		}
		// IMPRIMIMOS :
		System.out.println("Cantidad de empleados con sueldos entre 100 y 300 : " + mayor);
		System.out.println("Cantidad de empleados con sueldos mayor a 300 : " + menor);
		System.out.print("Gastos total de la empresa en sueldos : " + gastos);
	}
}
