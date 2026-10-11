package com.example.AirtelApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AirtelApplication.Entity.AirtelEntity;
import com.example.AirtelApplication.service.AirtelServiceImpl;

@RestController
@RequestMapping("/airtel")
public class AirtelController {

	@Autowired
	private AirtelServiceImpl impl;

	@PostMapping("/posting")
	public ResponseEntity<AirtelEntity> createDate(@RequestBody AirtelEntity entity) {
		AirtelEntity date = impl.createDate(entity);
		return new ResponseEntity<AirtelEntity>(date, HttpStatus.OK);
	}

	@GetMapping("/getall")
	public List<AirtelEntity> getallData() {
		List<AirtelEntity> getallData = impl.getallData();
		return getallData;
	}

	@GetMapping("getting/{id}")
	public ResponseEntity<AirtelEntity> getData(@PathVariable int id) {
		AirtelEntity data = impl.getData(id);
		return new ResponseEntity<AirtelEntity>(data, HttpStatus.OK);
	}

	@PutMapping("/putting/{id}")
	public ResponseEntity<AirtelEntity> updateData(@RequestBody AirtelEntity entity, @PathVariable int id) {
		AirtelEntity updateData = impl.updateData(entity, id);
		return new ResponseEntity<AirtelEntity>(updateData, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public void DeleteData(@PathVariable int id) {
		impl.DeleteData(id);
	}
}
