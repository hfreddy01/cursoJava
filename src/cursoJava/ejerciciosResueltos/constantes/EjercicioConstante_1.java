package cursoJava.ejerciciosResueltos.constantes;

/**
 * 
 * @author cursoJava
 * 
 *         IMPLEMENTAR UNA CLASE. DEFINIR UNA CONSTANTE DONDE SE DEBE ALMACENAR
 *         EL VALOR DE PI(RELACION ENTRE LA LONGITUD DE UNA CIRCUNSFERENCIA Y SU
 *         DIAMETRO). ADEMAS DEFINIR OTRO ATRIBITO DONDE ALMACENAR EL RADIO DEL
 *         CIRCULO. AL CONSTRUCTOR DEBE LLEGAR EL RADIO Y OTRO METODO DEBE
 *         RETORNAR EL PERIMETRO.
 *
 */

public class EjercicioConstante_1 {
	// ATRIBUTOS DE LA CLASE.
	private final double PI = 3.14159265358979323846;
	private double radio;

	// METODO CONSTRUCTOR DE LA CLASE.
	public EjercicioConstante_1(double radio) {
		this.radio = radio;
	}

	// METODO QUE PERMITE RETORNAR EL RADIO.
	public double retornarPerimetro() {
		// VALIDAMOS.
		double resultado = 2 * PI * radio;
		return resultado;
	}

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE EjercicioConstante_1.
		EjercicioConstante_1 circulo1 = new EjercicioConstante_1(5);
		// IMPRIMIMOS.
		System.out.println(circulo1.retornarPerimetro());
	}
}
