package com.eda.enroll.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//¼ȡ��Ϣ
@Table(name = "aspiration")
@Data
@Entity
public class EnrollInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	// רҵ����
	@Column(name = "major_name")
	private String majorName;
	// רҵ���ࣨ�ģ���
	@Column(name = "major_type")
	private String majorType;
	// ¼ȡ�ȼ�(��һ�����ڶ�������������
	@Column(name = "enroll_order")
	private String enrollOrder;
	// ¼ȡ״̬(�ǣ���¼ȡ
	@Column(name = "enrolls_tate")
	private int enrollState;

}
