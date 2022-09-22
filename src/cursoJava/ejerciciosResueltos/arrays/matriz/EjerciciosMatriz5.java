package cursoJava.ejerciciosResueltos.arrays.matriz;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE ARRAYS CON MATRIZ :
 * 
 *         5 - CREAR UNA MATRIZ DE N * M FILAS (CARGAR N Y M POR TECLADO)
 *             IMPRIMIR LA MATRIZ COMPLETA Y LA ULTIMA FILA.
 *
 */

public class EjerciciosMatriz5 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int filas, colunnas;
	private int[][] matriz;

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosMatriz5.
		EjerciciosMatriz5 op = new EjerciciosMatriz5();
		op.getAddWindows();
		op.getImprimirMatrizCompleta();
		op.getImprimirUltimaFila();
	}

	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getAddWindows() {
		text1 = JOptionPane.showInputDialog("Cuantas fila tiene la matriz");
		filas = Integer.parseInt(text1);
		text2 = JOptionPane.showInputDialog("Cuantas columnas tiene la matriz");
		colunnas = Integer.parseInt(text2);
		// CREAMOS EL OBJETO DE LA MATRIZ.
		matriz = new int[filas][colunnas];
		// VALIDAMOS.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// INTRODUCIMOS COMPONENTES DE LA MATRIZ POR VENTANA DE DIAOLOGO.
				text3 = JOptionPane.showInputDialog("Introduce componente");
				// TRANSFORMAMOS DE INT A STRING.
				matriz[i][j] = Integer.parseInt(text3);
			}
		}
	}

	// METODO QUE PERMITE IMPRIMIR LA MATRIZ COMPLETA.
	public void getImprimirMatrizCompleta() {
		// VALIDAMOS.
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz[j].length; i++) {
				System.out.println(matriz[j][i] + " ");
			}
		}
	}

	// METODO QUE PERMITE IMPRIMIR LA ULTIMA FILA.
	public void getImprimirUltimaFila() {
		// VALIDAMOS.
		System.out.println("Ultima fila");
		for (int i = 0; i < matriz[matriz.length - 1].length; i++) {
			System.out.println(matriz[matriz.length - 1][i] + "");
		}
	}

}
