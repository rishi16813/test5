package com.restapi55.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi55.entity.CityMall;
import com.restapi55.repository.CityMallRepo;
@Service
public class CityMallServiceImpl implements CityMallService {
	@Autowired
	private CityMallRepo cityMallRepo;

	@Override
	public List<CityMall> getAllData() {
		List<CityMall> findAll = cityMallRepo.findAll();
		return findAll;
	}

	@Override
	public CityMall getById(int id) {
		Optional<CityMall> findById = cityMallRepo.findById(id);
		return findById.get();
	}

	@Override
	public int resister(CityMall cityMall) {
	CityMall save = cityMallRepo.save(cityMall);
	if (save!=null) {
		return 1;
	}else {
		return 0;
	}
	}

	@Override
	public void deleteById(int id) {
		cityMallRepo.deleteById(id);
		
	}

	@Override
	public void update(CityMall cityMall, int id) {
		cityMall.setProductId(id);
		cityMallRepo.save(cityMall);
		
	}
	
	

}
