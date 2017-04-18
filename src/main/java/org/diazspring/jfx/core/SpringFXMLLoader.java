package org.diazspring.jfx.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import org.diazspring.jfx.FXMLView;
import org.diazspring.jfx.exception.MalformedFXMLViewName;
import org.diazspring.jfx.util.SpringFXMLUtil;
import org.springframework.context.ApplicationContext;

import javafx.fxml.FXMLLoader;

public class SpringFXMLLoader extends FXMLLoader {

	public SpringFXMLLoader() {
		super();
		ApplicationContext applicationContext = SpringFXMLViewRegistrarFactory.getInstance().getApplicationContext();
		setControllerFactory(applicationContext::getBean);
	}

	public void loadView(FXMLView view) {
		String viewName = SpringFXMLUtil.getViewName(view);
		try {
			if (!SpringFXMLUtil.hasValidViewName(view))
				throw new MalformedFXMLViewName(viewName);
			InputStream inputStream = view.getClass().getResourceAsStream(SpringFXMLUtil.getViewFxmlName(view));
			view.setView(load(inputStream));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MalformedFXMLViewName e) {
			e.printStackTrace();
		}
	}

	public void loadViews(Collection<FXMLView> views) {
		for (FXMLView view : views) {
			loadView(view);
		}
	}

}
