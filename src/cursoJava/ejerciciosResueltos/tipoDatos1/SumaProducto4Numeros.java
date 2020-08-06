package cursoJava.ejerciciosResueltos.tipoDatos1;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 3 . ESCRIBIR UN PROGRAMA EN EL CUAL SE INGRESEN CUATROS NUMEROS, CALCULAR E INFORMAR LA SUMA DE LOS DOS PRIMEROS 
	   Y EL  PRODUCTO DEL TERCERO Y EL CUARTO 
 *
 */
public class SumaProducto4Numeros {
	
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		String text1, text2, text3, text4;
		int num1, num2, num3, num4, suma, producto;
		
		// CREAMOS VENTANA PARA LA ENTRADA DE VALORES.
		text1 = JOptionPane.showInputDialog("Ingrese primer numero");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segundo numero");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercer numero");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num3 = Integer.parseInt(text3);
		
		text4 = JOptionPane.showInputDialog("Ingrese cuarto numero");
		// TRANSFORMAMOS EL STRING A ENTERO.
		num4 = Integer.parseInt(text4);
		
		
		// VALIDAMOS LAS SUMA DE LOS DOS PRIMEROS NUMEROS Y MOSTRAMOS EL RESULTADO.
		suma = num1 + num2;
		System.out.println("La suma de los dos primeros numeros es : " +suma);
		
		
		// VALIDAMOS EL PRODUCTO DE LOS DOS ULTIMOS VALORES Y MOSTRAMOS EL RESULTADO.
		producto = num3 * num4;
		System.out.println("El producto de los dos ultimos numeros es : " +producto);
		

	} 

}
