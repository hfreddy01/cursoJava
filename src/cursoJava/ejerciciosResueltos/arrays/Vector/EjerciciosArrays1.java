package cursoJava.ejerciciosResueltos.arrays.Vector;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE ARRYS :
 * 
 *         1 - SE DESEA GUARDAR LOS SUELDOS DE 5 OPERARIOS. SEGUN LO CONOCIDO
 *         DEBERIAMOS DEFINIR 5 VARIABLES SI QUEREMOS TENER EN UN CIERTO MOMENTO
 *         LOS 5 SUELDOS ALMACENADOS EN MEMORIA. EMPLEANDO UN ARRAYS SOLO SE
 *         REQUIERE DEFINIR UN UNICO NOMBRE Y ACCEDEMOS A CADA ELEMENTO POR
 *         MEDIO DEL SUB-INDICE
 * 
 *
 */

public class EjerciciosArrays1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO ARRAYS E INICILIZAMOS EL MISMO.
		int sueldos[];
		sueldos = new int[5];
		// VALIDAMOS CON EL BUCLE FOR LA CANTIDAD DE VECES QUE SE RECORRE EL ARRAYS.
		for (int i = 0; i < 5; i++) {
			// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE LOS SUELDOS.
			String text1 = JOptionPane.showInputDialog("Ingrese sueldo de operarios");
			sueldos[i] = Integer.parseInt(text1);
		}
		// IMPRIMIMOS EL SUELDO DE LOS OPERARIOS.
		for (int i = 0; i < 5; i++) {
			System.out.println(sueldos[i]);
		}
	}
}
