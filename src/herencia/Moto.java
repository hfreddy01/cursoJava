package herencia;

public class Moto extends Vehiculo{
	// PROPIEDADES DE LA CLASE.
		private int numRuedas;
		private String modeloMoto;
		
		
	// CONSTRUCTOR DE LA CLASE.
	public Moto(int serialVehiculos, String tipoVehiculo, String marcaVehiculo, String colorVehiculo, int numRuedas, String modeloMoto) {
		// LLAMADA AL CONSTRUCTOR PADRE 
		super(serialVehiculos, tipoVehiculo, marcaVehiculo, colorVehiculo);
		
		this.numRuedas = numRuedas;
		this.modeloMoto = modeloMoto;
	}


	public int getNumRuedas() {
		return numRuedas;
	}


	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}


	public String getModeloMoto() {
		return modeloMoto;
	}


	public void setModeloMoto(String modeloMoto) {
		this.modeloMoto = modeloMoto;
	}
	
	
	
	


}
