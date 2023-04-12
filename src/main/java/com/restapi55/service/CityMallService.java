package com.restapi55.service;

import java.util.List;

import com.restapi55.entity.CityMall;

public interface CityMallService {

	public List<CityMall>getAllData();
	public CityMall getById(int id);
	public int resister(CityMall cityMall);
	public void update(CityMall cityMall ,int id);
	public void deleteById(int id);
}
