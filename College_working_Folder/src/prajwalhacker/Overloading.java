package prajwalhacker;

public class Overloading {
int sum(int a,int b) {
	return a+b;
}

int sum(int a,int b,int c) {
	return a+b+c;
}

	public static void main(String[] args) {
	Overloading pp=new Overloading();
	int x=pp.sum(4,5);
	int y=pp.sum(4,5,6);
	System.out.println("The Sum of a and b: "+x);
	System.out.println("The Sum of a , b and c: "+y);
	}

}
