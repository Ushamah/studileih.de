package com.example.studileih.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.nio.file.Path;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@ToString
public abstract class Product extends BaseEntity{

     private String name;
     private String title;
     private double price = 0;
     private int views = 0; //How often was the product viewed?
     private boolean available = true; //is it available?


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_id")
    private User user;

    //for testing
    public Product(String name) {
        this.name = name;
    }
}