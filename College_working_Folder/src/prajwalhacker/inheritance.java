package prajwalhacker;
// single inheritance
class prajwall{
	void show() {
		System.out.println("I am father");
		
	}
	}
	

class gaurab extends prajwall{
	void display() {
		System.out.println("I am child");
		
	}
	}



public class inheritance {
public static void main(String[] args) {
	
	gaurab gb=new gaurab();
	gb.show();
	gb.display();
	
} 
}
