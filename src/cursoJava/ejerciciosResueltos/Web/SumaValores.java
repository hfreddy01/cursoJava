package cursoJava.ejerciciosResueltos.Web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumaValores
 */
@WebServlet("/SumaValores")
public class SumaValores extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumaValores() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
         PrintWriter out = response.getWriter();

         out.println("<html>");
         out.println("<head></head>");         
         out.println("<body>");

         String v1=request.getParameter("valor1");
         String v2=request.getParameter("valor2");
         int valor1=Integer.parseInt(v1);
         int valor2=Integer.parseInt(v2);
         int suma=valor1+valor2;
         out.println("La suma de los dos valores es : " +suma);
         out.println("<br>");
         out.println("<a href='index.html'>Volver</a>");
         out.println("</body>");
         out.println("</html>");             
    }

}