package webajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/estado")
public class EstadoController extends HttpServlet {

	final static String  json = ""; 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Cidade a1 = new Cidade("Campo Grande");
		Cidade a2 = new Cidade("Dourados");
		Cidade a3 = new Cidade("Ribas do Rio Pardo");
		List<Cidade> lcms= new ArrayList<Cidade>();
		List<Cidade> lcsp = new ArrayList<Cidade>();
		List<Cidade> lcba = new ArrayList<Cidade>();
		
		lcms.add(a1);
		lcms.add(a2);
		lcms.add(a3);
		
		
		Cidade b1 = new Cidade("São Paulo");
		Cidade b2 = new Cidade("Sorocaba");
		
		lcsp.add(b1);
		lcsp.add(b2);
		
		
		Cidade c1 = new Cidade("Salvador");
		
		lcba.add(c1);
		
		Estado ms = new Estado("MS", lcms);
		Estado sp = new Estado("SP",lcsp);
		Estado ba = new Estado("Bahia", lcba);
		
		
		if(req.getParameter("estado")=="1"){
			String a = ms.getCidades().get(0).toString(); 
			String b = ms.getCidades().get(0).toString();
			String d = ms.getCidades().get(0).toString();
			
		}
		else if(req.getParameter("estado")=="2"){
			
		}
		
		else if(req.getParameter("estado")=="3"){
			
		}
		 
		
		
		
		resp.getWriter().print("<p> oi do Servlet </p>");
	}
}
