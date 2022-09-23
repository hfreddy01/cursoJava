package cursoJava.ejerciciosResueltos.banco;
/**
 * 
 * @author cursoJava
 * 
 * UN BANCO TIENE 3 CLIENTES QUE PUEDEN HACER DEPOSITOS Y EXTRACCIONES. TAMBIEN EL BANCO REQUERE QUE AL FINAL
 * DEL DIA CALCULE LA CANTIDAD DE DINERO QUE HAY DEPOSITADA.
 * 
 *
 */

public class EjecutarBanco {

	// METODO QUE PERMITE EJECUTAR EL PROGRAMA BANCO.
	public static void main(String[] args) {
		// CREAMOS OBJETO DE LA CLASE Banco
		Banco banco = new Banco();
		banco.operacion();
		banco.depositoTotal();
	}

}
