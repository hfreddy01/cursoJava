package programacion;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. 
 * Mostrar lo que debe abonar el comprador.
 *
 */
public class CostoCompra {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int cantidad;
	private float precio, abono;
	
	// METODO QUE PERMITE CARGAR VENTANA PARA INGRESAR VALORES.
	public void getCaragarVentana() {
		text1 = JOptionPane.showInputDialog("Ingrese cantidad de articulos a llevar");
		cantidad = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese el precio del producto");
		precio = Float.parseFloat(text2);
			
	}
	
	// METODO QUE PERMITE VALIDAR EN IMPRIMIR EL IMPORTE Q DEBE ABONAR EL CLIENTE.
	public void getImporte() {
		// VALIDAMOS
		abono = precio * cantidad;
		System.out.println("El valor a pagar es : " +abono);
	}
	

}
