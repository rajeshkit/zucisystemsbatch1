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
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM restaurant WHERE id="+restaurantId+"");)  {
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
        String updateQuery="UPDATE restaurant SET name=? WHERE id=?";
        Restaurant restaurant=null;
        List<Restaurant> restaurantList=new ArrayList<>();
        try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            PreparedStatement pstmt=connection.prepareStatement(updateQuery);) {
            pstmt.setString(1,restaurantName);
            pstmt.setInt(2,restaurantId);
            pstmt.executeUpdate();
            ResultSet rs=pstmt.executeQuery("SELECT * FROM restaurant");
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

            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addNewRestaurant(Restaurant restaurant) {
        try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            PreparedStatement pstmt=connection.prepareStatement("INSERT INTO restaurant VALUES(?,?,?,?,?)")) {
            pstmt.setInt(1,restaurant.getId());
            pstmt.setString(2,restaurant.getName());
            pstmt.setString(3, restaurant.getAddress());
            pstmt.setLong(4,restaurant.getPhone());
            pstmt.setString(5,restaurant.getDoe());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
