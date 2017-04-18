package org.diazspring.jfx.core;

import java.util.Set;

import org.diazspring.jfx.FXMLView;
import org.reflections.Reflections;

public class SpringFXMLViewFetcher {

	public Set<Class<? extends FXMLView>> fetchViews() {
		Reflections reflections = new Reflections(SpringFXMLViewRegistrarFactory.getInstance().getBasePackage());
		return reflections.getSubTypesOf(FXMLView.class);
	}

}
