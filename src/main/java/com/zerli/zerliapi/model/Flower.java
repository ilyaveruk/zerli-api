package com.zerli.zerliapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flower {
    private Long id;
    private String description;
    private Float price;
    private byte[] image;

    public Flower(Long id, String description, Float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
}
