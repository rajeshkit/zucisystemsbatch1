package zuci.rms.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import zuci.rms.dao.RestaurantDao;
import zuci.rms.model.Restaurant;

public class SearchRestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			 Restaurant restaurant=RestaurantDao.getRestaurantById(Integer.parseInt(request.getParameter("id")));
			 RequestDispatcher rd=request.getRequestDispatcher("displayrestaurant.jsp");
				request.setAttribute("rest", restaurant);
				rd.forward(request, response);
	}

}
