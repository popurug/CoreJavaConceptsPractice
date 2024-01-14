package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Checked {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\ravi.kiran\\Documents\\data.txt");
		BufferedReader input = new BufferedReader(file);
		
		for(int c=0; c<5; c++)
			System.out.println(input.readLine());
		
		input.close();
	}
}
