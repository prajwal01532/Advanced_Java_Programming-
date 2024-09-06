
package prajwalhacker;

import java.util.Scanner;

public class Prajwal {
public static void main(String[] args) {
	

	
	Scanner sc=new Scanner(System.in);
System.out.println("Enter a choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
	System.out.println("Enter a first number");
 int first=sc.nextInt();
 System.out.println("Enter a second number");
 int second=sc.nextInt();
 int sum=first +second ;
 System.out.println("The sum of Two no is:"+ sum);
 
	case 2:
		System.out.println("Enter a first number");
	 int first1=sc.nextInt();
	 System.out.println("Enter a second number");
	 int second1=sc.nextInt();
	 int div=first1 /second1 ;
	 System.out.println("The sum of Two no is:"+ div);
	 break;
	 
	case 3:
		System.out.println("Enter a first number");
	 int first11=sc.nextInt();
	 System.out.println("Enter a second number");
	 int second11=sc.nextInt();
	 int mul=first11 *second11 ;
	 System.out.println("The sum of Two no is:"+ mul);
	 break;
	 
	case 4:
		System.out.println("Enter a first number");
	 int first111=sc.nextInt();
	 System.out.println("Enter a second number");
	 int second111=sc.nextInt();
	 int moduluss =first111 % second111 ;
	 System.out.println("The sum of Two no is:"+ moduluss);
	 break;
	 
	case 5:
		System.out.println("Enter a first Name");
	 String first1111=sc.next();
	 System.out.println("Enter a second Name");
	 String second1111=sc.next();
	
	 System.out.println("Conacatination of Name is:"+first1111+"\t"+second1111);
	 break;
	 
	case 6:
		System.out.println("Enter a first number");
		 int firs=sc.nextInt();
		 System.out.println("Enter a second number");
		 int secon=sc.nextInt();
if((firs<secon) && (firs==secon)){
	System.out.println( firs*secon);
}
break;
	
case 7:
	System.out.println("Enter a first number");
	 int fir=sc.nextInt();
	 System.out.println("Enter a second number");
	 int seco=sc.nextInt();
	if((fir<seco) || (fir==seco)){
		System.out.println( fir+seco);
	}
break;
		}
}
}