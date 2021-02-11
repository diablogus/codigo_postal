package com.casa.gus;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class CodigoPostalApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	@Order(0)
	void testZipCodesOk() throws Exception {
		mockMvc.perform(get("/zip-codes/08100")).andDo(print());
	}

	@Test
	@Order(1)
	void testZipCodesNotOk() throws Exception {
		mockMvc.perform(get("/zip-codes/08101")).andDo(print());
	}
	
	/*
	@Test
	@Order(2)
	void testEstado() throws Exception {
		mockMvc.perform(get("/estado/Ciudad de México")).andDo(print());
	}
	
	@Test
	@Order(3)
	void testMunicipio() throws Exception {
		mockMvc.perform(get("/municipio/Álvaro Obregón")).andDo(print());
	}

	@Test
	@Order(4)
	void testAsentamiento() throws Exception {
		mockMvc.perform(get("/asentamiento/San Ángel")).andDo(print());
	}
	*/
}
