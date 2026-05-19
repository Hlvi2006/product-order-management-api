package com.example.entity;

import com.example.enums.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity{
    @Column(nullable=false,name="full_name")
    private String fullName;

    @Column(nullable=false,unique=true)
    private String email;

    @Column(nullable=false)
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;
}
