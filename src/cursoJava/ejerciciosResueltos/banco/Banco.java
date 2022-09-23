package cursoJava.ejerciciosResueltos.banco;

/**
 * 
 * @author cursoJava
 * 
 *         UN BANCO TIENE 3 CLIENTES QUE PUEDEN HACER DEPOSITOS Y EXTRACCIONES.
 *         TAMBIEN EL BANCO REQUERE QUE AL FINAL DEL DIA CALCULE LA CANTIDAD DE
 *         DINERO QUE HAY DEPOSITADA.
 * 
 *
 */

public class Banco {
	// ATRIBUTOS DE LA CLASE.
	private Cliente cliente1, cliente2, cliente3;

	// METODO CONSTRUCTOR.
	public Banco() {
		// CREAMOS EL OBJETO CLIENTE.
		cliente1 = new Cliente("Freddy Herrera");
		cliente2 = new Cliente("Teresa Bornachera");
		cliente3 = new Cliente("Yessica Carrillo");

	}

	// METODO QUE PERMITE REALIZAR OPERACION.
	public void operacion() {
		cliente1.depositar(200);
		cliente2.depositar(600);
		cliente3.depositar(275);
	}

	// METODO QUE PERMITE MOSTRAR EL TOTAL DE DEPOSITOS.
	public void depositoTotal() {
		int depositoG = cliente1.mostrarMonto() + cliente2.mostrarMonto() + cliente3.mostrarMonto();
		cliente1.mostra();
		cliente2.mostra();
		cliente3.mostra();
		System.out.println("El total de deposito es : " + depositoG);
	}
}
