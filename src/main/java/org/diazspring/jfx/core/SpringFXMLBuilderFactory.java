package org.diazspring.jfx.core;

public class SpringFXMLBuilderFactory {
	
	private static SpringFXMLBuilder springFXMLBuilder;

	public static SpringFXMLBuilder getInstance() {
		if (springFXMLBuilder == null)
			springFXMLBuilder = new SpringFXMLBuilder();
		return springFXMLBuilder;
	}
	
}
