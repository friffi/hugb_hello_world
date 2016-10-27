package com.bangsapabbi.helloworld;
import com.google.gson.Gson;

public class World 
{
	private String greeting = "Hello world!";

	public String greet()
	{
		return greeting;
	}
	
	public String jsonGreet()
	{
		return new Gson().toJson(this);
	}
}
