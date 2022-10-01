package cursoJava.ejerciciosResueltos.poo.herencia;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 *         IMPLEMENTAR DOS CLASE QUE LLAMAREMOS SUMA Y RESTA. CADA CLASE TIENE
 *         COMO ATRIBUTO VARLO1, VALOR2 Y RESULTADO. LOS METODOS A DEFINIR SON
 *         CARGAR1 (QUE INICIALIZA EL ATRIBUTO VALOR1), CARGAR2 (QUE INICIALIZA
 *         EL ATRIBUTO VALOR2), OPERAR (QUE EN EL CASO DE LA CLASE SUMA SUMA LOS
 *         DOS ATRIBUTOS Y EN EL CASO DE LA CLASE RESTA HAGA LA REFERENCIA ENTRE
 *         EL VALOR1 Y VALOR2, Y OTRO METODO MOSTRARRESULTADO)
 *
 */

public class Operacion {
	// ATRIBUTOS DE LA CLASE.
	protected Scanner teclado;
	protected int valor1;
	protected int valor2;
	protected int resultado;

	// METODO CONSTRUCTOR.
	public Operacion() {
		// CREAMOS EL OBJETO SCANNER PARA EL INGRESO DE VALORES POR TECLADO.
		teclado = new Scanner(System.in);
	}

	// CREAMOS METODO QUE PERMITE INGRESAR VALOR1.
	public void cargarPrimerValor() {
        System.out.print("Ingrese el primer valor:");
        valor1=teclado.nextInt(); 
	}

	// CREAMOS METODO QUE PERMITE INGRESAR VALOR2.
	public void cargarSegundoValor() {
		System.out.println("Ingrese segundo valor :");
		valor2 = teclado.nextInt();
	}

	// CREAMOS METODO QUE PERMITE MOSTRAR EL RESULTADO.
	public void mostrarResultado() {
		// IMPRIMIMOS
		System.out.println(resultado);

	}
}
