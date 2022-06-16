package Unit_03;
/*
 * Multiprocessing :-Multiprocessing refers to a system that has more than two central processing units (CPUs).
 *                   Every additional CPU added to a system increases its speed, power and memory.
 *                   This allows users to run multiple processes simultaneously
 *                 - parallel processing.
 *                 -Sequential processing.
 *                 -concurrent processing.
 * 
  Multithreading is a java feature that allows us to do concurrent execution of two or more parts of a program for max
  utilization of cpu by creating multiple thread
 * 
 * Threads can be created using two methods 
 * 1.Extending the thread class
 * 2.implementing a runnable interface
 * 
 * We create a class that extends the java.lang.Thread class. 
 * This class overrides the run() method available in the Thread class. 
 * A thread begins its life inside run() method. 
 * We create an object of our new class and call start() method to start the execution of a thread. 
 * Start() invokes the run() method on the Thread object
 * 
 * Thread creation by implementing the Runnable Interface
 * 
 * We create a new class which implements java.lang.Runnable interface and override run() method. 
 * Then we instantiate a Thread object and call start() method on this object. 
 * 
 * Implement and extend works similar but we use we prefer "implement " because "extend" is costlier then implementing
 * 
 * 
 */
import java.util.*;
public class P16_multithreading_in_java {

	public static void main(String[] args) {
		
		Thread obj1 = new Thread(new T1(),"T1");
		Thread obj2 = new Thread(new T2(),"T2");
		
		obj1.start();
		obj2.start();
		
		Thread obj3 = new Thread(new T3(),"T3");
		Thread obj4 = new Thread(new T4(),"T4");
		obj3.start();
		obj4.start();
	}

}
/*class c1{
	void show1() {
		Scanner obj = new Scanner(System.in);
	}
	void show2() {
		for(int i=0;i<10;i++)
		{
			System.out.println("are you okay"+1);
		}
	}
}*/
class c1{
	void show1() {
		for(int i=0;i<10;i++) {
			System.out.println("hey_1");
		}
	}
}
class c2{
	void show2() {
		for(int i=0;i<10;i++) {
			System.out.println("hey_1");
		}
	}
}
class T1 implements Runnable{
	public void run() {
		int a;
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("hey_1");
		}
		obj.close();
	}
}
class T2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("hey_2");
		}
	}
}
class T3 implements Runnable{
	public void run() {
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			System.out.println("T3 is done");
		}
	}
}
class T4 extends Thread {
	public void Run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("hey_3");
		}
	}
}