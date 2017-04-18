package org.diazspring.jfx.util;

import org.diazspring.jfx.FXMLView;

public class SpringFXMLUtil {

	public static String getViewName(FXMLView view) {
		String name = view.getClass().getSimpleName();
		name = name.substring(0, 1).toLowerCase() + name.substring(1);
		return name;
	}

	public static String getViewFxmlName(FXMLView view) {
		String name = getViewName(view);
		name = name.substring(0, name.lastIndexOf("View")) + ".fxml";
		return name;
	}
	
	public static boolean hasValidViewName(FXMLView view) {
		return getViewName(view).endsWith("View");
	}

}
