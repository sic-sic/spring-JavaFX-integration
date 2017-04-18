package org.diazspring.jfx.core;

import java.util.Collection;

import org.diazspring.jfx.FXMLView;

public class SpringFXML {
	
	public void build() {
		SpringFXMLViewFetcher fetcher = SpringFXMLViewFetcherFactory.getInstance();
		SpringFXMLViewBeanInitializr initializr = SpringFXMLViewBeanInitializrFactory.getInstance();
		SpringFXMLLoader loader = SpringFXMLLoaderFactory.getInstance();
		
		Collection<FXMLView> views = initializr.getInstancesOf(fetcher.fetchViews());
		loader.loadViews(views);
		
		SpringFXMLViewRegistrar registrar = SpringFXMLViewRegistrarFactory.getInstance();
		registrar.registerAll(views);
	}
	
}
