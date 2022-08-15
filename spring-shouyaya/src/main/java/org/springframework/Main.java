package org.springframework;

import org.springframework.bean.HelloWorld;
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
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		helloWorld.hello();
	}
}