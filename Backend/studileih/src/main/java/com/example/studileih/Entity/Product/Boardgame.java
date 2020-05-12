package com.example.studileih.Entity.Product;

import com.example.studileih.Entity.Product.Product;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="boardgame")
@Data
@NoArgsConstructor
public class Boardgame extends Product {

    public Boardgame(String name) {
        super(name);
    }
}
