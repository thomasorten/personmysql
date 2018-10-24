package com.thomasorten.personmysql;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonRepository extends Repository<Person, Long> {
    public List<Person> findAll();
    public void save(Person person);
}
