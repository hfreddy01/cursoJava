package bucles.While;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Una planta que fabrica perfiles de hierro posee un lote de n piezas. Confeccionar un programa que pida ingresar por teclado
 * la cantidad de piezas a procesar y luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud esté 
 * comprendida en el rango de 1,20 y 1,30 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.
 *
 */


//
public class EstructuraRepetitivaWhile4 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int x, n, cantidad;
	private float largo;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getCreateVentana() {
		// INICIALIZAMOS VARIABLES.
		x = 1;
		cantidad = 0;
		
		text1 = JOptionPane.showInputDialog("Cuantas piezas procesara");
		n = Integer.parseInt(text1);
		
		// VALIDAMOS.
		while(x <= n) {
			text2 = JOptionPane.showInputDialog("Ingrese la medida de la pieza");
			largo = Float.parseFloat(text2);
			
			// VALIDAMOS.
			if(largo > 1.20	 && largo < 1.30) {
				cantidad = cantidad +1;
			}
				// INCREMENTAMOS X.
				x = x+1;
		}
			// IMPRIMIMOS
		    System.out.print("La cantidad de piezas aptas son : " +cantidad);
		
	}

}
