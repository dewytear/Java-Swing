package thread.pk35_thread;

public class ThreadsTest extends Thread {

	public void run(){
		System.out.println(getId() + "\t" + getName() + "\t" + getThreadGroup());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("currentThread name: "+Thread.currentThread().getName());
		
		ThreadsTest t1 = new ThreadsTest();
		ThreadsTest t2 = new ThreadsTest();
		ThreadsTest t3 = new ThreadsTest();
		ThreadsTest t4 = new ThreadsTest();
		ThreadsTest t5 = new ThreadsTest();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
