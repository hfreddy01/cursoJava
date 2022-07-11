package cursoJava.ejerciciosResueltos.metodos.constructor;
/**
 * 
 * @author cursoJava
 * 
 * 3 - PLANTEAR UNA CLASE TABLA DE MULTIPLICAR, DEFINIR DOS CONSTRUCTORES UNO CON UN PARAMETRO QUE LLEGUE UN ENTERO 
 *     INDICANDO QUE TABLA QUEREMOS VER, Y OTRO CON DOS PARAMETROS ENTEROS QUE INDIQUE EL PRIMERO QUE TABLA QUEREMOS VER Y 
 *     EL SEGUNDO PARAMETRO INDICA CUANTOS TERMINOS MOSTRAR. SINO LLEGA LA CANTIDAD DE TERMINOS A MOSTRAR INICIALIZAR EN
 *     10 LOS TERMINOS A MOSTRAR.
 *
 */
public class TablaMultiplicar {
	// ATRIBUTOS.
	private int tabla;
	private int terminos;
	
	// METODO CONSTRUCTOR.
	public TablaMultiplicar(int tablas, int terminos) {
		tabla = tablas;
		terminos = terminos;
	}
	
	// METODO CONSTRUCTOR.
	public TablaMultiplicar(int tabla) {
		tabla = tabla;
		terminos = 10;
	}
	
	// METODO QUE PERMITE IMPRIMIR.
	public void imprimir() {
		int result;
		
		System.out.println("La tabla de Multiplicar de " +tabla);
		// VALIDAMOS.
		for(int i = 1; i<=terminos; i++) {
			result = i*tabla;
			System.out.println(tabla + "*" + i + " = " + result);
		}
	}

}
