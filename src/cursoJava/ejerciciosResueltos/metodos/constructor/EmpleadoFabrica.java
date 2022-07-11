package cursoJava.ejerciciosResueltos.metodos.constructor;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 4 - CONFECCIONAR UNA CLASE QUE REPRESENTE UN MEPLEADO. DEFINIR COMO ATRIBUTOS SU NOMBRE Y SU SUELDO. EN EL CONSTRUCTOR
 * CARGAR LOS ATRIBUTOS Y LUEGO EN OTRO METODO IMPRIMIR SUS DATOS Y POR ULTIMO UN METODO QUE IMPRIMA UN MENSAJE SI DEBE
 * PAGAR IMPUETOS (SI EL SUELDO SUPERA A 3000).
 *
 */

public class EmpleadoFabrica {
	private Scanner teclado;
	private String nombre;
	private float sueldo;
	
	
	// METODO CONSTRUCTOR DE LA CLASE.
	public  EmpleadoFabrica() {
		// CREAMOS EL OBJETO SCANNER.
		teclado = new Scanner(System.in);
		
		System.out.println("Ingrese nombre empleado : ");
		nombre = teclado.next();
		
		System.out.println("Ingrese sueldo : ");
		sueldo = teclado.nextFloat();
	}
	
	// METODO QUE PERMITE CALCULAR SI DEBE PAGAR IMPUESTOS.
	public void pagaImpuestos() {
		// VALIDAMOS.
		if(sueldo > 3000) {
			System.out.println("Debe pagar Impuestos...");
		} else {
			System.out.println("NO paga Impuestos...");
		}
	}
	

}
