package com.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.admin.model.Cafe;

@Service
public interface CafeServices {
	
	Cafe addCafe(Cafe cafe);
	
	Cafe getCafe(int id);
	
	List<Cafe> allCafe();
	
	Cafe updateCafe(int id,Cafe c);
	
	void deleteCafe(int id);
	
}
