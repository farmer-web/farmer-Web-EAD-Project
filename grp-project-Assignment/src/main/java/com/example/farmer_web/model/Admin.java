package com.example.farmer_web.model;

import lombok.*;
import javax.persistence.*;


@Setter
@Getter
@Entity
public class Admin {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String fName;
    private String lName;
    private String username;
    private String password;
}
