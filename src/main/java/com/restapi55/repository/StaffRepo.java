package com.restapi55.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi55.entity.Staff;
@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>{

}
