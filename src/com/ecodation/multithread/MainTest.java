package com.ecodation.multithread;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {
		ProcessMultiThread processMultiThread1 = new ProcessMultiThread();
		ProcessMultiThread processMultiThread2 = new ProcessMultiThread();
		ProcessMultiThread processMultiThread3 = new ProcessMultiThread();

		// processMultiThread1.wait(2000);
		// processMultiThread1.notify();
		// processMultiThread1.notifyAll();

		String name1 = processMultiThread1.getName();
		System.out.println(name1);
		System.out.println("1.thread: " + processMultiThread1.isAlive());

		String name2 = processMultiThread2.getName();
		System.out.println(name2);
		System.out.println("2.thread: " + processMultiThread2.isAlive());

		processMultiThread3.setName("sen 3.thread");
		String name3 = processMultiThread3.getName();
		System.out.println(name3);
		System.out.println("3.thread: " + processMultiThread3.isAlive());

		processMultiThread1.start();
		processMultiThread2.start();
		processMultiThread3.start();

		System.out.println("1.thread: " + processMultiThread1.isAlive());
		System.out.println("2.thread: " + processMultiThread2.isAlive());
		System.out.println("3.thread: " + processMultiThread3.isAlive());

	}

}
