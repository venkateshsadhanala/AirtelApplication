package com.example.AirtelApplication.service;

import java.util.List;

import com.example.AirtelApplication.Entity.AirtelEntity;

public interface AirtelService {

	public AirtelEntity createDate(AirtelEntity entity);

	public AirtelEntity getData(int id);

	public List<AirtelEntity> getallData();

	public AirtelEntity updateData(AirtelEntity entity, int id);

	public void DeleteData(int id);
}
