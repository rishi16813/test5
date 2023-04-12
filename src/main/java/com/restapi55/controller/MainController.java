package com.restapi55.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi55.entity.CityMall;
import com.restapi55.service.CityMallService;

@RestController
public class MainController {
@Autowired
	private CityMallService service;
//create method post
@PostMapping("/post")
 public ResponseEntity<String>addCityEntity(@RequestBody CityMall cityMall){
	 int i = service.resister(cityMall);
	 if (i==1) {
		ResponseEntity<String>responseEntity=new ResponseEntity<String>("save Success",HttpStatus.CREATED);
		return responseEntity;
	}else {
		ResponseEntity<String>responseEntity = new ResponseEntity<String>("not Success",HttpStatus.BAD_REQUEST);
		return responseEntity;
	}
 }

// update method
@PutMapping("/put/{id}")
  public ResponseEntity<CityMall>updateEntity(@RequestBody CityMall cityMall,@PathVariable int id){
	
	try {
		this.service.update(cityMall, id);
		return ResponseEntity.ok().body(cityMall);
	} catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
  }
//all get by id 
@GetMapping("/getalldata")
  public ResponseEntity<List<CityMall>>getAllData(){
	  List<CityMall> allData = service.getAllData();
	  if (allData.size()<=0) {
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(allData);
	}

// getby Id method
  @GetMapping("/get/{id}")
  public ResponseEntity<CityMall>getById(@PathVariable int id){
	  CityMall byId = service.getById(id);
	  ResponseEntity<CityMall>responseEntity= new ResponseEntity<CityMall>(byId,HttpStatus.OK);
	  return responseEntity;
  }
  //Delete method
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteById(@PathVariable int id){
	  try {
		  this.service.deleteById(id);
		 
		 return new ResponseEntity<String>("Deleted Success",HttpStatus.CREATED);
	} catch (Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>("Deleted failed",HttpStatus.INTERNAL_SERVER_ERROR);
	}
  }
  
  }

