package com.example.studileih.Controller;

import com.example.studileih.Dto.UserDto;
import com.example.studileih.Entity.Product;
import com.example.studileih.Entity.User;
import com.example.studileih.Repository.ProductRepository;
import com.example.studileih.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void createBaseDataset() {
        // can be deleted
        Product product1 = new Product("Haralds VW Golf");
        product1.setCreatedAt(Calendar.getInstance().getTime());
        product1.setUpdatedAt(Calendar.getInstance().getTime());

        Product product2 = new Product("Haralds 2. VW Golf");
        product2.setCreatedAt(Calendar.getInstance().getTime());
        product2.setUpdatedAt(Calendar.getInstance().getTime());
        List<Product> haraldsList = new ArrayList<>();
        haraldsList.add(product1);
        haraldsList.add(product2);

        User user = new User("Harald", "harald@gmx.com", "2345", haraldsList);
        user.setCreatedAt(Calendar.getInstance().getTime());
        user.setUpdatedAt(Calendar.getInstance().getTime());
        userServiceImpl.saveOrUpdateUser(user);
        product1.setUser(user);
        product2.setUser(user);
        productRepository.save(product1);
        productRepository.save(product2);
        Optional<User> user2 = userServiceImpl.getUserById(23L);
        User user3 = user2.get();
        user3.setUpdatedAt(Calendar.getInstance().getTime());
        userServiceImpl.saveOrUpdateUser(user3);
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