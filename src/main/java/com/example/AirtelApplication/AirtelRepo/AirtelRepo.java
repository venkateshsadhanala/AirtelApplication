package com.example.AirtelApplication.AirtelRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AirtelApplication.Entity.AirtelEntity;

@Repository
public interface AirtelRepo extends JpaRepository<AirtelEntity, Integer> {

}
