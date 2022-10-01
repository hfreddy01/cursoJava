package cursoJava.ejerciciosResueltos.poo.herencia;

import java.util.Scanner;

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

public class EjericioHerencia1 {
	// ATRIBUTOS DE LA CLASE.
	protected Scanner teclado;
	protected String nombre;
	protected int edad;

	// METOD CONSTRUCTOR.
	public EjericioHerencia1() {
		teclado = new Scanner(System.in);
	}

	// METODO QUE PERMITE INGRESAR LOS DATOS POR TECLADO.
	public void cargarDatosPersonales() {
		System.out.println("Ingrese nombre : ");
		nombre = teclado.nextLine();
		System.out.println("Ingrese edad : ");
		edad = teclado.nextInt();
	}

	// METODO QUE PERMITE IMPRIMIR LOS DATOS PERSONALES.
	public void imprimirDatosPersonales() {
		// IMPRIMIMODS.
		System.out.println("Nombre : " + nombre);
		System.out.println("Edad : " + edad);
	}
}
