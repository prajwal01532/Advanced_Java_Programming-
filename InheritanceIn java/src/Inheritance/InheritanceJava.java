package Inheritance;

public class InheritanceJava {
	
public static class Parent{
	int a=23;//parent class ko
	void show() {
	
		System.out.print("This is parent class in java");
	}
}

public static class Child extends Parent{
	void print(){
	System.out.println("This is Child Class");
	
	System.out.print(a);
	}
}

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.print();

	}

}
