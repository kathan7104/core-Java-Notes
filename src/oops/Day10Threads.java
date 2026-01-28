package oops;
import java.lang.Runnable;
/*
 * thread priority: 1 to 10
 * 	min: 1
 * 	default:5
 * 	max: 10
 * */

/*
 * Time slicing Scheduling
 * FCFS
 * preemptive priority
 * 
 * */

/*
 * sleep():it give some milliseconds gap in between the execution.
 * isAlive():it check the thread is running or not. in output it give True or False.
 * yield(): pause and give chance to another thread.
 * setDaemon(): it will run as background services 
 * 
 * */

/*
 * synchronized
 * synchronized(){}
 * static synchronized() method
 * */


class PatternA extends Thread{
	public void run() {
		synchronized(this){
			for(int i=0;i<=5;i++) {
				for(int j=i;j<=5;j++) {
					System.out.print('A');
				}
				System.out.println();
			}
		}
		
	}
}

class PatternB extends Thread{
	public synchronized void run() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print('B');
			}
			System.out.println();
			
		}
	}
}

class PatternC implements Runnable{
	//running state
	public synchronized void run() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print('C');
			}
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class thrdpriority extends Thread{
	public synchronized void run() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(Thread.currentThread().getName()+"="+Thread.currentThread().getPriority());
			}
			System.out.println();
		}
		
		
	}
}

public class Day10Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PatternA a=new PatternA();//new State
		PatternB b=new PatternB();
		PatternC c=new PatternC();
		Thread t=new Thread(c);
		
		
		a.setDaemon(true);
		a.start();//runnable state
		b.start();
		t.start();
		
		
		thrdpriority t1=new thrdpriority();
		thrdpriority t2=new thrdpriority();
		thrdpriority t3=new thrdpriority();
		
		t1.setName("min/low");
		t2.setName("Default");
		t3.setName("max/highest");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println();System.out.println();System.out.println();
		t1.start();
		Thread.yield();
		System.out.println();System.out.println();System.out.println();
		t2.start();
		Thread.yield();
		System.out.println();System.out.println();System.out.println();
		t3.start();
		Thread.yield();
		System.out.println();System.out.println();System.out.println();
		Thread.yield();
		System.out.println("*******"+t.isAlive());
		
				
		
		
	}

}
