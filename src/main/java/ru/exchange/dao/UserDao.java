package ru.exchange.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.exchange.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);
}

