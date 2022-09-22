package cursoJava.ejerciciosResueltos.arrays.Vector;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava.
 * 
 *         EJERCICIOS DE ARRYS :
 * 
 *         * 3 - UNA EMPRESA TIENE DOS TURNOS (MAÑANA Y TARDE) EN LOS QUE
 *         TRABAJAN 8 EMPLEADOS (4 POR LA MAÑANA Y 4 POR LA TARDE) CONFECCIONAR
 *         UN PROGRAMA QUE PERMITA ALMACENAR LOS SUELDOS DE LOS EMPLEADOS
 *         AGRUPADOS POR TURNO. IMPRIMIR LOS GASTOS EN SUELDOS DE CADA TURNO.
 *         "\"
 *
 */

public class EjerciciosArrays3 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO DEL ARRAYS.
		float[] turnoMañana;
		float[] turnoTarde;
		// INICIALIZAMOS EL OBJETO ARRAYS.
		turnoMañana = new float[4];
		turnoTarde = new float[4];
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE LOS SUELDOS DE LOS
		// TRABAJADORES.
		// CREAMOS MENSAJE PARA.
		JOptionPane.showMessageDialog(null, "Sueldos de empleados del turno de la mañana.");
		for (int j = 0; j < 4; j++) {
			String text1 = JOptionPane.showInputDialog("Ingrese sueldo.");
			turnoMañana[j] = Float.parseFloat(text1);
		}
		JOptionPane.showMessageDialog(null, "Sueldos de empleados del turno de la tarde.");
		for (int j = 0; j < 4; j++) {
			String text2 = JOptionPane.showInputDialog("Ingrese sueldo.");
			turnoTarde[j] = Float.parseFloat(text2);
		}
		// CALCULAMOSM LOS GASTOS.
		float mañana = 0;
		float tarde = 0;
		// VALIDAMOS.
		for (int j = 0; j < 4; j++) {
			mañana = mañana + turnoMañana[j];
			tarde = tarde + turnoTarde[j];
		}
		// IMPRIMIMOS LOS GASTOS.
		System.out.println("Total de gastos del turno de la mañana : " + mañana);
		System.out.println("Total de gastos del turno de la tarde : " + tarde);
	}

}
