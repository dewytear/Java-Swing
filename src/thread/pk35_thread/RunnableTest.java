package thread.pk35_thread;

class Exam implements Runnable {
	@Override
	public void run() {
		
		for(int N=1; N<=5; N++){
			for(int j=1; j<=10000000; j++);
			System.out.println(Thread.currentThread().getName()+" -> "+N);
		}
	}
}

public class RunnableTest {

	public static void main(String[] args) {

		Exam r1 = new Exam();
		Exam r2 = new Exam();
		
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);	
		th1.start();
		th2.start();
	}

}
