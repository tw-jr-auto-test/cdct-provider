package com.thoughtworks.cdct.user_interface;

import com.thoughtworks.cdct.domain.Person;
import com.thoughtworks.cdct.domain.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

  private final PersonService personService;

  public PersonRestController(PersonService personService) {
    this.personService = personService;
  }

  @GetMapping("/person/{id}")
  public Person findPersonById(@PathVariable("id") Long id) {
    return personService.findPersonById(id);
  }
}