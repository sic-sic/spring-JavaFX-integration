package org.diazspring.jfx.core;

public class SpringFXMLViewFetcherFactory {

	private static SpringFXMLViewFetcher springFXMLViewFetcher;
	
	public static SpringFXMLViewFetcher getInstance() {
		if (springFXMLViewFetcher == null)
			springFXMLViewFetcher = new SpringFXMLViewFetcher();
		return springFXMLViewFetcher;
	}

}
