package com.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.model.Cafe;

public interface CafeRepo extends JpaRepository<Cafe, Integer> {

}
