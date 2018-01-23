package com.eda.enroll.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

//考生基本信息
@Entity
@Table(name = "examinee_base_info")
@Data
public class ExamineeBaseInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	// 姓名
	@Column(name = "name")
	private String name;

	// 性别
	@Column(name = "gender", length = 1)
	private char gender;

	// 省份
	@Column(name = "province")
	private String province;

	// 身份证号
	@Column(name = "idNo")
	private String idNo;

	// 民族
	@Column(name = "nation")
	private String nation;
	// 政治面貌
	@Column(name = "political_status")
	private String politicalStatus;
	// 考生类别(城镇应届,农村应届,城镇往届,农村往届)
	@Column(name = "examinee_type")
	private String examineeType;

	// 毕业学校
	@Column(name = "school_name")
	private String schoolName;
	



}
