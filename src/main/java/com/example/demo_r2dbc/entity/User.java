package com.example.demo_r2dbc.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Setter @Getter
@Table("users")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
}
