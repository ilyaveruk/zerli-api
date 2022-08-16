package com.zerli.zerliapi.controller;


import com.zerli.zerliapi.model.Flower;
import com.zerli.zerliapi.services.FlowerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Blob;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class FlowerController {

    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }


    @GetMapping("/flowers")
    public List<Flower> getAllFlowers() {
        return flowerService.getAllFlowers();
    }

    @GetMapping("/flower/{id}")
    public ResponseEntity<Flower> getFlowerById(@PathVariable Long id) {
        Flower flower = flowerService.getFlowerById(id);
        return ResponseEntity.ok(flower);
    }


}
