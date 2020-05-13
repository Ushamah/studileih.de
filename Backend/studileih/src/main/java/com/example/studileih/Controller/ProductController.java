package com.example.studileih.Controller;

import com.example.studileih.Dto.ProductDto;
import com.example.studileih.Entity.Product;
import com.example.studileih.Service.ProductServiceImpl;
import com.example.studileih.Service.UserServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @Autowired
    private ModelMapper modelMapper;

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
    @GetMapping("allProducts")
    public List<ProductDto> getAllProducts() {
        List<Product> allProducts = new ArrayList<>();
        allProducts = productServiceImpl.listAllProducts();
        System.out.println(allProducts.get(0).toString());
        return allProducts.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private ProductDto convertToDto(Product product) {
        ProductDto productDto = modelMapper.map(product, ProductDto.class);
        productDto.setCreatedAt(product.getCreatedAt(),
                ZonedDateTime.now(ZoneId.systemDefault()).toString());
        productDto.setUpdatedAt(product.getUpdatedAt(),
                ZonedDateTime.now(ZoneId.systemDefault()).toString());
        return productDto;
    }

}