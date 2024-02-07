package zuci.demo.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at:FirstServlet ").append(request.getContextPath());
		//response.sendRedirect("SecondServlet");
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.jsp");
		requestDispatcher.include(request, response);
	}

	
	

}
