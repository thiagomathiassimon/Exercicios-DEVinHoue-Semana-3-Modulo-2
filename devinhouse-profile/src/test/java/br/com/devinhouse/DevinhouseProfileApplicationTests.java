package br.com.devinhouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.devinhouse.Service.MyHello;

@SpringBootTest
@ActiveProfiles("test")
@Import(HelloTestConfiguration.class)
class DevinhouseProfileApplicationTests {

	@Autowired
	private MyHello hello;

	@Test
	void contextLoads() {
		String message = hello.greet("Thiago Mathias Simon");
		System.out.println(message);
		assertEquals(message, "Welcome to this test Mr. Thiago Mathias Simon!");
	}

}
