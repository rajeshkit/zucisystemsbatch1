package zuci.rms.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import zuci.rms.dao.RestaurantDao;
import zuci.rms.model.Restaurant;

public class AddRestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Restaurant restaurant=new Restaurant();
		restaurant.setRestaurantId(Integer.parseInt(request.getParameter("id")));
		restaurant.setRestaurantName(request.getParameter("name"));
		restaurant.setRestaurantAddress(request.getParameter("address"));
		restaurant.setRestaurantPhone(Long.parseLong(request.getParameter("phone")));	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			restaurant.setRestaurantDoe(sdf.parse(request.getParameter("doe")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean status=RestaurantDao.addNewRestaurant(restaurant);
		
		response.getWriter().append("Served at: ").append(""+status);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
