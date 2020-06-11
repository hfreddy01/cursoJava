package arrays;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se desea guardar los sueldos de 5 operarios.
   Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto momento los 5 sueldos almacenados en memoria.
   Empleando un vector solo se requiere definir un único nombre y accedemos a cada elemento por medio del subíndice.
 *
 */

public class PruebaVector1 {
	// PROPIEDADES DE LA CLASE.
	private String empleado;
	private int[] sueldos;
	
	
	// METODO QUE PERMITE CARGAR EL SUELDO DE UN EMPLEADO.
	public void getCargarSueldoEmpleado() {
		// CREAMOS EL OBJETO DEL ARRAYS.
		sueldos = new int[5];
		// VALIDAMOS.
		for(int i=0; i<5; i++) {
			empleado = JOptionPane.showInputDialog("Ingrse sueldo de empleados");
			sueldos[i] = Integer.parseInt(empleado);
		}
		
	}
	
	
	// METODO QUE PERMITE IMPRIMIR LOS SUELDOS DE LOS EMPLEADOS.
	public void getImprimirSueldos() {
		// VALIDAMOS.
		for(int i=0; i<5; i++) {
			// IMPRIMIMOS.
			System.out.println("Sueldos : " +sueldos[i]);
		}
	}
	

}
