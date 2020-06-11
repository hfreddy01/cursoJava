package condicionales.anidadas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando 
 * si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.
 *
 */

public class EstructuraCondicionalAnidada4 {
	// PROPIEDADES DE LA CLASE.
	private String text;
	private int num;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getVentana() {
		text = JOptionPane.showInputDialog("Ingrese un valor de hasta tres dígitos positivo:");
		num = Integer.parseInt(text);
	}

	
	// METODO QUE PERMITE VALIDAR NUMERO DE TRES CIFRAS.
	public void getNumeros() {
		// VALIDAMOS.
		if(num < 10) {
			System.out.println("Tiene un digito");
		} else {
			if(num < 100) {
				System.out.println("Tiene dos digito");
			} else {
				if(num < 1000) {
					System.out.println("Tiene tres digito");
				} else {
					System.out.println("Error al ingresar numeros");
				}
			}
		}
	}
}
