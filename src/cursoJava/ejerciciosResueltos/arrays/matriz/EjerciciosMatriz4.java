package cursoJava.ejerciciosResueltos.arrays.matriz;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS DE ARRYAS CON MATRIZ :
 * 
 *         4 - CREAR UNA MATRIZ DE 2 FILAS Y 5 COLUNNAS. REAILIZAR LA CARGA DE
 *         COMPONENTES POR COLUNNA, ES DECIR PRIMERO INGRESAR TODA LA PRIMERA
 *         COLUNNA, LUEGO LA SEGUNDA COLUNNA Y ASI SUCESIVAMENTE. IMPRIMIR LUEGO
 *         LA MATRIZ.
 *
 */

public class EjerciciosMatriz4 {
	// PROPIEDADES DE LA CLASE.
	private String text;
	private int matriz[][];

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosMatriz4
		EjerciciosMatriz4 op = new EjerciciosMatriz4();
		op.getVentanaDatos();
		op.getImprimir();

	}

	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getVentanaDatos() {
		// CREAMOS OBJETO DE LA MARIZ.
		matriz = new int[2][5];
		JOptionPane.showMessageDialog(null, "Carga de la matriz por columna:");
		// VALIDAMOS.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				// INTRODUCIMOS DATOS POR VENTANA DE DIALOGO.
				text = JOptionPane.showInputDialog("Ingrese componente de la fila j y la columna i");
				// TRANSFORMAMOS DE INT A STRING.
				matriz[j][i] = Integer.parseInt(text);
			}
		}
	}

	// METODO QUE PERMITE IMPRIMIR LA MATRIZ.
	public void getImprimir() {
		// VALIDAMOS.
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.println(matriz[j][i] + "");
			}
			System.out.println();
		}
	}
}
