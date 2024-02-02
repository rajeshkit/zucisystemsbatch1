package main;

import config.DBUtil;
import dao.RestaurantDao;
import model.Restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //addNewRestaurant();
        //getAllRestaurants();
        //getRestaurantById();
        // deleteRestaurantById();
        updateRestaurantNameById();


    }
    public static void getRestaurantById() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the restaurant id would like to see:");
        int id=sc.nextInt();
        RestaurantDao restaurantDao=new RestaurantDao();
        Restaurant res=restaurantDao.getRestaurantById(id);
        if(res!=null) {
            System.out.println(res);
        }else{
            System.out.println("No restaurant found for the Id:"+id);
        }
    }
    public static void updateRestaurantNameById() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the new restaurant name would like to update:");
        String restaurantName=sc.nextLine();
        System.out.println("Enter the restaurant ID would like to update:");
        int restaurantId=sc.nextInt();
        List<Restaurant> list= RestaurantDao.updateRestaurantNameById(restaurantName,restaurantId);
        if(list.isEmpty()){
            System.out.println("No restaurant details found in db");
        }else{
            for (Restaurant restaurant:list) {
                System.out.println(restaurant);
            }
        }
      }

    public static void deleteRestaurantById() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the restaurant ID would like to delete");
        int restaurantId = s.nextInt();
        //DELETE FROM restaurant WHERE id=restaurantId;
        //executeUpdate

        try(Connection connection=DriverManager.getConnection(DBUtil.URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            Statement stmt=connection.createStatement();)  {
            stmt.executeUpdate("DELETE * FROM where ID="+restaurantId+"");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getAllRestaurants() {

    }

    public static void addNewRestaurant() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the restaurant details");
        System.out.println("Enter the ID:");
        int restaurantId=s.nextInt();
        s.nextLine();
        System.out.println("Enter name");
        String restaurantName=s.nextLine();
        System.out.println("Enter Address");
        String restaurantAddress=s.nextLine();
        System.out.println("Enter Phone");
        long restaurantPhone=s.nextLong();
        s.nextLine();
        System.out.println("Enter date of establishment(yyyy-MM-dd)");
        String restaurantDoe=s.nextLine();
        Restaurant restaurant=new Restaurant(restaurantId,restaurantName,restaurantAddress,restaurantPhone,restaurantDoe);

        RestaurantDao.addNewRestaurant(restaurant);
    }
}