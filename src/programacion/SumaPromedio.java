package programacion;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.
 *
 */
public class SumaPromedio {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3, text4;
	private int num1, num2, num3, num4, suma, promedio;
	
	// METODO QUE PERMITE CARGAR VENTANA PARA INGRESAR VALORES.
	public void getCargarVentana() {
		// JOPTIONPANE
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		// TRANSFORMAMOS DE INT A STRING
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		// TRANSFORMAMOS DE INT A STRING
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer numero");
		// TRANSFORMAMOS DE INT A STRING
		num3 = Integer.parseInt(text3);
		
		text4 = JOptionPane.showInputDialog("Ingrese cuarto numero");
		// TRANSFORMAMOS DE INT A STRING
		num4 = Integer.parseInt(text4);
	}
	
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR EL RESULTADO DE LOS NUMEROS.
	public void getOperaciones() {
		// VALIDAMOS LA SUMA
		suma = num1 + num2 + num3 + num4;
		System.out.println("La suma de los valores es : " +suma);
		
		// VALIDAMOS EL PROMDEIO
		promedio = suma /4;
		System.out.println("El promedio de los valores es : " +promedio);
		
	}

}
