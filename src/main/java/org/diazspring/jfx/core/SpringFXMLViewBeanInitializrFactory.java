package org.diazspring.jfx.core;

public class SpringFXMLViewBeanInitializrFactory {

	private static SpringFXMLViewBeanInitializr springFXMLViewBeanInitializr;

	public static SpringFXMLViewBeanInitializr getInstance() {
		if (springFXMLViewBeanInitializr == null)
			springFXMLViewBeanInitializr = new SpringFXMLViewBeanInitializr();
		return springFXMLViewBeanInitializr;
	}
	
	
}
