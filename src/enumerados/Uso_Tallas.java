package enumerados;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class Uso_Tallas {
	
	// DECLARAMOS ENUM
	//enum Talla {PEQUEÑA, MEDIANA, GRANDE, EXTRA_GRANDE};
	enum Talla {

		PEQUEÑA("S"), MEDIANA("M"), GRANDE("G"), EXTRA_GRANDE("BIG");
		// CREAMOS PROPIEDAD DE LA CLASE Y LA ENCAPSULAMOS.
		private String abreviatura;

		// CONSTRUCTOR
		private Talla(String abreviatura) {
			// THIS.
			this.abreviatura=abreviatura;
			
		}
		
		// METODO QUE OBTIENE LA ABREVIATURA.
		public String getAbreviatura() {
			
			return abreviatura;
		}
	}
	
	
	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// INICILIAZMOS.
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Ingrese Talla : ");
		String entrada = teclado.next().toUpperCase();
		
		
		Talla talla=Enum.valueOf(Talla.class, entrada);
		//IMPRIMIMOS.
		System.out.println("Talla : " +talla);
		System.out.println("Abreviatura : " +talla.getAbreviatura());
		/**
		Talla s = Talla.PEQUEÑA;
		Talla m = Talla.MEDIANA;
		Talla xl = Talla.GRANDE;
		Talla big = Talla.EXTRA_GRANDE;
		**/

	}

}
