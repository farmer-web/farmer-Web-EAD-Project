package com.example.farmer_web.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Blog {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    @Lob
    @Column(columnDefinition = "BlOB")
    private String pImage;
    private Date date;

}
