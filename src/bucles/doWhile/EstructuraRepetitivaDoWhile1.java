package bucles.doWhile;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa que solicite la carga de un número entre 0 y 999, y nos muestre un mensaje de cuántos dígitos tiene 
 * el mismo. Finalizar el programa cuando se cargue el valor 0.
 *
 */

public class EstructuraRepetitivaDoWhile1 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int num = 1;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA ENTRADA DE VALORES.
	public void getCreateAll() {
		do {
			text1 = JOptionPane.showInputDialog("Ingrese numero entre 0 y 999, (0 finaliza)");
			num = Integer.parseInt(text1);
			
			// VALIDAMOS.
			if(num >= 100) {
				System.out.println("tiene tres digitos");
			} else {
				if(num > 10) {
					System.out.println("Tiene dos digitos");
				} else {
					System.out.println("Tiene un digitos");
				}
			}
		} while(num!=0);
	}

}
