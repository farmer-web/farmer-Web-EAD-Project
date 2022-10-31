package com.example.farmer_web.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity

public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String fName;
    private String lName;
    private String mobileNo;
    private String address;
    private String username;
    private String password;



}
