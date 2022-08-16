package com.zerli.zerliapi.services;

import com.zerli.zerliapi.model.Flower;

import java.sql.Blob;
import java.util.List;

public interface FlowerService {
    List<Flower> getAllFlowers();

    Flower getFlowerById(Long id);

}
