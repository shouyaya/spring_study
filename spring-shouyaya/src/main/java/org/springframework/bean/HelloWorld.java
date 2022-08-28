package org.springframework.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	@Autowired
	private HelloWorld2 helloWorld2;
	private String user;

	public HelloWorld() {
		System.out.println("HelloWorld's constructor...");
	}

	public void setUser(String user) {
		System.out.println("setUser:" + user);
		this.user = user;
	}

	public HelloWorld(String user) {
		this.user = user;
	}

	public void hello(){
		System.out.println("Hello: " + this.user);
	}

}