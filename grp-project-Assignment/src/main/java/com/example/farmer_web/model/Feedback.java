package com.example.farmer_web.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Feedback {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String mobileNo;
    private String message;
    private Date date;

}
