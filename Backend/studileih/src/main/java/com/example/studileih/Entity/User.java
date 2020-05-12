package com.example.studileih.Entity;

import com.example.studileih.Entity.Product.Product;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user_table")
@Data
@NoArgsConstructor
public class User extends BaseEntity{

    private String name;
    private String email;
    private String password;
    private String room;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL})
    private List<Product> products;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dorm")
    private Dorm dorm;

    public User(String name) {
        this.name = name;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password, List<Product> products, Dorm dorm) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.products = products;
        this.dorm = dorm;
    }
}