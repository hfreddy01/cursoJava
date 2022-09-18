package cursoJava.ejerciciosResueltos.bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         3 - ESCRIBIR UN PROGRAMA QUE LEA 10 NOTAS DE ALUNNOS Y NOS INFORME
 *         CUANTOS TIENEN NOTAS MAYORES O IGUALES A 7 Y CUANTOS MENORES.
 *
 */

public class EjerciciosBucleFor3 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		String text;
		int notas, aprobados, reprobados;
		// INICIALIZAMOS VARIABLES.
		aprobados = 0;
		reprobados = 0;
		// VALIDAMOS.
		for (int i = 1; i <= 10; i++) {
			// INGRESMOS DATOS POR VENTANA DE DIALOGO.
			text = JOptionPane.showInputDialog("Ingrese notas");
			// TRANSFORMAMOS DE INT A STRING.
			notas = Integer.parseInt(text);
			// VALIDAMOS.
			if (notas > 7) {
				aprobados++;
			} else {
				reprobados++;
			}
		}
		// IMPRIMIMOS.
		System.out.println("Cantidad de aprobados : " + aprobados);
		System.out.println("Cantidad de reprobados : " + reprobados);
	}
}
