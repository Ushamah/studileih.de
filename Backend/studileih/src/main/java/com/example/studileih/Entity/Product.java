package com.example.studileih.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="product")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@ToString
public class Product extends BaseEntity{

    private String name;
    private String title;
    private int price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_id")
    private User user;

    public Product(String name) {
        this.name = name;
    }
}