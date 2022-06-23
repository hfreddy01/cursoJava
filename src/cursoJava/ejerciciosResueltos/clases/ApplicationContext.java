package cursoJava.ejerciciosResueltos.clases;
/**
 * 
 * @author cursoJava
 * 
 * CLASE PRINCIPAL EN LA CUAL SE EJECUTAN TODOS LOS PROGRAMAS.
 *
 */
public class ApplicationContext {

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		/***************************************************************/
		// CREAMOS EL OBJETO PERSONA.
		//Persona person = new Persona();
		//person.cargarDatosPersona();
		//person.esMayorEdad();
		/***************************************************************/
		// CREAMOS OBJETO TRIANGULO
		//Triangulo triangulo = new Triangulo();
		//triangulo.cargarDatosTriangulo();
		//triangulo.ladoMayor();
		//triangulo.esEquilatero();
		/***************************************************************/
		// CREAMOS OBJETO DEL PUNTO.
		//Punto punto = new Punto();
		//punto.cargarDatosCoordenadas();
		//punto.imprimirCuadrante();
		/***************************************************************/
		// CREAMOS OBJETO DEL Cuadrado
		//Cuadrado cuadrado = new Cuadrado();
		//cuadrado.cargarValorLado();
		//cuadrado.validarPerimetro();
		//cuadrado.validarSuperficie();
		/***************************************************************/
		// CREAMOS OBJETO EMPLEADO.
		//Empleado empleado = new Empleado();
		//empleado.cargarDatosEmpleados();
		//empleado.pagaImpuestoEmpleado();
		/***************************************************************/
		// CREAMOS OBJETO OPERACIONES.
		Operaciones op = new Operaciones();
		op.cargarValores();
		op.sumar();
		op.resta();
		op.multiplicacion();
		op.division();
		/***************************************************************/

	}

}
