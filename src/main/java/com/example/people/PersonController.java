package com.example.people;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/people")
public class PersonController {

    @RequestMapping(value = {"/test"}, method = GET)
    public Person getOrganizationConfig() throws Exception {
        System.out.println("test cache");
        Person p = new Person();
        p.setFirstName("Name");
        p.setLastName("Last Name");
        return p;
    }

    @RequestMapping(value = {"/list"}, method = GET)
    public List<Person> listaLoad() throws Exception {
        System.out.println("test");
        Person p = new Person();
        p.setFirstName("Name");
        p.setLastName("LastName");
        Person p1 = new Person();
        p1.setFirstName("Name1");
        p1.setLastName("LastName1");
        return Arrays.asList(p, p1);
    }

}
