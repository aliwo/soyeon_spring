package com.soyeonlab.labs.web.dto;

import com.soyeonlab.labs.domain.user.User;

public class UserSaveRequestDto {
    private String name;

    public User toEntity() {
        return User.builder()
                .name(name)
                .build();
    }

}
