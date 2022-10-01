package cursoJava.ejerciciosResueltos.bucles.ForEach;

/**
 * 
 * @author cursoJava
 * 
 *         CONFECCIONAR UN PROGRAMA QUE PERMITA MOSTRAR LOS SUELDOS DE LOS
 *         EMPLEADOS Y TAMBIEN MUESTRE LOS GASTOS DE LA EMPRESA.
 *
 */

public class EjerciciosForEach2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int sueldos[] = { 275, 200, 265 };
		int gastos = 0;
		// VALIDAMOS.
		for (int monto : sueldos) {
			// VALIAMOS.
			gastos += monto;
			System.out.println("Gasto total en sueldos de la empresa : " + gastos);
		}
	}
}
