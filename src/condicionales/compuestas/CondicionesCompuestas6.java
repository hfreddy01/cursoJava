package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, imprimir en pantalla la leyenda
 * "Alguno de los números es menor a diez".
 *
 */

public class CondicionesCompuestas6 {
	// PROPIEDADES DE LA CLASE.
	private String nomb1, nomb2, nomb3;
	private int num1, num2, num3;
	
	
	// METODO QUE PERMITE CREAR E INTRODUCIR DATOS POR VENTANA DE DIALOGO.
	public void getVentana() {
		nomb1 = JOptionPane.showInputDialog("Ingrese primer numero");
		// TRANSFORMAMOS DE STRING A INT CON PARSE-INT
		num1 = Integer.parseInt(nomb1);
		
		nomb2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		// TRANSFORMAMOS DE STRING A INT CON PARSE-INT
		num2 = Integer.parseInt(nomb2);
		
		nomb3 = JOptionPane.showInputDialog("Ingrese tercer numero");
		// TRANSFORMAMOS DE STRING A INT CON PARSE-INT
		num3 = Integer.parseInt(nomb3);
	}
	
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR LEYENDA.
	public void getOperaciones() {
		// VALIDAMOS
		if(num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los números es menor a diez");
		}
	}

}
