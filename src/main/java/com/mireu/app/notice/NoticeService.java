package com.mireu.app.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NoticeService {

	@Autowired
	private NoticeRepository noticeRepository;

	public Page<NoticeVO> getList() throws Exception {
		Pageable pageable = PageRequest.of(0, 10);
		
		Page<NoticeVO> result = noticeRepository.findAll(pageable);
		log.info("{}",result.getTotalPages());
		log.info("List: {}",result.getContent());
		log.info("next:{}",result.hasNext());
		log.info("previos:{}",result.hasPrevious());
		log.info("class:{}",result.getClass());
		
		return result;
		// return noticeRepository.findAll(Sort.by(Sort.Direction.ASC, "boardNum"));
//		List<NoticeVO> list = noticeRepository.findAllByOrderByBoardNumDesc();
//		return list;
	}
	
	public Page<NoticeVO> getDetail(String boardTitle) throws Exception {
		Pageable pageable = PageRequest.of(0, 2);
		
		
		return noticeRepository.findByBoardTitleLike(boardTitle, pageable);
	}
}
