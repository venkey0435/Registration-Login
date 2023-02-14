package com.scientific.Registration;

public interface LoginDao 
{
	public int insertLogin(Login c);
	public Login getLogin(String username, String pass);
	

}
