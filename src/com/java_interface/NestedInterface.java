package com.java_interface;

import com.java_interface.OuterInterface.InnerInterface;

public class NestedInterface implements InnerInterface {

	@Override
	public void InnerMethod() {
       //Find first 15 prime numbers
		int iteration=0, num=0, x=1, y=1;
		while (num < 15) {
			y = 1;
			iteration = 0;
			while(y <= x) {
				if(x % y == 0)
					iteration++;
				y++;
			}
			if(iteration == 2) {
				System.out.printf("%d ", x);
				num++;
			}
			x++;
		}
	}
	
	public static void main(String[] args) {
		NestedInterface ni = new NestedInterface();
		ni.InnerMethod();
	}

}
