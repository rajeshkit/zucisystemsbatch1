package com.zuci.cafeteria.controller;

import com.zuci.cafeteria.model.Cafeteria;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CafeteriaController {
    @PostMapping("/cafeteria")
    public Cafeteria addCafeteria(@RequestBody Cafeteria cafeteria){
        return cafeteria;
    }

}
