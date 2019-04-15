package com.fr.formation.students.dtos;

import javax.validation.Valid;

public class UserCreateDto extends UserDto {

    @Valid
    private UserAccountDto userAccount;

    public UserCreateDto() {
    }

    public UserAccountDto getUserAccount() {
        return userAccount;
    }

    public void setUserAccountDto(UserAccountDto userAccount) {
        this.userAccount = userAccount;
    }


}
