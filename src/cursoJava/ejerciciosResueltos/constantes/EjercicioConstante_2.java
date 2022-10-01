package cursoJava.ejerciciosResueltos.constantes;

/**
 * 
 * @author cursoJava
 * 
 *         IMPLEMENTAR UNA CASE. SE DEBE ALMACENAR EL NUMERO DE DOCUMENTO DEL
 *         TITULAR Y EL MONTO DEPOSITADO. UNA VEZ QUE SE CARGA EL DOCUMENTO NO
 *         PERMITIR SU CAMBIO. PLANTEAR DOS CONSTRUCTORES UNO QUE LLEGUE EL
 *         DOCUMENTO DEL TITULAR Y EL MONTO A DEPOSITAR, Y UN SEGUNDO
 *         CONSTRUCTOR QUE SOLO LLEGUE EL DOCUMENTO.
 * 
 *
 */

public class EjercicioConstante_2 {
	// ATRIBUTO DE LA CLASE.
	private static final int MAYOREDAD = 18;
	private String nombre;
	private int edad;

	// METODO CONSTRUCTOR.
	public EjercicioConstante_2(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// METODO QUE PERMITE IMPRIMIRI LOS DATOS
	public void imprimirDatosPersona() {
		System.out.println("Nombre persona : " + nombre);
		System.out.println("Edad : " + edad);
	}

	// METODO QUE PERMITE RETORNAR EL NOMBRE
	public String getNombre() {
		return nombre;
	}

	// METODO QUE PERMITE VALIDAR SI ES MAYOR DE EDAD.
	public boolean mayorEdad() {
		// VALIDAMOS.
		if (edad >= MAYOREDAD) {
			return true;
		} else {
			return false;
		}
	}

	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjercicioConstante_2
		EjercicioConstante_2 person = new EjercicioConstante_2("Freddy", 37);
		// VALIDAMOS.
		if (person.mayorEdad()) {
			System.out.println("La persona mayor de edad es :" + person.getNombre());
		} else {
			System.out.println("La persona NO mayor de edad es : " + person.getNombre());
		}
	}
}
