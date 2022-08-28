package org.springframework.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * <B>主类名称：</B>  <BR>
 * <B>概要说明：</B>  <BR>
 *
 * @author zhiyong.yao
 * @since 2022-08-28 10:23
 */
@Component
public class ColorFactoryBean implements FactoryBean<Color> {
	@Override
	public Color getObject() throws Exception {
		return new Red();
	}

	@Override
	public Class<Color> getObjectType() {
		return Color.class;
	}
	
}
