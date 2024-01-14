package com.khadri.spring.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.khadri.spring.service.DataService;

@ExtendWith(MockitoExtension.class)
class DataControllerTest {

	@Mock
	private DataService dataService;

	@InjectMocks
	private DataController dataController;

	@BeforeAll
	static void setUp() {
		MockitoAnnotations.openMocks(DataControllerTest.class);
	}

	@Test
	void testDataAccepts() {

		Mockito.when(dataService.wish()).thenReturn("Welcome to Junit");

		ResponseEntity<String> actualResponse = dataController.dataAccepts();
		assertEquals("Welcome to Junit", actualResponse.getBody());
	}

}
