package servlet_config_context.basics;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/a")
public class ClassA extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		int a=1/0;
//		
//		System.out.println("file found");
		
		
		System.out.println(getServletContext().getInitParameter("a"));
		
		System.out.println(getServletConfig().getInitParameter("c"));
		
	}

}
