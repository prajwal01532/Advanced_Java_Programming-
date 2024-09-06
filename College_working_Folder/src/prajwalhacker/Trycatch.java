package prajwalhacker;

public class Trycatch {

	public static void main(String[] args) {
	int x=0;
	int div;
	try {
	
	int numbers[]={1,2,3,4};
	System.out.println("Try block run: "+numbers[2]);
	
	
	try {
		
		div=100/x;
		}
	catch(ArithmeticException e ) {
		System.out.println("An Arithmetic exception occurs here"+e);
	}
	}

	
	catch(IndexOutOfBoundsException  e) {
		System.out.println("An index error  exception occurs here"+e);
	}
	
	finally{
		System.out.println("This is a finally block");
		
	}
	}

}
