package bucles.While;

/**
 * 
 * @author Freddy
 * 
 * Realizar un programa que imprima en pantalla los números del 1 al 100.
 *
 */
public class EstructuraRepetitivaWhile1 {
	
	public int getNumero() {
		int num = 1;
		
		// VALIDAMOS
		while(num <= 100) {
			System.out.println(num);
			num++;
		}
		
		return num;
	}
	
	

}
