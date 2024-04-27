package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.EmployeeDao;


@WebServlet("/hi")
public class Fetch extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("primarykey");
		System.out.println("controller  "+id);
		
		int cid=Integer.parseInt(id);
		EmployeeDao dao=new EmployeeDao();
		Object msg=dao.fetch(cid);
		
		res.getWriter().print(msg);
	
	}

}
