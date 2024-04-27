package session_tracking.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/homepage")
public class Homepage extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
//		String email=req.getParameter("email");
		
//		System.out.println("hi"+"  "+email);
//		
//		resp.getWriter().print("hi"+"  "+email);
		
		Cookie[] cookie=req.getCookies();
		
		for(Cookie c:cookie)
		{
			String email=c.getValue();
			
			resp.getWriter().print("hi"+" "+email);
		}
		
	
		
		
		
	}

}