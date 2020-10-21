package cursoJava.ejerciciosResueltos.arrays.matriz;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 * 3 - CREAR Y CARGAR UNA MATRIZ DE 3 FILAS POR 4 COLUNNAS. IMPRIMIR LA PRIMERA FILA. IMPRIMIR LA ULTIMA FILA E
 *     IMPRIMIR LA PRIMERA COLUNNA.
 *
 */
public class EjerciciosMatriz3 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int matriz[][];

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosMatriz3
		EjerciciosMatriz3 op = new EjerciciosMatriz3();
		op.getVentanaDialogo();
		op.getPrimeraFila();
		op.getUltimaFila();
		op.getPrimeraColunna();

	}
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getVentanaDialogo() {
		// MENSAJE.
		JOptionPane.showMessageDialog(null, "3 - CREAR Y CARGAR UNA MATRIZ DE 3 FILAS POR 4 COLUNNAS. IMPRIMIR LA PRIMERA FILA. "
		+ "IMPRIMIR LA ULTIMA FILA E\r\n" + "IMPRIMIR LA PRIMERA COLUNNA.");
		
		// CREAMOS OBJETO DE LA MATRIZ.
		matriz = new int[3][4];
		// VALIDAMOS.
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				// INTRODUCIMOS DATOS POR VENTANA DE DIALOGO.
				text1 = JOptionPane.showInputDialog("Introduce componente");
				matriz[i][j] = Integer.parseInt(text1);
			}
		}
	}
	
	
	// METODO QUE PERMITE IMPRIMIR LA ULTIMA FILA E IMPRIMIR LA PRIMERA COLUNNA.
	public void getPrimeraFila() {
		// VALIDAMOS.
		System.out.println("Primer fila de la matriz :");
		// VALIDAMOS.
		for(int j =0; j<3; j++) {
			System.out.println(matriz[0][j]);
		}
	}
	
	
	// METODO QUE IMPRIME LA ULTIMA FILA.
	public void getUltimaFila() {
		// VALIDAMOS.
		System.out.println("Ultima fila de la matriz.");
		for(int j=0; j<4; j++) {
			System.out.println(matriz[2][j]);
		}
	}
	
	
	// METODO QUE PERMITE IMPRIMIR PRIMERA COLUNNA.
	public void getPrimeraColunna() {
		// VALIDAMOS.
		System.out.println("Primera Colunna de la matriz.");
		for(int i=0; i<34; i++) {
			System.out.println(matriz[i][0]);
		}
	}

}
