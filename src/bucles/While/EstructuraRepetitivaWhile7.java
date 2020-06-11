package bucles.While;

import javax.swing.JOptionPane;

/**
 * 
 * @author Freddy
 * 
 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los sueldos que 
 * cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además el programa 
 * deberá informar el importe que gasta la empresa en sueldos al personal.
 *
 */
 
public class EstructuraRepetitivaWhile7 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private int x, n, contador1, contador2;
	private float sueldo, gastos;
	
	// METODO QUE PERMITE CREAR Y VALIDAR TODO.
	public void getCreateAll() {
		// INICIALIZAMO VARIABLES.
		x = 1;
		contador1 = 0;
		contador2 = 0;
		gastos = 0;
		
		text1 = JOptionPane.showInputDialog("Cuantos empleados tiene la empresa");
		n = Integer.parseInt(text1);
		// VALIDAMOS.
		while(x <= n) {
			text2 = JOptionPane.showInputDialog("Ingrese el sueldo del empleado");
			sueldo = Float.parseFloat(text2);
			// VALIDAMOS.
			if(sueldo <= 300) {
				contador1++;
			} else {
				contador2++;
			}
			// VALIDAMOS LOS GATOS.
			gastos = gastos + sueldo;
			// INCREMENTAMOS
			x++;
		}
		
		//IMPRIMIMOS
		  System.out.println("Cantidad de empleados con sueldos entre 100 y 300 : " +contador1);
	      System.out.println("Cantidad de empleados con sueldos mayor a 300 : " +contador2);
	      System.out.println("Gastos total de la empresa en sueldos : " +gastos);
	}

}
