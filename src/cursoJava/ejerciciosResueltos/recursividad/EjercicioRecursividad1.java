package cursoJava.ejerciciosResueltos.recursividad;

/**
 * 
 * @author cursoJava
 * 
 *         IMPLEMENTACION DE UN METODO RECURSIVO.
 * 
 *
 */

public class EjercicioRecursividad1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE EjercicioRecursividad1.
		EjercicioRecursividad1 recursivo = new EjercicioRecursividad1();
		recursivo.repetir();

	}
	
	// METODO RECURSIVO.
	void repetir() {
		repetir();
	}

}
