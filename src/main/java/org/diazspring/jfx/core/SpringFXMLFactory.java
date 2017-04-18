package org.diazspring.jfx.core;

public class SpringFXMLFactory {
	
	private static SpringFXML springFXML;

	public static SpringFXML getInstance() {
		if (springFXML == null)
			springFXML = new SpringFXML();
		return springFXML;
	}
	
}
