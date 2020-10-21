package cursoJava.ejerciciosResueltos.operadores;

import javax.swing.JOptionPane;

/**
 * 
 * @author cursoJava
 * 
 *  8 - DE UN OPERARIO SE CONOCE SU SUELDO Y LOS AÑOS DE ANTIGUEDAD. SE PIDE CONFECCIONAR UN PROGRAMA QUE LEA LOS 
 *      DATOS DE ENTRADA E INFORME: A) SI EL SUELDO ES INFERIOR A 500 Y SU ANTIGUEDAD ES IGUAL O SUPERIOR A 10 AÑOS, 
 *      OTORGARLE UN AUMENTO DE 20%, MOSTRAR EL SUELDO A PAGAR. B) SI EL SUELDO ES INFERIOR A 500 PERO SU ANTIGUEDAD 
 *      ES MENOR A 10 AÑOS OTORGARLE UN AUMENTO DE 5% C) SI EL SUELDO ES MAYOR O IGUAL A 500 MOSTRAR EL SUELDO EN 
 *      PANTALLA SIN CAMABIOS.
 *
 */

public class EjerciciosOperadores8 {
	// PROPIEDADES DE LA CLASE.
	private String text1, text2;
	private float sueldo, aumento, sueldoTotal;
	private int antiguedad;

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] args) {
		// CREAMOS EL OBJETO DE LA CLASE EjerciciosOperadores8
		EjerciciosOperadores8 op = new EjerciciosOperadores8();
		op.mostarVentanas();
		op.getSueldoEmpleado();

	}
	
	
	// METODO QUE PERMITE CREAR VENTANA DE DIALOGO PARA EL INGRESO DE DATOS.
	public void mostarVentanas() {
		// MENSAJE.
		JOptionPane.showMessageDialog(null, "  8 - DE UN OPERARIO SE CONOCE SU SUELDO Y LOS AÑOS DE ANTIGUEDAD. SE PIDE "
				+ "CONFECCIONAR UN PROGRAMA QUE LEA LOS \r\n" 
				+ " * DATOS DE ENTRADA E INFORME");
		
		
		// CREAMOS VENTANA DE DIALOGO
		text1 = JOptionPane.showInputDialog("Ingrese sueldo del empleado:");
		// TRSNFORMAMOS DE INT A STRING.
		sueldo = Float.parseFloat(text1);
		
		text2 = JOptionPane.showInputDialog("Ingrese su antiguedad en años:");
		// TRSNFORMAMOS DE INT A STRING.
		antiguedad = Integer.parseInt(text2);
		
	}
	
	// METODO QUE PERMITECONOCER SUELDO Y ANTIGUEDAD DE UN EMPLEADO
	public void getSueldoEmpleado() {
		// VALIDAMOS.
		if(sueldo < 500 && antiguedad >= 10) {
			aumento = sueldo * 0.20f;
			sueldoTotal = sueldo + aumento;
			System.out.println("Sueldo a pagar : " +sueldoTotal);
		} else if(sueldo < 500 && antiguedad <= 10) {
			aumento = sueldo * 0.5f;
			sueldoTotal = sueldo + aumento;
			System.out.println("Sueldo a pagar : " +sueldoTotal);
		} else {
			System.out.print("Sueldo a pagar :" +sueldo);
		}
	}

}
