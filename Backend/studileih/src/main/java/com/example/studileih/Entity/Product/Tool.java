package com.example.studileih.Entity.Product;

import com.example.studileih.Entity.Product.Product;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tool")
@Data
@NoArgsConstructor
public class Tool extends Product {


    public Tool(String name) {
        super(name);
    }
}
