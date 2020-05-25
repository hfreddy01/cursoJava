package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda 
 * "Todos los números son menores a diez".
 *
 */

public class CondicionesCompuestas5 {
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
	
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR LA LEYENDA.
	public void getValidar() {
		// VALIDAMOS.
		if(num1 < 10  && num2 < 10 && num3 < 10) {
			// IMPRIMIMOS
			System.out.println("Todos los números son menores a diez");
		}
	}

}
