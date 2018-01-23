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
	
	// 附件名称
	@Column(name = "name")
	private String name;
	// 附件大小
	@Column(name = "size")
	private long size;
	// 附件类型(照片,体检表,档案)
	@Column(name = "attachment_type")
	private String attachmentType;
	// 文件类型（.jpg,pdf,excel)
	@Column(name = "file_type")
	private String fileType;
	// 文件存取路径
	@Column(name = "store_path")
	private String storePath;
	
	
}
