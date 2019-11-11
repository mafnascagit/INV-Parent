package com.inv.core.services;

import com.inv.core.models.Person;
import com.inv.core.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonDAOImpl implements PersonDAO {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> findAllPersons() {
       return  personRepository.findAll();
    }

    @Override
    public void updatePerson(long id, Person person) {

        Person updatedPerson = personRepository.getOne(id);
        updatedPerson.setFirstname(person.getFirstname());
        updatedPerson.setLastname(person.getLastname());
        updatedPerson.setAge(person.getAge());

    }

    @Override
    public void deletePerson(long id) {
        Person deletedPerson = personRepository.getOne(id);
        personRepository.delete(deletedPerson);
    }

    @Override
    public void findPerson(long id) {
        personRepository.findById(id);
    }
}
