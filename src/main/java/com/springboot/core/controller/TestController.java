package com.springboot.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {

	public static Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value = "/emp", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> getName() {

		logger.info("get response call");
		return new ResponseEntity<String>("tests", HttpStatus.OK);
	}

}
