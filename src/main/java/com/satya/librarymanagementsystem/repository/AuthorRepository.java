package com.satya.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
