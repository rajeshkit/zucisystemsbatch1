package com.zuci.cafeteria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cafeteria {
    @Id
    private int cafeteriaId;
    private String name;
    private int cost;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date doe;
}
