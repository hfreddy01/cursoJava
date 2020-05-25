package programacion;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo (El perímetro de un cuadrado 
 * se calcula multiplicando el valor del lado por cuatro)
 *
 */

public class PerimetroCuadrado {
	// PROPIEDADES DE LA CLASE.
	private String text;
	private int lado, perimetro;
	
	// METODO QUE PERMITE CARGAR VENTANA.
	public void getCargarVentana() {
		text = JOptionPane.showInputDialog("Ingrese lado del cuadrado");
		lado = Integer.parseInt(text);
	}
	
	// METODO QUE PERMITE VALIDAR E IMPRIMIR EL RESULTADO DE LOS VALORES.
	public void getOperaciones() {
		// VALIDAMOS
		perimetro = lado*4;
		System.out.print("El perimtero de un cuadrado es : " +perimetro);
	}

}
