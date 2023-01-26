package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.Cafe;
import com.admin.service.CafeServices;

@RestController
public class Controller {
	@Autowired
	private CafeServices cafeServices;
	
	@PostMapping("/addCafe")
	public void addCafe(@RequestBody Cafe cafe) {
		cafeServices.addCafe(cafe);
	}
	
	@GetMapping("/getCafe/{id}")
	public Cafe getCafe(@PathVariable int id) {
		return cafeServices.getCafe(id);
	}
		
	@GetMapping("/getAllCafes")
	public List<Cafe> getAllCafes(){
		return cafeServices.allCafe();
	}
	
	@PutMapping("update/{id}")
	public Cafe updateCafe(@PathVariable int id, @RequestBody Cafe cafe) {
		return cafeServices.updateCafe(id, cafe);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCafe(@PathVariable("id") int id) {
		cafeServices.deleteCafe(id);
	}
}
