package br.com.devinhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.com.devinhouse.Service.MyHello;

@SpringBootApplication
public class DevinhouseProfileApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DevinhouseProfileApplication.class, args);
		MyHello hello = context.getBean(MyHello.class);
		String message = hello.greet("Thiago");
		System.out.println(message);
	}
}
