package condicionales.simples;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
 *
 */

public class EstructuraCondicionalSimple2 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int nota1, nota2, nota3, promedio;
	
	
	// METODO QUE PERMITE INGRESAR VALORES POR VENTANA DE DIALOGO.
	public void getVentana() {
		// VALIDAMOS.
		text1 = JOptionPane.showInputDialog("Ingrese primera nota");
		nota1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segunda nota");
		nota2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercera nota");
		nota3 = Integer.parseInt(text3);
	}
	
	// METODO QUE VALIDA EL PROMEDIO DE NOTAS.
	public void getPromedioNotas() {
		// VALIDAMOS EL PROMEDIO.
		promedio = (nota1 + nota2 + nota3) / 3;
		if(promedio >= 7) {
			System.out.println("Promocionado...");
		}
	}

}
