package org.example;



import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Orders1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "order_name")
    private String orderName;
    @Transient
    private String address;
    @Column(name = "order_cost")
    private int orderCost;
    @Column(name = "order_quantity")
    private int orderQuantity;
    private Date orderDate;
    @ManyToOne
    private Customer1 customer;
}
