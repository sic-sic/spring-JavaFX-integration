package org.diazspring.jfx.core;

import org.springframework.context.ConfigurableApplicationContext;

public class SpringFXMLViewRegistrarFactory {
	
	private static SpringFXMLViewRegistrar springFXMLViewRegistrar;

	public static SpringFXMLViewRegistrar getInstance(ConfigurableApplicationContext context) {
		if (springFXMLViewRegistrar == null) {
			springFXMLViewRegistrar = new SpringFXMLViewRegistrar(context);
		}
		return null;
	}

	public static SpringFXMLViewRegistrar getInstance() {
		return springFXMLViewRegistrar;
	}

}
