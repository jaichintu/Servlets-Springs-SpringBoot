package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;


@WebServlet("/update")
public class Update extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		String date=req.getParameter("dob");
		
		Employee emp=new Employee();
		int eid = Integer.parseInt(id);
		emp.setId(eid);
		emp.setName(name);
		emp.setEmail(email);
		emp.setPassword(password);
		emp.setGender(gender);
		emp.setDob(date);
		
		EmployeeDao dao=new EmployeeDao();
		dao.update(emp);
		
		
	}

}
