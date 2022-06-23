package cursoJava.ejerciciosResueltos.clases;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 5 - CONFECCIONAR UNA CLASE QUE REPRESENTE UN EMPLEADO. DEFINIR COMO ATRIBUTOS SU NOMBRE Y SU SUELDO. CONFECCIONAR LOS METODOS PARA
 * LA CARGA DE LOS VALORES, ORO METODO PARA IMPRIMIR LOS DATOS Y POR ULTIMO UN METODO QUE IMPRIMA SI EL EMPLEADO DEBE PAGAR IMPUESTOS
 * SI EL SUELDO ES MAYOR A 3000.
 */
public class Empleado {
	// PROPIEDADES DE LA CLASE.
	private Scanner teclado;
	private String nombreEmpleado;
	private float sueldo;
	
	// METODO QUE PERMITE CARGAR LOS DATOS DEL EMPLEADO.
	public void cargarDatosEmpleados() {
		// CREAMOS OBJETO SCANNER.
		teclado = new Scanner(System.in);
		
		try {
			System.out.println("Ingrese nombre Empleado :");
			nombreEmpleado = teclado.next();
			
			System.out.println("Ingrese sueldo Empleado :");
			sueldo = teclado.nextFloat();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE VALIDAR SI EL EMPLEADO DEBE PAGAR IMPUESTOS.
	public void pagaImpuestoEmpleado() {
		try {
			
			if(sueldo >= 3000) {
				System.out.println("Empleado debe pagar impuestos...");
			} else {
				System.out.println("NO paga impuestos...");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
