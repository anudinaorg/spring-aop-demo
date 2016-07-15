package com.ado.springaop.exceptions;

public class EmployerNotFoundException extends Exception {

	private String mesg;
	public EmployerNotFoundException(String messge) {
		this.mesg = messge;
		super.getMessage();
 	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.mesg;
	}
}
