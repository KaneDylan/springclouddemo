package com.example.repository.impl;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    private static Map<Long,Person> personMap;

    static {
        personMap = new HashMap<>();
        personMap.put(1L,new Person(1L,"张三",22));
        personMap.put(2L,new Person(2L,"李四",19));
        personMap.put(3L,new Person(3L,"王麻子",68));
    }


    @Override
    public Collection<Person> queryAll() {
        return personMap.values();
    }

    @Override
    public Person queryId(long id) {
        return personMap.get(id);
    }

    @Override
    public void saverOrUpadte(Person person) {
        personMap.put(person.getId(),person);
    }

    @Override
    public void deleteByid(long id) {
        personMap.remove(id);
    }
}
