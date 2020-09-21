package constractor;

public class Calculator {
	public static int add(int n1, int n2){
		return n1+n2;
	
	}
	
	public static int multiply(int n1, int n2){
		return n1*n2;	
		
		
	}

	public static int calculate(int n1, int n2,String operator){
		switch (operator) {
		case"+":
			return add(n1,n2);
		case"*":
			return multiply(n1,n2);	

		default:
			System.out.println("invalid operator");
			return -1;
		
		}
	
	}
	}
	


	


	
