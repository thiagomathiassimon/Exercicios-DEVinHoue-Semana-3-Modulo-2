package br.com.devinhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyHello {

	@Autowired
	private HelloService helloService;

	public String greet(String who) {
		return helloService.sayHello(who);
	}

}
