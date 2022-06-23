package cursoJava.ejerciciosResueltos.clases;

import java.util.Scanner;

/**
 * 
 * @author cursoJava
 * 
 * 2 - DESARROLLAR UN PROGRAMA QUE CARGUE LOS LADOS DE UN TRIANGULO E IMPLEMNETE LOS SIGUIENTES METODOS: INICIALIZAR LOS ATRIBUTOS,
 * IMPRIMIR EL VALOR DEL LADO MAYOR, Y OTRO METODO QUE MUESTRE SI ES EQUILATERO O NO.
 * 
 * NOTA : SE UTILIZA CON TRY- CATCH.
 *
 */
public class Triangulo {
	// PROPIEDADES DE LA CLASE.
	private Scanner teclado;
	private int lado1;
	private int lado2;
	private int lado3;
	
	// METODO QUE PERMITE CARGAR LOS DATOS DEL TRINAGULO.
	public void cargarDatosTriangulo() {
		// CREAMOS OBJETO SCANNER.
		Scanner teclado = new Scanner(System.in);
		
		try {
			
			System.out.println("Ingrese medida del lado 1 : ");
			lado1 = teclado.nextInt();
			
			System.out.println("Ingrese medida del lado 2 : ");
			lado2 = teclado.nextInt();
			
			
			System.out.println("Ingrese medida del lado 3: ");
			lado3 = teclado.nextInt();
			
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE VALIDAR CUAL DE LOS LADOS ES EL MAYOR.
	public void ladoMayor() {
		try {
			
			if(lado1 > lado2 && lado1 > lado3) {
				System.out.println(lado1);
			} else if(lado2 > lado3) {
				System.out.println(lado2);
			} else {
				System.out.println(lado3);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// METODO QUE PERMITE VALIDAR SI EL LADO ES EQUILATERO.
	public void esEquilatero() {
		try {
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Es un trinagulo Equilatero");
			} else {
				System.out.println("NO es un trinagulo equilatero...");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
