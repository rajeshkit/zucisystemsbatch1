package com.zuci.cafeteria.service;

import com.zuci.cafeteria.exception.CafeteriaIdNotExistException;
import com.zuci.cafeteria.model.Cafeteria;
import com.zuci.cafeteria.repository.CafeteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CafeteriaServiceImpl implements  CafeteriaService{
    @Autowired
    private CafeteriaRepository cafeteriaRepository;

    @Override
    public Cafeteria createCafeteria(Cafeteria cafeteria) {
        return cafeteriaRepository.save(cafeteria);
    }

    @Override
    public List<Cafeteria> getAllCafeteria() {
        return cafeteriaRepository.findAll();
    }

    @Override
    public Cafeteria getcafeteriaById(int id) {
       Optional<Cafeteria> optional= cafeteriaRepository.findById(id);
        return optional.orElseThrow();
    }

    @Override
    public String deleteCafeteriaById(int id) {
        String status=null;
        Optional<Cafeteria> optional= cafeteriaRepository.findById(id);
        if(optional.isPresent())
        {
            cafeteriaRepository.deleteById(id);
            status="Deleted successfully";
        }else{
            status="Not Deleted successfully !! Cafeteria ID does not exists";
        }
        return status;
    }

    @Override
    public Cafeteria updateCafeteria(Cafeteria cafeteria){
        Optional<Cafeteria> optional= cafeteriaRepository.findById(cafeteria.getCafeteriaId());
        Cafeteria cafeteria1=null;
        if(optional.isPresent())
        {
            cafeteria1 = cafeteriaRepository.save(cafeteria);

        }else{
           throw new CafeteriaIdNotExistException("Id is not exist in the db!! check your id");
        }
        return cafeteria1;
    }
}
