package herencia;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * System.out.println("COCHE");
		Vehiculo car = new Vehiculo(001, "coche pase ", "BMW-Series ", "Verde");
		System.out.println( car.setSerialVehiculo());
		System.out.println("Marca : " +car.getMarcaVehiculo());
		System.out.println("Color : " +car.getColorVehiculo());
		
		System.out.println("---");
		
		Vehiculo car1 = new Vehiculo(002, "machito ", "Toyota ", "White");
		System.out.println( car1.setSerialVehiculo());
		System.out.println("Marca : " +car1.getMarcaVehiculo());
		System.out.println("Color : " +car1.getColorVehiculo());
		
		System.out.println("---");

		Vehiculo car2 = new Vehiculo(560, "Si", 7000);
		System.out.println("Precio : " +car2.getPrecioCoche());
		System.out.println("Peso Vehiculo : " +car2.getPesoCoche());
		
		System.out.println("---");

		Vehiculo car3 = new Vehiculo(760, "Si", 8000);
		System.out.println("Precio : " +car3.getPrecioCoche());
		System.out.println("Peso Vehiculo : " +car3.getPesoCoche());
		**/
		/**MOTO**/
		System.out.println("MOTO");
		Moto moto1 = new Moto(3, "Moto", "Yamaha", "Black", 2, "MOTO-KLR");
		System.out.println("Serial del Vehiculo : " +moto1.getSerial());
		System.out.println("Tipo de Vehiculo : " +moto1.getTipoVehiculo());
		System.out.println("Marca de Vehiculo : " +moto1.getMarcaVehiculo());
		System.out.println("Numero de Ruedas : " +moto1.getNumRuedas());
		System.out.println("Color del Vehiculo : " +moto1.getColorVehiculo());
	
	}

}
