package com.fr.formation.students.entities;

import javax.persistence.*;
import java.time.LocalDate;

// @Table spécifie le nom de la table mais pas obligatoire
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private LocalDate birthdate;
    @Column(nullable = false)

    //Association de person avec compte
    @Embedded // Intégré
    private UserAccount userAccount;

    public Person() {
        super();
    }

    public Person(String firstname, String lastname, LocalDate birthdate, boolean active) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
