package com.restapi55.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi55.entity.CityMall;
@Repository
public interface CityMallRepo extends JpaRepository<CityMall, Integer> {

}
