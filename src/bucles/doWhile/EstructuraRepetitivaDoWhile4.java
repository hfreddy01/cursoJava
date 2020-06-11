package bucles.doWhile;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, 
 * indica que ha finalizado la carga). Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.
 *
 */

public class EstructuraRepetitivaDoWhile4 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int suma, valor;
	
	
	// METODO QUE PERMITE CREAR CERNTANA DE DIALOGO PARA EL INGRESO DE DATOS E IMPRIMIR RRSULTADOS.
	public void getCreateWindows() {
		// INICIALIZAMOS.
		suma = 0;
		// VALIDAMOS.
		do {
			text1 = JOptionPane.showInputDialog("Ingrse valores");
			valor = Integer.parseInt(text1);
			if(valor != 999) {
				suma = suma + valor;
			}
		} while(valor != 999);
		
		 System.out.println("El valor acumulado es : " +suma);
		 
		 if(suma == 0) {
			 System.out.println("El valor acumulado es : cero.");
		 } else if(suma > 0) {
			 System.out.println("El valor acumulado es : positivo.");
		 } else {
			 System.out.println("El valor acumulado es : negativo.");
		 }
		
		
	}

}
