package zuci.rms.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import zuci.rms.config.DBUtil;
import zuci.rms.model.Restaurant;

public class RestaurantDaoImpl implements IRestaurantDao {
    // database code here
    public Restaurant getRestaurantById(int restaurantId) {
        Restaurant restaurant=null;
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try(Connection connection= DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            PreparedStatement pstmt=connection.prepareStatement("SELECT * FROM restaurant WHERE id=?");)
        {
            pstmt.setInt(1,restaurantId);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                restaurant=new Restaurant();
                restaurant.setRestaurantId(rs.getInt(1));
                restaurant.setRestaurantName(rs.getString(2));
                restaurant.setRestaurantAddress(rs.getString(3));
                restaurant.setRestaurantPhone(rs.getLong(4));
                restaurant.setRestaurantDoe(rs.getDate(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return restaurant;
    }
    public   List<Restaurant> updateRestaurantNameById(String restaurantName, int restaurantId) {
        String updateQuery="UPDATE restaurant SET name='"+restaurantName+"'WHERE id="+restaurantId+";";
        Restaurant restaurant=null;
        List<Restaurant> restaurantList=new ArrayList<>();
        try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            Statement stmt=connection.createStatement();) {
            stmt.executeUpdate(updateQuery);
            ResultSet rs=stmt.executeQuery("SELECT * FROM restaurant");
            while(rs.next()){
                restaurant=new Restaurant();
                restaurant.setRestaurantId(rs.getInt(1));
                restaurant.setRestaurantName(rs.getString(2));
                restaurant.setRestaurantAddress(rs.getString(3));
                restaurant.setRestaurantPhone(rs.getLong(4));
                restaurant.setRestaurantDoe(rs.getDate(5));
                restaurantList.add(restaurant);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return restaurantList;

    }

    public  void deleteRestaurantById(int restaurantId) {
       try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            Statement stmt=connection.createStatement();)  {
            stmt.executeUpdate("DELETE * FROM where ID="+restaurantId+"");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public  List<Restaurant> getAllRestaurants() {
    	Restaurant restaurant=null;
    	List<Restaurant> listOfRestaurant=new ArrayList<Restaurant>();
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM restaurant");)  {
            while(rs.next()) {
            	 restaurant=new Restaurant();
                 restaurant.setRestaurantId(rs.getInt(1));
                 restaurant.setRestaurantName(rs.getString(2));
                 restaurant.setRestaurantAddress(rs.getString(3));
                 restaurant.setRestaurantPhone(rs.getLong(4));
                 restaurant.setRestaurantDoe(rs.getDate(5));
                 listOfRestaurant.add(restaurant);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listOfRestaurant;
    }

    public  boolean addNewRestaurant(Restaurant restaurant) {
    	boolean flag=false;
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	try(
    		Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM restaurant");) {
            int status = stmt.executeUpdate("INSERT INTO restaurant VALUES("+restaurant.getRestaurantId()+",'"+restaurant.getRestaurantName()+"','"+restaurant.getRestaurantAddress()+"',"+restaurant.getRestaurantPhone()+",'"+new Date((restaurant.getRestaurantDoe()).getTime())+"')");
            if(status!=0) {
            	flag=true;
            }
    	} catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    	return flag;
    }
}
