package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //  addOrders();
       // getOrderById();
       // getAllOrders();
       // deleteOrder();
        Orders o=new Orders();
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
        Orders orders=session.get(Orders.class,3);
        session.delete(orders);
        session.getTransaction().commit();
    }

    private static void getAllOrders() {
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query=session.createQuery("FROM Orders");
        List<Orders> ordersList=query.getResultList();
        session.getTransaction().commit();
        System.out.println(ordersList);
    }

    private static void getOrderById() {
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Orders orders=session.get(Orders.class,3); //select * from orders where orderId=3;
        System.out.println(orders);
        session.getTransaction().commit();
    }

    private static void addOrders() {
        Orders o=new Orders();
        o.setOrderId(200);
        o.setOrderName("Refrgrirator");
        o.setOrderCost(8765);
        o.setOrderQuantity(2);
        o.setOrderDate(new Date());
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
    }
}
