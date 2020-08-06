package cursoJava.ejerciciosResueltos.arrays;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 4 - DESARROLLAR UN PROGRAMA QUE PERMITA INGRESAR UN ARRAYS DE 8 ELEMENTOS E INFORMAR EL VALOR ACOMULADO DE TODOS
 *     LOS ELEMENTOS DEL ARRAYAS. EL VALOR ACOMULADO DE LOS ELEMENTOS DEL ARRAYS QUE SEAN MAYORES A 36. CANTIDAD DE
 *     VALORES MAYORES A 50
 *
 */

public class PruebaVector4 {
	
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO ARRAYS.
		int[] vector = new int[8];
		String text1;
		
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
		for(int f=0; f<8; f++) {
			text1 = JOptionPane.showInputDialog("Ingrese elementos");
			vector[f] = Integer.parseInt(text1);
		}
		
		// ACOMULAMOS LOS ELEMENTOS.
		int suma1 = 0;
		for(int i=0; i<8; i++) {
			suma1 = suma1 + vector[i];		
		}
		
		// IMPRIMIMOS EL ACOMULADO.
		System.out.println("La suma de los 8 elementos es : " +suma1);
		
		// ACOMULAMOS LOS MAYORES A 36.
		int suma2 = 0;
		for(int j = 0; j<8; j++) {
			// VALIDAMOS SI EL VECTOR ES MAYOR A 36
			if(vector[j] > 36) {
				suma2 = suma2 + vector[j];
			}
		}
		
		// IMPRIMIMOS LOS MAYORES A 36.
		System.out.println("La suma de los elementos mayores a 36 es : " +suma2);
		
		// VALIDAMOS LA CANTIDAD DE MAYORES A 50.
		int cantidad = 0;
		// VALIDAMOS.
		for(int h = 0; h<8; h++) {
			// VALIDAMOS SI SON MAYORES A 50.
			if(vector[h] > 50) {
				cantidad++;		
			}
			
		}
		
		// IMPRIMIMOS MAYORES A 50.
		System.out.println("La cantidad de valores mayores a 50 es : " +cantidad);

	}

}
