package com.example.studileih.Controller;

import com.example.studileih.Dto.UserDto;
import com.example.studileih.Entity.Address;
import com.example.studileih.Entity.Dorm;
import com.example.studileih.Entity.Product.Product;
import com.example.studileih.Entity.Product.Tool;
import com.example.studileih.Entity.User;
import com.example.studileih.Service.ToolServiceImpl;
import com.example.studileih.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private ToolServiceImpl toolServiceImpl;

    /**
     * @return: all products from the repository
     */
    @GetMapping("getAllProducts")
    public List<Product> getAllProducts() {
        return null;
    }


}