package ru.exchange.service;

import ru.exchange.entity.User;
import ru.exchange.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);

    List<User> findAll();

    void delete(User user);

    User findOne(String username);

    User findById(Long id);
}
