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

public class Cliente {
	// ATRIBUTOS DE LA CLASE.
	private String nombre;
	private int monto;

	// CONSTRUCTOR DE LA CLASE.
	public Cliente(String nomb) {
		nombre = nomb;
		monto = 0;
	}

	// METODO QUE PERMITE REALIZAR DEPOSITO.
	public void depositar(int money) {
		// VALIDAMOS.
		monto = monto + money;
	}

	// METODO QUE PERMITE RETORNAR MONTO.
	public int mostrarMonto() {
		return monto;
	}

	// METODO QUE PERMITE IMPRIMIR EL NOMBRE Y EL MONTO DEPOSITADO.
	public void mostra() {
		System.out.println(nombre + " :" +monto);
	
	}
}
