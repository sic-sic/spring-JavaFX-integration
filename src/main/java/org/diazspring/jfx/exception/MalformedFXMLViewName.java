package org.diazspring.jfx.exception;

public class MalformedFXMLViewName extends Exception {
	
	private static final long serialVersionUID = 1L;

	
	public MalformedFXMLViewName() {
		super("Malformed FXMLView name exception");
	}


	public MalformedFXMLViewName(String args) {
		super("Malformed FXMLView name exception : " + args + " must end with View");
	}
	
	

}
