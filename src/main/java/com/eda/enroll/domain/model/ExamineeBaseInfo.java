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

//����������Ϣ
@Entity
@Table(name = "examinee_base_info")
@Data
public class ExamineeBaseInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	// ����
	@Column(name = "name")
	private String name;

	// �Ա�
	@Column(name = "gender", length = 1)
	private char gender;

	// ʡ��
	@Column(name = "province")
	private String province;

	// ���֤��
	@Column(name = "idNo")
	private String idNo;

	// ����
	@Column(name = "nation")
	private String nation;
	// ������ò
	@Column(name = "political_status")
	private String politicalStatus;
	// �������(����Ӧ��,ũ��Ӧ��,��������,ũ������)
	@Column(name = "examinee_type")
	private String examineeType;

	// ��ҵѧУ
	@Column(name = "school_name")
	private String schoolName;
	



}
