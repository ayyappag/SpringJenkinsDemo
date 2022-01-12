package com.springboot.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

	@PostConstruct
	public void init() {
		logger.info("spring boot init ");
	}

	public static void main(String[] args) {
		logger.info("spring boot executed");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
	}

}
