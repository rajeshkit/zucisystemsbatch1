import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        try {

            String url="jdbc:mysql://localhost:3306/zuci";
            String username="root";
            String password="root@123";
            Connection connection;
            Statement stmt;
            connection = DriverManager.getConnection(url,username,password);
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO restaurant VALUES("+restaurantId+",'"+restaurantName+"','"+restaurantAddress+"',"+restaurantPhone+",'"+restaurantDoe+"')");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}