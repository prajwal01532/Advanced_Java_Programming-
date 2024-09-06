
//passing argument and return value
package prajwalhacker;

public class Typesofmethod {
	int sum(double a,int b) {
		return (int) (a+b);
	}
	

	public static void main(String[] args) {
	
Typesofmethod t=new Typesofmethod();
double x=t.sum(2.9,3);

System.out.println("The sum is:"+ x);
	}


}