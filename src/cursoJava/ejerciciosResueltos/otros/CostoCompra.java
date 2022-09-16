package cursoJava.ejerciciosResueltos.otros;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 5 . SE DEBE DESARROLLAR UN PROGRAMA QUE PIDA EL INGRESO DEL PRECIO DE UN ARTICULO Y LA CANTIDAD QUE LLEVA EL 
	   CLIENTE, MOSTRAR LO QUE DEBE ABONAR EL COMPRDOR.
 *
 */

public class CostoCompra {
	
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS VARIABLES.
		int cantidad;
    	float precio;
    	float importe;
    	
    	// CREAMOS VENTANA DE DIALOGO PARA INGRESAR VALORES.
    	String text1 = JOptionPane.showInputDialog("Ingrese la cantidad de artículos a llevar:");
    	// TRANSFORMAMOS EL STRING A ENTERO.
    	cantidad = Integer.parseInt(text1);
    	
    	String text2 = JOptionPane.showInputDialog("Ingrese el precio  del producto:");
    	// TRANSFORMAMOS EL STRING A ENTERO.
    	precio = Float.parseFloat(text2);
    	
    	// VALIDAMOS NEL PRECIO DEL ARTICULO QUE LLEVA EL CLIENTE, MOSTRAR LO QUE DEBE ABONAR EL COMPRDOR.
    	importe = precio * cantidad;
    	System.out.println("El importe total a pagar es : " +importe);
		
	}

}
