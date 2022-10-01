package cursoJava.ejerciciosResueltos.poo.atributos;

/**
 * 
 * @author cursoJava
 * 
 *         DEFINIR UN ATRIBUTO ESTATICO QUE ALMACENE LA CANTIDAD DE OBJETOS
 *         CREADOS DE DICHA CLASE.
 * 
 *
 */

public class EjericicoAtributoStatico1 {
	// ATRIBUTOS.
	private String nombre;
	private int edad;
	private static int cantidad;

	// METODO PRINCIPAL DE LA CLASE
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjericicoAtributoStatico1
		System.out.println("Valor del atributo estático cantidad :" + EjericicoAtributoStatico1.cantidad);
		EjericicoAtributoStatico1 pers = new EjericicoAtributoStatico1("Freddy", 30);
		pers.imprimirDatosPersona();
		System.out.println("Valor del atributo estático cantidad :" + EjericicoAtributoStatico1.cantidad);
		EjericicoAtributoStatico1 per2 = new EjericicoAtributoStatico1("Ana", 20);
		per2.imprimirDatosPersona();
		System.out.println("Valor del atributo estático cantidad :" + EjericicoAtributoStatico1.cantidad);
		EjericicoAtributoStatico1 per3 = new EjericicoAtributoStatico1("Luis", 10);
		per3.imprimirDatosPersona();
		System.out.println("Valor del atributo estático cantidad :" + EjericicoAtributoStatico1.cantidad);
	}

	// METODO CONSTRUCTOR DE LA CLASE.
	public EjericicoAtributoStatico1(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		cantidad++;
	}

	// METODO QUE PERMITE IMPRIMIR.
	public void imprimirDatosPersona() {
		// IMPRIMIMOS.
		System.out.println("Nombre : " + nombre);
		System.out.println("Edad : " + edad);
	}
}
