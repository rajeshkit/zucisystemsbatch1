package com.zuci.cafeteria.service;

import com.zuci.cafeteria.model.Cafeteria;

import java.util.List;

public interface CafeteriaService {
    public Cafeteria createCafeteria(Cafeteria cafeteria);
    public List<Cafeteria> getAllCafeteria();
    public Cafeteria getcafeteriaById(int id);
    public String deleteCafeteriaById(int id);
    public Cafeteria updateCafeteria(Cafeteria cafeteria);
}
