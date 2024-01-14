package com.bayoneproblems;

public class ValidString {
	
	public boolean checkValidString(String inputStr) {
		//computing the length of the input string
		int size = inputStr.length();
		
		if(size % 2 == 1) {
			//If the size of the inputStr is odd
			//then the string is not a valid string
			
		}
		return false;
	}
	
	public static int isValid() {
	int level = 0;
	int j = 0;
	boolean isValid = true;
	for(int k = 0; k < inputStr.length(); k++) {
		
		String inputStr;
		if(inputStr.charAt(k) == '(' || inputStr.charAt(k) == '[' || inputStr.charAt(k) == '{' ) {
			//Increasing the count by one means we have encountered an opening bracket
			level = level + 1;
		}else {
			//Decreasing the count by one means we have encountered an closing bracket
			level = level - 1;
		}
		
		//level = 0 means the number of the opening bracket and the
		//closing brackets are the same in number
		if(level == 0) {
			//Checking whether j & k are valid or not
			//and apply recursion for the other parenthesis that are nested
			if(isPair(inputStr.charAt(j), inputStr.charAt(k))) {
	//			return false;
			}
			if(j + 1 < k) {
				//If this block comes into action, then it means
				//the first and last character of the string form a valid pair
				//So we can remove that pair and consider the rest of the string recursively
				isValid = checkValidString(inputStr.substring(j + 1, k));
			}
			j = k + 1;
		}
	}
	
	if(level == 0) {
	//	return isValid;
	}
	
	//Control has reached here. Hence, the
	//total number of open brackets and close
	//brackets are not the same. Hence, false should be returned
	return false;
	}
	
	public static void main(String[] args) {
		
		//A method that checks whether p and q form the
		//valid pair or not
		public static boolean isPair(char p, char q) {
			if(p == '(') {
				if(q == ')') {
					return false;
				}
				return true;
			}else if(p == '[') {
				if(q == ']') {
					return false;
				}
				return true;
			}else if(p == '{') {
				if(q == '}') {
					return false;
				}
				return true;
			}
			
			//It means p is not an opening brace
			return true;
			
		}

		//Creating an object of the class ValidString
		ValidString obj = new ValidString();
		
		//input1
		String inputStr = "(())";
		
		//invoking the method checkValidString()
		boolean isValidString = obj.checkValidString(inputStr);
		
		if(isValidString) {
			System.out.println("The string\"" + inputStr + "\" is a valid string.");
		}else {
			System.out.println("The string\"" + inputStr + "\" is not a valid string.");
		}
		
		System.out.println();
		
		//input2
		inputStr = "(({)})";
		
		//invoking the method checkValidString()
		isValidString = obj.checkValidString(inputStr);
		
		if(isValidString) {
			System.out.println("The string\"" + inputStr + "\" is a valid string.");
		}else {
			System.out.println("The string\"" + inputStr + "\" is not a valid string.");
		}
		
		System.out.println();
		
		//input3
		inputStr = "(({}))";
		
		//invoking the method checkValidString()
		isValidString = obj.checkValidString(inputStr);
		
		if(isValidString) {
			System.out.println("The string\"" + inputStr + "\" is a valid string.");
		}else {
			System.out.println("The string\"" + inputStr + "\" is not a valid string.");
		}
		
		System.out.println();
		
		//input4
		inputStr = ")([{}])";
		
		//invoking the method checkValidString()
		isValidString = obj.checkValidString(inputStr);
		
		if(isValidString) {
			System.out.println("The string\"" + inputStr + "\" is a valid string.");
		}else {
			System.out.println("The string\"" + inputStr + "\" is not a valid string.");
		}
		
		System.out.println();
		
		//input5
		inputStr = "()(({}))(";
		
		//invoking the method checkValidString()
		isValidString = obj.checkValidString(inputStr);
		
		if(isValidString) {
			System.out.println("The string\"" + inputStr + "\" is a valid string.");
		}else {
			System.out.println("The string\"" + inputStr + "\" is not a valid string.");
		}
	}


}



