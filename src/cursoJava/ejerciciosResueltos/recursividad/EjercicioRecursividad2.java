package cursoJava.ejerciciosResueltos.recursividad;

/**
 * 
 * @author cursoJava
 * 
 *         IMPLEMENTACION DE UN METODO RECURSIVO QUE RECIBA UN PARAMETRO DE TIPO
 *         ENTERO Y LUEGO LLAME EN FORMA RECURSIVA CON EL VALOR DEL PARAMETRO
 *         MENOS 1.
 *
 */

public class EjercicioRecursividad2 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjercicioRecursividad2
		EjercicioRecursividad2 recursivo = new EjercicioRecursividad2();
		recursivo.repetir(5);
	}

	// METODO RECURSIVO.
	void repetir(int x) {
		// IMPRIMIMOS.
		System.out.println(x);
		repetir(x);
	}
}
