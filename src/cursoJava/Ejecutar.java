package cursoJava;

import cursoJava.dao.ConexiomDAO;
import cursoJava.mapper.ConexiomMapeer;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexiomDAO con = new ConexiomMapeer();
		con.getVersion();
;
	}

}
