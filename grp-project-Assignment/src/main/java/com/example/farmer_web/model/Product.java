package com.example.farmer_web.model;


import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double price;
    private String description;

    @Lob
    @Column(columnDefinition = "BlOB")
    private String pImage;
    private Date date;




}
