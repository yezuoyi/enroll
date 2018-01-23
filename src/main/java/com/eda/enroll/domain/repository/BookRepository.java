package com.eda.enroll.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eda.enroll.domain.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
