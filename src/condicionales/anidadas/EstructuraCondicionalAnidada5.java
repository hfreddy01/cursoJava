package condicionales.anidadas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de 
 * preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que 
 * ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, 
 * y sabiendo que :
 * 
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
 *
 */

public class EstructuraCondicionalAnidada5 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int totalPreguntas,totalCorrectas, porcentaje;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getVentanaCreate() {
		text1 = JOptionPane.showInputDialog("Ingrese la cantidad total de preguntas del examen:");
		totalPreguntas = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese la cantidad total de preguntas contestadas correctamente:");
		totalCorrectas = Integer.parseInt(text2);
	}
	
	
	
	// METODO QUE PERMITE VALIDAR LA CANTIDAD DE PREGUNTAS CONTESTADA Y SU PORCENTAJE.
	public void getOperaciones() {
		// VALIDAMOS
		porcentaje = (totalCorrectas * 100 / totalPreguntas);
		
		if(porcentaje >= 90 ) {
			System.out.println("Nivel Maximo...");
		} else {
			if(porcentaje >=75) {
				System.out.println("Nivel Medio...");
			} else {
				if(porcentaje >=50) {
					System.out.println("Nivel Regular...");
				} else {
					System.out.println("Fuera de Nivel...");
				}
			}
		}
	}

}
