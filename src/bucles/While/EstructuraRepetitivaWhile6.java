package bucles.While;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.
 *
 */

public class EstructuraRepetitivaWhile6 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int x, n;
	private float altura, suma, promedio;
	
	
	// METODO QUE PERMITE CRERA VENTANA DE DIALOGO PARA EL INGRESO DE REGISTROS.
	public void getCreateVentana() {
		// INICIALIZAMOS VARIABLES.
		x = 1;
		suma = 0;
		
		text1 = JOptionPane.showInputDialog("Cuantas personas hay");
		n = Integer.parseInt(text1);
		
		// VALIDAMOS.
		while(x <= n) {
			text2 = JOptionPane.showInputDialog("Cuantas altura");
			altura = Float.parseFloat(text2);
			// VALIDAMOS LA SUMA.
			suma = suma + altura;
			// INCREMENTAMOS X
			x = x+1;
		}
		
		// VALIDAMOS EL PROMEDIO DE ALTURA DE LAS PERSONAS.
		promedio = suma/n;
		// IMPRIMIMOS
		System.out.print("Altura promedio : " +promedio);
	}

}
