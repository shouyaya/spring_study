package org.springframework.bean;


import javax.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements InitializingBean {
	@Autowired
	private HelloWorld2 helloWorld2;
	private String user;

	
	public HelloWorld() {
		System.out.println("HelloWorld's constructor...");
	}
	
	@PostConstruct
	public void postConstruct (){
		System.out.println("@PostConstruct before");
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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("HelloWorld : before");
	}
}