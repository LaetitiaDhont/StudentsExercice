package com.fr.formation.students.services;

import com.fr.formation.students.dtos.UserCreateDto;
import com.fr.formation.students.dtos.UserUpdateDto;
import com.fr.formation.students.entities.Person;
import com.fr.formation.students.entities.UserAccount;
import com.fr.formation.students.repositories.PersonJpaRepository;
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

}
