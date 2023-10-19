package com.xworkz.dmartapp.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private  int productId;
    private String ProductName;
    private String manufacturedBy;
    private String category;
    private int  price;
    private int quantity;
    private String expairyDate;

    }

