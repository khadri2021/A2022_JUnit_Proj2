package com.khadri.spring.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.khadri.spring.service.DataService;

@ExtendWith(MockitoExtension.class)
class DataControllerTest {

	private static final String WISH_MSG = "Welcome to Junit";

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
		when(dataService.wish()).thenReturn(WISH_MSG);
		ResponseEntity<String> actualResponse = dataController.dataAccepts();
		assertNotNull(actualResponse);
		assertEquals(WISH_MSG, actualResponse.getBody());
		assertNotEquals(WISH_MSG + "HAI", actualResponse.getBody());
	}
}
