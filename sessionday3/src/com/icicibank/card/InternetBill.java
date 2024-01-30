package com.icicibank.card;

import com.icicibank.account.Order;

import java.time.LocalDate;

public class InternetBill extends BillPayment{
    @Override
    public void payment(){ //overriding
        System.out.println("upi Payment");
    }

    public static void main(String[] args) {
       // String s="Rajesh";
       // String st="zuci";
       // st=new InternetBill();
        Order order=new Order();
        order.setOrderId(5678);
        order.setOrderName("Refrigrtor");
        order.setOrderDate(LocalDate.now());
        System.out.println(order);
        System.out.println(order.hashCode());
    }
}
