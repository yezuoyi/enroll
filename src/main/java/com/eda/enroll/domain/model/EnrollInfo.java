package com.eda.enroll.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//录取信息
@Table(name = "aspiration")
@Data
@Entity
public class EnrollInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	// 专业名称
	@Column(name = "major_name")
	private String majorName;
	// 专业科类（文，理）
	@Column(name = "major_type")
	private String majorType;
	// 录取等级(第一批，第二批，第三批）
	@Column(name = "enroll_order")
	private String enrollOrder;
	// 录取状态(是，否）录取
	@Column(name = "enrolls_tate")
	private int enrollState;

}
