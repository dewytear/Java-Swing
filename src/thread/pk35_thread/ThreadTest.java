package thread.pk35_thread;

public class ThreadTest {

	public static void main(String[] args) {
		Ex t1=new Ex("First Thread");
		Ex t2=new Ex("Second Thread");
		t1.start();
		t2.start();
	}
}

class Ex extends Thread{
	public Ex(String name){
		super(name);
	}
	
	public void run(){
		for(int N=1; N<=5; N++){	//오랜시간 실행시키기위한 블록
			for(int j=1; j<=2; j++) {
			System.out.println(getName()+" -> "+N);
			}
		}
	}
}