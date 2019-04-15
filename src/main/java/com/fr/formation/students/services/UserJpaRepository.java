package com.fr.formation.students.services;

import com.fr.formation.students.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository implicite
public interface UserJpaRepository extends JpaRepository<Person,Long> {
}
