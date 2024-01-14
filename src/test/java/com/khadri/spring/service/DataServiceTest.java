package com.khadri.spring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DataServiceTest {

	private static DataService dataService;

	@BeforeAll
	static void setUpBeforeClass() {
		dataService = new DataService();
	}

	@Test
	void testWish() {
		String actual = dataService.wish();
		assertEquals("Welcome to Junit", actual);
	}

}
