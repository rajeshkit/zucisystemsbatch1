package zuci.rms.dao;

import java.util.List;

import zuci.rms.model.Restaurant;

public interface IRestaurantDao {
	public Restaurant getRestaurantById(int restaurantId);
    public List<Restaurant> updateRestaurantNameById(String restaurantName, int restaurantId);
    public void deleteRestaurantById(int restaurantId);
    public List<Restaurant> getAllRestaurants();
    public boolean addNewRestaurant(Restaurant restaurant) ;
}
