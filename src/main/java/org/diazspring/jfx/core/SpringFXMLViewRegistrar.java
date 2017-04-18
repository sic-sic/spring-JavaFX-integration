package org.diazspring.jfx.core;

import java.util.Collection;

import org.diazspring.jfx.FXMLView;
import org.diazspring.jfx.util.SpringFXMLUtil;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringFXMLViewRegistrar {
	
	private ConfigurableApplicationContext applicationContext;
	private String basePackage;

	public SpringFXMLViewRegistrar(ConfigurableApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		this.basePackage = "";
	}

	public void register(FXMLView view) {
		applicationContext.getBeanFactory().registerSingleton(SpringFXMLUtil.getViewName(view), view);
	}
	
	public void registerAll(Collection<FXMLView> views) {
		for (FXMLView view : views) {
			register(view);
		}
	}

	public ConfigurableApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(ConfigurableApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public String getBasePackage() {
		return basePackage;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}

}
