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

	// �����ɼ�
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "examinee_id")
	private List<Score> scoreList;

	// ־Ը�б�
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "examinee_id")
	private List<Aspiration> aspirationList;

	// ����������Ϣ
	@OneToOne(targetEntity = ExamineeBaseInfo.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(referencedColumnName = "id")
	private ExamineeBaseInfo examineeBaseInfo;

	// ��Ƭ
	@OneToOne(targetEntity = Photo.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "photo_id", referencedColumnName = "id")
	private Photo photo;

	// ��Ƭ
	@OneToOne(targetEntity = HealthForm.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "healthform_id", referencedColumnName = "id")
	private HealthForm healthForm;

	// ����
	@OneToOne(targetEntity = Dossier.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "dossier_id", referencedColumnName = "id")
	private Dossier dossier;

	// ¼ȡ��Ϣ
	@OneToOne(targetEntity = EnrollInfo.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "enrollinfo_id", referencedColumnName = "id")
	private EnrollInfo enrollInfo;

}
