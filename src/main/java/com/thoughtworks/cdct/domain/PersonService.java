
package com.thoughtworks.cdct.domain;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PersonService {

  private final Map<Long, Person> personMap = new HashMap<>();

  public PersonService() {
    personMap.put(1L, new Person(1L, "Richard", "Gere"));
    personMap.put(2L, new Person(2L, "Emma", "Choplin"));
    personMap.put(3L, new Person(3L, "Anna", "Carolina"));
  }

  public Person findPersonById(Long id) {
    return personMap.get(id);
  }
}