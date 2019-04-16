package com.fr.formation.students.services;

import com.fr.formation.students.dtos.UserCreateDto;

public interface UserService {
    void create(UserCreateDto user);

    void delete(Long id);
}

