package condicionales.anidadas;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el promedio e imprima alguno de estos mensajes:
	Si el promedio es >=7 mostrar "Promocionado".
	Si el promedio es >=4 y <7 mostrar "Regular".
	Si el promedio es <4 mostrar "Reprobado".
 *
 */

public class EstructuraCondicionalAnidada1 {
	// PROPIEDADES
	private String nomb1, nomb2, nomb3;
	private int nota1, nota2, nota3, promedio;
	
	
	// METODO QUE PERMITE CREAR E INTRODUCIR VALORES POR VENTANA DE DIALOGO.
	public void getVentana() {
		nomb1 = JOptionPane.showInputDialog("Ingrese primnera nota");
		nota1 = Integer.parseInt(nomb1);
		
		nomb2 = JOptionPane.showInputDialog("Ingrese segunda nota");
		nota2 = Integer.parseInt(nomb2);
		
		nomb3 = JOptionPane.showInputDialog("Ingrese tercera nota");
		nota3 = Integer.parseInt(nomb3);
	}
	
	
	// METODO QUE PERMITE VALIDAR LAS NOTAS DEL ALUNNO.
	public void getNotaPromedio() {
		// VALIDAMOS EL PROMEDIO.
		promedio = (nota1 + nota2 + nota3) / 3;
		// VALIDAMOS.
		if(promedio >= 7) {
			System.out.println("Promocionado...");
		} else if(promedio >= 4) {
			System.out.println("Regular...");
		} else {
			System.out.println("Reprobado...");
		}
	}

}
