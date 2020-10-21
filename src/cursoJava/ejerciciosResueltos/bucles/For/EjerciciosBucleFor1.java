package cursoJava.ejerciciosResueltos.bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 1 - REALIZAR UN PROGRAMA QUE IMPRIMA EN PANTALLA LOS NUMEROS DEL 1 AL 100
 *
 */

public class EjerciciosBucleFor1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// MENSAJE.
		JOptionPane.showMessageDialog(null, "1 - REALIZAR UN PROGRAMA QUE IMPRIMA EN PANTALLA LOS NUMEROS DEL 1 AL 100");
		
		// VALIDAMOS.
		for(int i=1; i<=100; i++) {
			// IMPRIMIMOS.
			System.out.println(i);
		}

	}

}
