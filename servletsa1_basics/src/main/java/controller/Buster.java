package controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.EmployeeDao;
import dto.Employee;

@WebServlet("/insert")
public class Buster implements Servlet {

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
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = arg0.getParameter("id");
		String name = arg0.getParameter("name");
		String password = arg0.getParameter("password");
		String email=arg0.getParameter("email");
		String dob = arg0.getParameter("dob");
		String gender = arg0.getParameter("gender");
		String tc = arg0.getParameter("checkbox");
		String country = arg0.getParameter("drop");
		
		Employee employee = new Employee();
		int eid = Integer.parseInt(id);
		employee.setId(eid);
		employee.setName(name);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setGender(gender);
		employee.setDob(dob);
		employee.setCountry(country);
		employee.setTc(tc);
		
		System.out.println(employee);
		
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.insert(employee);
	}
	
}
