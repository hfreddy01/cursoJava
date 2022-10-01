package cursoJava.ejerciciosResueltos.poo.metodos.estaticos;

/**
 * 
 * @author cursoJava
 * 
 *         DECLARAR UNA CLASE CON LOS ATRIBUTOS NOMBRE Y EDAD. DEFINIR UN METODO
 *         ESTATICO QUE RECIBA COMO PARAMETROS DOS OBJETOS DE LA CLASE, Y ME
 *         RETORNE LA QUE TIENE UNA EDAD MAYOR. SI SON IGUALES RETORNE
 *         CUALQUIERA DE LAS DOS.
 * 
 *
 */

public class EjercicioMetodoStatico_2 {
	// ATRIBITOS DE LA CLASE.
	private String nombre;
	private int edad;

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE.
		EjercicioMetodoStatico_2 persona1 = new EjercicioMetodoStatico_2("Freddy", 37);
		EjercicioMetodoStatico_2 persona2 = new EjercicioMetodoStatico_2("Ana", 50);
		persona1.imprimirDatos();
		persona2.imprimirDatos();
		EjercicioMetodoStatico_2 personaMayor = EjercicioMetodoStatico_2.mayorEdad(persona1, persona2);
		System.out.println("Persona con mayor edad : ");
		personaMayor.imprimirDatos();
	}

	// METODO CONSTRUCTOR DE LA CLASE.
	public EjercicioMetodoStatico_2(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// METODO QUE PERMITE IMPRIMIR LOS DATOS.
	public void imprimirDatos() {
		// IMPRIMIMOS.
		System.out.println("Nombre : " + this.nombre);
		System.out.println("Edad : " + this.edad);
	}

	// METODO QUE PERMITE VALIDAR CUAL ES MAYOR.
	public static EjercicioMetodoStatico_2 mayorEdad(EjercicioMetodoStatico_2 edad1, EjercicioMetodoStatico_2 edad2) {
		// VALIDAMOS.
		if (edad1.edad > edad2.edad) {
			return edad1;
		} else {
			return edad2;
		}
	}
}
