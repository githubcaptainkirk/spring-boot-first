package org.example.springBootApi.contoller;

import org.example.springBootApi.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PertsonController {

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/person",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person getPerson(){

        List skills = new ArrayList<String>();
        skills.add("Spring-Boot");
        skills.add("Java");

        String vorname = "Murat";
        String name = "Kirkoroglu";

        Person person = new Person(vorname, name, skills);

        return person;
    }


}
