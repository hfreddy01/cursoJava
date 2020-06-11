package bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 *
 */

public class EstructuraRepetitivaFor3 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int notas, aprobados, reprobados;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL REGISTRO.
	public void getCreateAll() {
		// INICIALIZAMOS.
		aprobados = 0;
		reprobados = 0;
		
		// VALIDAMOS.
		for(int i=0; i<=5; i++) {
			text1 = JOptionPane.showInputDialog("ingrese notas de estudiante");
			notas = Integer.parseInt(text1);
			// VALIDAMOS.
			if(notas >= 7) {
				aprobados++;
			} else {
				reprobados++;
			}
		}
		
			// IMPRIMIMOS.
		    System.out.println("Cantidad de aprobados : " +aprobados);
            System.out.println("Cantidad de reprobados : " +reprobados);
	}

}
