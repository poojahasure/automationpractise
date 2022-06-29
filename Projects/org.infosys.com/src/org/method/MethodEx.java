package org.method;


class Calculator {

	// Implement your code here
	public double findAverage(int number1,int number2 ,int number3){
	    double sum=((number1+number2+number3)/(3.0));
	    return sum;
	}
}

class MethodEx {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		// Invoke the method findAverage of the Calculator class and display the average
		int sum1=calculator.findAverage(12,8,15);
		
		System.out.println((double)Math.round(sum1*100)/100);
	}
}