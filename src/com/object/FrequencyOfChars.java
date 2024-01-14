package com.object;

import java.util.Scanner;

public class FrequencyOfChars {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		//Enter your statement here.
		System.out.println("Enter the Statement: ");
		
		//will read statement and store it in "S" for further process.
		str = s.nextLine();
		int count = 0, len = 0;
		do {
			try {
				//this loop will identify the character and find how many times it occurs.
				char name[] = str.toCharArray();
				len = name.length;
				count = 0;
				for(int j=0; j<len; j++) {
					if((name[0]==name[j]) && ((name[0]>=65&&name[0]<=91)|| (name[0]>=97&&name[0]<=123)))
						count++;
				}
				if(count != 0) {
					//Print all the repeated characters
					System.out.println(name[0]+" "+count+" Times");
				}
				str = str.replace(""+name[0], "");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		while(len != 1);
		s.close();
	}
}
