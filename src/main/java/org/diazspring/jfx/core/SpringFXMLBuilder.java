package org.diazspring.jfx.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringFXMLBuilder {
	
	public SpringFXMLBuilder basePackage(String basePackage) {
		SpringFXMLViewRegistrarFactory.getInstance()
			.setBasePackage(basePackage);
		return this;
	}
	
	public void build() {
		SpringFXMLFactory.getInstance().build();
	}
	
	public static SpringFXMLBuilder forContext(ApplicationContext context) {
		SpringFXMLViewRegistrarFactory.getInstance((ConfigurableApplicationContext) context);
		return SpringFXMLBuilderFactory.getInstance();
	}
	
}
