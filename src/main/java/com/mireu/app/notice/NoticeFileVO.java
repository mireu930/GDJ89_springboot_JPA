package com.mireu.app.notice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "noticefiles_tbl")
public class NoticeFileVO {

	@Id
	private Long fileNum;
	private String fileName;
	private String oldName;
	//private Long boardNum;
	@OneToOne
	@JoinColumn(name ="boardNum")
	private NoticeVO noticeVO;
}
