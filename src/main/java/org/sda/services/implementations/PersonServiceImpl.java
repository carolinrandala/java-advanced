package org.sda.services.implementations;

import org.sda.models.Person;
import org.sda.services.PersonService;

import java.time.LocalDate;

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
        return person.getFirstName() + " " + person.getFirstName();
    }
}
