package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("chocolates")//localhost:8080/chocolates

public class ChocolateController {

    @Autowired
    ChocolateRepository chocolateRepository;

//    INDEX
    @GetMapping
    public ResponseEntity<List<Chocolate>> getAllChocolatesName(
            @RequestParam(required = false, name = "name") String name)
    {
        if(name != null){
            return new ResponseEntity<>(chocolateRepository.findChocolateByName(name), HttpStatus.OK);
        }
        return new ResponseEntity<>(chocolateRepository.findAll(), HttpStatus.OK);
    }

//    SHOW


}
