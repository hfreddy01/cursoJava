package cursoJava.ejerciciosResueltos.recursividad.otroEjercicios;

/**
 * cursoJava
 * 
 * RECORRER UN ARBOL DE DIRECTORIOS EN FORMA RECURSIVA.

 */

import java.io.File;

public class Recursividad {
	// METODO QUE PERMITE LEER UN ARBOL DE DIRECTORIOS EN FORMA RECURSIVA.
	public void leer(String inicio, String altura) {
		File ar = new File(inicio);
		String[] dir = ar.list();
		// VALIDAMOS
		for (int f = 0; f < dir.length; f++) {
			File ar2 = new File(inicio + dir[f]);
			// VALIDAMOS
			if (ar2.isFile())
				System.out.println(altura + dir[f]);
			if (ar2.isDirectory()) {
				System.out.println(altura + "Directorio:" + dir[f].toUpperCase());
				leer(inicio + dir[f] + "\\", altura + "  ");
			}
		}
	}

	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] arguments) {
		// CREAMOS OBJETO DE LA CLASE
		Recursividad rec = new Recursividad();
		rec.leer("d:\\windows\\", "");
	}
}
