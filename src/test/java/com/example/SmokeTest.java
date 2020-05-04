package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {
	
	@Autowired
	private HomeController controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
}
