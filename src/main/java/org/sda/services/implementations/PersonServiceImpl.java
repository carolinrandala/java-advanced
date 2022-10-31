package org.sda.services.implementations;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;

import java.time.LocalDate;
import java.util.List;

/**
 * Implementation of person service
 *
 * @author carolinrandala
 */
public class PersonServiceImpl implements PersonService {
    @Override
    public int getPersonBirthYear(int age) {
        return LocalDate.now().getYear() - age;
    }

    @Override
    public String getPersonFullName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }

    @Override
    public Person findPersonByFirstName(String firstName) throws PersonNotFoundException {
        Person resultPerson = null;

        // Search a person with given firstName from the random list
        for(Person person: getRandomPersonList()) {
            if(person.getFirstName().equals(firstName)) {
                resultPerson = person;
                break;
            }
        }

        //If the person is not found then throw an exception
        if(resultPerson == null) {
            throw new PersonNotFoundException(firstName);
        }
        return resultPerson;
    }

    //PRIVATE METHODS//
    private List<Person> getRandomPersonList() {
        Person person1 = new Person();
        person1.setFirstName("Alysa");
        person1.setLastName("S");
        person1.setAge(15);

        Person person2 = new Person();
        person2.setFirstName("Toby");
        person2.setLastName("Shark");
        person2.setAge(20);

        Person person3 = new Person();
        person3.setFirstName("Jane");
        person3.setLastName("Bloom");
        person3.setAge(19);

        return List.of(person1, person2, person3); // List of persons
    }
}
