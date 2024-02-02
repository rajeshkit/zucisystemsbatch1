package dao;

import config.DBUtil;
import model.Restaurant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDao {
    // database code here
    public Restaurant getRestaurantById(int restaurantId) {
        Restaurant restaurant=null;
        try(Connection connection= DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            PreparedStatement pstmt=connection.prepareStatement("SELECT * FROM restaurant WHERE id=?");)
        {
            pstmt.setInt(1,restaurantId);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                restaurant=new Restaurant();
                restaurant.setId(rs.getInt(1));
                restaurant.setName(rs.getString(2));
                restaurant.setAddress(rs.getString(3));
                restaurant.setPhone(rs.getLong(4));
                restaurant.setDoe(rs.getString(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return restaurant;
    }
    public static  List<Restaurant> updateRestaurantNameById(String restaurantName, int restaurantId) {
        String updateQuery="UPDATE restaurant SET name='"+restaurantName+"'WHERE id="+restaurantId+";";
        Restaurant restaurant=null;
        List<Restaurant> restaurantList=new ArrayList<>();
        try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            Statement stmt=connection.createStatement();) {
            stmt.executeUpdate(updateQuery);
            ResultSet rs=stmt.executeQuery("SELECT * FROM restaurant");
            while(rs.next()){
                restaurant=new Restaurant();
                restaurant.setId(rs.getInt(1));
                restaurant.setName(rs.getString(2));
                restaurant.setAddress(rs.getString(3));
                restaurant.setPhone(rs.getLong(4));
                restaurant.setDoe(rs.getString(5));
                restaurantList.add(restaurant);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return restaurantList;

    }

    public static void deleteRestaurantById(int restaurantId) {
       try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            Statement stmt=connection.createStatement();)  {
            stmt.executeUpdate("DELETE * FROM where ID="+restaurantId+"");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getAllRestaurants() {

        try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM restaurant");)  {
            while(rs.next()) {
//                System.out.println(rs.getInt(1));
//                System.out.println(rs.getString(2));
//                System.out.println(rs.getString(3));
//                System.out.println(rs.getLong(4));
//                System.out.println(rs.getDate(5));
//                System.out.println("***************");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addNewRestaurant(Restaurant restaurant) {
        try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM restaurant");) {
            stmt.executeUpdate("INSERT INTO restaurant VALUES("+restaurant.getId()+",'"+restaurant.getName()+"','"+restaurant.getAddress()+"',"+restaurant.getPhone()+",'"+restaurant.getDoe()+"')");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
