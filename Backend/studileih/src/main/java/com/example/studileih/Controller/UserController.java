package com.example.studileih.Controller;

import com.example.studileih.Dto.UserDto;
import com.example.studileih.Entity.User;
import com.example.studileih.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostConstruct
    public void createBaseDataset() {
        // can be deleted
        User user = new User();
        userServiceImpl.saveOrUpdateUser(user);
    }

    /**
     * @return: all users from the repository
     */
    @GetMapping("getAllUsers")
    public List<User> getAllRoofOffers() {
        return userServiceImpl.listAllUser();
    }

    /**
     * Get's an user as JSON from the angular-client and saves it as a new user into the repository
     */
    @PostMapping("saveUser")
    public Boolean saveRoof(@RequestBody UserDto userDto) {
        userServiceImpl.saveOrUpdateUser(new User(userDto.getName()));
        return true;
    }

}