package com.halim.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.halim.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	public Category findByName(String name);

}
