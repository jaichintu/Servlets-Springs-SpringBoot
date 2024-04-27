package session_tracking.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/b")

public class Cls2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		HttpSession session=req.getSession();
		String s1=(String)session.getAttribute("e");
		String s2=(String)session.getAttribute("p");
		
		System.out.println(s1+"  "+s2);
		
	}

}
