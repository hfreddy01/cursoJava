package cursoJava.ejerciciosResueltos.arrays.Vector;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava.
 * 
 *         EJERCICIOS DE ARRYS :
 * 
 *         2 - DEFINIR UN ARRAYS DE 5 COMPONENTES DE TIPO float QUE REPRESENTEN
 *         LAS ALTURAS DE 5 PERSONAS. OBTENER EL PROMEDIO DE LAS MISMAS. CONTAR
 *         CUANTAS PERSONAS SON MAS ALTAS QUE EL PROMEDIO Y CUANTAS MAS BAJAS.
 *
 */

public class EjerciciosArrays2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO ARRAYS.
		float alturas[];
		alturas = new float[5];
		// CREAMOS VENTANA DE DIALOGO PARA EL INGRESO DE LAS ALTURAS. UTILIZAMOS BUCLE
		// FOR PARA MOSTRAR 5 VECES
		// LA VENTANA DE DIALOGO.
		for (int i = 0; i < 5; i++) {
			String text1 = JOptionPane.showInputDialog("Ingrese la altura de la persona:");
			alturas[i] = Float.parseFloat(text1);
		}
		// CALCULAMOS EL PROMEDIO DE LAS ALTURAS.
		float suma;
		suma = 0;
		// VALIDAMOS PROMEDIIO DE LAS ALTURAS.
		for (int i = 0; i < 5; i++) {
			suma = suma + alturas[i];
		}
		// IMPRIMIMOS EL PROMEDIO.
		float promedio = suma / 5;
		System.out.println("Promedio de alturas : " + promedio);
	}
}
