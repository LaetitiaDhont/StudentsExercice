package com.fr.formation.students.repositories;

import com.fr.formation.students.dtos.UserViewDto;
import com.fr.formation.students.entities.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PersonJpaRepository extends JpaRepository<Person, Long> {

    Person findByUserAccountUsername(String username);


    // JPQL Java Persistance Query Language
    @Query("select new com.fr.formation.students.dtos.UserViewDto(p.firstname, p.lastname) " + "from Person p order by p.lastname, p.firstname desc")
    Page<UserViewDto> findAllAsDto(Pageable pageable);

}
