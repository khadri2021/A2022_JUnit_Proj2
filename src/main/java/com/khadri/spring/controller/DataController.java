package com.khadri.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khadri.spring.service.DataService;

@RestController
public class DataController {

	@Autowired
	private DataService dataService;

	@PostMapping
	public ResponseEntity<String> dataAccepts() {

		String wish = dataService.wish();

		return new ResponseEntity<String>(wish, HttpStatus.ACCEPTED);
	}
}
