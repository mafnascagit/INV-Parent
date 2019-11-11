package com.inv.core.services;

import com.inv.core.models.Person;

import java.util.List;

public interface PersonDAO {

    void savePerson(Person person);

    List<Person> findAllPersons();

    void updatePerson(long id, Person person);

    void deletePerson(long id);

    void findPerson(long id);




}
