package herencia;

import javax.swing.JOptionPane;

public class Vehiculo {
	// PROPIEDADES DE LA CLASE.
	private static int serialVehiculo=0;
	private String tipoVehiculo;
	private String marcaVehiculo;
	private String colorVehiculo;
	private int pesoCoche;
	private String frenoDisco;
	private float precioCoche;
	
	// CONSTRUCTOR DE LA CLASE.
	public Vehiculo(int serialVehiculos, String tipoVehiculo, String marcaVehiculo, String colorVehiculo) {
		// INICIAAMOS.
		serialVehiculos = serialVehiculo++;
		this.tipoVehiculo = tipoVehiculo;
		this.marcaVehiculo = marcaVehiculo;
		this.colorVehiculo = colorVehiculo;
		
		/**
		String serial  = JOptionPane.showInputDialog("Ingrese serial del Vehiculo");
		serialVehiculo = Integer.parseInt(serial);
		
		tipoVehiculo = JOptionPane.showInputDialog("Ingrese tipo del Vehiculo");
		tipoVehiculo = JOptionPane.showInputDialog("Ingrese marca del Vehiculo");
		marcaVehiculo = JOptionPane.showInputDialog("Ingrese color del Vehiculo");
		
		// IMPRIMIMOS
		System.out.println("Serial Coche :" +serialVehiculo);
		System.out.println("Tipo Coche :" +tipoVehiculo);
		System.out.println("Marca Vehiculo :" +marcaVehiculo);
		System.out.println("Color Coche :" +colorVehiculo);
		**/
	}
	
	
	// CONSTRUCTOR DE LA CLASE.
	public Vehiculo(int pesoCoche, String frenoDisco, float precioCoche ) {
		
		this.pesoCoche = pesoCoche;
		this.frenoDisco = frenoDisco;
		this.precioCoche = precioCoche;
		
		// llama al primer constructor.
		//this(12, "coche libiano", "Toyota", "Verde" );
	}
	

	
	public static String getSerial() {
		return "Serial : " +serialVehiculo;
	}
	
	public String setSerialVehiculo() {
		String serial = Vehiculo.getSerial();
		
		return serial;
		
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getMarcaVehiculo() {
		return marcaVehiculo;
	}

	public void setMarcaVehiculo(String marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
	}

	public String getColorVehiculo() {
		return colorVehiculo;
	}

	public void setColorVehiculo(String colorVehiculo) {
		this.colorVehiculo = colorVehiculo;
	}

	public int getPesoCoche() {
		return pesoCoche;
	}

	public void setPesoCoche(int pesoCoche) {
		this.pesoCoche = pesoCoche;
	}

	public String isFrenoDisco() {
		return frenoDisco;
	}

	public void setFrenoDisco(String frenoDisco) {
		this.frenoDisco = frenoDisco;
	}

	public float getPrecioCoche() {
		return precioCoche;
	}

	public void setPrecioCoche(float precioCoche) {
		this.precioCoche = precioCoche;
	}
	
	
	
	

}
