package herencia;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	
	}

}
