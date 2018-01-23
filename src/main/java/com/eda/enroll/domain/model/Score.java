package com.eda.enroll.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

//单项成绩
@Entity
@Data
public class Score {
	private @Id @GeneratedValue Long id;
	// 科目代码
	@Column(name = "subject_no", nullable = false, length = 32)
	private String subjectNo;
	// 科目名称
	@Column(name = "subject_name", nullable = false, length = 32)
	private String subjectName;
	// 成绩
	@Column(name = "mark", nullable = true, precision = 12, scale = 2)
	private float mark;

	@ManyToOne
	private Examinee examinee;

}
