package org.diazspring.jfx.core;

public class SpringFXMLLoaderFactory {
	private static SpringFXMLLoader loader;
	
	public static SpringFXMLLoader getInstance() {
		if (loader == null) {
			loader = new SpringFXMLLoader();
		}
		return loader;
	}
}
