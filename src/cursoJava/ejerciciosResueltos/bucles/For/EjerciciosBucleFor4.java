package cursoJava.ejerciciosResueltos.bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 4 - ESCRIBIR UN PROGRAMA QUE LEA 10 NUMEROS ENTEROS Y LUEGO MUESTRE CUANTOS VALORES INGRESADOS FUERON MULTIPLOS
 *     DE 3 Y CUANTOS DE 5. DEBEMOS TENER EN CUENTA QUE HAY NUMEROS QUE SON MULTIPLOS DE 3 Y DE 5 A LA VEZ.
 *
 */

public class EjerciciosBucleFor4 {

	public static void main(String[] args) {
		// MENSAJE.
		JOptionPane.showMessageDialog(null, "4 - ESCRIBIR UN PROGRAMA QUE LEA 10 NUMEROS ENTEROS Y LUEGO MUESTRE CUANTOS "
				+ "VALORES INGRESADOS FUERON MULTIPLOS\r\n" + "DE 3 Y CUANTOS DE 5. DEBEMOS TENER EN CUENTA QUE HAY NUMEROS "
				+ "QUE SON MULTIPLOS DE 3 Y DE 5 A LA VEZ.");
		// CREAMOS VARIABLES.
		int num, suma, multiplo3, multiplo5;
		// INICIALIZAMOS VARIABLES.
		multiplo3 = 0;
		multiplo5 = 0;
		suma = 0;
		
		// VALIDAMOS.
		for(int i = 1; i<=10; i++) {
			// INTRODUCIMOS DATOS POR VENTANA DE DIALOGO.
			String text = JOptionPane.showInputDialog("Ingrese valores");
			// TRANSFORMAMOS DE INT A STRING.
			num = Integer.parseInt(text);
			// VALIDAMOS.
			if(num %3 == 0) {
				multiplo3++;
			} 
			
			if(num%5 ==0) {
				multiplo5++;
			}
		}
		
		// IMPRIMIMOS.
		  System.out.println("Cantidad de valores ingresados múltiplos de 3 : " +multiplo3);
		  System.out.print("Cantidad de valores ingresados múltiplos de 5 :" +multiplo5);
		

	}

}
