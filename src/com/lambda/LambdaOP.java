package com.lambda;

//import javax.xml.validation.Validator;
//import java.util.function.*;

public class LambdaOP {

	public static void main(String[] args) {
		Validator validator = new Validator();
		String city = "newyork884";
		boolean isValid = validator.isDataValid(city, (String info) ->{
			String regx = "^[a-zA-Z0-9]*$";
			return info.matches(regx);
		});
		System.out.println("The value returned from lambda is: " + isValid);
	}
}
