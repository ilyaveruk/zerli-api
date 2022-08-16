package com.zerli.zerliapi.repository;

import com.zerli.zerliapi.entity.FlowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlowerRepository extends JpaRepository<FlowerEntity, Long> {


}
