package cursoJava.ejerciciosResueltos.otros;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 4 . REALIZAR UN PROGRAMA QUE LEA CUATRO VALORES NUMERICOS E INFORMAR SU SUMA Y PROMEDIO.
 *
 */
public class SumaPromedio {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		String text1, text2, text3, text4;
		int num1, num2, num3, num4, suma, producto;
		
		// CREAMOS VENTANA PARA LA ENTRADA DE VALORES.
		text1 = JOptionPane.showInputDialog("Ingrese primer valor");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo valor");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer valor");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num3 = Integer.parseInt(text3);
		
		text4 = JOptionPane.showInputDialog("Ingrese cuarto valor");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num4 = Integer.parseInt(text4);
		
		
		// VALIDAMOS LA SUMA Y MOSTRAMOS LOS RESULTADOS. 
		suma = (num1 + num2 + num3 + num4);
		System.out.println("La suma de los cuatro valores es : " +suma);
		
		// VALIDAMOS EL PRODUCTO PROMEDIO DE LOS VALORES Y MOSTRAMOS LOS RESULTADOS.
		producto = suma / 4;
		System.out.println("El producto de los 4 valores es : " +producto);
		

	}

}
