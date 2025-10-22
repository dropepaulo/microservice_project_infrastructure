package com.mpi.hello_world_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.mpi.hello_world_service.controller.HelloWorldController;

@WebMvcTest(HelloWorldController.class) // Especifica que quero testar apenas a camada web (nosso
// controller)
class AloMundoServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testeDizerOlaEndpoint() throws Exception {
		mockMvc.perform(get("/api/v1/ola"))
				.andExpect(status().isOk())
				.andExpect(content().string("Alô, Mundo com Spring Boot!"));
	}
}