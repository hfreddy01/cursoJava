package cursoJava.ejerciciosResueltos.arrays;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 5 - REAILZAR UN PROGRAMA QUE PIDA LA CARGA DE DOS ARRAYS NUMERICOS DE TIPO ENTEROS. OBTENER LA SUMA DE LOS DOS
 *     ARRAYS. DICHO RESULTADO GUARDARLO EN UN TERCER ARRAYS DEL MISMO TAMAÑO. SUMAR COMPONENTE A COMPONENTE. 
 *
 */

public class PruebaVector5 {

	/**
	 * 
	 * @param args
	 * Metodo principal de la clase.
	 * 
	 */
	public static void main(String[] args) {
		// CREAMOS OBJETOS ARRAYS.
		int vector1[];
		int vector2[];
		int vectorSuma[];
		
		// INICIALIZAMOS LOSMOBJETOS ARRAYS.
		vector1 = new int[4];
		vector2 = new int[4];
		
		// MOSTRAMOS EL MENSAJE DE CARGA DEL PRIMER ARRAYS
		 System.out.println("Carga del primer vector.");
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE REGISTRO.
		for(int i=0; i<4; i++) {
			String text1 = JOptionPane.showInputDialog("Ingrese elementos");
			vector1[i] = Integer.parseInt(text1);		
		}
		
		// MOSTRAMOS EL MENSAJE DE CARGA DEL SEGUNDO ARRAYS
		 System.out.println("Carga del segundo vector.");
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE REGISTRO.
		for(int i=0; i<4; i++) {
			String text2 = JOptionPane.showInputDialog("Ingrese elementos");
			vector2[i] = Integer.parseInt(text2);		
		}
		
		// SUMAMOS LOS VECTORES.
		// INICIALIZAMOS EL ARRAYSS SUMA.
		vectorSuma = new int[4];
		// VALIDAMOS.
		for(int i=0; i<4; i++) {
			vectorSuma[i] = vector1[i] + vector2[i];		
		}
		
		// IMPRIMIMOS
		System.out.println("Arrays resultante.");
		
		for(int i=0; i<4; i++) {
			System.out.println(vectorSuma[i]);
		}
	}
}
