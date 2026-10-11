package com.example.AirtelApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AirtelApplication.AirtelRepo.AirtelRepo;
import com.example.AirtelApplication.Entity.AirtelEntity;

@Service
public class AirtelServiceImpl implements AirtelService {

	@Autowired
	private AirtelRepo repo;

	@Override
	public AirtelEntity createDate(AirtelEntity entity) {
		AirtelEntity save = repo.save(entity);
		return save;
	}

	@Override
	public AirtelEntity getData(int id) {
		Optional<AirtelEntity> byId = repo.findById(id);
		if (byId.isEmpty()) {
			throw new RuntimeException("data not found");
		}
		AirtelEntity airtelEntity = byId.get();
		return airtelEntity;
	}

	@Override
	public List<AirtelEntity> getallData() {
		List<AirtelEntity> all = repo.findAll();
		return all;
	}

	@Override
	public AirtelEntity updateData(AirtelEntity entity, int id) {
		Optional<AirtelEntity> byId = repo.findById(id);
		if (byId.isPresent()) {
			AirtelEntity airtelEntity = byId.get();

			if (entity.getName() != null && !(entity.getName().isEmpty())) {
				airtelEntity.setName(entity.getName());
			}
			if (entity.getAddress() != null && !(entity.getAddress().isEmpty())) {
				airtelEntity.setAddress(entity.getAddress());
			}
			if (entity.getEmail() != null && !(entity.getEmail().isEmpty())) {
				airtelEntity.setEmail(entity.getEmail());
			}
			if (entity.getStreet() != null && !(entity.getStreet().isEmpty())) {
				airtelEntity.setStreet(entity.getStreet());
			}
			if (entity.getVillage() != null && !(entity.getVillage().isEmpty())) {
				airtelEntity.setVillage(entity.getVillage());
			}
			if (entity.getPhno() != null && !(entity.getPhno().isEmpty())) {
				airtelEntity.setPhno(entity.getPhno());
			}
			return repo.save(airtelEntity);
		} else {
			throw new RuntimeException("data not found");
		}
	}

	@Override
	public void DeleteData(int id) {
		repo.deleteById(id);
	}

}
