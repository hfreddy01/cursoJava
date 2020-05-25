package condicionales.compuestas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y 
 * (distintos a cero). Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. 
 * (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
 *
 */

public class CondicionesCompuestas7 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int x,y;
	
	
	// METODO QUE PERMITE CREAR E INTRODUCIR VALORES POR VENTANA DE DIALOGO.
	public void getVentana() {
		text1 = JOptionPane.showInputDialog("Ingrese corrdenada x : ");
		x = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese corrdenada y : ");
		y = Integer.parseInt(text2);
	}
	
	
	// METODO QUE PERMITE VAILDAR LOS CUADRANTES Y SUS POSICIONES.
	public void getCuadrantes() {
		// VALIDAMOS.
		if( x > 0 && y > 0) {
			System.out.println("Se encuentra en el primer cuadrante");
		} else {
			if(x < 0 && y > 0) {
				System.out.println("Se encuentra en el segundo cuadrante");
			} else {
				if(x < 0 && y < 0) {
					System.out.println("Se encuentra en el tercer cuadrante");
				} else {
					System.out.println("Se encuentra en el cuarto cuadrante");
				}
			}
		}
		
	}
	

}
