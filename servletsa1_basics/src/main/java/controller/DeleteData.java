package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


import dao.EmployeeDao;
import dto.Employee;


@WebServlet("/def")
public class DeleteData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("primarykey");
		System.out.println("controller  "+id);
		
		int cid=Integer.parseInt(id);
		EmployeeDao dao=new EmployeeDao();
//		String msg=dao.delete(cid);
		dao.delete(cid);
		 List<Employee> list=dao.fetchall();
		req.setAttribute("objects", list);
		
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.forward(req,res);
		
//		res.getWriter().print(msg);
	}

}
