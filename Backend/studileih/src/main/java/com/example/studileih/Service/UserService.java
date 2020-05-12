package com.example.studileih.Service;

import com.example.studileih.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> listAllUser();

    void saveOrUpdateUser(User user);

    Optional<User> getUserById(Long id);

    void deleteUser(Long id);
}
