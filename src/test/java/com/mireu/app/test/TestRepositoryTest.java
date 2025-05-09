package com.mireu.app.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
@SpringBootTest
@Slf4j
class TestRepositoryTest {

	@Autowired
	private TestRepository repository;
	
	@Test
	void test2() {
		TestVO testVO = new TestVO();
//		testVO.setNum(11L);
		testVO.setName("zz");
		testVO.setAge(20);
		
		testVO = repository.save(testVO);
		log.info("TestVO:{}",testVO);
		assertNotNull(testVO);
	}
	
//	@Test
//	void test() {
//		long count = repository.count();
//		
//		assertNotEquals(0, count);
//	}

}
