package com.eda.enroll.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eda.enroll.domain.model.Author;

public interface AuthorRepository  extends JpaRepository<Author, Long>{

}
