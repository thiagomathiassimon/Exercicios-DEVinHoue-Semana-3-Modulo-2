package br.com.devinhouse;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import br.com.devinhouse.service.HelloService;

@TestConfiguration
public class HelloTestConfiguration {
	@Bean
	public HelloService helloService() {
		return new HelloService() {

			@Override
			public String sayHello(String forWho) {
				return String.format("Welcome to this test Mr. %s!", forWho);
			}
		};
	}
}
