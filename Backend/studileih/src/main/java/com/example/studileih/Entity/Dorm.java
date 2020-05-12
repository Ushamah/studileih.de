package com.example.studileih.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="dorm")
@Data
@NoArgsConstructor
public class Dorm extends BaseEntity {
    @NonNull private String name;
    @OneToMany(mappedBy = "dorm", cascade = {CascadeType.ALL})
    private List<User> users;

    public Dorm(@NonNull String name) {
        this.name = name;
    }
}
