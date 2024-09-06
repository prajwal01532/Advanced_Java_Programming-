package Overloading;

public class OverloadingJava {
	static int sum(int a,int b) {
		return a+b;
	}
	static int sum(int a,int b, int c) {
		return a+b+c;
	}
	
	static float sum(float a,int b) {
		return a+b;
	}
	
	static double sum(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
	System.out.println("Sum of a and b is:"+ sum(1,2));
	System.out.println("Sum of a and b is:"+ sum(1,2,3));
	System.out.println("Sum of a and b is:"+ sum(1.2f,2));
	System.out.println("Sum of a and b is:"+ sum(1.5,2.5));
	
	}

}
