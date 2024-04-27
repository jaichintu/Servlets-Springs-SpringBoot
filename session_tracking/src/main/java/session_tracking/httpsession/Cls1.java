package session_tracking.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/a")
public class Cls1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s1=req.getParameter("email");
		String s2=req.getParameter("pwd");
		
		System.out.println(s1+"  "+s2);
		
		HttpSession session=req.getSession();
		session.setAttribute("e", s1);
		session.setAttribute("p", s2);
		
		resp.sendRedirect("b");
		
	}
			
}
