package com.eda.enroll.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "aspiration")
@Data
@Entity
public class Aspiration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	// 志愿序号(第一,二....
	@Column(name = "aspiration_sn")
	private int aspirationSn;

	// 专业名称
	@Column(name = "major_name")
	private String majorName;

	@ManyToOne
	private Examinee examinee;

}
