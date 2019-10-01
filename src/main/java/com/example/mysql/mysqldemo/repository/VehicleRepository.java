package com.example.mysql.mysqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mysql.mysqldemo.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
