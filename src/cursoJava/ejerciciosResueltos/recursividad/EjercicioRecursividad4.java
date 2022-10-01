package cursoJava.ejerciciosResueltos.recursividad;

/**
 * 
 * @author cursoJava
 * 
 *         IMPRIMIR LOS NUMEROS DE 1 A 5 EN PANTALLA UTILIZANDO RECURSIVIDAD.
 * 
 *
 */

public class EjercicioRecursividad4 {

	// METOO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjercicioRecursividad4.
		EjercicioRecursividad4 recursivo = new EjercicioRecursividad4();
		recursivo.imprimir(5);
	}

	// METODO QUE PERMITE IMPRIMIR LOS VALORES.
	void imprimir(int x) {
		if (x > 0) {
			imprimir(x);
			System.out.println(x);
		}
	}
}
