package com.example.repository;

import com.example.entity.Person;

import java.util.Collection;

public interface PersonRepository {
    public Collection<Person>  queryAll();

    public Person queryId(long id);

    public void saverOrUpadte(Person person);

    public void deleteByid(long id);
}
