package com.zuci.cafeteria.controller;

import com.zuci.cafeteria.model.Cafeteria;
import com.zuci.cafeteria.service.CafeteriaService;
import com.zuci.cafeteria.service.CafeteriaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class CafeteriaController {
    @GetMapping("/")
    public String welcome(){
        return "success";
    }
    @Autowired
    private CafeteriaService cafeteriaService;
    @PostMapping("/cafeteria")
    public ResponseEntity<Cafeteria> addCafeteria(@Valid @RequestBody Cafeteria cafeteria){
        return new ResponseEntity(cafeteriaService.createCafeteria(cafeteria), HttpStatus.CREATED) ;
    }
    //get all cafeteria
    @GetMapping("/cafeteria")
    public List<Cafeteria> findAllCafeteria(){
        return cafeteriaService.getAllCafeteria();
    }
    @GetMapping("/cafeteria/{id}")
    public Cafeteria findByCafeteriaId(@PathVariable("id") int id){
        return  cafeteriaService.getcafeteriaById(id);
    }
    @DeleteMapping("/cafeteria/{id}")
    public String deleteCafetria(@PathVariable("id") int id){
        return cafeteriaService.deleteCafeteriaById(id);
    }
    @PutMapping("/cafeteria")
    public Cafeteria updateCafetria(@RequestBody Cafeteria cafeteria){
        Cafeteria cafeteria1=cafeteriaService.updateCafeteria(cafeteria);
        return cafeteria1;
    }
}
