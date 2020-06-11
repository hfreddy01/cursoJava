package bucles.For;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de 
 * un triángulo. El programa deberá informar:
 * 
   a) De cada triángulo la medida de su base, su altura y su superficie.
   b) La cantidad de triángulos cuya superficie es mayor a 12.
 *
 */

public class EstructuraRepetitivaFor6 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2, text3;
	private int n, base, altura, superficie, cantidad;
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DOALOGO PARA ENTRADA DE DATOS E IMPRIME LOS RESULTADOS.
	public void getCreateVentana() {
		// INICILIZAMOS.
		cantidad = 0;
		
		text1 = JOptionPane.showInputDialog("Cuantos triángulos procesara");
		n = Integer.parseInt(text1);
		
		// VALIDAMOS  \.
		for(int i=0; i<=n; i++) {
			text2 = JOptionPane.showInputDialog("Ingrese el valor de la base :");
			base = Integer.parseInt(text2);
			
			text3 = JOptionPane.showInputDialog("Ingrese el valor de la altura : ");
			altura = Integer.parseInt(text3);
			
			// VALIDAMOS.
			superficie = base * altura / 2;
			System.out.println("La superficie es : " +superficie);
			if(superficie > 12) {
				cantidad = cantidad + 1;
			}
					
		}
			// IMPRIMOS.
		    System.out.print("La cantidad de triángulos con superficie superior a 12 son : " +cantidad);	
	}
		
}
