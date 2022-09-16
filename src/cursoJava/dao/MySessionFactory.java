package cursoJava.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySessionFactory {
	private static MySessionFactory instancia;
	private SqlSessionFactory factory;
	
	private MySessionFactory() {
		String recurso = "mybatis-config.xml";
		Reader lector = null;
		
		try {
			lector = Resources.getResourceAsReader(recurso);
			factory = new SqlSessionFactoryBuilder().build(lector);
			lector.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	public static MySessionFactory getInstacia() {
		
			if(instancia == null) {
			instancia = new MySessionFactory();
}
		
		return instancia;
	}
	
	public SqlSessionFactory getFactory() {
		return factory;
	}

}
