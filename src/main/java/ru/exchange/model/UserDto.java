package ru.exchange.model;

import lombok.Data;
import ru.exchange.entity.Role;

@Data
public class UserDto {

    private String username;
    private String password;
    private String fio;
    private String organization;
    private Role role;
}
