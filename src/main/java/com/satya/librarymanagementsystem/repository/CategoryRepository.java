package com.satya.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
