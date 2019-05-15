package com.fr.formation.students.controllers;

import com.fr.formation.students.dtos.UserCreateDto;
import com.fr.formation.students.dtos.UserUpdateDto;
import com.fr.formation.students.dtos.UserViewDto;
import com.fr.formation.students.services.UserService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin("http://localhost:3000/login")
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

    // La size ne sera pas obligatoire
    // Ne pas exposer des types primitifs car leur valeur par défaut = 0 alors qu'un objet sera null
    @GetMapping("/all")
    @Secured("ROLE_USER")
    protected Page<UserViewDto> findAll(@RequestParam(value = "s", required = false) Integer size, @RequestParam("p") Integer page) {
        Integer checkedSize = size == null ? 20 : size;
        return service.findAll(checkedSize, page);
    }


}
