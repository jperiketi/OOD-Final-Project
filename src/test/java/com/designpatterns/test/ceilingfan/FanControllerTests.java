package com.designpatterns.test.ceilingfan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.designpatterns.ceilingfan.controller.FanController;

@ExtendWith(MockitoExtension.class)
class FanControllerTests {
	
	@InjectMocks
	FanController fanController;

	@Test
	public void testoperateHigh() {

		ResponseEntity<String> responseEntity = fanController.operateHigh("LivingArea");

		assert(responseEntity.getStatusCode().is2xxSuccessful());
	}
	

	@Test
	public void testOperateOff() {
		
		ResponseEntity<String> responseEntity = fanController.operateOff("StudyRoom");

		assert(responseEntity.getStatusCode().is2xxSuccessful());

	}

}
