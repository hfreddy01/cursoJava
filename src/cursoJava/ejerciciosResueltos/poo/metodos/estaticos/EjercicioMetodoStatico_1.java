package cursoJava.ejerciciosResueltos.poo.metodos.estaticos;

/**
 * 
 * @author cursoJava
 * 
 *         IMPLEMENTAR UNA CLASE LLAMADA OPERACION. DEFINIR DOS METODOS
 *         ESTATICOS QUE PERMITAN SUMAR Y RESTAR DOS VALORES ENTEROS.
 *
 */

public class EjercicioMetodoStatico_1 {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// IMPRIMIMOS.
        System.out.print("La suma de 2+4 es : ");
        System.out.println(EjercicioMetodoStatico_1.sumarValores(2, 4));
        System.out.print("La resta de 6-2 es : ");
        System.out.println(EjercicioMetodoStatico_1.restarValores(6, 2));
	}
	
	// METODO QUE PERMITE REALIZAR SUMA DE VALORES.
	public static int sumarValores(int num1, int num2) {
		int resultadoSuma = num1 + num2;
		return resultadoSuma;
	}
	
	// METODO QUE PERMITE REALIZAR RESTAR VALORES.
	public static int restarValores(int num1, int num2) {
		int resultadoResta = num1 - num2;
		return resultadoResta;
	}
}
