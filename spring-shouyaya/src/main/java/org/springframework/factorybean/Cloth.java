package org.springframework.factorybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 布料
 * 包含颜色属性
 **/
@Component
public class Cloth {
	@Autowired
	//这里会通过ColorFactoryBean完成依赖注入
	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void printfClothInfo(){
		System.out.println("衣服信息如下：");
		this.color.printfColor();
	}
}