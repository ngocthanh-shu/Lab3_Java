package com.lab3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Phone")
public class Phone {
    @Id
    private String Id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Price")
    private int price;

    @Column(name = "Color")
    private String color;

    @Column(name = "Country")
    private String country;

    @Column(name = "Quantity")
    private int quantity;
}
