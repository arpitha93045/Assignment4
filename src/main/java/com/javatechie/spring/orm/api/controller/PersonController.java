package com.javatechie.spring.orm.api.controller;

import com.javatechie.spring.orm.api.dao.PersonDao;
import com.javatechie.spring.orm.api.model.Person;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class PersonController {
  
  private PersonDao dao;

  
  @PostMapping("/savePerson")
  public String save(@RequestBody Person person){
    dao.savePerson(person);
    return "success";
  }
  
  
  @GetMapping("/getAll")
  public List<Person> getAllPersons()
  {
    return dao.getPerson();//commit
  }

}
