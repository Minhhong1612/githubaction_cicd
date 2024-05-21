package com.example.userservice.controller;

import com.example.userservice.models.Suplier;
import com.example.userservice.repositories.SuplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SuplierController {
    @Autowired
    private SuplierRepository suplierRepository;
    @GetMapping("/supliers")
    public List<Suplier> getAll(){
        List<Suplier> list = suplierRepository.findAll();
        return list;
    }

    @GetMapping("/supliers/{id}")
    public Optional<Suplier> getSuplierById(@PathVariable("id") long id){
        Optional<Suplier> suplier =   suplierRepository.findById(id);
        return suplier;
    }

    @PostMapping("/suplier")
    public Suplier create(@RequestBody Suplier suplier){
        suplier = suplierRepository.save(suplier);
        return suplier;
    }

}
