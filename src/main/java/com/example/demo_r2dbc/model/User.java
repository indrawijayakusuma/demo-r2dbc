package com.example.demo_r2dbc.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter @Getter
public class User {
    private Long id;
    private String name;
    private String email;
}
