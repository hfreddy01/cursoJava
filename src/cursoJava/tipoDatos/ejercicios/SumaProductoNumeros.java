package cursoJava.tipoDatos.ejercicios;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 1 . REALIZAR LA CARGA DE DOS NUMEROS ENTEROS POR TECLADO E IMPRIMIR SU SUMA Y SU PRODUCTO.
 *
 */

public class SumaProductoNumeros {
	
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARAIBLE.
		int num1, num2, suma, producto;
		String text1, text2;
		
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num2 = Integer.parseInt(text2);
		
		// VALIDAMOS E IMPRIMIMOS LA SUMNA.
		suma = num1 + num2;
		System.out.println("La suma de los valores es : " +suma);
		
		// VALIDAMOS E IMPRIMIMOS EL PRODUCTO DE LOS VALORES.
		producto = num1 * num2;
		System.out.println("Ek producto de los valores es : " +producto);
					
	}

}
