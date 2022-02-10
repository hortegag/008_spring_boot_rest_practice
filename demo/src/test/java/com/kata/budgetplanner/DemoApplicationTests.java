package com.kata.budgetplanner;

import com.kata.budgetplanner.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {


	@Autowired
	private HomeController controller;



	@Test
	void contextLoads() {

		assertThat(controller).isNotNull();
	}


	@LocalServerPort
	private int port;
f
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@WithMockUser(username = "user",password = "password")
	public void greetingShouldReturnDefaultMessage() throws Exception {




		assertThat(this.restTemplate.withBasicAuth("user","password").getForObject("http://localhost:" + port + "/",
												  String.class)).contains("Hello, World");

	}

	@Autowired
	private HomeController service;

	@WithMockUser()
	@Test
	public void givenAuthenticated_whenCallServiceWithSecured_thenOk() {
		System.out.println(service.greeting());
		assertThat(service.greeting()).isNotBlank();
	}

}
