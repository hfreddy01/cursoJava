package cursoJava.ejerciciosResueltos.bucles.ForEach;

public class EjerciciosForEach1 {

	public static void main(String[] args) {
		// CREAMOS OBJETO ARRAYS.
		String ciudad[] = new String[8];
		ciudad[0] = "Argentina";
		ciudad[1] = "Brazil";
		ciudad[2] = "Bolivia";
		ciudad[3] = "Chile";
		ciudad[4] = "Colombia";
		ciudad[5] = "PAraguay";
		ciudad[6] = "Uruguay";
		ciudad[7] = "Venezuela";
		
		// VALIDAMOS.
		for(String i : ciudad) {
			System.out.println(i);
		}
		

	}

}
