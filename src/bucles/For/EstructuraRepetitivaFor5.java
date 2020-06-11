package bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa que lea n números enteros y calcule la cantidad de valores mayores o iguales a 1000.
   Este tipo de problemas también se puede resolver empleando la estructura repetitiva for. Lo primero que se 
   hace es cargar una variable que indique la cantidad de valores a ingresar. Dicha variable se carga antes de entrar 
   a la estructura repetitiva for.La estructura for permite que el valor inicial o final dependa de una variable cargada
   previamente por teclado.
 *
 */

public class EstructuraRepetitivaFor5 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int valor, n, cantidad;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO E IMPRIMIR RESULTADOS.
	public void getCreateVentana() {
		// INICILIZAMOS.
		cantidad=0;
		
		//VALIDAMOS.
		text1 = JOptionPane.showInputDialog("Cuantos valores ingresrasas");
		n = Integer.parseInt(text1);
		// VALIDAMOS.
		for(int i=1; i<=n; i++) {
			text2 = JOptionPane.showInputDialog("Ingrese valores");
			valor = Integer.parseInt(text2);
			// VALIDAMOS.
			if(valor >= 100) {
				cantidad = cantidad+1;
			}
		}
			// IMPRIMIMOS.
		   System.out.println("La cantidad de valores ingresados mayores o iguales a 1000 son : " +cantidad);
	}

}
