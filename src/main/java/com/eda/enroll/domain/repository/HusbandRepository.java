package com.eda.enroll.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eda.enroll.domain.model.Husband;

public interface HusbandRepository extends JpaRepository<Husband, Integer> {
	public Husband save(Husband husband);

	public Husband findByName(String name);

	public List<Husband> findAll();

}
