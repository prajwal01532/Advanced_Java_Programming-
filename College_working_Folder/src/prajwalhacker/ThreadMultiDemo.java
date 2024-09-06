package prajwalhacker;

public class ThreadMultiDemo extends Thread  {
	public void run() {
		System.out.println("Thread is Started  :"+Thread.currentThread().getId());
	}

	public static void main(String[] args) {

ThreadMultiDemo th=new ThreadMultiDemo();
th.start();

	}

}
