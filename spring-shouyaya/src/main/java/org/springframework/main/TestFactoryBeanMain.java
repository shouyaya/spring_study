package org.springframework.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.factorybean.Cloth;
import org.springframework.factorybean.Color;

/**
 * <B>主类名称：</B>  <BR>
 * <B>概要说明：</B>  <BR>
 *
 * @author zhiyong.yao
 * @since 2022-08-28 11:12
 */
public class TestFactoryBeanMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springframework.factorybean");
		Cloth cloth = applicationContext.getBean("cloth", Cloth.class);
		cloth.printfClothInfo();
	}
}
