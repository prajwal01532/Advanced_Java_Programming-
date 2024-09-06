package exception_in_java;

public class ExceptionInJava {

	public static void main(String[] args) {
		try {
			int data=100/0;
			
		}
catch(ArithmeticException e) {
	System.out.println(e);
}
	// rest of code
	System.out.println("Rest of code...");
}
	}


