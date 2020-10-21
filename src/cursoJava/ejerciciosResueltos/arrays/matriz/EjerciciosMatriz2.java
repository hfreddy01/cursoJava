package cursoJava.ejerciciosResueltos.arrays.matriz;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava.
 * 
 *  2 - CREAR Y CARGAR UNA MATRIZ DE 4 FILAS POR 4 COLUNNAS. IMPRIMIR LA DIAGONAL PRINCIPAL.
 *
 */

public class EjerciciosMatriz2 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private int [][] matriz;

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosMatriz2
		EjerciciosMatriz2 op = new EjerciciosMatriz2();
		op.getAddWindows();
		op.getAddWindows();
		

	}
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void getAddWindows() {
		// CREAMOS OBJETO MATRIZ.
		matriz = new int[4][4];
		// MENSAJE.78
		JOptionPane.showMessageDialog(null, "2 - CREAR Y CARGAR UNA MATRIZ DE 4 FILAS POR 4 COLUNNAS. IMPRIMIR LA DIAGONAL "
		+ "PRINCIPAL.");
		
		// VALIDAMOS.
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				//INTRODUCIMOS DATOS POR VENTANA DE DIALOGO.
				text1 = JOptionPane.showInputDialog("introduce componente");
				// TRANSFORMAMOS DE INT A STRING.
				matriz[i][j] = Integer.parseInt(text1);
			}
		}
	}
	
	// METODO QUE PERMITE IMPRIMIR DIAGONAL PRINCIPAL.
	public void getAddDiagonal() {
		// VALIDAMOS.
		for(int k=0; k<4; k++) {
			System.out.println(matriz[k][k] +"");
		}
		
	}

}
