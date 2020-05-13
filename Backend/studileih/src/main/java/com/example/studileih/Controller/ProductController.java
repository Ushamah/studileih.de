package com.example.studileih.Controller;

import com.example.studileih.Dto.ProductDto;
import com.example.studileih.Entity.Product;
import com.example.studileih.Service.ProductServiceImpl;
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
    private ProductServiceImpl productServiceImpl;

    @PostConstruct
    public void createBaseDataset() {
        Product monopoly = new Product("Monopoly");
        monopoly.setCreatedAt(Calendar.getInstance().getTime());
        monopoly.setUpdatedAt(Calendar.getInstance().getTime());
        productServiceImpl.saveOrUpdateProduct((Product) monopoly);
    }
    /**
     * @return: all products from the repository
     */
    @GetMapping("getAllProducts")
    public List<Product> getAllProducts() {
        List<Product> allProducts = new ArrayList<>();
        allProducts = productServiceImpl.listAllProducts();
        List<ProductDto> allProductsDto = transferProductToDto(allProducts);
        return allProducts;
    }

    private List<ProductDto> transferProductToDto(List<Product> allProducts) {
        return null;
    }


}