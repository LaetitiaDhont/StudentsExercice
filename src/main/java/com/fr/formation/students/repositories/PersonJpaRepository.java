package com.fr.formation.students.repositories;

import com.fr.formation.students.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonJpaRepository extends JpaRepository<Person, Long> {

    Person findByUserAccountUsername(String username);
}
