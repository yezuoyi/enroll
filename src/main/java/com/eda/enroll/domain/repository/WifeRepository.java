package com.eda.enroll.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.eda.enroll.domain.model.Wife;

public interface WifeRepository extends CrudRepository<Wife, Integer> {
	public Wife save(Wife wife);

	public Wife findByName(String name);
}
