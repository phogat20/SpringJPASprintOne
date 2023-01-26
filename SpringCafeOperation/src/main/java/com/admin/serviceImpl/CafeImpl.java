package com.admin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.Cafe;
import com.admin.repo.CafeRepo;
import com.admin.service.CafeServices;

@Service
public class CafeImpl implements CafeServices {
	@Autowired
	CafeRepo cafeRepo;

	@Override
	public Cafe addCafe(Cafe cafe) {
		return cafeRepo.save(cafe);
	}

	@Override
	public Cafe getCafe(int id) {
		return cafeRepo.findById(id).get();
	}

	@Override
	public List<Cafe> allCafe() {
		return cafeRepo.findAll();
	}

	@Override
	public Cafe updateCafe(int id, Cafe c) {
		return cafeRepo.save(c);
	}

	@Override
	public void deleteCafe(int id) {
		cafeRepo.deleteById(id);
	}

}
