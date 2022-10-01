package cursoJava.ejerciciosResueltos.bucles.ForEach;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         SE DESEA ALMACENAR LOS SUELDOS DE OPERARIOS. CUANDO SE EJECUTA EL
 *         PROGRAMA SE DEBE PEDIR LA CANTIDAD DE SUELDOS A INGRESAR. LUEGO CREAR
 *         UN ARREGLO CON DICHO TAMAÑO. IMPRIMIR TODOS LOS SUELDOS INGRESADOS Y
 *         MOSTRAR EL MAYOR DE ELLOS.
 *
 */

public class EjerciciosForEach3 {
	// ATRIBUTOS DE LA CLASE.
	private Scanner teclado;
	private int sueldos[];

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosForEach3.
		EjerciciosForEach3 sueldoMayor = new EjerciciosForEach3();
		// IMPRIMIMOS.
		sueldoMayor.imprimirSueldo();
		sueldoMayor.sueldoMayor();
	}

	// METODO CONSTRUCTOR.
	public EjerciciosForEach3() {
		// CREAMOS EL OBJETO SCANNER
		teclado = new Scanner(System.in);
		System.out.println("Cuantos sueldos cargara : ");
		int cant = teclado.nextInt();
		// CREAMOS EL OBJETO ARRAYS.
		sueldos = new int[cant];
		// VALIDAMOS.
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingrese sueldo :");
			sueldos[i] = teclado.nextInt();
		}
	}

	// METODO QUE PERMITE IMPRIMIR LOS SUELDOS.
	public void imprimirSueldo() {
		// VALIDAMOS.
		for (int sueldo : sueldos) {
			System.out.println(sueldo);
		}
	}

	// METODO QUE PERMITE VALIDAR EL SUELDO MAYOR.
	public void sueldoMayor() {
		// CREAMOS VARIABLES.
		int mayor = sueldos[0];
		// VALIDAMOS.
		for (int sueldo : sueldos)
			// VALIDAMOS.
			if (sueldo > mayor) {
				mayor = sueldo;
				System.out.println("El sueldo mayor que paga la empresa es  : " + mayor);
			}
	}
}
