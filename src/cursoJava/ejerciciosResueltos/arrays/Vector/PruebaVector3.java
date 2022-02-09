package cursoJava.ejerciciosResueltos.arrays;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava.
 * 
 *  * 3 - UNA EMPRESA TIENE DOS TURNOS (MA�ANA Y TARDE) EN LOS QUE TRABAJAN 8 EMPLEADOS (4 POR LA MA�ANA Y 4 POR LA
 *        TARDE) CONFECCIONAR UN PROGRAMA QUE PERMITA ALMACENAR LOS SUELDOS DE LOS EMPLEADOS AGRUPADOS POR TURNO.
 *        IMPRIMIR LOS GASTOS EN SUELDOS DE CADA TURNO. "\"
 *
 */

public class PruebaVector3 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO DEL ARRAYS.
		float[] turnoMa�ana;
		float[] turnoTarde;
		
		// INICIALIZAMOS EL OBJETO ARRAYS.
		turnoMa�ana = new float[4];
		turnoTarde = new float[4];
		
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE LOS SUELDOS DE LOS TRABAJADORES.
		// CREAMOS MENSAJE PARA.
		JOptionPane.showMessageDialog(null, "Sueldos de empleados del turno de la ma�ana.");
		for(int j=0; j<4; j++) {
			String text1 = JOptionPane.showInputDialog("Ingrese sueldo.");
			turnoMa�ana[j] = Float.parseFloat(text1);
		}
		
		JOptionPane.showMessageDialog(null, "Sueldos de empleados del turno de la tarde.");
		for(int j=0; j<4; j++) {
			String text2 = JOptionPane.showInputDialog("Ingrese sueldo.");
			turnoTarde[j] = Float.parseFloat(text2);
		}
		
		// CALCULAMOSM LOS GASTOS.
		float ma�ana = 0;
		float tarde = 0;	
		// VALIDAMOS.
		for(int j=0; j<4; j++) {
			ma�ana = ma�ana + turnoMa�ana[j];
			tarde = tarde + turnoTarde[j];
		}
		
		
		// IMPRIMIMOS LOS GASTOS.
		System.out.println("Total de gastos del turno de la ma�ana : " +ma�ana);
        System.out.println("Total de gastos del turno de la tarde : " +tarde);

		

	}

}
