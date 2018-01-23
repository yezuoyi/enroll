package com.eda.enroll.domain.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "examinee")
@Data
public class Examinee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Integer examineeId;

	// 考生成绩
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "examinee_id")
	private List<Score> scoreList;

	// 志愿列表
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "examinee_id")
	private List<Aspiration> aspirationList;

	// 考生基本信息
	@OneToOne(targetEntity = ExamineeBaseInfo.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(referencedColumnName = "id")
	private ExamineeBaseInfo examineeBaseInfo;

	// 相片
	@OneToOne(targetEntity = Photo.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "photo_id", referencedColumnName = "id")
	private Photo photo;

	// 相片
	@OneToOne(targetEntity = HealthForm.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "healthform_id", referencedColumnName = "id")
	private HealthForm healthForm;

	// 档案
	@OneToOne(targetEntity = Dossier.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "dossier_id", referencedColumnName = "id")
	private Dossier dossier;

	// 录取信息
	@OneToOne(targetEntity = EnrollInfo.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "enrollinfo_id", referencedColumnName = "id")
	private EnrollInfo enrollInfo;

}
