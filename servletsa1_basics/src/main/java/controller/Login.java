package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;


@WebServlet("/signin")
public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		int frontend_id=Integer.parseInt(id);
		
		String pwd=req.getParameter("pwd");
		
		
		EmployeeDao employee=new EmployeeDao();
		
		Employee e=employee.fetch(frontend_id);
		
		if(e!=null)
		{
			if(pwd.equals(e.getPassword()))
			{
				resp.getWriter().print("<h1>welcome to home page</h1>");
			}
			else {
				resp.getWriter().print("<h1>please enter proper password</h1>");
			}
		}
		else {
			resp.getWriter().print("<h1>please enter proper ID</h1>");
			resp.getWriter().print("<a href='registration.html'>if no account click here to register</a>");
		}
		
		
	}

}
