package cursoJava.ejerciciosResueltos.poo.herencia;

/**
 * 
 * @author cursoJava
 * 
 * CLAEE QUE EJECUTA LOS PROGRAMAS DE LOS EJERCICIOS DE HERENCIA
 */

public class TestHerencia {

	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE SUMA
		Suma suma1 = new Suma();
		suma1.cargarPrimerValor();
		suma1.cargarSegundoValor();
		suma1.operar();
		System.out.print("El resultado de la suma es:");
		suma1.mostrarResultado();
		// CREAMOS EL OBJETO DE LA CLASE RESTA
		Resta resta1 = new Resta();
		resta1.cargarPrimerValor();
		resta1.cargarSegundoValor();
		resta1.operarResta();
		System.out.print("El resultado de la resta es:");
		resta1.mostrarResultado();
		System.out.println("***Inicializando programa de carga de sueldo de persona ");
		// CREAMOS OBJRTO DE LA CLASE EjericioHerencia1
		EjericioHerencia1 persona1=new EjericioHerencia1();
        persona1.cargarDatosPersonales();
        // CREAMOS OBJETO DE LA CLASE EjericioHerencia2
        EjercicioHerencia2 empleado1=new EjercicioHerencia2();
        empleado1.cargarDatosPersonales();
        empleado1.cargarSueldoPersona();
        persona1.imprimirDatosPersonales();        
        empleado1.imprimirDatosPersonales();
        empleado1.imprimirSueldoPersona();

	}

}
