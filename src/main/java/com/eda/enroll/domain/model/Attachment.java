package com.eda.enroll.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Data;

@MappedSuperclass
public class Attachment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	// ��������
	@Column(name = "name")
	private String name;
	// ������С
	@Column(name = "size")
	private long size;
	// ��������(��Ƭ,����,����)
	@Column(name = "attachment_type")
	private String attachmentType;
	// �ļ����ͣ�.jpg,pdf,excel)
	@Column(name = "file_type")
	private String fileType;
	// �ļ���ȡ·��
	@Column(name = "store_path")
	private String storePath;
	
	
}
