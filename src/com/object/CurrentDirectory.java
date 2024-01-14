package com.object;

import java.nio.file.Paths;

public class CurrentDirectory {

	public static void main(String[] args) {
	//	String path = System.getProperty("user.dir");
	//	System.out.println("Working Directory = " + path);
		
		String path = Paths.get("").toAbsolutePath().toString();
		System.out.println("Working Directory = " + path);
	}
}
