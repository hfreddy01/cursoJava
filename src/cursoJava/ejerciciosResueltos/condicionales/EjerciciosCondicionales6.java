package cursoJava.ejerciciosResueltos.condicionales;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 6 - CONFECCIONAR UN PROGRAMA QUE PIDA POR TECLADO TRES NOTAS DE UN ALUNNO, CALCULE EL PROMEDIO E IMPRIMA ALGUNO DE 
       ESTOS MENSAJES : SI EL PROMEDIO ES MAYOR O IGUAL A 7 MOSTRAR "PROMOCIONADO", SI EL PROMEDIO ES MAYOR O IGUAL A 
       4 Y MENOR QUE 7 MOSTRAR "REGULAR" SI EL PROMEDIO ES MENOR A 4 MOSTRAR "REPROBADO".
 *
 */

public class EjerciciosCondicionales6 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int nota1, nota2, nota3, promedio;

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosCondicionales6
		EjerciciosCondicionales6 operacion = new EjerciciosCondicionales6();
		operacion.getVentana();
		operacion.getPromedio();

	}
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS
	public void getVentana() {
		// CREAMOS VENTANA.
		text1 = JOptionPane.showInputDialog("Ingrese primera nota");
		// PASAMOS DE INT A STRING
		nota1 = Integer.parseInt(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese segunda nota");
		// PASAMOS DE INT A STRING
		nota2 = Integer.parseInt(text2);
		
		text3 = JOptionPane.showInputDialog("Ingrese tercera nota");
		// PASAMOS DE INT A STRING
		nota3 = Integer.parseInt(text3);
	}
	
	
	// METODO QUE PERMITE CALCULAR EL PROMEDIO DE LOS ESTUDIANTES.
	public void getPromedio() {
		// VALIDAMOS EL PROMEDIO.
		promedio = (nota1 + nota2 + nota3)/3;
		
		// VALIDAMOS.
		if(promedio >= 7) {
			System.out.println("Promocionado...");
		} else {
			if(promedio >= 4) {
				System.out.println("Regular...");
			} else {
				System.out.println("Reprobado...");
			}
		}
	}

}
