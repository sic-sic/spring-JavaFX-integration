package org.diazspring.jfx.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.diazspring.jfx.FXMLView;

public class SpringFXMLViewBeanInitializr {

	public FXMLView getInstanceOf(Class<? extends FXMLView> clazz) {
		try {
			return clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Collection<FXMLView> getInstancesOf(Set<Class<? extends FXMLView>> classes) {
		Collection<FXMLView> views = new ArrayList<>();
		for (Class<? extends FXMLView> clazz : classes) {
			views.add(getInstanceOf(clazz));
		}
		return views;
	}
	
}
