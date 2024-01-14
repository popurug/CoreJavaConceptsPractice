package com.practice;

import java.util.stream.Stream;

public class StreamTest1 {
	public static void main(String[] args){  
        Stream.iterate(1, element-> element+1)  
        .filter(element->element%5==0)  
        .limit(3)  
        .forEach(System.out::println);  

        System.out.println("JAVA 7 ***************");
	for(int element =1, limit=0;limit<3; element=element+1){
		if(element%5==0){
			System.out.println(element);
			limit= limit+1;
		}
	}
	}
}
