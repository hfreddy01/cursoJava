package cursoJava.ejerciciosResueltos.arrays.matriz;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *         EJERCICIOS ARRYAS CON MATRIZ :
 * 
 *         1 - CREAR UNA MATRIZ DE 3 FILAS POR 5 COLUNNAS CON ELEMENTOS DE TIPO
 *         ENTERO, CREAR SUS COMPONENTES Y LUEGO IMPRIMIRMLOS.
 *
 */

public class EjerciciosMatriz1 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int[][] matriz;

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBKETO DE LA CLASE EjerciciosMatriz1
		EjerciciosMatriz1 op = new EjerciciosMatriz1();
		op.getCreateVentana();
		op.getCreateComponentes();

	}

	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getCreateVentana() {
		// CREAMOS OBJETO DE LA MATRIZ.
		matriz = new int[3][5];
		// INTRODUCIMOS DATOS POR VENTANA DE DIALOGO.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				text1 = JOptionPane.showInputDialog("Ingrese componente");
				// TRANSFORMAMOS DE INT A STRING.
				matriz[i][j] = Integer.parseInt(text1);
			}
		}
	}

	// METODO QUE PERMITE CREAR E IMPRIMIR COMPONENTES.
	public void getCreateComponentes() {
		// VALIDAMOS.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				// IMPIMIMOS.
				System.out.println(matriz[i][j] + " ");
			}
			// IMPORMIMOS.
			System.out.println();
		}
	}

}
