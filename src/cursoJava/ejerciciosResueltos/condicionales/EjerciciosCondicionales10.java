package cursoJava.ejerciciosResueltos.condicionales;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 10  UN POSTULANTE A UN EMPLEO, REALIZA UN TEST DE CAPACITACION, SE OBTUVO LA SIGUIENTE INFORMACION: CANTIDAD TOTAL DE
       PREGUNTAS QUE SE REALIZARON Y LA CANTIDAD DE PREGUNTAS QUE CONTESTO CORRECTAMENTE. SE PIDE CONFECCIONAR UN 
       PROGRAMA QUE INGRESE LOS DOS DATOS POR TECLADO E INFORMAR EL NIVEL DEL MISMO SEGUN EL PORCENTAJE DE RESPUESTAS 
       CORRECTAS QUE SE HA OBTENIDO SABIENDO QUE: NIVEL MAXIMO Porcentaje>=90% NIVEL MEDIO Porcentaje>=75% y <90% NIVEL
       REGULAR Porcentaje>=50% y <75% FUERA DE NIVEL Porcentaje<50%
 *
 */

public class EjerciciosCondicionales10 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int totalPreguntas, totalCorrectas, porcentaje;
	

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE.
		EjerciciosCondicionales10 op = new EjerciciosCondicionales10();
		op.getAddVentanas();
		op.getValidatePrueba();

	}
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOG PARA EL INGRESO DE DATOS.
	public void getAddVentanas() {
		// CREAMOS VENTANA DE DIALOG.
		text1 = JOptionPane.showInputDialog("Ingrese la cantidad total de preguntas del examen");
		// TRANSFORMAMOS LA VARIABLE TOTAL PREGUNTAS A STRING.
		totalPreguntas = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese la cantidad total de preguntas contestadas correctamente");
		// TRANSFORMAMOS LA VARIABLE TOTAL CORRECTAS A STRING.
		totalCorrectas = Integer.parseInt(text2);
	}
	
	
	// METODO QUE PERMITE VALIDAR EL PORCENTAJE DEL EXAMEN.
	public void getValidatePrueba() {
		// VALIDAMOS PORCENTAJE.
		porcentaje = totalCorrectas * 100 / totalPreguntas;
		
		// VALIDAMOS.
		if(porcentaje >= 90) {
			System.out.println("Nivel Maximo...");
		} else if(porcentaje >=75) {
			System.out.println("Nivel Medio...");
		} else {
			if(porcentaje >= 50){
				System.out.println("Nivel Regular...");
			} else {
				System.out.print("Fuera de nivel");

			}
		}
	}

}
