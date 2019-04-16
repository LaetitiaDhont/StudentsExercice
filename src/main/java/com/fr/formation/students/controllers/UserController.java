package com.fr.formation.students.controllers;

import com.fr.formation.students.dtos.UserCreateDto;
import com.fr.formation.students.dtos.UserUpdateDto;
import com.fr.formation.students.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service; // Singleton

    // Injection de dépendances par constructeur
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping // Pas de chemin necessaire car ma méthode pour créer un user est unique.
    @ResponseStatus(value = HttpStatus.CREATED)
    protected void create(@Valid @RequestBody UserCreateDto user) { // @RequestBody prend le corps de la requête
        service.create(user);
    }

    @PutMapping("/{id}")
    protected void update(@PathVariable(value = "id") Long id, @Valid @RequestBody UserUpdateDto user) {

    }

    @DeleteMapping("{id}")
    @Secured("ROLE_ADMIN")
    protected void delete(@PathVariable(value = "id") Long id){
        service.delete(id);
    }



}
