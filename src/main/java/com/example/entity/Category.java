package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name="categories")
@NoArgsConstructor
public class Category extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Product> products;
}
