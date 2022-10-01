package cursoJava.ejerciciosResueltos.recursividad.otroEjercicios;
/**
 * 
 * @author cursoJava
 * 
 * Imprimir la informaci�n de una lista simplemente encadenada de atr�s para adelante.
El empleo de estructuras repetitivas para resolver este problema es bastante engorroso y lento (debemos avanzar 
hasta el �ltimo nodo e imprimir, luego avanzar desde el principio hasta el ante�ltimo nodo y as� sucesivamente)
 *
 */
public class Recursividad1 {
	class Nodo {
		int info;
		Nodo sig;
	}

	private Nodo raiz;

	void insertarPrimero(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = raiz;
		raiz = nuevo;
	}

	public void imprimirInversa(Nodo reco) {
		if (reco != null) {
			imprimirInversa(reco.sig);
			System.out.print(reco.info + "-");
		}
	}

	public void imprimirInversa() {
		imprimirInversa(raiz);
	}

	public static void main(String[] ar) {
		Recursividad1 r = new Recursividad1();
		r.insertarPrimero(10);
		r.insertarPrimero(4);
		r.insertarPrimero(5);
		r.imprimirInversa();
	}
}
