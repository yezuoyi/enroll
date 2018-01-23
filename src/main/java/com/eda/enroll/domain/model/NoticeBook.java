package com.eda.enroll.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

//考生基本信息
@Table(name = "notice_book")
@Data
@Entity
public class NoticeBook {
	//主键
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	// 通知书号
	@Column(name = "notice_no")
	private Integer noticeNo;
	
	// 通知书内容
	@Column(name = "notice_content")
	private String noticeContent;
	
	// 通知书风格(用来控制通知书内容的显示方式）
	@Transient
	private NoticeBookStyle noticeBookStyle;
	
}
