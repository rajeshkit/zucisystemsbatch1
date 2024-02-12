package zuci.rms.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import zuci.rms.dao.IRestaurantDao;
import zuci.rms.dao.RestaurantDao;
import zuci.rms.dao.RestaurantDaoImpl;
import zuci.rms.model.Restaurant;

public class SearchRestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IRestaurantDao restaurantDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			restaurantDao = new RestaurantDaoImpl();
			Restaurant restaurant=restaurantDao.getRestaurantById(Integer.parseInt(request.getParameter("id")));
			HttpSession session=request.getSession();
			session.setAttribute("rest", restaurant);
			session.setAttribute("name", "Rajesh N");
			response.sendRedirect("displayrestaurant.jsp");
			//rd.forward(request, response);
	}

}
