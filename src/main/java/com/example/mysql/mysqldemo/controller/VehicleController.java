package com.example.mysql.mysqldemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.mysqldemo.model.Vehicle;
import com.example.mysql.mysqldemo.repository.VehicleRepository;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleRepository vr;
	
	@PostMapping(path="/vehicle", consumes="application/json", produces = "application/json")
	public String saveVehicle(@RequestBody Vehicle vh){
		vr.save(vh);
		return "vehicle created";
	}
}
