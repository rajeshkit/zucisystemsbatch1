package com.zuci.cafeteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cafeteria {
    private int id;
    private String name;
    private int cost;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date doe;
}
