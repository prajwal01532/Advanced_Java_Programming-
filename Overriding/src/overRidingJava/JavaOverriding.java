package overRidingJava;


class Parent{
	
	void show() {
		System.out.println("This is Parent Class");
	}
	}
	
	class Child extends Parent{
		@Override
		void show() {
			System.out.println("This is Child Class");
			
		}
	}
public class JavaOverriding {

	
	public static void main(String[] args) {
	
Parent obj1=new Parent();
obj1.show();

Parent obj=new Child();
obj.show();
}

}
