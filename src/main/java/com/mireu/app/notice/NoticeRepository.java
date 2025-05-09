package com.mireu.app.notice;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<NoticeVO, Long>{

	public List<NoticeVO> findAllByOrderByBoardNumDesc();
	public Page<NoticeVO> findByBoardTitleLike(String b, Pageable pageable);
}
