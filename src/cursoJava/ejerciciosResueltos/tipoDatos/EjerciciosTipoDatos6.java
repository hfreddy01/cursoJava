package cursoJava.ejerciciosResueltos.tipoDatos1;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 6 . DECLARAR UN STRING QUE CONTENGA TU NOMBRE, DESPUES MUESTRA UN MENSAJE DE BIENVENIDA POR CONSOLA. POR EJEMPLO SI 
 *     INTRODUZCO "FERNANDO", ME DEBE APARECER "BIENVENIDO FERNANDO".
 *
 */
public class EjerciciosTipoDatos6 {


	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS STRING
		String name = JOptionPane.showInputDialog("Ingrese nombre");
		
		// MOSTRAMOS MENSAJE.
		System.out.println("Bienvenido " +name);

	}
	
	

}
