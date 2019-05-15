package com.fr.formation.students.services;

import com.fr.formation.students.dtos.UserCreateDto;
import com.fr.formation.students.dtos.UserViewDto;
import com.fr.formation.students.entities.Person;
import com.fr.formation.students.entities.UserAccount;
import com.fr.formation.students.repositories.PersonJpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final PasswordEncoder encoder;

    private final PersonJpaRepository repo;

    public UserServiceImpl(PasswordEncoder encoder, PersonJpaRepository repo) {
        this.encoder = encoder;
        this.repo = repo;

    }

    // private final UserCustomJpaRepository; convention
    @Override
    public void create(UserCreateDto dto) {
        Person user = new Person();
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());
        user.setBirthdate(dto.getBirthdate());
        UserAccount account = new UserAccount();
        account.setUsername(dto.getUserAccount().getUsername());
        String decoded = dto.getUserAccount().getPassword();
        String encoded = encoder.encode(decoded); // Mot de passe brut
        account.setPassword(encoded);
        user.setUserAccount(account);
        repo.save(user);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Page<UserViewDto> findAll(Integer size, Integer page) {
        Pageable pageable = PageRequest.of(page, size);
        return repo.findAllAsDto(pageable);
    }


}
