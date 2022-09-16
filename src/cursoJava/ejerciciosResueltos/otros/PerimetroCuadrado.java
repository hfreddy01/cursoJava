package cursoJava.ejerciciosResueltos.otros;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 2 . REALIZAR LA CARGA DEL LADO DE UN CUADRADO, MOSTRAR POR PANTALLA EL PERIMETRO DEL MISMO (EL PERIMETRO DE UN 
	   CUADRADO SE CALCULA MULTIPLICANDO EL VALOR DEL LADO POR CUATRO)
 *
 */

public class PerimetroCuadrado {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// DECLARAMOS VARIABLES.
		int lado,perimetro;
		String text1;
		
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE VALORES.
		text1 = JOptionPane.showInputDialog("Ingrese el lado del cuadrado:");
		// TRANSFORMAMOS DE INT A STRING
		lado = Integer.parseInt(text1);
		
		// VALIDAMOS EL PERIMETRO DE UN CUADRADO Y MOSTRAMOS EL RESULTADO.
		perimetro = lado * 4;
		System.out.println("El perímetro del cuadrado es : " +perimetro);
		
		

	}

}
