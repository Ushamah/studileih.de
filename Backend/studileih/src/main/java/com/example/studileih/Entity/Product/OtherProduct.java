package com.example.studileih.Entity.Product;

import com.example.studileih.Entity.Product.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="otherProduct")
@Data
@NoArgsConstructor
public class OtherProduct extends Product {

    public OtherProduct(String name) {
        super(name);
    }
}
