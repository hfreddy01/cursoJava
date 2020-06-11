package bucles.doWhile;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta
 * y saldo actual. El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
   Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
   
   a) De cada cuenta : número de cuenta y estado de la cuenta según su saldo, sabiendo que:
      Estado de la cuenta	'Acreedor' si el saldo es > 0.
		'Deudor' si el saldo es <0.
		'Nulo' si el saldo es =0.
		
   b) La suma total de los saldos acreedores
 *
 */

public class EstructuraRepetitivaDoWhile5 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int cuenta;
	private float suma, saldo;
	
	
	// METODO QUE PERMITE MOSTRAR RESULTADOS.
	public void getCuenta() {
		// INICIALIZAMOS.
		suma = 0;
		// VALIDAMOS.
		do {
			text1 = JOptionPane.showInputDialog("Ingrse numero de cuenta");
			cuenta = Integer.parseInt(text1);
			// VALIDAMOS.
			if(cuenta >= 0) {
				text2 = JOptionPane.showInputDialog("Ingrse saldo");
				saldo = Float.parseFloat(text2);
				if(saldo > 0) {
					System.out.println("Saldo acreedeor...");
					suma = suma + saldo;
				} else {
					if(saldo < 0) {
						System.out.println("Saldo deudor...");
					} else {
						System.out.println("Saldo nulo...");
					}
				}
			}
		} while(cuenta >= 0);
		System.out.println("Total de saldos Acreedores : " +suma);
	}

}
