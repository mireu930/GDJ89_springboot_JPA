package com.mireu.app.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice/*")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("list")
	public Page<NoticeVO> getList() throws Exception {
		Page<NoticeVO> list = noticeService.getList();
		return list;
	}
	
	@GetMapping("detail")
	public Page<NoticeVO> getDetail() throws Exception {
		return noticeService.getDetail("%문의%");
	}
}
