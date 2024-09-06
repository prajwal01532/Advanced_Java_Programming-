package prajwalhacker;

public class PriorityDemo extends Thread{

public static void main(String[] args) {
PriorityDemo pd1=new PriorityDemo();
PriorityDemo pd2=new PriorityDemo();
PriorityDemo pd3=new PriorityDemo();
System.out.println("pd1 thread priority:"+pd1.getPriority());
System.out.println("pd2 thread priority:"+pd2.getPriority());
System.out.println("pd3 thread priority:"+pd3.getPriority());
System.out.println("-----------------------");
pd1.setPriority(MIN_PRIORITY);
pd2.setPriority(MAX_PRIORITY);
pd3.setPriority(NORM_PRIORITY);
System.out.println("pd1 thread priority="+pd1);
System.out.println("pd2 thread priority="+pd2);
System.out.println("pd3 thread priority="+pd3);
System.out.println("------------");
pd1.setPriority(3);
pd2.setPriority(8);
pd3.setPriority(5);
System.out.println("pd1 thread priority="+pd1);
System.out.println("pd2 thread priority="+pd2);
System.out.println("pd3 thread priority="+pd3);
}
}
