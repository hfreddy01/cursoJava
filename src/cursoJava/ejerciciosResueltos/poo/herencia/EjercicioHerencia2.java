package cursoJava.ejerciciosResueltos.poo.herencia;

/**
 * 
 * @author cursoJava
 * 
 *         CONFECCIONAR UNA CLASE "EjercicioHerencia1" QUE TENGA COMO ATRIBUTOS
 *         EL NOMBRE Y LA EDAD. DEFINIR COMO RESPONSABILIDADES UN METODO QUE
 *         CARGUE LOS DATOS PERSONALES Y OTRO QUE LOS IMPRIMA. PLANTEAR UNA
 *         SEGUNDA CLASE "EjercicioHerencia2" QUE HEREDE DE LA CLASE
 *         "EjercicioHerencia1". AÑADIR UN ATRIBTO SUELDO Y LOS METODOS DE CARGA
 *         EL SUELDO E IMPRIMIR SU SUELDO. DEFINIR UN OBJETO DE LA CLASE
 *         "EjercicioHerencia1" Y LLAMAR A SUS METODOS. TAMBIEN CREAR UN OBJETO
 *         DE LA CLASE "EjercicioHerencia2" Y LLAMAR A SUS METODOS.
 *
 */

public class EjercicioHerencia2 extends EjericioHerencia1 {
	// ATRIBUTOS DE LA CLASE.
	protected int sueldo;
	
	// METODO QUE PERMITE CARGAR EL SEULEDO DE UNA PERSONA.
	public void cargarSueldoPersona() {
		// CARGAMOS.
		System.out.println("Ingrese sueldo :");
		sueldo = teclado.nextInt();
	}
	
	// IMPRIMIMOS EL SUELDO.
	public void imprimirSueldoPersona() {
		System.out.println("Sueldo : " +sueldo);
	}
}
