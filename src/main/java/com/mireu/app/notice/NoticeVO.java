package com.mireu.app.notice;

import java.sql.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "NOTICE_TBL")

public class NoticeVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long boardNum;
	private String boardTitle;
	@Lob
	private String boardContents;
	//@UpdateTimestamp
	//@Temporal(TemporalType.DATE) //클래스의 변수의 날짜타입을 지정
	@CreationTimestamp
	private Date boardDate;
	private Long boardHit;
	@Column(name = "user_name")
	private String username;
	@OneToMany
	@JoinColumn(name = "boardNum")
	private List<NoticeFileVO> noticeFileVOs;
}
