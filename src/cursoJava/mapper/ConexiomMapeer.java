package cursoJava.mapper;

import org.apache.ibatis.session.SqlSession;

import cursoJava.dao.ConexiomDAO;
import cursoJava.dao.MySessionFactory;

public class ConexiomMapeer implements ConexiomDAO {
	private final MySessionFactory instancia = MySessionFactory.getInstacia();
	
	

	@Override
	public String getVersion() {
		String version = "";
		SqlSession session = null;
		
		try {
			
			session = instancia.getFactory().openSession();
			version =  session.selectOne("mysqlVersion");
		
		} catch(Exception e) {
			System.out.println(e);
			
		} finally {
			if(session != null) {
				session.close();
			}
		}

		return null;
	}

}
