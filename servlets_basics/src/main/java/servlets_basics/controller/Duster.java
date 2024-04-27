package servlets_basics.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlets_basics.dao.EmployeeDao;
import servlets_basics.dto.Employee;

@WebServlet("/insert")
public class Duster implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("welcome to thursday");

		String empid = req.getParameter("id");
		String empname = req.getParameter("num");
		String empmail = req.getParameter("email");
		String emppassword = req.getParameter("password");
		String empdob = req.getParameter("dob");
		String empgender = req.getParameter("gender");
		String empcheck = req.getParameter("checkbox");
		String empdrop = req.getParameter("drop");

		Employee employee = new Employee();

//		int eid = Integer.parseInt(empid);
//		employee.setId(eid);
//		
//
		employee.setName(empname);
		employee.setEmail(empmail);
		employee.setPwd(emppassword);
		employee.setDob(empdob);
		employee.setGender(empgender);
		employee.setCheckbox(empcheck);
		employee.setDrop(empdrop);
		
//		System.out.println(employee); 
		
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.insert(employee);
	
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empmail);
		System.out.println(emppassword);
		System.out.println(empdob);
		System.out.println(empgender);
		System.out.println(empcheck);
		System.out.println(empdrop);

//		res.getWriter().print(empid);
//		res.getWriter().print(empname);
//		res.getWriter().print(empmail);
//		res.getWriter().print(emppassword);
//		res.getWriter().print(empdob);
//		res.getWriter().print(empgender);
//		res.getWriter().print(empcheck);

	}

}
