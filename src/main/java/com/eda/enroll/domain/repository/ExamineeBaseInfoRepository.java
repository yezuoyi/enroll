package com.eda.enroll.domain.repository;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import com.eda.enroll.domain.model.ExamineeBaseInfo;

public interface ExamineeBaseInfoRepository extends JpaRepository<ExamineeBaseInfo, Integer> {

	public ExamineeBaseInfo findByName(String name);

	@QueryHints({ @QueryHint(name = org.hibernate.ejb.QueryHints.HINT_CACHEABLE, value = "true") })
	@Query("FROM ExamineeBaseInfo e")
	List<ExamineeBaseInfo> getAll();
}


