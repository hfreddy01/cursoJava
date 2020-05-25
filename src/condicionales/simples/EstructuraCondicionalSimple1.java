package condicionales.simples;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.
 *
 */

public class EstructuraCondicionalSimple1 {
	// PROPIEDADES DE LA CLASE
	private String nombre;
	private float sueldo;
	
	// METODO QUE PERMITE CVARGAR VENTANA DE DIALOGO PARA INGRSAR VALORES.
	public void getCargarVentana() {
		nombre = JOptionPane.showInputDialog("Ingrese sueldo de empleado");
		sueldo = Float.parseFloat(nombre);
	}
	
	// METODO QUE VALIDA EL SUELDO DEL EMPLEADO.
	public void getSueldo() {
		// VALIDAMOS
		if(sueldo > 3000) {
			JOptionPane.showMessageDialog(null, "Debe abonar impuesto");
		}
	}
	

}
