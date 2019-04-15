package com.fr.formation.students.services;

import com.fr.formation.students.dtos.UserCreateDto;
import com.fr.formation.students.entities.Person;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserJpaRepository repo;

    public UserServiceImpl(UserJpaRepository repo) {
        this.repo = repo;
    }

    // private final UserCustomJpaRepository; convention
    @Override
    public void create(UserCreateDto dto) {
        Person user = new Person();
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());
        user.setBirthdate(dto.getBirthdate());
        user.setActive(dto.isActive());

        repo.save(user);
    }
}