package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        addOrders();
       // getOrderById();
       // getAllOrders();
       // deleteOrder();
        //updateOrder();

    }

    private static void updateOrder() {
        Orders1 o=new Orders1();
        o.setOrderId(3);
        o.setOrderName("Projector");
        o.setOrderCost(876544);
        o.setOrderQuantity(12);
        o.setOrderDate(new Date());
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //Orders orders=session.get(Orders.class,3);
        session.update(o);
        session.getTransaction().commit();
    }

    private static void deleteOrder() {
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Orders1 orders=session.get(Orders1.class,3);
        session.delete(orders);
        session.getTransaction().commit();
    }

    private static void getAllOrders() {
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query=session.createQuery("FROM Orders");
        List<Orders1> ordersList=query.getResultList();
        session.getTransaction().commit();
        System.out.println(ordersList);
    }

    private static void getOrderById() {
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Orders1 orders=session.get(Orders1.class,2); //select * from orders where orderId=3;
        System.out.println(orders);
        session.getTransaction().commit();
    }

    private static void addOrders() {
        Customer1 customer=new Customer1();
        customer.setCustomerName("Kamala");
        customer.setWalletBalance(8456);
        Orders1 o=new Orders1(0,"tv","chennai",56754,2,new Date(),customer);
        Orders1 o1=new Orders1(0,"ref","chennai",88766,1,new Date(),customer);
        Orders1 o2=new Orders1(0,"fan","namakkal",23354,1,new Date(),customer);



        customer.setOrders(Arrays.asList(o,o1,o2));
//        Customer1 customer1=new Customer1();
//        customer1.setCustomerName("Rajesh");
//        customer1.setWalletBalance(3434);
//        Customer1 customer2=new Customer1();
//        customer2.setCustomerName("Kannan");
//        customer2.setWalletBalance(5555);
       ///  Orders1 o2=new Orders1(0,"fan","namakkal",23354,1,new Date(),Arrays.asList(customer,customer1,customer2));


        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(customer);
        session.save(o);session.save(o1);session.save(o2);

        session.getTransaction().commit();
    }
}
