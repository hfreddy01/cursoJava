package cursoJava.ejerciciosResueltos.bucles.DoWhile;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         4 - REALIZAR UN PROGRAMA QUE ACOMULE(SUME) VALORES INGRESAODS POR
 *         TECLADO HASTA INGRESAR EL 999 (NO SUMAR DICHO VALOR INDICAR QUE HA
 *         FINALIZADO LA CARGA). IMPRIMIR EL VALOR ACOMULADO E INFORMAR SI DICHO
 *         VALOR ES CERO, MAYOR A CERO O MENOR A CERO.
 *
 */

public class EjerciciosDoWhile4 {

	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int suma, num;
		String text;
		// INICIALIZAMOS VARIABLE.
		suma = 0;
		// VALIDAMOS.
		do {
			// INTRODUCIMOS VALORES POR VENTANA DE DIALOGO.
			text = JOptionPane.showInputDialog("Ingrese un valor:");
			// TRANSFORMAMOS DE INT A STRING.
			num = Integer.parseInt(text);
			// VALIDAMOS.
			if (num != 999) {
				suma = suma + num;
			}
		} while (num != 999);
		// IMPRIMIMOS.
		System.out.println("El valor acumulado es :" + suma);
		// VALIDAMNOS.
		if (num == 0) {
			System.out.println("El valor acomulado es cero");
		} else if (num > 0) {
			System.out.println("El valor acomulado es positivo");
		} else {
			System.out.println("El valor acomulado es negativo");
		}
	}
}
