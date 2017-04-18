package org.diazspring.jfx;

import javafx.scene.Parent;

public abstract class FXMLView {

	protected Parent view;

	public Parent getView() {
		return view;
	}

	public void setView(Parent view) {
		this.view = view;
	}

}
