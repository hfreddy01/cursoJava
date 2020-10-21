package cursoJava.ejerciciosResueltos.bucles.While;

import javax.swing.JOptionPane;

/**
 * 
 * @author E6420
 * 
 * 1 - REALIZAR UN PROGRAMA QUE IMPRIMA EN PANTALLA LOS NUMEROS DEL 1 AL 100.
 *
 */

public class EjerciciosBucleWhile1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// MENSAJE.
		JOptionPane.showMessageDialog(null, "1 - REALIZAR UN PROGRAMA QUE IMPRIMA EN PANTALLA LOS NUMEROS DEL 1 AL 100.");
		
		// CREAMOS VARIABLE.
		int num = 1;
		
		// VALIDMOS.
		while(num <= 100) {
			System.out.println(num);
			num++;
		}
		

	}

}
