package com.example.farmer_web.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class POrder {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String customerName;
    private String customerMobileNo;
    private String productName;
    private String productType;
    private String quantity;
    private String price;
    private Date date;

}
