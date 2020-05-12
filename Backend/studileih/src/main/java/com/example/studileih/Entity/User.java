package com.example.studileih.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user_table")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@ToString
public class User extends BaseEntity{

    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL})
    private List<Product> products;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dorm")
    private Dorm dorm;

    public User(String name) {
        this.name = name;
    }
}