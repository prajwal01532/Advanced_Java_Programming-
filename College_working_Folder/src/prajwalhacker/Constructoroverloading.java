package prajwalhacker;

public class Constructoroverloading {
	
	public Constructoroverloading(int a, int b) {
		System.out.println("The sum is:"+(a+b));
	}
	
	public Constructoroverloading(int a, int b,int c) {
		System.out.println("The sum is:"+(a+b+c));
	}

	public static void main(String[] args) {
		Constructoroverloading c=new Constructoroverloading(5, 6);
		Constructoroverloading cc=new Constructoroverloading(5, 6,7);

	}

}
