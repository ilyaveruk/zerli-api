package com.zerli.zerliapi.services;

import com.zerli.zerliapi.entity.FlowerEntity;
import com.zerli.zerliapi.model.Flower;
import com.zerli.zerliapi.repository.FlowerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlowerServiceImpl implements FlowerService {

    private final FlowerRepository flowerRepository;

    public FlowerServiceImpl(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @Override
    public List<Flower> getAllFlowers() {
        List<FlowerEntity> flowerEntities = flowerRepository.findAll();
        return flowerEntities.stream().map(
                flower -> new Flower(flower.getId(), flower.getDescription(), flower.getPrice())).collect(Collectors.toList());

    }

    @Override
    public Flower getFlowerById(Long id) {
        FlowerEntity flowerEntity = flowerRepository.findById(id).orElse(null);
        Flower flower = new Flower();

        assert flowerEntity != null;
        BeanUtils.copyProperties(flowerEntity, flower);
        return flower;
    }

}
