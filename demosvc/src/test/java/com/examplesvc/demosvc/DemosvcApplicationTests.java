package com.examplesvc.demosvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemosvcApplicationTests {

	@Autowired
	HeloowController h;
	@Test
	void contextLoads() {
		assertEquals(h.getHellow(), "Hello World123");
	}

}
