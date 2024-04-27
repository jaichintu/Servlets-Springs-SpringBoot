package session_tracking.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password=req.getParameter("pwd");
		
		PrintWriter out=resp.getWriter();
		
		Cookie cookie=new Cookie("e", email);
		resp.addCookie(cookie);
		
		if(email.equals("abc@gmail.com") && password.equals("123"))
		{
			resp.sendRedirect("homepage");
		}
		else {
			out.print("please enter proper credentials");
		}
	}
	
	
	

}
