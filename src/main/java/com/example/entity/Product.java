package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="products")
@Getter
@Setter
@NoArgsConstructor
public class Product extends BaseEntity {
    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;

    @Column(nullable=false)
    private Integer stock=0;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<OrderItem> orderItems;
}
