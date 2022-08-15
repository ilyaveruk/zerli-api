package com.zerli.zerliapi.entity;


import lombok.Data;


import javax.persistence.*;

@Entity
@Data
@Table(name="flowers")
public class FlowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Float price;
}
