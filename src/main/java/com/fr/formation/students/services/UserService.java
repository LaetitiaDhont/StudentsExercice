package com.fr.formation.students.services;

import com.fr.formation.students.dtos.UserCreateDto;
import com.fr.formation.students.dtos.UserViewDto;
import org.springframework.data.domain.Page;

public interface UserService {
    void create(UserCreateDto user);

    void delete(Long id);


    Page<UserViewDto> findAll(Integer checkedSize, Integer page);
}

