package Static;

public class EjemploStatic1 {
	// PROPIEDADES DE LA CLASE.
	public  String nombre;
	public  String apellido;
	public static int idSigiente=0;
	
	
	// CONSTRUCTOR DE LA CLASE.
	public  EjemploStatic1(int id, String nomb, String ape) {
		id = idSigiente++;
		nombre = nomb;
		apellido = ape;
		
	}
	
	
	// METODO PARA OBTENER LOS DATOS.
	public String setObtener(){
		String datos =" nombre : " +nombre +" apellido : " +apellido +EjemploStatic1.dameID();
		
		return datos;
	}
	
	// METODO STATICO PARA OBTENER EL ID
	public static String dameID() {
		return "Id : "+idSigiente;
	}

}
