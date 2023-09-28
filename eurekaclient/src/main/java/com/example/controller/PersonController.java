package com.example.controller;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    /**
     * 访问全部数据
     * @return
     */
    @GetMapping("/findAll")
    public Collection<Person> findAll(){
        return personRepository.queryAll();
    }

    @GetMapping("/findById/{id}")
    public Person findById(@PathVariable("id") long id){
        return personRepository.queryId(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Person person){
        personRepository.saverOrUpadte(person);
    }

    @PatchMapping("/update")
    public void update(@RequestBody Person person){
        personRepository.saverOrUpadte(person);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        personRepository.deleteByid(id);
    }
}
