package prajwalhacker;

public class PrioritizingThread extends Thread{
public static void main(String[] args) {
PrioritizingThread pt=new PrioritizingThread();
System.out.println("currently executing thread="+Thread.currentThread().getId());

System.out.println("Currently executing thread Name="+Thread.currentThread().getName());
System.out.println("currently executing thread Priority="+Thread.currentThread().getPriority());
pt.setPriority(3);
pt.setName("myThread");
System.out.println("This is the name="+pt.getName());
System.out.println("this is priority="+pt.getPriority());
}
}



	

