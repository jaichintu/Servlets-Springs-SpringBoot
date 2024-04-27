package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/class24")
public class Demo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String cid=req.getParameter("id");
		
		System.out.println("Demo class"+" "+cid);
		
		res.getWriter().print("<a href='class2'>click here</a>");
		
		
		
	
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("class2");
		requestDispatcher.forward(req, res);
		
		
	}

}
