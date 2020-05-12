package com.example.studileih.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tool")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tool extends Product {


    public Tool(String name) {
        super(name);
    }
}
