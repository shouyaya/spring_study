package org.springframework.main;

import org.springframework.bean.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <B>主类名称：</B>  <BR>
 * <B>概要说明：</B>  <BR>
 *
 * @author zhiyong.yao
 * @since ${DATE} ${TIME}
 */
public class Main {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springframework.bean");
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorld.class);
		HelloWorld helloWorld = applicationContext.getBean("helloWorld",HelloWorld.class);
		helloWorld.hello();
	}
}