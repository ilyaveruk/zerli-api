package com.zerli.zerliapi.repository;

import com.zerli.zerliapi.entity.FlowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Blob;
import java.util.List;

@Repository
public interface FlowerRepository extends JpaRepository<FlowerEntity, Long> {

    @Query("SELECT u.image FROM FlowerEntity u")
    List<byte[]> getAllImages();


}
