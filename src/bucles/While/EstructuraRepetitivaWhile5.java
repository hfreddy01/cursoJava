package bucles.While;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 
 * y cuántos menores.
 *
 */

public class EstructuraRepetitivaWhile5 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int notas, contador1, contador2, x;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE REGISTROS.
	public void getCreateVentana() {
		// INICIALIZAMOS CONTADORES.
		x = 1;
		contador1 = 0;
		contador2 = 0;
		
		// VALIDAMOS VENTANA DE DIALOGOS A 10.
		while(x <= 10) {
			text1 = JOptionPane.showInputDialog("Ingrese notas");
			notas = Integer.parseInt(text1);
			// VALIDAMOS.
			if(notas >= 7) {
				contador1 = contador1 + 1;
			} else {
				contador2 = contador2 + 1;
			}
				// INCREMENTAMOS X
				x = x+1;
		}
		
		// IMPRIMIMOS
		System.out.println("Cantidad de alumnos con notas mayores o iguales a 7 : " +contador1);
        System.out.println("Cantidad de alumons con notas menores a 7 : " +contador2);
	}

}
