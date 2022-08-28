package org.springframework.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * <B>主类名称：</B>  <BR>
 * <B>概要说明：</B>  <BR>
 *
 * @author zhiyong.yao
 * @since 2022-08-27 15:35
 */
@Component
@Lazy
public class HelloWorld2 {
	@Autowired
	private HelloWorld helloWorld;
	private String user;

	public HelloWorld2() {
		System.out.println("HelloWorld's constructor...");
	}

	public void setUser(String user) {
		System.out.println("setUser:" + user);
		this.user = user;
	}

	public HelloWorld2(String user) {
		this.user = user;
	}

	public void hello(){
		System.out.println("Hello: " + this.user);
	}

}
