package com.fr.formation.students.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserAccountDto {

    @NotBlank
    @Size(max = 100)
    private String username;
    @NotBlank
    @Size(max = 12)
    private String password;

    public UserAccountDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}