package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;


@WebServlet("/httpfetchall")
public class Findall extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		
		EmployeeDao dao=new EmployeeDao();
//		System.out.println("data fetched");
		List<Employee> list=dao.fetchall();
		
		resp.getWriter().print(list);
		
		req.setAttribute("objects", list);
		
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.forward(req,resp);
		
		
	}

}
