package com.example.batuhan.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.batuhan.project.entity.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block, String>{

}
