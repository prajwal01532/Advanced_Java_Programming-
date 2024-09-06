package prajwalhacker;
// multiple inheritance

class grandfather1{
	void show() {
		System.out.println("I am grandfather");
	}
}

class father extends grandfather1{
	void showw() {
		System.out.println("I am  son father");
	}
}

class son extends father{
	void showww() {
		System.out.println("I am kanxo son");
	}
}


public class multipleinheritance {

	public static void main(String[] args) {
	son sn=new son();
	sn.show();
	sn.showw();
	sn.showww();
		


	}

}
