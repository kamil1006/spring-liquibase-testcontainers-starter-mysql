package com.example.springliquibasetestcontainersstartermysql.controller;

import com.example.springliquibasetestcontainersstartermysql.entity.Person;
import com.example.springliquibasetestcontainersstartermysql.repository.PersonRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    PersonRepo personRepo;
    public PersonController(PersonRepo personRepo){
        this.personRepo = personRepo;
    }

    @GetMapping("/")
    public List<Person> get(){

        return personRepo.findAll();

    }


}
