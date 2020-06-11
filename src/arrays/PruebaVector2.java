package arrays;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * Definir un vector de 5 componentes de tipo float que representen las alturas de 5 personas.
   Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas.
 *
 */

public class PruebaVector2 {
	// PROPIEDADES DE LA CLASE.
	private String text1;
	private float[] alturas;
	private float promedio;
	
	// METODO QUE PERMITE CARGAR DATOS.
	public void getCragarDatos() {
		// CREAMOS ONJETO ARRAYS.
		alturas = new float[5];
		// VALIDAMOS.
		for(int i=0; i<5; i++) {
			text1 = JOptionPane.showInputDialog("Ingrese altura de la persona");
			alturas[i] = Float.parseFloat(text1);
		}
	}
	
	// METODO QUE PERMITE CALCULAR EL PROMEDIO.
	public void getCalcularPromedio() {
		// CREAMOS VARIABLE SUMA Y LA INCIALIZAMOS EN CERO.
		float suma = 0;
		
		// VALIDAMOS.
		for(int i =0; i<5; i++) {
			suma = suma + alturas[i];
		}
		
		// VALIDAMOS PROMEDIO.
		promedio = suma / 5;
	}
	
	
	// METODO QUE PERMITE CLACULAR ALTURAS MAYORES Y MENORES.
	public void getCalcularAlturas() {
		// VALIDAMOS.
		int mayor = 0;
		int menor = 0;
		// VALIDAMOS.
		for(int i=0; i<5; i++) {
			if(alturas[i] > promedio) {
				mayor++;
			} else if(alturas[i] < promedio) {
				menor++;
			} else {
				System.out.println("Error");
			}
		}
		
		// IMPRIMOS.
	    System.out.println("Cantidad de personas mayores al promedio:"+mayor);
        System.out.println("Cantidad de personas menores al promedio:"+menor);
	}
		

}
