package com.eda.enroll.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

//����������Ϣ
@Table(name = "notice_book")
@Data
@Entity
public class NoticeBook {
	//����
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	// ֪ͨ���
	@Column(name = "notice_no")
	private Integer noticeNo;
	
	// ֪ͨ������
	@Column(name = "notice_content")
	private String noticeContent;
	
	// ֪ͨ����(��������֪ͨ�����ݵ���ʾ��ʽ��
	@Transient
	private NoticeBookStyle noticeBookStyle;
	
}
