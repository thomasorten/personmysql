package com.thomasorten.personmysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonmysqlApplicationTests {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getAll(){
        Person person = new Person("Kalle", "Klovn");
        personRepository.save(person);
        List<Person> personList = personRepository.findAll();
        System.out.println(personList.size());
    }

}
